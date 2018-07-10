package com.jiabian.sh.biz;

import com.jiabian.beans.basic.UserDetail;
/**
 * 
 * ISHUserDetailServiceBiz
 * 创建人:熊天威
 * 时间：2017年1月3日-下午4:39:04 
 * @version 1.0.0
 *
 */
public interface ISHUserDetailServiceBiz {

	/**
	 * 注册时插入userDetail
	 * com.jiabian.sh.biz 
	 * 方法名：addUserDetail
	 * 创建人：熊天威
	 * 时间：2017年1月3日-下午4:26:45 
	 * @param userDetail
	 * @return int
	 * @exception 
	 * @since  1.0.0
	 */
	int addUserDetail(UserDetail userDetail);

}
