package com.jiabian.util;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.springframework.beans.factory.annotation.Autowired;

import redis.clients.jedis.JedisCluster;

import com.jiabian.cache.JedisUtil;

public class SMSUtils {
	private static HttpClient httpclient;

	private final static Long MAX_NUM = 10l;// 最大发送次数

	@Autowired
	JedisCluster jedisCluster;

	/**
	 * 
	 * 短信验证码发送 com.jiabian.util 方法名：sendMsg 创建人：黄世平 时间：2016年11月7日-下午1:19:18
	 * 
	 * @param smsEnum
	 * @param userTel
	 *            手机号码
	 * @return Integer
	 * @exception
	 * @since 1.0.0
	 */
	public static Integer sendMsg(SMSEnum smsEnum, String userTel) {

		// 判定验证码是否失效
		if (JedisUtil.exists(getSmsKey(userTel, smsEnum))) {
			return ResponseEnum.SMS_EXISTS.result();
		}

		String smsCode = getCode();
		Integer result = hxSend(SMSMessage.getMessage(smsCode, smsEnum),
				userTel);
		if (result == ResponseEnum.SMS_OK.result()) {
			JedisUtil.save(getSmsKey(userTel, smsEnum),
					Constants.HX_SMS_EXPIRAT, smsCode);
		}
		return result;
	}

	/**
	 * 
	 * 获取验证码 com.jiabian.util 方法名：getSMSCode 创建人：黄世平 时间：2016年11月7日-下午1:20:04
	 * 
	 * @param SMSEnum
	 * @param userTel
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public static String getSMSCode(SMSEnum SMSEnum, String userTel) {
		return JedisUtil.get(getSmsKey(userTel, SMSEnum));
	}

	public static void main(String[] args) {
		// System.out.println(hxSend(SMSMessage.getMessage("12345",
		// SMSEnum.SH_REGIST),"13758144686"));
		JedisUtil.expire("13758144686", 2);
		System.out.println(getSmsKey("137581446", SMSEnum.JB_BPHONE));
	}

	/**
	 * 华信短信发送
	 * 
	 * @param msg
	 * @param userTel
	 * @return
	 */
	public static Integer hxSend(String msg, String userTel) {
		Long count = JedisUtil.incr(userTel);
		checkExpire(count, userTel);
		if (count > MAX_NUM) {
			return ResponseEnum.SMS_MAX_COUNT.result();
		}
		try {
			httpclient = new SSLClient();
			String url = Constants.HX_SMS_URL;
			HttpPost post = new HttpPost(url);
			post.setHeader("Content-type",
					"application/x-www-form-urlencoded;charset=utf-8");
			List<NameValuePair> nvps = new ArrayList<NameValuePair>();
			nvps.add(new BasicNameValuePair("action", "send"));
			nvps.add(new BasicNameValuePair("userid", ""));
			nvps.add(new BasicNameValuePair("account", ConfigUtil
					.getConfig(Constants.HX_SMS_ACCOUNT)));
			nvps.add(new BasicNameValuePair("password", ConfigUtil
					.getConfig(Constants.HX_SMS_PWD)));
			nvps.add(new BasicNameValuePair("mobile", userTel)); // 多个手机号用逗号分隔
			nvps.add(new BasicNameValuePair("content", msg));
			nvps.add(new BasicNameValuePair("sendTime", ""));
			nvps.add(new BasicNameValuePair("extno", ""));

			post.setEntity(new UrlEncodedFormEntity(nvps, HTTP.UTF_8));

			HttpResponse response = httpclient.execute(post);
			HttpEntity entity = response.getEntity();
			// 将字符转化为XML
			String returnString = EntityUtils.toString(entity, "UTF-8");
			Document doc = DocumentHelper.parseText(returnString);
			// 获取根节点
			Element rootElt = doc.getRootElement();
			// 获取根节点下的子节点的值
			String returnstatus = rootElt.elementText("returnstatus").trim();
			System.out.println(returnstatus);
			if (!StringUtils.isBlank(returnstatus)
					&& returnstatus.equals("Success")) {
				return ResponseEnum.SMS_OK.result();
			}
		} catch (UnsupportedEncodingException e) {
			return ResponseEnum.SMS_FAIL.result();
		} catch (ClientProtocolException e) {
			return ResponseEnum.SMS_FAIL.result();
		} catch (IOException e) {
			return ResponseEnum.SMS_FAIL.result();
		} catch (Exception e) {
			return ResponseEnum.SMS_FAIL.result();
		}

		return ResponseEnum.SMS_FAIL.result();
	}

	/**
	 * 
	 * 获取一个随机码 com.jiabian.util 方法名：getCode 创建人：黄世平 时间：2016年11月7日-下午1:20:46
	 * 
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public static String getCode() {
		return RandomStringUtils.randomNumeric(6);
	}

	/**
	 * 
	 * 得到短信的key com.jiabian.util 方法名：getSmsKey 创建人：黄世平 时间：2016年11月7日-下午1:21:19
	 * 
	 * @param userTel
	 * @param SMSEnum
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public static String getSmsKey(String userTel, SMSEnum SMSEnum) {

		return new StringBuilder().append(SMSEnum).append(userTel).toString();
	}

	/**
	 * 
	 * 设置手机号码过期时间 com.jiabian.util 方法名：checkExpire 创建人：黄世平
	 * 时间：2016年11月7日-下午1:22:02
	 * 
	 * @param count
	 * @param userTel
	 *            void
	 * @exception
	 * @since 1.0.0
	 */
	public static void checkExpire(Long count, String userTel) {
		if (count > 1) {
			return;
		}
		JedisUtil.expire(userTel, Constants.HX_SMS_LIMIT_EXPIRAT);
	}

	public static Integer sendShoppingReminderSMS(String shopName,String price) {
		return hxSend(StrTools.appendString("【家边生活】新订单提醒：用户在", shopName,
				"店下单提醒！下单金额", price, "，请尽快处理！"), "18268082619");//
	}

}
