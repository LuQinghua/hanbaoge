package com.jiabian.sh.biz;

import java.util.List;

import com.jiabian.beans.basic.UserDetail;
import com.jiabian.beans.basic.Users;
import com.jiabian.user.request.UsersReq;
import com.jiabian.user.response.UserRes;



public interface ISHUsersServiceBiz {

	
	Users selectUsresByUserName(String username);


	void updateUserInfo(Users user);

	
	int checkedTel(String userTel);


	int addUser(Users user);


	UserRes login(UsersReq usersReq);

	List<Users> selectUserByPram(UsersReq usersReq);


	//查找用户
	UserRes selectUsresByUserNameCheck(Users user);

	//根据用户id查找用户信息
	UserRes selectUsresByUserId(UsersReq usersReq);

	/**
	 * 
	 * 修改密码根据电话号码查询用户是否存在
	 * com.jiabian.sh.biz 
	 * 方法名：selectUsresByTel
	 * 创建人：李文凯
	 * 时间：2016年11月19日-上午11:35:30 
	 * @param usersReq
	 * @return UserRes
	 * @exception 
	 * @since  1.0.0
	 */
	UserRes selectUsresByTel(UsersReq usersReq);

	/**
	 * 
	 * 修改用户密码
	 * com.jiabian.sh.biz 
	 * 方法名：updateUserPwd
	 * 创建人：李文凯
	 * 时间：2016年11月19日-下午2:10:13 
	 * @param pwd1
	 * @return Integer
	 * @exception 
	 * @since  1.0.0
	 */
	Integer updateUserPwd(String userTel,String userPwd);




	/**
	 * 查询用户信息
	 * com.jiabian.sh.biz 
	 * 方法名：selectUserShortInfo
	 * 创建人：熊天威
	 * 时间：2016年11月26日-下午4:10:49 
	 * @param parseLong
	 * @return int
	 * @exception 
	 * @since  1.0.0
	 */
	UserRes selectUserShortInfo(long userId);


	void addUserDetail(UserDetail userDetail);


	/**
	 * 查询用户下的所有收货地址
	 * com.jiabian.sh.biz 
	 * 方法名：selectUserAddress4UserId
	 * 创建人：熊天威
	 * 时间：2016年12月13日-下午2:33:34 
	 * @param id
	 * @return UserRes
	 * @exception 
	 * @since  1.0.0
	 */
	List<UserRes> selectUserAddress4UserId(Long id);

	//xtw
	int updateUserPwd4Id(Long userId, String userPwd);
	
	//xtw
	int updateUserTel4Id(Long userId, String userTel);

	/**
	 * 修改个人资料
	 * com.jiabian.sh.biz 
	 * 方法名：updateUserInfo4Id
	 * 创建人：熊天威
	 * 时间：2017年1月4日-下午2:47:51 
	 * @param user
	 * @return int
	 * @exception 
	 * @since  1.0.0
	 */
	int updateUserInfo4Id(Users user);
}
