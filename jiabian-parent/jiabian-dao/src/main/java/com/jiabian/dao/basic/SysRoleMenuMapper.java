/*
 * SysRoleMenuMapper.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-10-11 Created
 */
package com.jiabian.dao.basic;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jiabian.beans.basic.SysRoleMenu;
import com.jiabian.beans.basic.SysRoleMenuQueryHelper;

public interface SysRoleMenuMapper {
    int countByExample(SysRoleMenuQueryHelper example);

    int deleteByExample(SysRoleMenuQueryHelper example);

    int deleteByPrimaryKey(Long id);
    
    int insert(SysRoleMenu record);

    int insertSelective(SysRoleMenu record);

    List<SysRoleMenu> selectByExample(SysRoleMenuQueryHelper example);

    SysRoleMenu selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysRoleMenu record, @Param("example") SysRoleMenuQueryHelper example);

    int updateByExample(@Param("record") SysRoleMenu record, @Param("example") SysRoleMenuQueryHelper example);

    int updateByPrimaryKeySelective(SysRoleMenu record);

    int updateByPrimaryKey(SysRoleMenu record);
    
    /**
     * 批量插入
     * @param roleMenuList
     * @return
     */
    public int insertForeach(List<SysRoleMenu> roleMenuList);
}