/*
 * OrdersMapper.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2018-06-17 Created
 */
package com.jiabian.dao.basic.hotel;

import com.jiabian.base.PagesModel;
import com.jiabian.beans.basic.hotel.Orders;
import com.jiabian.beans.basic.hotel.OrdersQueryHelper;
import com.jiabian.hotel.request.OrdersReq;
import com.jiabian.hotel.response.OrdersRes;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrdersMapper {
    int countByExample(OrdersQueryHelper example);

    int deleteByExample(OrdersQueryHelper example);

    int deleteByPrimaryKey(Long id);

    int insert(Orders record);

    int insertSelective(Orders record);

    List<Orders> selectByExample(OrdersQueryHelper example);

    Orders selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Orders record, @Param("example") OrdersQueryHelper example);

    int updateByExample(@Param("record") Orders record, @Param("example") OrdersQueryHelper example);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);

	Integer countOrders(PagesModel<OrdersReq, OrdersRes> pagesModel);

	List<OrdersRes> selectOrders(PagesModel<OrdersReq, OrdersRes> pagesModel);

	Integer countOrdersByCondition(@Param("orderCode") String orderCode, 
			@Param("condition") String condition, @Param("pagesModel") PagesModel<OrdersReq, OrdersRes> pagesModel);

	List<OrdersRes> selectOrdersByCondition(@Param("orderCode") String orderCode, 
			@Param("condition") String condition, @Param("pagesModel") PagesModel<OrdersReq, OrdersRes> pagesModel);
}