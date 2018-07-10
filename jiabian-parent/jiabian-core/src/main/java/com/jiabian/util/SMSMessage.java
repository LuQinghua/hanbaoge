package com.jiabian.util;

public class SMSMessage {

	public static final String JB_NAME = "家边生活";
	public static final String RG_CONTENT = "注册";
	public static final String LOGIN_CONTENT = "登录";
	public static final String CHANGE_PWD = "修改密码";
	public static final String PWD_CONTENT = "忘记密码";
	public static final String CHANGE_PHONE = "更改手机号码";
	public static final String BIND_CONTENT = "手机号码绑定";

	/**
	 * 获取发送的短信内容
	 * 
	 * @param code
	 * @param smsEnum
	 * @return
	 */
	public static String getMessage(String code, SMSEnum smsEnum) {
		switch (smsEnum) {
		case JB_REGIST:
			return appendMesssage(JB_NAME, code, RG_CONTENT);
		case JB_LOGIN:
			return appendMesssage(JB_NAME, code, LOGIN_CONTENT);
		case JB_MPWD:
			return appendMesssage(JB_NAME, code, CHANGE_PWD);
		case JB_FPWD:
			return appendMesssage(JB_NAME, code, PWD_CONTENT);
		case JB_MPHONE:
			return appendMesssage(JB_NAME, code, CHANGE_PHONE);
		case JB_BPHONE:
			return appendMesssage(JB_NAME, code, BIND_CONTENT);
		case SC_REGIST:
			return appendMesssage(JB_NAME, code, RG_CONTENT);
		case SC_BPHONE:
			return appendMesssage(JB_NAME, code, BIND_CONTENT);
		case SC_MPHONE:
			return appendMesssage(JB_NAME, code, CHANGE_PHONE);
		case SC_MPWD:
			return appendMesssage(JB_NAME, code, PWD_CONTENT);
		case SC_LOGIN:
			return appendMesssage(JB_NAME, code, LOGIN_CONTENT);
		default:
			return null;
		}
	}

	public static String appendMesssage(String name, String code, String content) {
		return StrTools.appendString("【", name, "】您的短信验证码为:", "，仅用于用户", code,
				content, "校验，短信验证码的有效时间为5分钟。");
	}
}
