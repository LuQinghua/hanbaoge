/*
 * UserNoticeMapper.java
 * Copyright(C) 20xx-2015 xxxxxx鍏徃
 * All rights reserved.
 * -----------------------------------------------
 * 2016-10-10 Created
 */
package com.jiabian.dao.basic;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jiabian.beans.basic.UserNotice;
import com.jiabian.beans.basic.UserNoticeQueryHelper;

public interface UserNoticeMapper {
    int countByExample(UserNoticeQueryHelper example);

    int deleteByExample(UserNoticeQueryHelper example);

    int deleteByPrimaryKey(Long id);

    int insert(UserNotice record);

    int insertSelective(UserNotice record);

    List<UserNotice> selectByExample(UserNoticeQueryHelper example);

    UserNotice selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserNotice record, @Param("example") UserNoticeQueryHelper example);

    int updateByExample(@Param("record") UserNotice record, @Param("example") UserNoticeQueryHelper example);

    int updateByPrimaryKeySelective(UserNotice record);

    int updateByPrimaryKey(UserNotice record);
}