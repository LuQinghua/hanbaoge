/*
 * SysMenuMapper.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-10-31 Created
 */
package com.jiabian.dao.basic;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jiabian.beans.basic.SysMenu;
import com.jiabian.beans.basic.SysMenuQueryHelper;

public interface SysMenuMapper {
    int countByExample(SysMenuQueryHelper example);

    int deleteByExample(SysMenuQueryHelper example);

    int deleteByPrimaryKey(Long menuId);

    int insert(SysMenu record);

    int insertSelective(SysMenu record);

    List<SysMenu> selectByExample(SysMenuQueryHelper example);

    SysMenu selectByPrimaryKey(Long menuId);

    int updateByExampleSelective(@Param("record") SysMenu record, @Param("example") SysMenuQueryHelper example);

    int updateByExample(@Param("record") SysMenu record, @Param("example") SysMenuQueryHelper example);

    int updateByPrimaryKeySelective(SysMenu record);

    int updateByPrimaryKey(SysMenu record);
}