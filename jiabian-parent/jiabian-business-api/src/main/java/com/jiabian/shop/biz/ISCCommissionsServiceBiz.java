package com.jiabian.shop.biz;

import com.alibaba.fastjson.JSONObject;
import com.jiabian.util.Result;


/**
 * 用户推广销售服务接口层
 * IBusinessmanShopServiceBiz
 * 创建人:何雪平 
 * 时间：2016年10月31日-下午6:13:11 
 * @version 1.0.0
 *
 */
public interface ISCCommissionsServiceBiz {

	/**
	 * 添加推广码
	 * com.jiabian.shop.biz 
	 * 方法名：insertExtension
	 * 创建人：何雪平 
	 * 时间：2016年12月24日-上午10:48:42 
	 * @param userId
	 * @param invitationCode
	 * @return Result<JSONObject>
	 * @exception 
	 * @since  1.0.0
	 */
	Result<JSONObject> insertExtension(Long userId,String invitationCode);
	
	/**
	 * 查询订单是否显示邀请码
	 * com.jiabian.shop.biz 
	 * 方法名：selectCode
	 * 创建人：何雪平 
	 * 时间：2016年12月24日-下午2:47:35 
	 * @param orderCode
	 * @return Result<JSONObject>
	 * @exception 
	 * @since  1.0.0
	 */
	Result<JSONObject> selectCode(String orderCode);
	
	/**
	 * 添加邀请码销售信息
	 * com.jiabian.shop.biz 
	 * 方法名：insertSales
	 * 创建人：何雪平 
	 * 时间：2016年12月26日-下午2:28:32 
	 * @param orderCode
	 * @return Result<JSONObject>
	 * @exception 
	 * @since  1.0.0
	 */
	Result<JSONObject> insertSales(String orderCode,String invitationCode);
	
	
}
