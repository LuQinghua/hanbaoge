package com.jiabian.service.basic.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jiabian.beans.basic.UserDetail;
import com.jiabian.beans.basic.UserDetailQueryHelper;
import com.jiabian.dao.basic.UserDetailMapper;
import com.jiabian.service.basic.IUserDetailService;
@Service
/**
 * 
 * UserDetailServiceImpl
 * 创建人:熊天威
 * 时间：2017年1月3日-下午4:40:12 
 * @version 1.0.0
 *
 */
public class UserDetailServiceImpl implements IUserDetailService {
	@Autowired
	UserDetailMapper userDetailMapper;

	//xtw
	@Override
	public int addUserDetail(UserDetail userDetail) {
		return userDetailMapper.insertSelective(userDetail);
	}

	/**
	 * 更新用户详情
	 * com.jiabian.service.basic.impl 
	 * 方法名：updateUserDetail
	 * 创建人：何雪平 
	 * 时间：2017年4月18日-上午11:16:50 
	 * @param userDetail
	 * @return
	 * @see com.jiabian.service.basic.IUserDetailService#updateUserDetail(com.jiabian.beans.basic.UserDetail)
	 * @exception 
	 * @since  1.0.0
	*/
	@Override
	public int updateUserDetail(UserDetail userDetail) {
		UserDetailQueryHelper queryHelper=new UserDetailQueryHelper();
		queryHelper.createCriteria().andUserIdEqualTo(userDetail.getUserId());
		return userDetailMapper.updateByExampleSelective(userDetail, queryHelper);
	}
	
}
