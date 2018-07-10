/*
 * SysRole.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-11-07 Created
 */
package com.jiabian.beans.basic;

import java.io.Serializable;

/**
 * 
 * 
 * @author 菠萝大象
 * @version 1.0 2016-11-07
 */
public class SysRole implements Serializable {

	private static final long serialVersionUID = 1L;
    /**
     * 角色编号
     */
    private Long roleId;
    /**
     * 角色名称
     */
    private String roleName;
    /**
     * 角色权限
     */
    private Byte roleAuth;
    /**
     * 角色描述
     */
    private String roleDesc;

    public Long getRoleId() {
        return roleId;
    }
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
    public String getRoleName() {
        return roleName;
    }
    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }
    public Byte getRoleAuth() {
        return roleAuth;
    }
    public void setRoleAuth(Byte roleAuth) {
        this.roleAuth = roleAuth;
    }
    public String getRoleDesc() {
        return roleDesc;
    }
    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc == null ? null : roleDesc.trim();
    }
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        SysRole other = (SysRole) that;
        return (this.getRoleId() == null ? other.getRoleId() == null : this.getRoleId().equals(other.getRoleId()))
            && (this.getRoleName() == null ? other.getRoleName() == null : this.getRoleName().equals(other.getRoleName()))
            && (this.getRoleAuth() == null ? other.getRoleAuth() == null : this.getRoleAuth().equals(other.getRoleAuth()))
            && (this.getRoleDesc() == null ? other.getRoleDesc() == null : this.getRoleDesc().equals(other.getRoleDesc()));
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRoleId() == null) ? 0 : getRoleId().hashCode());
        result = prime * result + ((getRoleName() == null) ? 0 : getRoleName().hashCode());
        result = prime * result + ((getRoleAuth() == null) ? 0 : getRoleAuth().hashCode());
        result = prime * result + ((getRoleDesc() == null) ? 0 : getRoleDesc().hashCode());
        return result;
    }
}