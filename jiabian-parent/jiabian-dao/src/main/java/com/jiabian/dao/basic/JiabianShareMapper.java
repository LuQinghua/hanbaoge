/*
 * JiabianShareMapper.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2017-03-09 Created
 */
package com.jiabian.dao.basic;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jiabian.beans.basic.JiabianShare;
import com.jiabian.beans.basic.JiabianShareQueryHelper;

public interface JiabianShareMapper {
    int countByExample(JiabianShareQueryHelper example);

    int deleteByExample(JiabianShareQueryHelper example);

    int deleteByPrimaryKey(Long id);

    int insert(JiabianShare record);

    int insertSelective(JiabianShare record);

    List<JiabianShare> selectByExample(JiabianShareQueryHelper example);

    JiabianShare selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") JiabianShare record, @Param("example") JiabianShareQueryHelper example);

    int updateByExample(@Param("record") JiabianShare record, @Param("example") JiabianShareQueryHelper example);

    int updateByPrimaryKeySelective(JiabianShare record);

    int updateByPrimaryKey(JiabianShare record);
}