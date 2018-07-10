/**
 * 家边网络科技有限公司
 * jiabian-core
 * com.jiabian.callback.yiwangtong
 * YwtUtils.java
 * 创建人:潇洒
 * 时间：2016-11-25-下午4:29:44 
 * 2016家边网络科技有限公司-版权所有
 */
package com.jiabian.callback.yiwangtong;

import java.io.UnsupportedEncodingException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.alibaba.fastjson.JSONObject;
import com.jiabian.util.Base64Utils;
import com.jiabian.util.ConfigUtil;
import com.jiabian.util.Constants;
import com.jiabian.util.DateUtil;
import com.jiabian.util.PropertiesUtil;
import com.jiabian.util.StrTools;

/**
 * YwtUtils 创建人:潇洒 时间：2016-11-25-下午4:29:44
 */
public class YwtUtils {
	private static final Logger logger = LogManager.getLogger(YwtUtils.class
			.getName());

	// 成功支付结果通知地址,商户接收成功支付结果通知的地址。
	public static final String QDY_PAYNOTICEURL = new StringBuilder(
			PropertiesUtil.getProperties("pay.applink")).append(
			"/h5businesscontroller/ywtPayNotify").toString();
	// 成功签约结果通知地址
	public static final String QDY_SIGNNOTICEURL = new StringBuilder(
			PropertiesUtil.getProperties("pay.applink")).append(
			"/h5businesscontroller/ywtSignedNotify").toString();
	// 成功页返回商户地址,支付成功页面上“返回商户”按钮跳转地址。
	public static final String QDY_RETURNURL = new StringBuilder(
			PropertiesUtil.getProperties("pay.applink")).append(
			"/h5/luckyStar/luckyStar.html#/record").toString();

	// 成功支付结果通知地址,商户接收成功支付结果通知的地址。
	public static final String SC_PAYNOTICEURL = new StringBuilder(
			PropertiesUtil.getProperties("pay.applink")).append(
			"/common/ywtPayNotify").toString();
	// 成功签约结果通知地址
	public static final String SC_SIGNNOTICEURL = new StringBuilder(
			PropertiesUtil.getProperties("pay.applink")).append(
			"/common/ywtSignedNotify").toString();
	// 成功页返回商户地址,支付成功页面上“返回商户”按钮跳转地址。
	public static final String SC_RETURNURL = new StringBuilder(
			PropertiesUtil.getProperties("pay.applink")).append(
			"/cart/userSelectCart").toString();

	// 成功支付结果通知地址,商户接收成功支付结果通知的地址。
	public static final String FUN_PAYNOTICEURL = new StringBuilder(
			PropertiesUtil.getProperties("pay.applink")).append(
			"/funpay/ywtPayNotify").toString();
	// 成功签约结果通知地址
	public static final String FUN_SIGNNOTICEURL = new StringBuilder(
			PropertiesUtil.getProperties("pay.applink")).append(
			"/funpay/ywtSignedNotify").toString();
	// 成功页返回商户地址,支付成功页面上“返回商户”按钮跳转地址。
	public static final String FUN_RETURNURL = new StringBuilder(
			PropertiesUtil.getProperties("pay.applink")).append(
			"/fun/showText#/record").toString();

	// 查询招行公钥API(生产环境)
	public static final String COMMONKET = "https://b2b.cmbchina.com/CmbBank_B2B/UI/NetPay/DoBusiness.ashx";

	// 查询单笔订单
	public static final String QUERYORDER = "http://218.17.27.197/NetPayment/BaseHttp.dll?QuerySingleOrder";

	// 商户分行号，4位数字
	public static final String YWT_BRANCHNO = "YWT_BRANCHNO";

	// 商户号
	public static final String YWT_MERCHANTNO = "YWT_MERCHANTNO";

	// 版本号
	public static final String VERSION = "1.0";

	// 签名算法
	public static final String SIGNTYPE = "SHA-256";

	// 商户密钥
	public static final String YWT_SECRETKEY = "YWT_SECRETKEY";

	// 交易码,固定为FBPK,查询招行公钥用
	public static final String TXCODE = "FBPK";

	// 签约回调通知类型
	public static final String NOTICETYPE = "BKQY";

	// 签约回调时，回调HTTP地址
	public static final String HTTPMETHOD = "POST";

	// 获取公钥后，存到redis的Key
	public static final String FBPUBKEY = "FBPUBKEY";

	// 签约成功时，返回的标注状态
	public static final String RSPCODE = "SUC0000";

	/**
	 * 协议开通请求流水号,不超过20位，建议纯数字，随机两位加时间戳加随机两位组成
	 */
	public static String getMerchantSerialNo() {
		return StrTools.appendString(RandomStringUtils.randomNumeric(2),
				new Date().getTime(), RandomStringUtils.randomNumeric(2));
	}

	/**
	 * 客户协议号， 必须为纯数字串，不超过30位，新用户注册时使用。随机五位加时间戳加随机七位组成
	 */
	public static String getAgrNo() {
		return StrTools.appendString(RandomStringUtils.randomNumeric(5),
				new Date().getTime(), RandomStringUtils.randomNumeric(7));
	}

	/**
	 * userID,用于标识商户用户的唯一ID。不超过20位,时间戳加随机六位组成
	 */
	public static String getUserID() {
		return new StringBuffer().append(new Date().getTime())
				.append(RandomStringUtils.randomNumeric(6)).toString();
	}

	/**
	 * 订单号字符串截取，订单号要求十位纯数字。从第4位开始截取后面的数字
	 */
	public static String getOrderNo(String out_trade_no) {
		return out_trade_no.substring(4, 14);
	}

	/**
	 * 日期
	 */
	public static String getTime() {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
		String dateTime = formatter.format(new Date());
		return dateTime;
	}

	/**
	 * 给移动端的参数
	 * 
	 * @param userID
	 * @param agrNo
	 */
	public static Map<String, String> reqDataMap(String Amount,
			String out_trade_no, String agrNo, String userID,
			String payNoticeUrl, String signNoticeUrl, String returnUrl) {
		Map<String, String> reqData = new TreeMap<String, String>();
		reqData.put("dateTime", getTime());
		reqData.put("branchNo", ConfigUtil.getConfig(YWT_BRANCHNO));
		reqData.put("merchantNo", ConfigUtil.getConfig(YWT_MERCHANTNO));
		reqData.put("date", DateUtil.getShortCurrTimes().replaceAll("-", ""));
		reqData.put("orderNo", YwtUtils.getOrderNo(out_trade_no));
		reqData.put("amount", Amount);
		reqData.put("payNoticeUrl", payNoticeUrl);
		reqData.put("agrNo", agrNo);
		reqData.put("merchantSerialNo", YwtUtils.getMerchantSerialNo());
		reqData.put("userID", userID);
		reqData.put("signNoticeUrl", signNoticeUrl);
		reqData.put("returnUrl", returnUrl);
		return reqData;
	}

	/**
	 * 签约回调招行服务端返回的参数(验签)
	 */
	public static Map<String, String> SignedNoticeDataMap(
			HttpServletRequest request) {
		String parameter = request.getParameter("jsonRequestData");
		logger.info("签约parameter:" + parameter);
		JSONObject json = new JSONObject().parseObject(parameter);
		JSONObject NoticeData = new JSONObject().parseObject(json
				.getString(("noticeData")));
		SortedMap<String, String> signedNoticeData = new TreeMap<>();
		signedNoticeData.put("dateTime", (String) NoticeData.get("dateTime"));
		signedNoticeData.put("rspCode", (String) NoticeData.get("rspCode"));
		signedNoticeData.put("rspMsg", (String) NoticeData.get("rspMsg"));
		signedNoticeData.put("noticeType",
				(String) NoticeData.get("noticeType"));
		signedNoticeData.put("noticeSerialNo",
				(String) NoticeData.get("noticeSerialNo"));
		signedNoticeData.put("branchNo", (String) NoticeData.get("branchNo"));
		signedNoticeData.put("merchantNo",
				(String) NoticeData.get("merchantNo"));
		signedNoticeData.put("noticeUrl", (String) NoticeData.get("noticeUrl"));
		signedNoticeData.put("httpMethod",
				(String) NoticeData.get("httpMethod"));
		signedNoticeData.put("agrNo", (String) NoticeData.get("agrNo"));
		signedNoticeData.put("noticePara",
				(String) NoticeData.get("noticePara"));
		signedNoticeData.put("userID", (String) NoticeData.get("userID"));
		signedNoticeData.put("userPidType",
				(String) NoticeData.get("userPidType"));
		signedNoticeData.put("userPidHash",
				(String) NoticeData.get("userPidHash"));
		signedNoticeData.put("noPwdPay", (String) NoticeData.get("noPwdPay"));
		return signedNoticeData;
	}

	/**
	 * 支付回调招行服务端返回的参数(验签)
	 */
	public static Map<String, String> CallBackNoticeDataMap(
			HttpServletRequest request) {
		String parameter = request.getParameter("jsonRequestData");
		logger.info("parameter:" + parameter);
		JSONObject json = new JSONObject().parseObject(parameter);
		JSONObject backNoticeData = new JSONObject().parseObject(json
				.getString(("noticeData")));
		SortedMap<String, String> noticeData = new TreeMap<>();
		noticeData.put("dateTime", (String) backNoticeData.get("dateTime"));
		noticeData.put("noticeUrl", (String) backNoticeData.get("noticeUrl"));
		noticeData.put("httpMethod", (String) backNoticeData.get("httpMethod"));
		noticeData.put("branchNo", (String) backNoticeData.get("branchNo"));
		noticeData.put("merchantNo", (String) backNoticeData.get("merchantNo"));
		noticeData.put("noticeType", (String) backNoticeData.get("noticeType"));
		noticeData.put("noticeSerialNo",
				(String) backNoticeData.get("noticeSerialNo"));
		noticeData.put("date", (String) backNoticeData.get("date"));
		noticeData.put("orderNo", (String) backNoticeData.get("orderNo"));
		noticeData.put("amount", (String) backNoticeData.get("amount"));
		noticeData.put("bankDate", (String) backNoticeData.get("bankDate"));
		noticeData.put("bankSerialNo",
				(String) backNoticeData.get("bankSerialNo"));
		noticeData.put("discountFlag",
				(String) backNoticeData.get("discountFlag"));
		noticeData.put("discountAmount",
				(String) backNoticeData.get("discountAmount"));
		noticeData.put("merchantPara",
				(String) backNoticeData.get("merchantPara"));
		noticeData.put("cardType", (String) backNoticeData.get("cardType"));
		return noticeData;
	}

	/**
	 * 对参数按字典顺序排序，不区分大小写(Key排序)
	 */
	public static List<String> sortParams(Map<String, String> reqDataMap) {
		List<String> list = new ArrayList<String>(reqDataMap.keySet());
		Collections.sort(list, new Comparator<String>() {
			public int compare(String o1, String o2) {
				String[] temp = { o1.toLowerCase(), o2.toLowerCase() };
				Arrays.sort(temp);
				if (o1.equalsIgnoreCase(temp[0])) {
					return -1;
				} else if (temp[0].equalsIgnoreCase(temp[1])) {
					return 0;
				} else {
					return 1;
				}
			}
		});
		return list;
	}

	/**
	 * 待签名字符串
	 */
	public static String strToSign(Map<String, String> reqDataMap) {

		StringBuffer buffer = new StringBuffer();
		List<String> keyList = sortParams(reqDataMap);
		for (String key : keyList) {
			buffer.append(key).append("=").append(reqDataMap.get(key))
					.append("&");
		}
		buffer.append(ConfigUtil.getConfig(YWT_SECRETKEY));
		return buffer.toString();

	}

	/**
	 * 待验签字符串
	 */
	public static String verifyStrToSign(Map<String, String> noticeData) {

		StringBuffer buffer = new StringBuffer();
		List<String> keyList = sortParams(noticeData);
		for (String key : keyList) {
			buffer.append(key).append("=").append(noticeData.get(key))
					.append("&");
		}
		return buffer.toString().substring(0, buffer.toString().length() - 1);

	}

	/**
	 * 对参数签名：
	 * 对reqData所有请求参数按从a到z的字典顺序排列，如果首字母相同，按第二个字母排列，以此类推。排序完成后按将所有键值对以“&”符号拼接。
	 * com.jiabian.callback.yiwangtong 方法名：sign 创建人：潇洒 时间：2016-12-1-下午8:35:58
	 */
	public static String sign(Map<String, String> reqDataMap) {
		String strToSign = strToSign(reqDataMap);
		try {
			// 创建加密对象
			MessageDigest messageDigest = MessageDigest.getInstance(SIGNTYPE);
			// 传入要加密的字符串,按指定的字符集将字符串转换为字节流
			messageDigest.update(strToSign.getBytes(Constants.ENCODING));
			byte byteBuffer[] = messageDigest.digest();

			// 將 byte转换为16进制string
			StringBuffer strHexString = new StringBuffer();
			for (int i = 0; i < byteBuffer.length; i++) {
				String hex = Integer.toHexString(0xff & byteBuffer[i]);
				if (hex.length() == 1) {
					strHexString.append('0');
				}
				strHexString.append(hex);
			}
			return strHexString.toString();

		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return "";
	}

	/**
	 * 给移动端返回的数据
	 */
	public static Response<String, String> jsonRequestData(
			Map<String, String> reqDataMap, String sign) {
		Response<String, String> response = new Response<>();
		response.setReqData(reqDataMap);
		response.setSign(sign);
		return response;
	}

	/**
	 * 验签
	 */
	public static boolean isValidSignature(String strToSign, String sign,
			String fbPubKey) {
		try {
			KeyFactory keyFactory = KeyFactory.getInstance("RSA");
			byte[] encodedKey = Base64Utils.decode(fbPubKey);
			PublicKey pubKey = keyFactory
					.generatePublic(new X509EncodedKeySpec(encodedKey));
			Signature signature = Signature.getInstance("SHA1WithRSA");

			signature.initVerify((java.security.PublicKey) pubKey);
			signature.update(strToSign.getBytes(Constants.ENCODING));

			boolean bverify = signature.verify(Base64Utils.decode(sign));
			return bverify;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}