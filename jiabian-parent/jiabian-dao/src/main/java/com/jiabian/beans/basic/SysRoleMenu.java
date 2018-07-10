/*
 * SysRoleMenu.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-10-11 Created
 */
package com.jiabian.beans.basic;

import java.io.Serializable;

/**
 * 
 * 
 * @author 菠萝大象
 * @version 1.0 2016-10-11
 */
public class SysRoleMenu implements Serializable {

	private static final long serialVersionUID = 1L;
    /**
     * 菜单权限ID
     */
    private Long id;
    /**
     * 系统用户外键
     */
    private Long roleId;
    /**
     * 系统角色外键
     */
    private Long menuId;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getRoleId() {
        return roleId;
    }
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
    public Long getMenuId() {
        return menuId;
    }
    public void setMenuId(Long menuId) {
        this.menuId = menuId;
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
        SysRoleMenu other = (SysRoleMenu) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRoleId() == null ? other.getRoleId() == null : this.getRoleId().equals(other.getRoleId()))
            && (this.getMenuId() == null ? other.getMenuId() == null : this.getMenuId().equals(other.getMenuId()));
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getRoleId() == null) ? 0 : getRoleId().hashCode());
        result = prime * result + ((getMenuId() == null) ? 0 : getMenuId().hashCode());
        return result;
    }
}