/*
 * SysRoleMapper.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-11-07 Created
 */
package com.jiabian.dao.basic;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jiabian.base.PagesModel;
import com.jiabian.beans.basic.SysRole;
import com.jiabian.beans.basic.SysRoleQueryHelper;
import com.jiabian.sys.sysrole.request.SysRoleReq;
import com.jiabian.sys.sysrole.response.SysRoleResp;

public interface SysRoleMapper {
    int countByExample(SysRoleQueryHelper example);

    int deleteByExample(SysRoleQueryHelper example);

    int deleteByPrimaryKey(Long roleId);

    int insert(SysRole record);

    int insertSelective(SysRole record);

    List<SysRole> selectByExample(SysRoleQueryHelper example);

    SysRole selectByPrimaryKey(Long roleId);

    int updateByExampleSelective(@Param("record") SysRole record, @Param("example") SysRoleQueryHelper example);

    int updateByExample(@Param("record") SysRole record, @Param("example") SysRoleQueryHelper example);

    int updateByPrimaryKeySelective(SysRole record);

    int updateByPrimaryKey(SysRole record);
    
    /**
     * 分页查询
     * @param pagesModel
     * @return
     */
    List<SysRoleResp> selectforPageByParam(PagesModel<SysRoleReq,SysRoleResp> pagesModel);
    Integer countforPageByParam(PagesModel<SysRoleReq,SysRoleResp> pagesModel);


}