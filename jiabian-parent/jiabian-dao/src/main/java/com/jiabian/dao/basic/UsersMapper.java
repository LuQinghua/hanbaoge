/*
 * UsersMapper.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-12-23 Created
 */
package com.jiabian.dao.basic;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.jiabian.base.PagesModel;
import com.jiabian.beans.basic.Users;
import com.jiabian.beans.basic.UsersQueryHelper;
import com.jiabian.user.request.UsersReq;
import com.jiabian.user.response.UserRes;

public interface UsersMapper {
    int countByExample(UsersQueryHelper example);

    int deleteByExample(UsersQueryHelper example);

    int deleteByPrimaryKey(Long id);

    int insert(Users record);

    int insertSelective(Users record);

    List<Users> selectByExample(UsersQueryHelper example);

    Users selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Users record, @Param("example") UsersQueryHelper example);

    int updateByExample(@Param("record") Users record, @Param("example") UsersQueryHelper example);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);
    
    /**
     * @Description: JK在用
     */
    @Select("SELECT count(1) FROM users WHERE userTel = #{0} LIMIT 1")
    int cheakedTel(String userTel);

  	Users selectUsresByUserName(String userame);

  	UserRes selectUsers4UserName(String username);

  	//查找用户
  	UserRes selectUsresByUserNameCheck(Users user);
  	
  	/**
  	 * 验证用户
  	 * com.jiabian.dao.basic 
  	 * 方法名：selectUserByAccountCheck
  	 * 创建人：何雪平 
  	 * 时间：2016年10月25日-下午6:25:50 
  	 * @param user
  	 * @return LoginRes
  	 * @exception 
  	 * @since  1.0.0
  	 */
  	UserRes selectUserByAccountCheck(Users user);
  	
  	/**
  	 * @Description:查找用户(手机端登录)
  	 * @author 潇洒
  	 */
	UserRes selectUsersByUserTel(Users user);

	
	/**
	 * 注册
	 * 潇洒
	 */
	int addUsers(Users user);

	/**
	 * 
	 * 商家登录
	 * com.jiabian.dao.basic 
	 * 方法名：selectBusinessmanByUserNameCheck
	 * 创建人：李文凯 
	 * 时间：2016-11-8-上午10:22:07 
	 * @param user
	 * @return UserRes
	 * @exception 
	 * @since  1.0.0
	 */
	UserRes selectBusinessmanByUserNameCheck(Users user);

	
	/**
	 * @Description: 个人中心展示用户信息
	 * @author 潇洒
	 */
	UserRes selectuserPersonalInformation(UsersReq userReq);

	/**
	 * 查找用户id
	 * com.jiabian.dao.basic 
	 * 方法名：selectUsersByUser
	 * 创建人：潇洒
	 * 时间：2016-11-8-下午4:42:18 
	*/
	Long selectUsersByUser(Users user);

	
	UserRes selectUserByUserId(UsersReq usersReq);

	/**
	 * 修改密码根据电话号码查询用户是否存在	
	 * com.jiabian.dao.basic 
	 * 方法名：selectByUserTel
	 * 创建人：李文凯
	 * 时间：2016年11月19日-上午11:37:09 
	 * @param userReq
	 * @return UserRes
	 * @exception 
	 * @since  1.0.0
	 */
	UserRes selectByUserTel(UsersReq userReq);

	/**
	 * 查询users表是否有该手机号
	 * com.jiabian.dao.basic 
	 * 方法名：selectIdByTel
	 * 创建人：潇洒
	 * 时间：2016-11-23-下午4:35:37 
	*/
	Long selectIdByTel(String userTel);

	/**
	 * (这里用一句话描述这个方法的作用)
	 * com.jiabian.dao.basic 
	 * 方法名：insertTel
	 * 创建人：潇洒
	 * 时间：2016-11-23-下午4:40:04 
	*/
	int insertTel(String userTel);

	/**
	 *  更改最后登陆时间
	 * com.jiabian.dao.basic 
	 * 方法名：updateLastTimeById
	 * 创建人：潇洒
	 * 时间：2016-11-23-下午7:44:10 
	*/
	void updateLastTimeById(Long id);

	//查询用户信息
	UserRes selectUserShortInfo(long userId);

	//xtw
	@Select("SELECT ua.id, ua.receiver,ua.userId, ua.telPhone, ua.address, ua.addressInfo FROM user_address ua WHERE ua.isDel = 1 AND ua.userId = #{0}")
	List<UserRes> selectUserAddress4UserId(Long id);
	
	/**
	 * 
	 * (总商家后台   注册用户管理回显列表)
	 * com.jiabian.dao.basic 
	 * 方法名：registerUserList
	 * 创建人：彭振锋 
	 * 时间：2016年12月24日-下午1:37:44 
	 * @param pageModel
	 * @return List<UserRes>
	 * @exception 
	 * @since  1.0.0
	 */
	List<UserRes>  registerUserList(PagesModel<UsersReq, UserRes> pageModel);
	
	/**
	 * 
	 * (总商家后台   注册用户管理回显数量)
	 * com.jiabian.dao.basic 
	 * 方法名：countRegisterUserList
	 * 创建人：彭振锋 
	 * 时间：2016年12月24日-下午1:38:30 
	 * @param pageModel
	 * @return Integer
	 * @exception 
	 * @since  1.0.0
	 */
	Integer countRegisterUserList(PagesModel<UsersReq, UserRes> pageModel);

	
	/**
	 * 
	 * 获取商家ID
	 * com.jiabian.dao.basic 
	 * 方法名：selectBusIdByUserId
	 * 创建人：李文凯
	 * 时间：2017年2月16日-下午4:51:14 
	 * @param id
	 * @return Long
	 * @exception 
	 * @since  1.0.0
	 */
	Long selectBusIdByUserId(Long id);


 
	@Select("select exists(select id from users where userTel = #{0});")
	Integer checkedUserTel(String userTel);
	
}