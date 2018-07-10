/*
 * GiftMapper.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2018-06-28 Created
 */
package com.jiabian.dao.basic.dada;

import com.jiabian.beans.basic.dada.Gift;
import com.jiabian.beans.basic.dada.GiftQueryHelper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GiftMapper {
    int countByExample(GiftQueryHelper example);

    int deleteByExample(GiftQueryHelper example);

    int deleteByPrimaryKey(Long id);

    int insert(Gift record);

    int insertSelective(Gift record);

    List<Gift> selectByExample(GiftQueryHelper example);

    Gift selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Gift record, @Param("example") GiftQueryHelper example);

    int updateByExample(@Param("record") Gift record, @Param("example") GiftQueryHelper example);

    int updateByPrimaryKeySelective(Gift record);

    int updateByPrimaryKey(Gift record);
}