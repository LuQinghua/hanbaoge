/**
 * 家边网络科技有限公司
 * jiabian-core
 * com.jiabian.callback.yiwangtong
 * ywtPay.java
 * 创建人:潇洒
 * 时间：2016-11-25-下午4:26:46 
 * 2016家边网络科技有限公司-版权所有
 */
package com.jiabian.callback.yiwangtong;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.alibaba.fastjson.JSONObject;
import com.jiabian.cache.JedisUtil;

/**
 * YwtSigned 创建人:潇洒 时间：2016-11-25-下午4:26:46
 */
public class YwtPay {
	private static final Logger logger = LogManager.getLogger(YwtPay.class
			.getName());

	/**
	 * 一网通支付,给移动端返回的参数
	 */
	public static Response<String, String> YwtAppPay(String Amount,
			String out_trade_no, String agrNo, String userID,
			String payNoticeUrl, String signNoticeUrl, String returnUrl) {

		Map<String, String> reqDataMap = YwtUtils.reqDataMap(Amount,
				out_trade_no, agrNo, userID, payNoticeUrl, signNoticeUrl,
				returnUrl);
		logger.info("给移动端的参数放到map里:" + reqDataMap);
		List<String> sortParams = YwtUtils.sortParams(reqDataMap);
		logger.info("字典排序:" + sortParams);
		String sign = YwtUtils.sign(reqDataMap);
		logger.info("给移动端发送数据时的签名:" + sign);
		return YwtUtils.jsonRequestData(reqDataMap, sign);
	}

	/**
	 * 一网通签约回调
	 */
	public static boolean YwtSignedCallBack(HttpServletRequest request) {

		Map<String, String> signedNoticeData = YwtUtils
				.SignedNoticeDataMap(request);

		List<String> sortParams = YwtUtils.sortParams(signedNoticeData);
		logger.info("签约回调字典排序:" + sortParams);
		String strToSign = YwtUtils.verifyStrToSign(signedNoticeData);
		logger.info("签约回调拼接的字符串strToSign:" + strToSign);

		String parameter = request.getParameter("jsonRequestData");
		JSONObject json = new JSONObject().parseObject(parameter);
		String sign = json.getString("sign");
		// 获得公钥
		String fbPubKey = JedisUtil.get(YwtUtils.FBPUBKEY);
		logger.info("签约回调获取公钥fbPubKey:" + fbPubKey);
		String Keysign = FbPubKey.strToSign(FbPubKey.reqDataMap());
		logger.info("签约回调获取公钥sign签名:" + Keysign);

		return YwtUtils.isValidSignature(strToSign, sign, fbPubKey);
	}

	/**
	 * 一网通支付回调
	 */
	public static boolean YwtPayCallBack(HttpServletRequest request) {

		String parameter = request.getParameter("jsonRequestData");
		JSONObject json = new JSONObject().parseObject(parameter);
		String sign = json.getString("sign");

		Map<String, String> noticeData = YwtUtils
				.CallBackNoticeDataMap(request);
		logger.info("一网通回调map:" + noticeData);
		String strToSign = YwtUtils.verifyStrToSign(noticeData);
		logger.info("待签名字符串:" + strToSign);
		// 获得公钥
		String fbPubKey = JedisUtil.get(YwtUtils.FBPUBKEY);
		logger.info("支付回调公钥fbPubKey:" + fbPubKey);

		if (fbPubKey.equals("false")) {
			return false;
		}
		return YwtUtils.isValidSignature(strToSign, sign, fbPubKey);
	}

}