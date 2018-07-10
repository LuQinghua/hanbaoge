package com.jiabian.service.basic.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jiabian.base.BaseEnum;
import com.jiabian.beans.basic.UserDetail;
import com.jiabian.beans.basic.UserDetailQueryHelper;
import com.jiabian.beans.basic.Users;
import com.jiabian.beans.basic.UsersQueryHelper;
import com.jiabian.dao.basic.UserDetailMapper;
import com.jiabian.dao.basic.UsersMapper;
import com.jiabian.service.basic.IPersonalInformationService;
import com.jiabian.user.request.UsersReq;
import com.jiabian.user.response.UserRes;

@Service
public class PersonalInformationServiceImpl implements IPersonalInformationService {

	@Autowired
	UserDetailMapper userDetailMapper;
	@Autowired
	UsersMapper usersMapper;
	
	/**
	 * 个人中心展示用户信息
	 */
	@Override
	public UserRes selectuserPersonalInformation(UsersReq userReq) {
		// TODO Auto-generated method stub
		return usersMapper.selectuserPersonalInformation(userReq);
	}

	/**
	 * 用户信息修改，修改头像
	 * com.jiabian.service.basic.impl 
	 * 方法名：updatePersonalInformation
	 * 创建人：潇洒
	 * 时间：2016-11-7-下午8:09:42
	 */
	@Override
	public int userUpdateHeadPortrait(Long userId,String userImg) {
		// TODO Auto-generated method stub
		UserDetailQueryHelper queryHelper=new UserDetailQueryHelper();
		queryHelper.createCriteria().andUserIdEqualTo(userId).andIsDelEqualTo(BaseEnum.isDel.NORMAL.getValue());
		UserDetail detail=new UserDetail();
		detail.setUserImg(userImg);
		return userDetailMapper.updateByExampleSelective(detail, queryHelper);
	}

	/**
	 * 个人信息修改，修改用户名
	 * com.jiabian.service.basic.impl 
	 * 方法名：userUpdateUserName
	 * 创建人：潇洒
	 * 时间：2016-11-10-下午3:12:42 
	*/
	@Override
	public int userUpdateUserName(Users user) {
		return usersMapper.updateByPrimaryKeySelective(user);
	}

	/**
	 * 个人信息修改，换绑手机
	 * com.jiabian.service.basic.impl 
	 * 方法名：userUpdateUserTel
	 * 创建人：潇洒
	 * 时间：2016-11-10-下午3:16:45 
	*/
	@Override
	public int userUpdateUserTel(Users user) {
		// TODO Auto-generated method stub
		return usersMapper.updateByPrimaryKeySelective(user);
	}

	/**
	 * 个人信息修改，验证数据库是否有该手机号(换绑手机步骤1)
	 * com.jiabian.service.basic.impl 
	 * 方法名：selectUserOldTel
	 * 创建人：潇洒
	 * 时间：2016-11-10-下午3:39:46 
	*/
	@Override
	public List<Users> selectUserOldTel(Users user) {
		// TODO Auto-generated method stub
		UsersQueryHelper example = new UsersQueryHelper();
		example.createCriteria().andUserTelEqualTo(user.getUserTel());
		return usersMapper.selectByExample(example);
	}

	/**
	 * 查询userDetail表是否有userId
	 * com.jiabian.service.basic.impl 
	 * 方法名：selectUserId
	 * 创建人：潇洒
	 * 时间：2016-11-23-下午5:17:39 
	*/
	@Override
	public Long selectUserId(UsersReq userReq) {
		// TODO Auto-generated method stub
		return userDetailMapper.selectUserId(userReq);
	}
}
