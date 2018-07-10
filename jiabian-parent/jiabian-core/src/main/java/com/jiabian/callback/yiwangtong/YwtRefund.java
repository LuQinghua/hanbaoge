package com.jiabian.callback.yiwangtong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.jiabian.util.Constants;

/**
 * 一网通退款 YwtRefund 创建人:潇洒 时间：2017年1月10日-下午5:18:18
 */
public class YwtRefund {
	private static final Logger logger = LogManager.getLogger(YwtRefund.class
			.getName());

	/**
	 * 组装发送的报文
	 */
	public static String YwtAppRefund(String orderNo, String amount, String desc) {

		// 组成签名的map
		Map<String, String> refundReqData = YwtRefundUtils.getRefundReqData(
				orderNo, amount, desc);
		// 拼接字符串
		List<String> sortParams = YwtUtils.sortParams(refundReqData);
		logger.info("sortParams:" + sortParams);
		// 签名
		String sign = YwtUtils.sign(refundReqData);
		logger.info("sign:" + sign);
		// Response
		Response<String, String> jsonRequestData = YwtUtils.jsonRequestData(
				refundReqData, sign);
		return JSON.toJSONString(jsonRequestData);

	}

	/**
	 * 发送POST请求
	 */
	public static String getResponse(String orderNo, String amount, String desc) {

		String ywtAppRefund = YwtAppRefund(orderNo, amount, desc);

		OutputStreamWriter out = null;
		BufferedReader in = null;
		StringBuffer result = new StringBuffer();
		try {
			URL httpUrl = new URL(YwtRefundUtils.REFUND);
			HttpURLConnection urlCon = (HttpURLConnection) httpUrl
					.openConnection();
			urlCon.setRequestMethod("POST");
			urlCon.setRequestProperty("Content-type",
					"application/x-www-form-urlencoded");
			urlCon.setDoOutput(true);
			urlCon.setDoInput(true);
			urlCon.setReadTimeout(5 * 1000);
			out = new OutputStreamWriter(urlCon.getOutputStream(),
					Constants.ENCODING);
			out.write("jsonRequestData=" + ywtAppRefund);
			out.flush();

			in = new BufferedReader(new InputStreamReader(
					urlCon.getInputStream(), Constants.ENCODING));
			String str = null;
			while ((str = in.readLine()) != null) {
				result.append(str);
			}

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (out != null) {
					out.close();
				}
				if (in != null) {
					in.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return result.toString();
	}
}
