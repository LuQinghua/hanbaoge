package com.jiabian.shop.biz;

import java.util.List;

import com.alibaba.fastjson.JSONObject;
import com.jiabian.beans.basic.UserAddress;
import com.jiabian.util.Result;


/**
 * 用户地址服务接口层
 * IUserAddressServiceBiz
 * 创建人:何雪平 
 * 时间：2016-10-24-下午3:22:45 
 * @version 1.0.0
 *
 */
public interface ISCUserAddressServiceBiz {

	/**
	 *  根据用户id查询地址列表
	 * com.jiabian.sh.biz 
	 * 方法名：selectAddressByUserId
	 * 创建人：何雪平 
	 * 时间：2016-10-24-下午3:23:26 
	 * @param id
	 * @return List<UserAddress>
	 * @exception 
	 * @since  1.0.0
	 */
	Result<List<UserAddress>> selectAddressByUserId(Long userId);
	
	/**
	 * 添加用户地址
	 * com.jiabian.sh.biz 
	 * 方法名：addUserAddress
	 * 创建人：何雪平 
	 * 时间：2016年10月26日-下午3:06:39 
	 * @param userAddress
	 * @return Result<JSONObject>
	 * @exception 
	 * @since  1.0.0
	 */
	Result<Long> addUserAddress(UserAddress userAddress);
	
	/**
	 * 更新用户地址
	 * com.jiabian.sh.biz 
	 * 方法名：updateUserAddress
	 * 创建人：何雪平 
	 * 时间：2016年10月26日-下午3:07:03 
	 * @param userAddress
	 * @return Result<JSONObject>
	 * @exception 
	 * @since  1.0.0
	 */
	Result<JSONObject> updateUserAddress(UserAddress userAddress);
	
	/**
	 * 删除用户地址
	 * com.jiabian.sh.biz 
	 * 方法名：deleteUserAddress
	 * 创建人：何雪平 
	 * 时间：2016年10月26日-下午3:07:59 
	 * @param id
	 * @return Result<JSONObject>
	 * @exception 
	 * @since  1.0.0
	 */
	Result<JSONObject> deleteUserAddressById(Long id);
	
	/**
	 * 最近地址
	 * com.jiabian.shop.biz 
	 * 方法名：selectRecentById
	 * 创建人：何雪平 
	 * 时间：2016年11月19日-上午9:17:58 
	 * @param userId
	 * @return Result<UserAddress>
	 * @exception 
	 * @since  1.0.0
	 */
	Result<UserAddress>  selectRecentById(Long userId);


}
