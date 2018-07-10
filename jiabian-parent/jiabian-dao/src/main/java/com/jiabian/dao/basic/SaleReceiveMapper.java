/*
 * SaleReceiveMapper.java
 * Copyright(C) 20xx-2015 xxxxxx��˾
 * All rights reserved.
 * -----------------------------------------------
 * 2016-12-28 Created
 */
package com.jiabian.dao.basic;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jiabian.beans.basic.SaleReceive;
import com.jiabian.beans.basic.SaleReceiveQueryHelper;

public interface SaleReceiveMapper {
    int countByExample(SaleReceiveQueryHelper example);

    int deleteByExample(SaleReceiveQueryHelper example);

    int deleteByPrimaryKey(Long id);

    int insert(SaleReceive record);

    int insertSelective(SaleReceive record);

    List<SaleReceive> selectByExample(SaleReceiveQueryHelper example);

    SaleReceive selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SaleReceive record, @Param("example") SaleReceiveQueryHelper example);

    int updateByExample(@Param("record") SaleReceive record, @Param("example") SaleReceiveQueryHelper example);

    int updateByPrimaryKeySelective(SaleReceive record);

    int updateByPrimaryKey(SaleReceive record);
}