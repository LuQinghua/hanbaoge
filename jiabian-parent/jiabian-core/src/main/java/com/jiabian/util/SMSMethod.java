package com.jiabian.util;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;

import com.jiabian.util.ResponseEnum.UsersResEnum;

/**
 * SMSMethod
 * 创建人:熊天威
 * 时间：2017年3月7日-下午1:15:56 
 * @version 1.0.0
 *
 */
public class SMSMethod {

	/**
	 * 发送验证码
	 * com.jiabian.util 
	 * 方法名：registerSHSendCode
	 * 创建人：熊天威
	 * 时间：2017年3月7日-下午1:16:24 
	 * @param userTel
	 * @param flag
	 * @return Result<Long>
	 * @exception 
	 * @since  1.0.0
	 */
	public static Result sendCode(String userTel,String flag) {
		Result result = new Result();
		SMSEnum sendType=null;
		if(flag.equals("register")){
			sendType=SMSEnum.JB_REGIST;
		}else if(flag.equals("updatePwd")){
			sendType=SMSEnum.JB_MPWD;
		}else if(flag.equals("updateUserTel")){
			sendType=SMSEnum.JB_MPHONE;
		}else if(flag.equals("binding")){
			sendType=SMSEnum.JB_BPHONE;
		}
		if(sendType==null){
			result.setResult(ResponseEnum.SMS_FAIL.result());
			result.setDesc("请填写发送类型");
			return result;
		}
		//给手机发送验证码
		if(userTel!="" && userTel!=null){
			Integer msg = SMSUtils.sendMsg(sendType,userTel);
			if(msg==ResponseEnum.SMS_EXISTS.result()){
				result.setResult(ResponseEnum.SMS_EXISTS.result());
				result.setDesc(ResponseEnum.SMS_EXISTS.desc());
				result.setStatus(false);
			}
			if(msg==ResponseEnum.SMS_MAX_COUNT.result()){
				result.setResult(ResponseEnum.SMS_MAX_COUNT.result());
				result.setDesc(ResponseEnum.SMS_MAX_COUNT.desc());
				result.setStatus(false);
			}
			if(msg==ResponseEnum.SMS_FAIL.result()){
				result.setResult(ResponseEnum.SMS_FAIL.result());
				result.setDesc(ResponseEnum.SMS_FAIL.desc());
				result.setStatus(false);
			}
			if(msg==ResponseEnum.SMS_OK.result()){
				result.setResult(ResponseEnum.SMS_OK.result());
				result.setDesc(ResponseEnum.SMS_OK.desc());
				result.setStatus(true);
			}
			return result;
		}else{
			result.setResult(ResponseEnum.SMS_FAIL.result());
			result.setDesc("请填写手机号码");
		}
		return result;
	}
	
	
	/**
	 * 验证短信码
	 * com.jiabian.util 
	 * 方法名：verifySHCode
	 * 创建人：熊天威
	 * 时间：2017年3月7日-下午1:37:10 
	 * @param userTel
	 * @param smsCode
	 * @param smsEnum
	 * @param response
	 * @return Result
	 * @exception 
	 * @since  1.0.0
	 */
	public static Result verifyCode(String userTel,String smsCode,SMSEnum smsEnum ,HttpServletResponse response) {
		Result result = new Result();
		if(userTel==null || smsCode==""){
			result.setResult(UsersResEnum.USER_SMS_NULL.result());
			result.setDesc(UsersResEnum.USER_SMS_NULL.desc());
			return result;
		}
		String jediscode = SMSUtils.getSMSCode(smsEnum,userTel);
		if(jediscode!=null){
			// 判断用户输入的验证码是否为空
			if (StringUtils.isBlank(smsCode)) {
				result.setResult(UsersResEnum.USER_SMS_NULL.result());
				result.setDesc(UsersResEnum.USER_SMS_NULL.desc());
				result.setStatus(false);
				return result;
			}
			// 判断验证码是否正确
			if (!(jediscode.equals(smsCode))) {
				result.setResult(UsersResEnum.USER_SMS_ERR.result());
				result.setDesc(UsersResEnum.USER_SMS_ERR.desc());
				result.setStatus(false);
				return result; 
			}
		}else{
			result.setResult(UsersResEnum.USER_SMS_ERR.result());
			result.setDesc(UsersResEnum.USER_SMS_ERR.desc());
		}
		return result;
	}
}
