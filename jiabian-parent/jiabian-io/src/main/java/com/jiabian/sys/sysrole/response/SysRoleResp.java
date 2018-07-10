package com.jiabian.sys.sysrole.response;

import java.io.Serializable;

public class SysRoleResp implements Serializable {
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
		this.roleName = roleName;
	}
	public String getRoleDesc() {
		return roleDesc;
	}
	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
	}
}
