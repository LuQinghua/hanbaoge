package com.jiabian.sso.biz;

import com.jiabian.user.response.UserRes;
import com.jiabian.util.Result;
import com.jiabian.util.SMSEnum;


/**
 * 用户服务接口层
 * IUserServiceBiz
 * 创建人:何雪平 
 * 时间：2016年11月3日-上午9:35:36 
 * @version 1.0.0
 *
 */
public interface IUsersServiceBiz {

	/**
	 * 用户登录
	 * com.jiabian.sso.biz 
	 * 方法名：selectlogin
	 * 创建人：何雪平 
	 * 时间：2017年1月17日-上午10:21:14 
	 * @param userAccount
	 * @param userPwd
	 * @param sid
	 * @param type
	 * @return Result<UserRes>
	 * @exception 
	 * @since  1.0.0
	 */
	Result<UserRes> selectLogin(String userAccount,String userPwd,String sid,Integer type);
	
	/**
	 * 用户注册
	 * com.jiabian.sso.biz 
	 * 方法名：insertRegister
	 * 创建人：何雪平 
	 * 时间：2017年1月18日-下午3:03:34 
	 * @param userTel
	 * @param userPwd
	 * @param verCode
	 * @param userSource
	 * @param smsEnum
	 * @return Result<UserRes>
	 * @exception 
	 * @since  1.0.0
	 */
	Result<UserRes> insertRegister(String userTel, String userPwd, String verCode,Byte userSource,SMSEnum smsEnum);
}
