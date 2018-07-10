package com.jiabian.sys.sysmenu.response;

import java.io.Serializable;

public class SysMenuResp implements Serializable{
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
    
    public Byte getMenuType() {
		return menuType;
	}
	public void setMenuType(Byte menuType) {
		this.menuType = menuType;
	}
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
		this.menuName = menuName;
	}
	public String getMenuDesc() {
		return menuDesc;
	}
	public void setMenuDesc(String menuDesc) {
		this.menuDesc = menuDesc;
	}
	public String getMenuUrl() {
		return menuUrl;
	}
	public void setMenuUrl(String menuUrl) {
		this.menuUrl = menuUrl;
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
		this.menuIcon = menuIcon;
	}
	public Byte getMenuState() {
		return menuState;
	}
	public void setMenuState(Byte menuState) {
		this.menuState = menuState;
	}
}
