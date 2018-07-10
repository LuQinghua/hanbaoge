/**
 * 家边网络科技有限公司
 * jiabian-core
 * com.jiabian.callback.wxpay
 * Utils.java
 * 创建人:潇洒
 * 时间：2016-11-25-下午4:19:40 
 * 2016家边网络科技有限公司-版权所有
 */
package com.jiabian.callback.wxpay;

import java.io.IOException;
import java.io.StringReader;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.RequestEntity;
import org.apache.commons.httpclient.methods.StringRequestEntity;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.springframework.ui.ModelMap;
import org.xml.sax.InputSource;

import com.jiabian.util.ConfigUtil;
import com.jiabian.util.Constants;
import com.jiabian.util.MD5;
import com.jiabian.util.PropertiesUtil;
import com.jiabian.util.StrTools;
/**
 * Utils 创建人:潇洒 时间：2016-11-25-下午4:19:40
 */
public class WxPayUtils {
	
	private static final Logger logger = LogManager.getLogger(WxPayUtils.class.getName());
	
	/**
	 * 商户给微信的回应
	 */
	public static final String WX_RESULT = "<xml><return_code><![CDATA[SUCCESS]]></return_code><return_msg><![CDATA[OK]]></return_msg></xml>";

	/**
	 *  扩展字段
	 */
	public static final String EXTEND = "Sign=WXPay";

	/**
	 *  商户号
	 */
	public static final String WX_APP_MCH_ID = "WX_APP_MCH_ID";

	/**
	 *  通知地址
	 */
//	public static final String NOTIFY_URL =new StringBuilder( PropertiesUtil.getProperties("pay.applink")).append(PropertiesUtil.getProperties("pay.weixinInterfaceName")).toString();
	//商超回调地址
	public static String SC_NOTIFY_URL = PropertiesUtil.getProperties("pay.applink")+"/common/weiXinNotify";
	//抢大运回调地址
	public static String QDY_NOTIFY_URL = PropertiesUtil.getProperties("pay.applink")+"/h5businesscontroller/weixinnotify";
	//趣味乐园回调地址
	public static String FUN_NOTIFY_URL = PropertiesUtil.getProperties("pay.applink")+"/funpay/weiXinNotify";
	
	/**
	 *  交易类型
	 */
	public static final String TRADE_TYPE = "APP";

	/**
	 * 商户密钥
	 */
	public static final String WX_APP_KEY = "WX_APP_KEY";

	/** 
	 * 调用微信服务端的url
	 */
	public static final String UN_IFIEDORDER = "https://api.mch.weixin.qq.com/pay/unifiedorder";
	
	/**
	 * 微信服务端退款接口
	 */
	public static final String PAY_REFUND = "https://api.mch.weixin.qq.com/secapi/pay/refund";
		
	
	public static final String DATA_TYPE = "text/xml";
	
	public static final String WX_APP_ID = "WX_APP_ID";
	

	/**
	 * 随机字符串
	 * com.jiabian.callback.wxpay 
	 * 方法名：getNonceStr
	 * 创建人：潇洒
	 * 时间：2016-12-30-上午10:05:46
	 */
	public static String getNonceStr(int count) {
		return RandomStringUtils.randomAlphabetic(count);
	}

	/**
	 * 时间戳
	 * com.jiabian.callback.wxpay 
	 * 方法名：getTimestamp
	 * 创建人：潇洒
	 * 时间：2016-12-30-上午10:05:59
	 */
	public static String getTimestamp() {
		
		return String.valueOf(new Date().getTime() / 1000);
	}
	
	
	/**
	 *  请求xml组装
	 * com.jiabian.callback.wxpay 
	 * 方法名：getRequestXml
	 * 创建人：潇洒
	 * 时间：2016-12-30-上午10:06:07
	 */
	public static String getRequestXml(HttpServletRequest request,
			String appid, String body, String out_trade_no, String total_fee,String nonce_str,String wxNotify_url) {
		
		logger.info("appid");
		
		String spbill_create_ip = getRemoteIP(request);
		SortedMap<String, Object> map = new TreeMap<>();
		map.put("appid", appid);
		map.put("body", body);
		map.put("mch_id", ConfigUtil.getConfig(WX_APP_MCH_ID));
		map.put("nonce_str", nonce_str);
		map.put("notify_url", wxNotify_url);
		map.put("out_trade_no", out_trade_no);
		map.put("spbill_create_ip", spbill_create_ip);
		map.put("total_fee", total_fee);
		map.put("trade_type", WxPayUtils.TRADE_TYPE);
		map.put("sign",  MD5.MD5Encode(
				WxPayUtils.getSigningSplice(request, appid, body, out_trade_no,
						total_fee, nonce_str, spbill_create_ip,wxNotify_url)).toUpperCase());
		StringBuffer sb = new StringBuffer();
		sb.append("<xml>");
		Set es = map.entrySet();
		Iterator it = es.iterator();
		while (it.hasNext()) {
			Map.Entry entry = (Map.Entry) it.next();
			String key = (String) entry.getKey();
			String value = (String) entry.getValue();
			if ("appid".equalsIgnoreCase(key) || "body".equalsIgnoreCase(key)
					|| "mch_id".equalsIgnoreCase(key)
					|| "nonce_str".equalsIgnoreCase(key)
					|| "notify_url".equalsIgnoreCase(key)
					|| "out_trade_no".equalsIgnoreCase(key)
					|| "spbill_create_ip".equalsIgnoreCase(key)
					|| "total_fee".equalsIgnoreCase(key)
					|| "trade_type".equalsIgnoreCase(key)
					|| "sign".equalsIgnoreCase(key)) {
				sb.append("<" + key + ">" + "<![CDATA[" + value + "]]></" + key
						+ ">");
			} else {
				sb.append("<" + key + ">" + value + "</" + key + ">");
			}
		}
		sb.append("</xml>");
		return sb.toString();
	}
	
	/**
	 * 获取id地址
	 * com.jiabian.callback.wxpay 
	 * 方法名：getRemoteIP
	 * 创建人：潇洒
	 * 时间：2016-12-30-上午10:06:16
	 */
	protected static String getRemoteIP(HttpServletRequest request) {
		String ip = request.getHeader("x-forwarded-for");
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("WL-Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = "183.129.165.206"; //因为这个方法总是获取不到ip，故写死了。
		}
		if (ip != null && ip.length() > 0) {
			String[] ipArray = ip.split(",");
			if (ipArray != null && ipArray.length > 1) {
				return ipArray[0];
			}
			logger.info("ip:"+ip);
			return ip;
		}

		return "未知IP";
	}

	/**
	 * 向微信服务端发送请求
	 * com.jiabian.callback.wxpay 
	 * 方法名：sendWxPayRequest
	 * 创建人：潇洒
	 * 时间：2016-12-30-上午10:06:21
	 */
	public static String sendWxPayRequest(String requestXml) {
		// 构造HTTP请求
		HttpClient httpclient = new HttpClient();
		PostMethod postMethod = new PostMethod(UN_IFIEDORDER);
		// 发送请求
		String strResponse = null;
		try {
			RequestEntity entity = new StringRequestEntity(
					requestXml.toString(), DATA_TYPE, Constants.ENCODING);
			postMethod.setRequestEntity(entity);
			httpclient.executeMethod(postMethod);
			strResponse = new String(postMethod.getResponseBody(),  Constants.ENCODING);
		} catch (HttpException e) {
			logger.error(e);
		} catch (IOException e) {
			logger.error(e);
		} 
		logger.info("strResponse:"+strResponse);
		return strResponse;
	}

	
	/**
	 * 第一次签名拼接字符串
	 * com.jiabian.callback.wxpay 
	 * 方法名：getSigningSplice
	 * 创建人：潇洒
	 * 时间：2016-12-30-上午10:06:27
	 */
	public static String getSigningSplice(HttpServletRequest request,
			String appId, String body, String out_trade_no, String total_fee,
			String nonceStr, String spbill_create_ip,String wxNotify_url) {
		return StrTools.appendString("appid=",appId,"&body=",body,"&mch_id="
				,ConfigUtil.getConfig(WX_APP_MCH_ID),"&nonce_str=",nonceStr
				,"&notify_url=",wxNotify_url,"&out_trade_no=",out_trade_no
				,"&spbill_create_ip=",spbill_create_ip,"&total_fee=",total_fee,"&trade_type="
				,TRADE_TYPE,"&key=",ConfigUtil.getConfig(WX_APP_KEY));
	}
	
	/**
	 * 第二次签名拼接字符串
	 * com.jiabian.callback.wxpay 
	 * 方法名：getSigning
	 * 创建人：潇洒
	 * 时间：2016-12-30-上午10:06:31
	 */
	public static String getSigning(HttpServletRequest request, String appid,
			String prepay_id,String nonce_str,String timestamp) {
		return StrTools.appendString("appid=",appid,"&noncestr=",nonce_str,"&package="
				,EXTEND,"&partnerid=",ConfigUtil.getConfig(WX_APP_MCH_ID),"&prepayid=",prepay_id,"&timestamp="
				,timestamp,"&key=",ConfigUtil.getConfig(WX_APP_KEY));
	}

	/**
	 * 读取xml文件
	 * com.jiabian.callback.wxpay 
	 * 方法名：getPrepayId
	 * 创建人：潇洒
	 * 时间：2016-12-30-上午10:06:36
	 */
	public static String getPrepayId(String weixin) {
		StringReader sr = new StringReader(weixin);
		Document inputdoc = null;
		// 创建新的输入源SAX 解析器将使用 InputSource 对象来确定如何读取 XML 输入
		InputSource source = new InputSource(sr);
		// 创建一个新的SAXBuilder
		SAXBuilder saxbBuilder = new SAXBuilder();
		// 通过输入源构造一个Document
		Map<String, String> payParams = new HashMap<String, String>();
		try {
			inputdoc = saxbBuilder.build(source);
			Element root_in = inputdoc.getRootElement();
			List<Element> list = root_in.getChildren();
			payParams = new HashMap<String, String>();
			for (Element em : list) {
				if (!StringUtils.isBlank(em.getText()) && !StringUtils.isBlank(em.getName())) {
					payParams.put(em.getName(), em.getText());
				}
			}
		} catch (JDOMException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return payParams.get("prepay_id");
	}

	
	/**
	 * 给移动端返回的数据
	 * com.jiabian.callback.wxpay 
	 * 方法名：getModelMap
	 * 创建人：潇洒
	 * 时间：2016-12-30-上午10:06:42
	 * @param notify_url 
	 */
	public static ModelMap getModelMap(HttpServletRequest request,
			String appid,String body,String out_trade_no,String total_fee, String wxNotify_url) {
		
		logger.info("appid:"+appid+"body:"+body+"out_trade_no:"+out_trade_no+"total_fee:"+total_fee);
		
		String nonce_str = getNonceStr(20);
		String timestamp = getTimestamp();
		String requestXml = WxPayUtils.getRequestXml(request, appid, body,
				out_trade_no, total_fee,nonce_str,wxNotify_url);
		logger.info("requestXml-----------"+requestXml);
		String weixin = sendWxPayRequest(requestXml);
		logger.info("weixin："+weixin);
		String prepay_id = getPrepayId(weixin);
		logger.info("prepay_id："+prepay_id);
		if(StringUtils.isBlank(prepay_id)){
			return null;
		}
		ModelMap modelMap = new ModelMap();
		modelMap.put("appid", appid);
		modelMap.put("partnerid", ConfigUtil.getConfig(WX_APP_MCH_ID));
		modelMap.put("prepayid", prepay_id);
		modelMap.put("noncestr", nonce_str);
		modelMap.put("timestamp", timestamp);
		modelMap.put("package", "Sign=WXPay");
		modelMap.put("sign",MD5.MD5Encode(getSigning(request, appid, prepay_id,nonce_str,timestamp)).toUpperCase());
		return modelMap;
	}
}
