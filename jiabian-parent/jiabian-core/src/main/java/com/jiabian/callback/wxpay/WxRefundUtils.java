package com.jiabian.callback.wxpay;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.security.KeyStore;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

import javax.net.ssl.SSLContext;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLContexts;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import com.jiabian.util.ConfigUtil;
import com.jiabian.util.MD5;
import com.jiabian.util.StrTools;

public class WxRefundUtils {
	
	
	/**
	 * 微信退款商户证书目录
	 */
	private static final String WX_REFUND = "/apiclient_cert.p12";

	private static final Logger logger = LogManager
			.getLogger(WxRefundUtils.class.getName());

	public static String wxRefund(String appid, String out_trade_no, String total_fee, String refund_fee) {
		CloseableHttpClient httpclient = null;
		CloseableHttpResponse response = null;
		String strResponse = null;
		try {
			httpclient = getCloseableHttpClient();
			// 构造HTTP请求
			HttpPost httpPost = new HttpPost(WxPayUtils.PAY_REFUND);
			logger.info("httpPost:"+httpPost);
			WeixinRefundInfo wxdata = new WeixinRefundInfo();
			wxdata.setAppid(appid);
			wxdata.setNonce_str(WxPayUtils.getNonceStr(23));
			wxdata.setOut_trade_no(out_trade_no);
			wxdata.setOut_refund_no(getOutRefundNo());
			wxdata.setTotal_fee(total_fee);
			wxdata.setRefund_fee(refund_fee);
			logger.info("wxdata有值吗？:"+wxdata.getAppid()+"--"+wxdata.getNonce_str()+"--"+wxdata.getOut_trade_no()+"--"+wxdata.getOut_refund_no()+"--"+wxdata.getTotal_fee()+"--"+wxdata.getRefund_fee());
			String requestStr = getRequestXml(wxdata);
			logger.info("requestStr:"+requestStr);
			
			StringEntity se = new StringEntity(requestStr);
			httpPost.setEntity(se);
			
			// 发送请求
			response = httpclient.execute(httpPost);
			logger.info("发送了吗？"+response);
			HttpEntity entity = response.getEntity();
			if (entity != null) {
				SAXReader saxReader = new SAXReader();
				Document document = saxReader.read(entity.getContent());
				Element rootElt = document.getRootElement();
				// 结果码
				String returnCode = rootElt.elementText("return_code");
				logger.info("returnCode:"+returnCode);
				String resultCode = rootElt.elementText("result_code");
				logger.info("result_code:"+resultCode);
				
				if ("SUCCESS".equals(returnCode)&& "SUCCESS".equals(resultCode)) {
					logger.info("SUCCESS");
					return "SUCCESS";
				} else {
					strResponse = rootElt.elementText("err_code_des");
					logger.info("strResponse:"+strResponse);
					return "false";
				}
			}
			
			EntityUtils.consume(entity);
			
		} catch (Exception e) {
		} finally {
			try {
				response.close();
				httpclient.close();
			} catch (IOException e) {
				e.getStackTrace();
				// TODO Auto-generated catch block
			}
		}
		return "false";
	}

	/**
	 * 商户退款单号
	 */
	public static String getOutRefundNo() {
		return new StringBuilder(RandomStringUtils.randomNumeric(23))
				.toString();
	}

	/**
	 * 请求xml组装 
	 * com.jiabian.callback.wxpay 
	 * 方法名：getRequestXml
	 * 创建人：潇洒
	 * 时间：2017年1月4日-上午9:56:17
	 */
	public static String getRequestXml(WeixinRefundInfo wxdata) {

		SortedMap<String, Object> map = new TreeMap<>();
		map.put("appid", wxdata.getAppid());
		map.put("mch_id", ConfigUtil.getConfig(WxPayUtils.WX_APP_MCH_ID));
		map.put("nonce_str", wxdata.getNonce_str());
		map.put("out_trade_no", wxdata.getOut_trade_no());
		map.put("out_refund_no", wxdata.getOut_refund_no());
		map.put("total_fee", wxdata.getTotal_fee());
		map.put("refund_fee", wxdata.getRefund_fee());
		map.put("op_user_id", WxPayUtils.WX_APP_MCH_ID);
		map.put("sign",
				MD5.MD5Encode(
						getRefundSigningSplice(wxdata.getAppid(),
								wxdata.getNonce_str(),
								wxdata.getOut_trade_no(),
								wxdata.getOut_refund_no(),
								wxdata.getTotal_fee(), wxdata.getRefund_fee()))
						.toUpperCase());
		
		StringBuffer sb = new StringBuffer();
		sb.append("<xml>");
		Set es = map.entrySet();
		Iterator it = es.iterator();
		while (it.hasNext()) {
			Map.Entry entry = (Map.Entry) it.next();
			String key = (String) entry.getKey();
			String value = (String) entry.getValue();
			if ("appid".equalsIgnoreCase(key) || "mch_id".equalsIgnoreCase(key)
					|| "nonce_str".equalsIgnoreCase(key)
					|| "out_trade_no".equalsIgnoreCase(key)
					|| "out_refund_no".equalsIgnoreCase(key)
					|| "total_fee".equalsIgnoreCase(key)
					|| "refund_fee".equalsIgnoreCase(key)
					|| "op_user_id".equalsIgnoreCase(key)
					|| "sign".equalsIgnoreCase(key)) {
				sb.append("<" + key + ">" + "<![CDATA[" + value + "]]></" + key
						+ ">");
			} else {
				sb.append("<" + key + ">" + value + "</" + key + ">");
			}
		}
		sb.append("</xml>");
		logger.info("sb.toString():"+sb.toString());
		return sb.toString();
	}

	/**
	 * 签名拼接字符串 com.jiabian.callback.wxpay 方法名：getSigningSplice 创建人：潇洒
	 * 时间：2016-12-30-上午10:06:27
	 */
	public static String getRefundSigningSplice(String appid, String nonce_str,
			String out_trade_no, String out_refund_no, String total_fee,
			String refund_fee) {
		return StrTools.appendString("appid=",appid
				,"&mch_id=",ConfigUtil.getConfig(WxPayUtils.WX_APP_MCH_ID)
				,"&nonce_str=",nonce_str
				,"&op_user_id=",ConfigUtil.getConfig(WxPayUtils.WX_APP_MCH_ID)
				,"&out_refund_no=",out_refund_no
				,"&out_trade_no=",out_trade_no
				,"&refund_fee=",refund_fee
				,"&total_fee=",total_fee
				,"&key=",ConfigUtil.getConfig(WxPayUtils.WX_APP_KEY));
}

	/**
	 * ClientCustomSSL 
	 * 创建人:潇洒 
	 * 时间：2017年1月5日-下午5:05:09
	 */
	public static CloseableHttpClient getCloseableHttpClient() {
		CloseableHttpClient httpclient = null;
		try {
			KeyStore keyStore = KeyStore.getInstance("PKCS12");
			FileInputStream instream = new FileInputStream(new File(WX_REFUND));
			try {
				keyStore.load(instream, ConfigUtil.getConfig(WxPayUtils.WX_APP_MCH_ID).toCharArray());
			} finally {
				instream.close();
			}
			SSLContext sslcontext = SSLContexts.custom()
					.loadKeyMaterial(keyStore, WxPayUtils.WX_APP_MCH_ID.toCharArray())
					.build();
			// Allow TLSv1 protocol only
			SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(
					sslcontext,
					new String[] { "TLSv1" },
					null,
					SSLConnectionSocketFactory.BROWSER_COMPATIBLE_HOSTNAME_VERIFIER);
			httpclient = HttpClients.custom().setSSLSocketFactory(sslsf)
					.build();
		} catch (Exception e) {
			e.getStackTrace();
			logger.info("e:"+e);
			// TODO: handle exception
		}
		logger.info("httpclient："+httpclient);
		return httpclient;
	}
	
	
	
	/**
	 * 金额类型转换
	 */
	public static String getAmont(String amount){
		BigDecimal decimal = new BigDecimal(amount);
		return decimal.multiply(new BigDecimal("100")).setScale(0).toString();
	}
}
