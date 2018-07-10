/*
 * UserEvaluateMapper.java
 * Copyright(C) 20xx-2015 xxxxxx鍏徃
 * All rights reserved.
 * -----------------------------------------------
 * 2016-10-10 Created
 */
package com.jiabian.dao.basic;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jiabian.beans.basic.UserEvaluate;
import com.jiabian.beans.basic.UserEvaluateQueryHelper;

public interface UserEvaluateMapper {
    int countByExample(UserEvaluateQueryHelper example);

    int deleteByExample(UserEvaluateQueryHelper example);

    int deleteByPrimaryKey(Long id);

    int insert(UserEvaluate record);

    int insertSelective(UserEvaluate record);

    List<UserEvaluate> selectByExample(UserEvaluateQueryHelper example);

    UserEvaluate selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserEvaluate record, @Param("example") UserEvaluateQueryHelper example);

    int updateByExample(@Param("record") UserEvaluate record, @Param("example") UserEvaluateQueryHelper example);

    int updateByPrimaryKeySelective(UserEvaluate record);

    int updateByPrimaryKey(UserEvaluate record);
}