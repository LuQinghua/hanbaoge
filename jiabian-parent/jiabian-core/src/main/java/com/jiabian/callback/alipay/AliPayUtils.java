/**
 * 家边网络科技有限公司
 * jiabian-core
 * com.jiabian.callback.alipay
 * Utils.java
 * 创建人:潇洒
 * 时间：2016-11-25-下午4:19:15 
 * 2016家边网络科技有限公司-版权所有
 */
package com.jiabian.callback.alipay;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.jiabian.util.Base64Utils;
import com.jiabian.util.ConfigUtil;
import com.jiabian.util.Constants;
import com.jiabian.util.DateUtil;
import com.jiabian.util.PropertiesUtil;
import com.jiabian.util.StrTools;

/**
 * Utils 创建人:潇洒 时间：2016-11-25-下午4:19:15
 */
public class AliPayUtils {
	private static final Logger logger = LogManager.getLogger(AliPayUtils.class
			.getName());

	/**
	 * 支付宝网关
	 */
	public static final String ALIPAY_GATEWAY = "https://openapi.alipay.com/gateway.do";

	/**
	 * 接口名(公共参数)
	 */
	public static final String METHOD = "alipay.trade.app.pay";

	/**
	 * appid
	 */
	public static final String APP_ID = "AL_APP_ID";

	/**
	 * 商家支付宝用户号
	 */
	public static final String SELLER_ID = "AL_SELLER_ID";

	/**
	 * 销售产品码
	 */
	public static final String PRODUCT_CODE = "QUICK_MSECURITY_PAY";

	/**
	 * 调用的接口版本，固定为：1.0
	 */
	public static final String VERSION = "1.0";

	/**
	 * 加密方式
	 */
	private static final String SIGN_ALGORITHMS = "SHA1WithRSA";

	/**
	 * 支付宝回调接口
	 */
	//抢大运支付宝回调地址
	public static final String NOTIFY_URL = PropertiesUtil.getProperties("pay.applink")+"/h5businesscontroller/alipaynotify";
	//商超支付宝回调地址
	public static final String SC_NOTIFY_URL = PropertiesUtil.getProperties("pay.applink")+"/common/alipayNotify";
	//游趣乐园回调地址
	public static final String FUN_NOTIFY_URL = PropertiesUtil.getProperties("pay.applink")+"/funpay/alipaynotify";

	/**
	 * alipay支付成功
	 */
	public static final String TRADE_SUCCESS = "TRADE_SUCCESS";

	/**
	 * 支付宝开发者私钥
	 */
	public static final String APP_PRIVATE_KEY = "AL_APP_PRIVATE_KEY";

	/**
	 * 支付宝公钥
	 */
	public static final String APP_PUBLIC_KEY = "AL_APP_PUBLIC_KEY";

	/**
	 * 付款，给移动端的入参
	 */
	public static Map<String, String> buildOrderParamMap(String out_trade_no,
			String subject, String total_amount,String notify_url) {
		SortedMap<String, String> keyValues = new TreeMap<String, String>();

		keyValues.put("app_id", ConfigUtil.getConfig(AliPayUtils.APP_ID));

		keyValues.put("biz_content",
				"{\"product_code\":\"QUICK_MSECURITY_PAY\",\"total_amount\":\""
						+ total_amount + "\"," + "\"subject\":\"" + subject
						+ "\",\"out_trade_no\":\"" + out_trade_no + "\"}");

		keyValues.put("charset", Constants.ENCODING);

		keyValues.put("method", AliPayUtils.METHOD);

		keyValues.put("sign_type", Constants.SIGN_TYPE);

		keyValues.put("timestamp", DateUtil.getLongCurrTimes());

		keyValues.put("version", AliPayUtils.VERSION);

		keyValues.put("notify_url", notify_url);

		return keyValues;
	}

	/**
	 * 构造支付订单参数信息
	 */
	public static String buildOrderParam(Map<String, String> map) {
		List<String> keys = new ArrayList<String>(map.keySet());

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < keys.size() - 1; i++) {
			String key = keys.get(i);
			String value = map.get(key);
			sb.append(buildKeyValue(key, value, true));
			sb.append("&");
		}

		String tailKey = keys.get(keys.size() - 1);
		String tailValue = map.get(tailKey);
		sb.append(buildKeyValue(tailKey, tailValue, true));
		return sb.toString();
	}

	/**
	 * 拼接键值对
	 */
	private static String buildKeyValue(String key, String value,
			boolean isEncode) {
		StringBuilder sb = new StringBuilder();
		sb.append(key);
		sb.append("=");
		if (isEncode) {
			try {
				sb.append(URLEncoder.encode(value, "UTF-8"));
			} catch (UnsupportedEncodingException e) {
				sb.append(value);
			}
		} else {
			sb.append(value);
		}
		return sb.toString();
	}

	/**
	 * 对支付参数信息进行签名
	 */
	public static String getSigning(Map<String, String> map, String rsaKey) {
		List<String> keys = new ArrayList<String>(map.keySet());
		// key排序
		Collections.sort(keys);

		StringBuilder authInfo = new StringBuilder();
		for (int i = 0; i < keys.size() - 1; i++) {
			String key = keys.get(i);
			String value = map.get(key);
			authInfo.append(buildKeyValue(key, value, false));
			authInfo.append("&");
		}

		String tailKey = keys.get(keys.size() - 1);
		String tailValue = map.get(tailKey);
		authInfo.append(buildKeyValue(tailKey, tailValue, false));

		String oriSign = AliPayUtils.sign(authInfo.toString(), rsaKey);
		String encodedSign = "";

		try {
			encodedSign = URLEncoder.encode(oriSign, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		logger.info("对支付参数信息进行签名：" + encodedSign);
		return StrTools.appendString("sign=",encodedSign);
	}

	public static String sign(String content, String privateKey) {
		try {
			PKCS8EncodedKeySpec priPKCS8 = new PKCS8EncodedKeySpec(
					Base64Utils.decode(privateKey));
			KeyFactory keyf = KeyFactory.getInstance(Constants.SIGN_TYPE);
			PrivateKey priKey = keyf.generatePrivate(priPKCS8);

			java.security.Signature signature = java.security.Signature
					.getInstance(SIGN_ALGORITHMS);

			signature.initSign(priKey);
			signature.update(content.getBytes(Constants.ENCODING));

			byte[] signed = signature.sign();

			return Base64Utils.encode(signed);

		} catch (Exception e) {
			logger.error(e);
			return null;
		}

	}

	/**
	 * 付款验签的参数
	 */
	public static SortedMap<String, String> getMap(HttpServletRequest request) {
		try {
			Map<String, String[]> parameterMap = request.getParameterMap();
			Set<Entry<String, String[]>> set = parameterMap.entrySet();
			SortedMap<String, String> map = new TreeMap<>();
			for (Entry<String, String[]> entry : set) {
				String[] value = entry.getValue();
				map.put(entry.getKey(), value[0]);
			}
			return map;
		} catch (Exception e) {
			logger.error(e);
			return null;
		}
		
	}
}
