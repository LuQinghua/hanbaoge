/*
 * SaleOrderDetailMapper.java
 * Copyright(C) 20xx-2015 xxxxxx��˾
 * All rights reserved.
 * -----------------------------------------------
 * 2016-12-27 Created
 */
package com.jiabian.dao.basic;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jiabian.beans.basic.SaleOrderDetail;
import com.jiabian.beans.basic.SaleOrderDetailQueryHelper;

public interface SaleOrderDetailMapper {
    int countByExample(SaleOrderDetailQueryHelper example);

    int deleteByExample(SaleOrderDetailQueryHelper example);

    int deleteByPrimaryKey(Long id);

    int insert(SaleOrderDetail record);

    int insertSelective(SaleOrderDetail record);

    List<SaleOrderDetail> selectByExample(SaleOrderDetailQueryHelper example);

    SaleOrderDetail selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SaleOrderDetail record, @Param("example") SaleOrderDetailQueryHelper example);

    int updateByExample(@Param("record") SaleOrderDetail record, @Param("example") SaleOrderDetailQueryHelper example);

    int updateByPrimaryKeySelective(SaleOrderDetail record);

    int updateByPrimaryKey(SaleOrderDetail record);

	/**
	 * 批量添加订单详情
	 * com.jiabian.dao.basic 
	 * 方法名：insertForeach
	 * 创建人：方玉明
	 * 时间：2017年1月3日-下午2:12:47 
	 * @param list
	 * @return Integer
	 * @exception 
	 * @since  1.0.0
	*/
	Integer insertForeach(List<SaleOrderDetail> list);
}