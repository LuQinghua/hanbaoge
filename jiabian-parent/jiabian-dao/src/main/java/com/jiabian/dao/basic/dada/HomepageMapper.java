/*
 * HomepageMapper.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2018-06-27 Created
 */
package com.jiabian.dao.basic.dada;

import com.jiabian.beans.basic.dada.Homepage;
import com.jiabian.beans.basic.dada.HomepageQueryHelper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HomepageMapper {
    int countByExample(HomepageQueryHelper example);

    int deleteByExample(HomepageQueryHelper example);

    int deleteByPrimaryKey(Integer id);

    int insert(Homepage record);

    int insertSelective(Homepage record);

    List<Homepage> selectByExample(HomepageQueryHelper example);

    Homepage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Homepage record, @Param("example") HomepageQueryHelper example);

    int updateByExample(@Param("record") Homepage record, @Param("example") HomepageQueryHelper example);

    int updateByPrimaryKeySelective(Homepage record);

    int updateByPrimaryKey(Homepage record);
}