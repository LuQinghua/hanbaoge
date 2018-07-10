package com.jiabian.service.basic;

import com.jiabian.beans.basic.UserDetail;
/**
 * 
 * IUserDetailService
 * 创建人:熊天威
 * 时间：2017年1月3日-下午4:40:02 
 * @version 1.0.0
 *
 */
public interface IUserDetailService {

	//xtw
	int addUserDetail(UserDetail userDetail);
	
	/**
	 * 更新用户详情
	 * com.jiabian.service.basic 
	 * 方法名：updateUserDetail
	 * 创建人：何雪平 
	 * 时间：2017年4月18日-上午11:16:23 
	 * @param userDetail
	 * @return int
	 * @exception 
	 * @since  1.0.0
	 */
	int updateUserDetail(UserDetail userDetail);

}
