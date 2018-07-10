/*
 * UserSafeMapper.java
 * Copyright(C) 20xx-2015 xxxxxx鍏徃
 * All rights reserved.
 * -----------------------------------------------
 * 2016-10-10 Created
 */
package com.jiabian.dao.basic;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jiabian.beans.basic.UserSafe;
import com.jiabian.beans.basic.UserSafeQueryHelper;

public interface UserSafeMapper {
    int countByExample(UserSafeQueryHelper example);

    int deleteByExample(UserSafeQueryHelper example);

    int deleteByPrimaryKey(Long id);

    int insert(UserSafe record);

    int insertSelective(UserSafe record);

    List<UserSafe> selectByExample(UserSafeQueryHelper example);

    UserSafe selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserSafe record, @Param("example") UserSafeQueryHelper example);

    int updateByExample(@Param("record") UserSafe record, @Param("example") UserSafeQueryHelper example);

    int updateByPrimaryKeySelective(UserSafe record);

    int updateByPrimaryKey(UserSafe record);
}