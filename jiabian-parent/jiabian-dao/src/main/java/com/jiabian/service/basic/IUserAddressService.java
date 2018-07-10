package com.jiabian.service.basic;

import java.util.List;

import com.jiabian.beans.basic.UserAddress;
/**
 *  用户地址数据接口层
 * IUserAddressService
 * 创建人:何雪平 
 * 时间：2016-10-24-下午3:26:01 
 * @version 1.0.0
 *
 */
public interface IUserAddressService {

	/**
	 * 根据用户id查询地址列表
	 * com.jiabian.service.basic 
	 * 方法名：selectAddressByUserId
	 * 创建人：何雪平 
	 * 时间：2016-10-24-下午3:27:00 
	 * @param id
	 * @return List<UserAddress>
	 * @exception 
	 * @since  1.0.0
	 */
	List<UserAddress> selectAddressByUserId(Long id);

	/**
	 * 添加用户地址
	 * com.jiabian.service.basic 
	 * 方法名：addUserAddress
	 * 创建人：何雪平 
	 * 时间：2016-10-24-下午4:44:30 
	 * @param userAddress
	 * @return int
	 * @exception 
	 * @since  1.0.0
	 */
	Long addUserAddress(UserAddress userAddress);
	
	/**
	 * 修改用户地址
	 * com.jiabian.service.basic 
	 * 方法名：updateUserAddress
	 * 创建人：何雪平 
	 * 时间：2016-10-24-下午5:12:22 
	 * @param userAddress
	 * @return int
	 * @exception 
	 * @since  1.0.0
	 */
	int updateUserAddress(UserAddress userAddress);

	/**
	 * 删除用户地址
	 * com.jiabian.service.basic 
	 * 方法名：deleteUserAddress
	 * 创建人：何雪平 
	 * 时间：2016年10月26日-下午3:00:17 
	 * @param id
	 * @return int
	 * @exception 
	 * @since  1.0.0
	 */
	 int deleteUserAddress(Long id);
	 
	 /**
	  * 最近地址
	  * com.jiabian.service.basic 
	  * 方法名：selectRecentById
	  * 创建人：何雪平 
	  * 时间：2016年11月19日-上午9:25:28 
	  * @param userId
	  * @return UserAddress
	  * @exception 
	  * @since  1.0.0
	  */
	 UserAddress selectRecentById(Long userId);
}
