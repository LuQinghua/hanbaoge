/*
 * FreightMapper.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-11-15 Created
 */
package com.jiabian.dao.basic;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jiabian.beans.basic.Freight;
import com.jiabian.beans.basic.FreightQueryHelper;

public interface FreightMapper {
    int countByExample(FreightQueryHelper example);

    int deleteByExample(FreightQueryHelper example);

    int deleteByPrimaryKey(Long id);

    int insert(Freight record);

    int insertSelective(Freight record);

    List<Freight> selectByExample(FreightQueryHelper example);

    Freight selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Freight record, @Param("example") FreightQueryHelper example);

    int updateByExample(@Param("record") Freight record, @Param("example") FreightQueryHelper example);

    int updateByPrimaryKeySelective(Freight record);

    int updateByPrimaryKey(Freight record);
}