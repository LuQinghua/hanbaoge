package com.jiabian.util;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;

import com.jiabian.cache.JedisUtil;
import com.jiabian.user.response.UserRes;

/**
 * 用户相关操作辅助类
 */
public class UserUtil {

	private static JedisUtil jedisUtil;

	public static Long getLoginUserId(HttpServletRequest request) {

		String sid = decryptSid(getHttpSid(request));
		if(StringUtils.isBlank(sid)){
			return null;
		}
		String res = jedisUtil.get(getUserSessionKey(Long.parseLong(sid.split("-")[0])));
		if(StringUtils.isBlank(res)){
			return null;
		}
		return Long.parseLong(res);
	}
	

	/**
	 * 获取sid
	 * 
	 * @return
	 */
	public static String getHttpSid(HttpServletRequest request) {
		return request.getHeader("sid");
	}

	/**
	 * 保存用户登录信息
	 */
	public static String saveUsersSession(UserRes loginRes) {

		jedisUtil.save(getUserSessionKey(loginRes.getId()), loginRes.getId().toString());
		return getSid(loginRes);

	}

	public static void clearUserSession(Long userId) {
		jedisUtil.del(getUserSessionKey(userId));
	}

	public static String getUserSessionKey(Long userId) {
		return new StringBuilder().append(Constants.USER_SESSION)
				.append(userId).toString();
	}

	public static String getSid(UserRes loginRes) {

		return SecurityUtils.encryptByDESAndEncodeByBase64(
				new StringBuilder().append(loginRes.getId()).append("-")
						.append(loginRes.getLastLogTime().getTime())
						.append("-").append(loginRes.getDevice()).toString(),
						ConfigUtil.getConfig(Constants.API_SECRET));
	}

	public static String decryptSid(String sid) {

		return SecurityUtils.decryptByDESAndDecodeByBase64(sid,
				ConfigUtil.getConfig(Constants.API_SECRET));
	}

	public static void main(String[] args) {
		UserRes loginRes = new UserRes();
		loginRes.setId(1l);
		loginRes.setLastLogTime(new Date());
		loginRes.setDevice("aaa");
		jedisUtil.save("a", loginRes.toString());
		System.out.println(jedisUtil.getList("a", UserRes.class));
	}
}
