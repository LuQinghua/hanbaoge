package com.jiabian.sys.sysrole.request;

import com.jiabian.base.BaseReq;
import com.jiabian.base.io.request.IRequest;

public class SysRoleReq extends BaseReq implements IRequest {
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

	public Byte getRoleAuth() {
		return roleAuth;
	}

	public void setRoleAuth(Byte roleAuth) {
		this.roleAuth = roleAuth;
	}

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
