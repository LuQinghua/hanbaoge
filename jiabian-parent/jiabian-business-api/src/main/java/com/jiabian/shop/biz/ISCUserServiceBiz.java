package com.jiabian.shop.biz;

import java.util.List;

import com.alibaba.fastjson.JSONObject;
import com.jiabian.beans.basic.Users;
import com.jiabian.user.request.UsersReq;
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
public interface ISCUserServiceBiz {

	/**
	 * 用户登录
	 * com.jiabian.sh.biz 
	 * 方法名：selectlogin
	 * 创建人：何雪平 
	 * 时间：2016年10月25日-下午4:17:40 
	 * @param userTel
	 * @param userPwd
	 * @return LoginRes
	 * @exception 
	 * @since  1.0.0
	 */
	Result<UserRes> selectlogin(String userTel,String userPwd);
	
	/**
	 * 根据id查询用户基本信息
	 * com.jiabian.sh.biz 
	 * 方法名：selectUserBaseById
	 * 创建人：何雪平 
	 * 时间：2016年10月27日-上午10:23:22 
	 * @param id
	 * @return Result<List<Map<String,Object>>>
	 * @exception 
	 * @since  1.0.0
	 */
	Result<UserRes> selectUserBaseById(Long id);
	
	/**
	 * 用户注册
	 * com.jiabian.sh.biz 
	 * 方法名：addUserRegister
	 * 创建人：何雪平 
	 * 时间：2016年10月29日-下午2:15:00 
	 * @param userTel
	 * @param userPwd
	 * @param verCode
	 * @return Result<RegisterRes>
	 * @exception 
	 * @since  1.0.0
	 */
	Result<UserRes> addUserRegister(String userTel, String userPwd, String verCode,SMSEnum smsEnum);
	
	/**
	 * 在注册时验证 电话、用户名、邮箱是否存在
	 * 
	 * 方法名：
	 * 创建人：彭振锋
	 * 时间：2016年11月03日-下午3:15:15
	 * @param 
	 * @param 
	 * @param 
	 * @return Result
	 * @see 
	 * @exception 
	 * @since  
	 */
	UserRes checkedAll(String uname);
	
	/**
	 * 手机验证码核验
	 * com.jiabian.shop.biz 
	 * 方法名：telSmsCheck
	 * 创建人：何雪平 
	 * 时间：2016年11月9日-下午5:56:01 
	 * @param userTel
	 * @param verCode
	 * @param smsEnum
	 * @return Result<JSONObject>
	 * @exception 
	 * @since  1.0.0
	 */
	Result<JSONObject> telSmsCheck(String userTel,String verCode,SMSEnum smsEnum);

	/**
	 * 
	 * 商家登录
	 * com.jiabian.shop.service 
	 * 方法名：selectUsresByUserNameCheck
	 * 创建人：李文凯 
	 * 时间：2016-11-7-下午7:22:12 
	 * @param user
	 * @return
	 * @exception 
	 * @since  1.0.0
	 */
	UserRes selectUsresByUserNameCheck(Users user);
	
	/**
	 * 更新用户密码
	 * com.jiabian.shop.biz 
	 * 方法名：updatePwd
	 * 创建人：何雪平 
	 * 时间：2016年11月8日-下午1:29:25 
	 * @param userTel
	 * @param userPwd
	 * @return Result<JSONObject>
	 * @exception 
	 * @since  1.0.0
	 */
	Result<JSONObject> updatePwd(String userTel,String userPwd);
	
	/**
	 * 绑定手机 
	 * com.jiabian.shop.biz 
	 * 方法名：boundTel
	 * 创建人：何雪平
	 * 时间：2016年11月9日-上午9:33:49 
	 * @param userTel
	 * @param verCode
	 * @param id
	 * @param SMSEnum smsEnum
	 * @return Result<JSONObject>
	 * @exception 
	 * @since  1.0.0
	 */
	Result<JSONObject> boundTel(String userTel,String verCode,Long id,SMSEnum smsEnum);
	
	/**
	 * 查询用户详情信息
	 * com.jiabian.shop.biz 
	 * 方法名：selectUserDetailById
	 * 创建人：何雪平 
	 * 时间：2016年11月9日-下午1:18:58 
	 * @param id
	 * @return Result<UserRes>
	 * @exception 
	 * @since  1.0.0
	 */
	Result<UserRes> selectUserDetailById(Long id);
	
	/**
	 * 查询用户名修改状态
	 * com.jiabian.shop.biz 
	 * 方法名：selectNameStatus
	 * 创建人：何雪平 
	 * 时间：2016年11月10日-下午4:20:48 
	 * @param id
	 * @return Result<Integer>
	 * @exception 
	 * @since  1.0.0
	 */
	Result<Integer> selectUserNameChange(Long id);
	
	/**
	 * 更新用户名
	 * com.jiabian.shop.biz 
	 * 方法名：updateUserName
	 * 创建人：何雪平 
	 * 时间：2016年11月10日-下午5:21:50 
	 * @param id
	 * @param userName
	 * @return Result<JSONObject>
	 * @exception 
	 * @since  1.0.0
	 */
	Result<JSONObject> updateUserName(Long id,String userName);
	
	/**
	 * 更新用户头像
	 * com.jiabian.shop.biz 
	 * 方法名：updateUserImg
	 * 创建人：何雪平 
	 * 时间：2016年11月15日-下午3:47:44 
	 * @param userId
	 * @return Result<JSONObject>
	 * @exception 
	 * @since  1.0.0
	 */
	Result<JSONObject> updateUserImg(Long userId,String userImg);
	
	/**
	 * 第三方授权登录
	 * com.jiabian.shop.biz 
	 * 方法名：userAuth
	 * 创建人：何雪平 
	 * 时间：2016年12月6日-下午2:52:32 
	 * @param openId
	 * @param type
	 * @return Result<UserRes>
	 * @exception 
	 * @since  1.0.0
	 */
	Result<UserRes> userAuth(String openId,Integer type);
	
	/**
	 * 即时通讯用户列表
	 * com.jiabian.shop.biz 
	 * 方法名：selectUserChat
	 * 创建人：何雪平 
	 * 时间：2016年12月7日-下午5:16:39 
	 * @return Result<List<UserRes>>
	 * @exception 
	 * @since  1.0.0
	 */
	Result<List<UserRes>> selectUserChat();
	
	/**
	 * 
	 * (修改密码，判断原密码是否正确)
	 * com.jiabian.shop.biz 
	 * 方法名：selectUserByName
	 * 创建人：彭振锋 
	 * 时间：2016年12月14日-下午1:22:30 
	 * @return UserRes
	 * @exception 
	 * @since  1.0.0
	 */
    int checkOldPassword(UsersReq usersReq);
    
    /**
     * 
     * (修改密码)
     * com.jiabian.shop.biz 
     * 方法名：changePassword
     * 创建人：彭振锋 
     * 时间：2016年12月14日-下午2:18:30 
     * @return int
     * @exception 
     * @since  1.0.0
     */
    int changePassword(UsersReq usersReq);
    
    /**
     * 
     * (根据用户名查用户)
     * com.jiabian.shop.biz 
     * 方法名：selectUserByName
     * 创建人：彭振锋 
     * 时间：2016年12月14日-下午4:02:31 
     * @param user
     * @return UserRes
     * @exception 
     * @since  1.0.0
     */
    UserRes selectUserByName(Users user);
    
    /**
     * 手机验证码登录
     * com.jiabian.shop.biz 
     * 方法名：userVerCoderLogin
     * 创建人：何雪平 
     * 时间：2016年12月28日-下午4:53:29 
     * @param userTel
     * @param verCode
     * @param smsEnum
     * @return Result<UserRes>
     * @exception 
     * @since  1.0.0
     */
    Result<UserRes> userVerCoderLogin(String userTel,String verCode,SMSEnum smsEnum);
    
    /**
     * 查询是否设置登录密码
     * com.jiabian.shop.biz 
     * 方法名：selectLoginPwd
     * 创建人：何雪平 
     * 时间：2016年12月29日-上午9:38:15 
     * @param userId
     * @return Result<UserRes>
     * @exception 
     * @since  1.0.0
     */
    Result<JSONObject> selectLoginPwd(Long userId);
    
    /**
     * 设置登录密码
     * com.jiabian.shop.biz 
     * 方法名：insertLoginPwd
     * 创建人：何雪平 
     * 时间：2016年12月29日-上午9:49:05 
     * @param userId
     * @return Result<JSONObject>
     * @exception 
     * @since  1.0.0
     */
    Result<JSONObject> insertLoginPwd(Long userId,String userPwd);
    
    /**
     * 第三方换绑手机号
     * com.jiabian.shop.biz 
     * 方法名：updateAuthUserTel
     * 创建人：何雪平 
     * 时间：2016年12月30日-下午1:52:07 
     * @param userId
     * @param userTel
     * @return Result<JSONObject>
     * @exception 
     * @since  1.0.0
     */
    Result<JSONObject> updateAuthUserTel(Long userId,String userTel);
    
    /**
     * 查询用户手机号
     * com.jiabian.shop.biz 
     * 方法名：selectUserTelByUserId
     * 创建人：何雪平
     * 时间：2017年1月5日-下午1:18:57 
     * @param userId
     * @return Result<JSONObject>
     * @exception 
     * @since  1.0.0
     */
    Result<String> selectUserTelByUserId(Long userId);

	/**
	 * 用户积分
	 * com.jiabian.shop.biz 
	 * 方法名：selectIntegralByUserId
	 * 创建人：何雪平 
	 * 时间：2017年3月31日-下午4:03:18 
	 * @param userId
	 * @return Result<String>
	 * @exception 
	 * @since  1.0.0
	*/
	Result<Integer> selectIntegralByUserId(Long userId);

	/**
	 * 查询用户书签
	 * com.jiabian.shop.biz 
	 * 方法名：selectBookMark
	 * 创建人：何雪平 
	 * 时间：2017年4月19日-下午3:18:02 
	 * @param userId
	 * @return Result<Integer>
	 * @exception 
	 * @since  1.0.0
	*/
	Result<UserRes> selectBookMark(Long userId);
}
