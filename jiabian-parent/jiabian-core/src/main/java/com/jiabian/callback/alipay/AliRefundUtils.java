package com.jiabian.callback.alipay;

import java.math.BigDecimal;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradeRefundRequest;
import com.alipay.api.response.AlipayTradeRefundResponse;
import com.jiabian.json.JsonUtils;
import com.jiabian.util.ConfigUtil;
import com.jiabian.util.Constants;
import com.jiabian.util.StrTools;

public class AliRefundUtils {

	private static final Logger logger = LogManager
			.getLogger(AliRefundUtils.class.getName());

	public static AlipayTradeRefundResponse alipayRefund(String out_trade_no,
			BigDecimal refund_amount, String refund_reason, String platform)
			throws AlipayApiException {

		AlipayClient alipayClient = new DefaultAlipayClient(
				AliPayUtils.ALIPAY_GATEWAY, ConfigUtil.getConfig(AliPayUtils.APP_ID),
				ConfigUtil.getConfig(AliPayUtils.APP_PRIVATE_KEY), Constants.DATA_TYPE,
				Constants.ENCODING, ConfigUtil.getConfig(AliPayUtils.APP_PUBLIC_KEY));

		AlipayTradeRefundRequest request = new AlipayTradeRefundRequest();
		AlipayRefundInfo alidata = new AlipayRefundInfo();
		alidata.setOut_trade_no(out_trade_no);
		alidata.setRefund_amount(refund_amount);
		alidata.setRefund_reason(refund_reason);
		alidata.setOut_request_no(getOutRequestNo(platform));
		request.setBizContent(JsonUtils.objectToJson(alidata));
		AlipayTradeRefundResponse response = alipayClient.execute(request);
		return response;
	}

	/**
	 * 标识一次退款请求的字符串
	 */
	public static String getOutRequestNo(String platform) {
		return  StrTools.appendString(platform,RandomStringUtils.randomAlphanumeric(7).toUpperCase());
	}
}
