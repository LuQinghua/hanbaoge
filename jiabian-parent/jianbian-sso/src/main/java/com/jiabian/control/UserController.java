package com.jiabian.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.jiabian.shop.biz.ISCUserServiceBiz;
import com.jiabian.sso.biz.IUsersServiceBiz;
import com.jiabian.user.response.UserRes;
import com.jiabian.util.Result;
import com.jiabian.util.SMSEnum;
/**
 * 用户控制层
 * UserController
 * 创建人:何雪平 
 * 时间：2016年10月28日-下午1:17:28 
 * @version 1.0.0
 *
 */
@CrossOrigin(origins = "*")
@Controller
@RequestMapping(value = "/user")
public class UserController {
	
	@Autowired
	IUsersServiceBiz usersServiceBiz;
	
	@Autowired
	ISCUserServiceBiz iSCUserServiceBiz;
	
	@Value("${QN_IMG_URL}")
	private String QN_IMG_URL;
	

	/**
	 * 用户登录
	 * com.jiabian.control 
	 * 方法名：login
	 * 创建人：何雪平 
	 * 时间：2016年10月25日-下午2:47:41 
	 * @param username
	 * @param password
	 * @return Result<LoginRes>
	 * @exception 
	 * @since  1.0.0
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	@ResponseBody
	public Result<UserRes> login(
			@RequestParam(value = "userAccount") String userAccount,
			@RequestParam(value = "userPwd") String userPwd,
			@RequestParam(value = "sid") String sid,
			@RequestParam(value = "type") Integer type) {
		return usersServiceBiz.selectLogin(userAccount, userPwd, sid, type);
	}
	
	/**
	 * 用户注册
	 * com.jiabian.control 
	 * 方法名：register
	 * 创建人：何雪平 
	 * 时间：2016年10月29日-下午1:46:21 
	 * @param userTel
	 * @param userPwd
	 * @param verCode
	 * @return Result<RegisterRes>
	 * @exception 
	 * @since  1.0.0
	 */
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	@ResponseBody
	public Result<UserRes> register(
			@RequestParam(value = "userTel") String userTel,
			@RequestParam(value = "userPwd") String userPwd,
			@RequestParam(value = "verCode") String verCode,
			@RequestParam(value = "userSource") Byte userSource,
			SMSEnum smsEnum) {
		return usersServiceBiz.insertRegister(userTel, userPwd, verCode,userSource, smsEnum);
	}
	
	
	/**
	 * 查询用户基本信息
	 * com.jiabian.control 
	 * 方法名：selectUserBaseById
	 * 创建人：何雪平 
	 * 时间：2016年10月27日-下午12:56:36 
	 * @param id
	 * @return Result<Map<String,Object>>
	 * @exception 
	 * @since  1.0.0
	 */
	@RequestMapping(value = "/base", method = RequestMethod.POST)
	@ResponseBody
	public Result<UserRes> selectUserBaseById(
			@RequestParam(value = "id") Long id) {
		return iSCUserServiceBiz.selectUserBaseById(id);
	}
	
	
	/**
	 * 手机验证码核验
	 * com.jiabian.control 
	 * 方法名：telSmsCheck
	 * 创建人：何雪平 
	 * 时间：2016年11月10日-上午10:28:48 
	 * @param userTel
	 * @param verCode
	 * @param smsEnum
	 * @return Result<JSONObject>
	 * @exception 
	 * @since  1.0.0
	 */
	@RequestMapping(value = "/check", method = RequestMethod.POST)
	@ResponseBody
	public Result<JSONObject> telSmsCheck(
			@RequestParam(value = "userTel") String userTel,
			@RequestParam(value = "verCode") String verCode,
			SMSEnum smsEnum) {
		return iSCUserServiceBiz.telSmsCheck(userTel, verCode,smsEnum);
	}

	/**
	 * 更新用户密码
	 * com.jiabian.control 
	 * 方法名：updatePwd
	 * 创建人：何雪平 
	 * 时间：2016年11月8日-下午1:30:13 
	 * @param userTel
	 * @param userPwd
	 * @return Result<JSONObject>
	 * @exception 
	 * @since  1.0.0
	 */
	@RequestMapping(value = "/pwd/update", method = RequestMethod.POST)
	@ResponseBody
	public Result<JSONObject> updatePwd(
			@RequestParam(value = "userTel") String userTel,
			@RequestParam(value = "userPwd") String userPwd){
		return iSCUserServiceBiz.updatePwd(userTel, userPwd);
	}
	
	/**
	 * 绑定手机 
	 * com.jiabian.control 
	 * 方法名：BoundTel
	 * 创建人：何雪平
	 * 时间：2016年11月9日-上午9:31:23 
	 * @param BoundTel
	 * @param verCode
	 * @param id
	 * @param status
	 * @return Result<JSONObject>
	 * @exception 
	 * @since  1.0.0
	 */
	@RequestMapping(value = "/bound", method = RequestMethod.POST)
	@ResponseBody
	public Result<JSONObject> BoundTel(
			@RequestParam(value = "userTel") String userTel,
			@RequestParam(value = "verCode") String verCode,
			@RequestParam(value = "id") Long id,
			SMSEnum smsEnum) {
		return iSCUserServiceBiz.boundTel(userTel, verCode,id,smsEnum);
	}
	
	/**
	 * 查询用户详情信息
	 * com.jiabian.control 
	 * 方法名：userDetail
	 * 创建人：何雪平 
	 * 时间：2016年11月9日-下午1:14:16 
	 * @param id
	 * @return Result<UserRes>
	 * @exception 
	 * @since  1.0.0
	 */
	@RequestMapping(value = "/detail", method = RequestMethod.POST)
	@ResponseBody
	public Result<UserRes> userDetail(
			@RequestParam(value = "id") Long id) {
		return iSCUserServiceBiz.selectUserDetailById(id);
	}
	
	/**
	 * 查询用户名修改状态
	 * com.jiabian.control 
	 * 方法名：selectNameChange
	 * 创建人：何雪平 
	 * 时间：2016年11月10日-下午4:22:48 
	 * @param id
	 * @return Result<Integer>
	 * @exception 
	 * @since  1.0.0
	 */
	@RequestMapping(value = "/name/change", method = RequestMethod.POST)
	@ResponseBody
	public Result<Integer> selectNameChange(
			@RequestParam(value = "id") Long id) {
		return iSCUserServiceBiz.selectUserNameChange(id);
	}
	
	/**
	 * 更新用户名
	 * com.jiabian.control 
	 * 方法名：updateUserName
	 * 创建人：何雪平 
	 * 时间：2016年11月10日-下午5:37:10 
	 * @param id
	 * @param userName
	 * @return Result<JSONObject>
	 * @exception 
	 * @since  1.0.0
	 */
	@RequestMapping(value = "/name/update", method = RequestMethod.POST)
	@ResponseBody
	public Result<JSONObject> updateUserName(
			@RequestParam(value = "id") Long id,
			@RequestParam(value = "userName") String userName) {
		return iSCUserServiceBiz.updateUserName(id ,userName);
	}
	
	/**
	 * 更新用户头像
	 * com.jiabian.control 
	 * 方法名：updateUserImg
	 * 创建人：何雪平 
	 * 时间：2016年11月15日-下午3:48:50 
	 * @param userId
	 * @return Result<JSONObject>
	 * @exception 
	 * @since  1.0.0
	 */
	@RequestMapping(value = "/img", method = RequestMethod.POST)
	@ResponseBody
	public Result<JSONObject> updateUserImg(
			@RequestParam(value = "userId") Long userId,
			@RequestParam(value = "userImg") String userImg) {
		return iSCUserServiceBiz.updateUserImg(userId,new StringBuffer(
				QN_IMG_URL).append(userImg).toString());
	}
	
	/**
	 * 第三方授权登录
	 * com.jiabian.control 
	 * 方法名：userAuth
	 * 创建人：何雪平 
	 * 时间：2016年12月6日-下午2:51:47 
	 * @param openId
	 * @param type
	 * @return Result<UserRes>
	 * @exception 
	 * @since  1.0.0
	 */
	@RequestMapping(value = "/auth", method = RequestMethod.POST)
	@ResponseBody
	public Result<UserRes> userAuth(
			@RequestParam(value = "openId") String openId,
			@RequestParam(value = "type") Integer type) {
		return iSCUserServiceBiz.userAuth(openId,type);
	}
	
	/**
	 * 手机验证码登录
	 * com.jiabian.control 
	 * 方法名：telSmsCheck
	 * 创建人：何雪平 
	 * 时间：2016年11月10日-上午10:28:48 
	 * @param userTel
	 * @param verCode
	 * @param smsEnum
	 * @return Result<JSONObject>
	 * @exception 
	 * @since  1.0.0
	 */
	@RequestMapping(value = "/login/verCode", method = RequestMethod.POST)
	@ResponseBody
	public Result<UserRes> userVerCoderLogin(
			@RequestParam(value = "userTel") String userTel,
			@RequestParam(value = "verCode") String verCode,
			SMSEnum smsEnum) {
		return iSCUserServiceBiz.userVerCoderLogin(userTel, verCode,smsEnum);
	}	
	
	/**
	 * 查询是否设置登录密码
	 * com.jiabian.control 
	 * 方法名：selectLoginPwd
	 * 创建人：何雪平 
	 * 时间：2016年12月29日-上午9:37:09 
	 * @param userId
	 * @return Result<UserRes>
	 * @exception 
	 * @since  1.0.0
	 */
	@RequestMapping(value = "/login/userPwd", method = RequestMethod.POST)
	@ResponseBody
	public Result<JSONObject> selectLoginPwd(
			@RequestParam(value = "userId") Long userId) {
		return iSCUserServiceBiz.selectLoginPwd(userId);
	}	
	
	/**
	 * 设置登录密码
	 * com.jiabian.control 
	 * 方法名：insertLoginPwd
	 * 创建人：何雪平 
	 * 时间：2016年12月29日-上午9:47:22 
	 * @param userId
	 * @return Result<UserRes>
	 * @exception 
	 * @since  1.0.0
	 */
	@RequestMapping(value = "/login/userPwd/insert", method = RequestMethod.POST)
	@ResponseBody
	public Result<JSONObject> insertLoginPwd(
			@RequestParam(value = "userId") Long userId,
			@RequestParam(value = "userPwd") String userPwd) {
		return iSCUserServiceBiz.insertLoginPwd(userId,userPwd);
	}	
	
	/**
	 * 第三方换绑手机号
	 * com.jiabian.control 
	 * 方法名：selectLoginPwd
	 * 创建人：何雪平 
	 * 时间：2016年12月30日-下午1:33:10 
	 * @param userId
	 * @return Result<JSONObject>
	 * @exception 
	 * @since  1.0.0
	 */
	@RequestMapping(value = "/auth/userTel", method = RequestMethod.POST)
	@ResponseBody
	public Result<JSONObject> updateAuthUserTel(
			@RequestParam(value = "userId") Long userId,
			@RequestParam(value = "userTel") String userTel) {
		return iSCUserServiceBiz.updateAuthUserTel(userId,userTel);
	}	
	
	/**
	 * 查询用户手机号
	 * com.jiabian.control 
	 * 方法名：selectUserTel
	 * 创建人：何雪平 
	 * 时间：2017年1月5日-下午1:24:29 
	 * @param userId
	 * @return Result<String>
	 * @exception 
	 * @since  1.0.0
	 */
	@RequestMapping(value = "/userTel", method = RequestMethod.POST)
	@ResponseBody
	public Result<String> selectUserTel(
			@RequestParam(value = "userId") Long userId) { 
		return iSCUserServiceBiz.selectUserTelByUserId(userId);
	}	
	
	
}
