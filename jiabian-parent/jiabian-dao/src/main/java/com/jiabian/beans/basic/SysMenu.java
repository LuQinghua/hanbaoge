/*
 * SysMenu.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-10-31 Created
 */
package com.jiabian.beans.basic;

import java.io.Serializable;

/**
 * 
 * 
 * @author 菠萝大象
 * @version 1.0 2016-10-31
 */
public class SysMenu implements Serializable {

	private static final long serialVersionUID = 1L;
    /**
     * 菜单编号
     */
    private Long menuId;
    /**
     * 菜单名称
     */
    private String menuName;
    /**
     * 菜单描述
     */
    private String menuDesc;
    /**
     * 菜单请求路径
     */
    private String menuUrl;
    /**
     * 父级菜单ID
     */
    private Long menuParentId;
    /**
     * 菜单小图标
     */
    private String menuIcon;
    /**
     * 菜单状态（0：显示 1：不显示）
     */
    private Byte menuState;
    /**
     * 菜单类型（1：系统菜单，2：业务菜单）
     */
    private Byte menuType;

    public Long getMenuId() {
        return menuId;
    }
    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }
    public String getMenuName() {
        return menuName;
    }
    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }
    public String getMenuDesc() {
        return menuDesc;
    }
    public void setMenuDesc(String menuDesc) {
        this.menuDesc = menuDesc == null ? null : menuDesc.trim();
    }
    public String getMenuUrl() {
        return menuUrl;
    }
    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl == null ? null : menuUrl.trim();
    }
    public Long getMenuParentId() {
        return menuParentId;
    }
    public void setMenuParentId(Long menuParentId) {
        this.menuParentId = menuParentId;
    }
    public String getMenuIcon() {
        return menuIcon;
    }
    public void setMenuIcon(String menuIcon) {
        this.menuIcon = menuIcon == null ? null : menuIcon.trim();
    }
    public Byte getMenuState() {
        return menuState;
    }
    public void setMenuState(Byte menuState) {
        this.menuState = menuState;
    }
    public Byte getMenuType() {
        return menuType;
    }
    public void setMenuType(Byte menuType) {
        this.menuType = menuType;
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
        SysMenu other = (SysMenu) that;
        return (this.getMenuId() == null ? other.getMenuId() == null : this.getMenuId().equals(other.getMenuId()))
            && (this.getMenuName() == null ? other.getMenuName() == null : this.getMenuName().equals(other.getMenuName()))
            && (this.getMenuDesc() == null ? other.getMenuDesc() == null : this.getMenuDesc().equals(other.getMenuDesc()))
            && (this.getMenuUrl() == null ? other.getMenuUrl() == null : this.getMenuUrl().equals(other.getMenuUrl()))
            && (this.getMenuParentId() == null ? other.getMenuParentId() == null : this.getMenuParentId().equals(other.getMenuParentId()))
            && (this.getMenuIcon() == null ? other.getMenuIcon() == null : this.getMenuIcon().equals(other.getMenuIcon()))
            && (this.getMenuState() == null ? other.getMenuState() == null : this.getMenuState().equals(other.getMenuState()))
            && (this.getMenuType() == null ? other.getMenuType() == null : this.getMenuType().equals(other.getMenuType()));
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMenuId() == null) ? 0 : getMenuId().hashCode());
        result = prime * result + ((getMenuName() == null) ? 0 : getMenuName().hashCode());
        result = prime * result + ((getMenuDesc() == null) ? 0 : getMenuDesc().hashCode());
        result = prime * result + ((getMenuUrl() == null) ? 0 : getMenuUrl().hashCode());
        result = prime * result + ((getMenuParentId() == null) ? 0 : getMenuParentId().hashCode());
        result = prime * result + ((getMenuIcon() == null) ? 0 : getMenuIcon().hashCode());
        result = prime * result + ((getMenuState() == null) ? 0 : getMenuState().hashCode());
        result = prime * result + ((getMenuType() == null) ? 0 : getMenuType().hashCode());
        return result;
    }
}