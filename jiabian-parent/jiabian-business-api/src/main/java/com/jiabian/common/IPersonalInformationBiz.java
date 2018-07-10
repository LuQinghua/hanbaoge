package com.jiabian.common;

import com.jiabian.beans.basic.Users;
import com.jiabian.user.request.UsersReq;
import com.jiabian.user.response.UserRes;
import com.jiabian.util.Result;

public interface IPersonalInformationBiz {

	/*
	 * 个人中心展示用户信息
	 */
	Result<UserRes> selectuserPersonalInformation(UsersReq userReq);
	
	/**
	 * 个人信息修改，修改头像
	 * com.jiabian.common 
	 * 方法名：userUpdateHeadPortrait
	 * 创建人：潇洒
	 * 时间：2016-11-10-下午2:59:06 
	*/
	Result<Long> userUpdateHeadPortrait(Long userId,String userImg);

	/**
	 * 个人信息修改，修改用户名
	 * com.jiabian.common 
	 * 方法名：userUpdateUserName
	 * 创建人：潇洒
	 * 时间：2016-11-10-下午3:11:56 
	*/
	Result<Long> userUpdateUserName(Users user);

	/**
	 * 个人信息修改，换绑手机(换绑手机步骤2)
	 * com.jiabian.common 
	 * 方法名：userUpdateUserTel
	 * 创建人：潇洒
	 * 时间：2016-11-10-下午3:15:19 
	*/
	Result<Long> userUpdateUserTel(Users user);

	/**
	 * 个人信息修改，验证数据库是否有该手机号(换绑手机步骤1)
	 * com.jiabian.common 
	 * 方法名：userUpdateOldUserTel
	 * 创建人：潇洒
	 * 时间：2016-11-10-下午3:35:49 
	*/
	Result<Long> userSelectOldUserTel(Users user);

}
