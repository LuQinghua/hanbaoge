/**
 * 家边网络科技有限公司
 * jiabian-core
 * com.jiabian.callback.alipay
 * Alipay.java
 * 创建人:潇洒
 * 时间：2016-11-25-下午4:19:03 
 * 2016家边网络科技有限公司-版权所有
 */
package com.jiabian.callback.alipay;

import java.util.Map;
import java.util.SortedMap;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.alipay.api.internal.util.AlipaySignature;
import com.jiabian.util.ConfigUtil;
import com.jiabian.util.Constants;
import com.jiabian.util.StrTools;

/**
 * Alipay 
 * 创建人:潇洒 
 * 时间：2016-11-25-下午4:19:03
 */
public class Alipay {
	private static final Logger logger = LogManager.getLogger(Alipay.class
			.getName());

	/**
	 * 给移动端返回的数据
	 */
	public static String aliAppPay(String out_trade_no, String subject, String total_amount,String notify_url) {
		Map<String, String> paramMap = AliPayUtils.buildOrderParamMap(out_trade_no, subject, total_amount,notify_url);
		logger.info("paramMap---"+paramMap);
		String orderParam = AliPayUtils.buildOrderParam(paramMap);
		logger.info("orderParam---"+orderParam);
		String sign = AliPayUtils.getSigning(paramMap, ConfigUtil.getConfig(AliPayUtils.APP_PRIVATE_KEY));
		logger.info("sign---"+sign);
		return StrTools.appendString(orderParam,"&",sign);
	}

	
	
	/**
	 * 支付宝回调
	 */
	public static boolean aliPayCallBack(HttpServletRequest request) {
		SortedMap<String, String> map = AliPayUtils.getMap(request);
		if(map == null){
			return false;
		}
		try {
			// 验签
			boolean signVerified  = AlipaySignature.rsaCheckV1(map,
					ConfigUtil.getConfig(AliPayUtils.APP_PUBLIC_KEY), Constants.ENCODING);
			if (!signVerified) {
				return signVerified;
			} 
			// 验证app_id是否为该商户本身
			if (!request.getParameter("app_id").equals(ConfigUtil.getConfig(AliPayUtils.APP_ID))) {
				return false;
			}
			if (!request.getParameter("seller_id").equals(ConfigUtil.getConfig(AliPayUtils.SELLER_ID))) {
				return false;
			}
			return signVerified;
		
		} catch (Exception e) {
			logger.error(e);
			return false;
		}
	}
}
