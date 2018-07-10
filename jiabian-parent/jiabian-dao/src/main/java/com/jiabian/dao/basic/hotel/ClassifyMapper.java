/*
 * ClassifyMapper.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2018-06-14 Created
 */
package com.jiabian.dao.basic.hotel;

import com.jiabian.beans.basic.hotel.Classify;
import com.jiabian.beans.basic.hotel.ClassifyQueryHelper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClassifyMapper {
    int countByExample(ClassifyQueryHelper example);

    int deleteByExample(ClassifyQueryHelper example);

    int deleteByPrimaryKey(Long id);

    int insert(Classify record);

    int insertSelective(Classify record);

    List<Classify> selectByExample(ClassifyQueryHelper example);

    Classify selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Classify record, @Param("example") ClassifyQueryHelper example);

    int updateByExample(@Param("record") Classify record, @Param("example") ClassifyQueryHelper example);

    int updateByPrimaryKeySelective(Classify record);

    int updateByPrimaryKey(Classify record);
}