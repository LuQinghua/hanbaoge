package com.jiabian.service.basic;

import java.util.List;

import com.jiabian.beans.basic.Users;
import com.jiabian.user.request.UsersReq;
import com.jiabian.user.response.UserRes;

public interface IPersonalInformationService {

	/**
	 *个人中心展示用户信息
	 */
	UserRes selectuserPersonalInformation(UsersReq userReq);
	
	/**
	 * 用户信息修改，修改头像
	 * @param string 
	 */
	int userUpdateHeadPortrait(Long userId, String userImg);

	/**
	 * 个人信息修改，修改用户名
	 * com.jiabian.service.basic 
	 * 方法名：userUpdateUserName
	 * 创建人：潇洒
	 * 时间：2016-11-10-下午3:12:31 
	*/
	int userUpdateUserName(Users user);

	/**
	 * 个人信息修改，换绑手机
	 * com.jiabian.service.basic 
	 * 方法名：userUpdateUserTel
	 * 创建人：潇洒
	 * 时间：2016-11-10-下午3:16:36 
	*/
	int userUpdateUserTel(Users user);

	/**
	 * 个人信息修改，验证数据库是否有该手机号(换绑手机步骤1)
	 * com.jiabian.service.basic 
	 * 方法名：selectUserOldTel
	 * 创建人：潇洒
	 * 时间：2016-11-10-下午3:39:30 
	*/
	List<Users> selectUserOldTel(Users user);

	/**
	 * 查询userDetail表是否有userId
	 * com.jiabian.service.basic 
	 * 方法名：selectUserId
	 * 创建人：潇洒
	 * 时间：2016-11-23-下午5:17:28 
	*/
	Long selectUserId(UsersReq userReq);

}
