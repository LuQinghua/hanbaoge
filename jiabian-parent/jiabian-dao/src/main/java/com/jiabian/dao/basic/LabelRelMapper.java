/*
 * LabelRelMapper.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2017-02-28 Created
 */
package com.jiabian.dao.basic;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jiabian.beans.basic.LabelRel;
import com.jiabian.beans.basic.LabelRelQueryHelper;

public interface LabelRelMapper {
    int countByExample(LabelRelQueryHelper example);

    int deleteByExample(LabelRelQueryHelper example);

    int deleteByPrimaryKey(Long id);

    int insert(LabelRel record);

    int insertSelective(LabelRel record);

    List<LabelRel> selectByExample(LabelRelQueryHelper example);

    LabelRel selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LabelRel record, @Param("example") LabelRelQueryHelper example);

    int updateByExample(@Param("record") LabelRel record, @Param("example") LabelRelQueryHelper example);

    int updateByPrimaryKeySelective(LabelRel record);

    int updateByPrimaryKey(LabelRel record);
}