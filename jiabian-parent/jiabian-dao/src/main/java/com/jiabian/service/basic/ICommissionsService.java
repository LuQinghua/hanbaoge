package com.jiabian.service.basic;
/**
 * 用户推广销售数据接口层
 * ICommissionsService
 * 创建人:何雪平 
 * 时间：2016年12月24日-上午11:00:53 
 * @version 1.0.0
 *
 */
public interface ICommissionsService {
	
	/**
	 * 添加推广码
	 * com.jiabian.service.basic 
	 * 方法名：addExtension
	 * 创建人：何雪平 
	 * 时间：2016年12月24日-上午11:00:34 
	 * @param userId
	 * @param invitationCode
	 * @return int
	 * @exception 
	 * @since  1.0.0
	 */
	int insertExtension(Long userId,String invitationCode);
	
	/**
	 * 查询订单是否显示邀请码
	 * com.jiabian.service.basic 
	 * 方法名：selectCode
	 * 创建人：何雪平 
	 * 时间：2016年12月24日-下午2:50:08 
	 * @param orderCode
	 * @return Boolean
	 * @exception 
	 * @since  1.0.0
	 */
	int selectCode(String orderCode);
	
	/**
	 * 添加邀请码销售信息
	 * com.jiabian.service.basic 
	 * 方法名：insertSales
	 * 创建人：何雪平 
	 * 时间：2016年12月26日-下午2:58:17 
	 * @param orderCode
	 * @return int
	 * @exception 
	 * @since  1.0.0
	 */
	int insertSales(String orderCode,String invitationCode);
}
