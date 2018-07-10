/*
 * SysUser.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2017-02-10 Created
 */
package com.jiabian.beans.basic;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author 菠萝大象
 * @version 1.0 2017-02-10
 */
public class SysUser implements Serializable {

	private static final long serialVersionUID = 1L;
	/**
	 * 荣云token,当初小方手动加入。
	 */
	private String token;

	/**
	 * 后台用户编号
	 */
	private Long suserId;
	/**
	 * 后台用户名称
	 */
	private String realName;
	/**
	 * 登录账号
	 */
	private String loginName;
	/**
	 * 登录密码
	 */
	private String loginPwd;
	/**
	 * 性别（1：男，2：女）
	 */
	private Byte sex;
	/**
	 * 电子邮箱
	 */
	private String email;
	/**
	 * 角色ID外键
	 */
	private Long roleId;
	/**
	 * 省份
	 */
	private Long province;
	/**
	 * 城市
	 */
	private Long city;
	/**
	 * 地区
	 */
	private Long area;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 更新时间
	 */
	private Date updateTime;
	/**
	 * 删除标记（1：正常，2：删除）
	 */
	private Byte isDel;
	/**
	 * 邀请码
	 */
	private String invitationCode;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Long getSuserId() {
		return suserId;
	}

	public void setSuserId(Long suserId) {
		this.suserId = suserId;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName == null ? null : realName.trim();
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName == null ? null : loginName.trim();
	}

	public String getLoginPwd() {
		return loginPwd;
	}

	public void setLoginPwd(String loginPwd) {
		this.loginPwd = loginPwd == null ? null : loginPwd.trim();
	}

	public Byte getSex() {
		return sex;
	}

	public void setSex(Byte sex) {
		this.sex = sex;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email == null ? null : email.trim();
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public Long getProvince() {
		return province;
	}

	public void setProvince(Long province) {
		this.province = province;
	}

	public Long getCity() {
		return city;
	}

	public void setCity(Long city) {
		this.city = city;
	}

	public Long getArea() {
		return area;
	}

	public void setArea(Long area) {
		this.area = area;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Byte getIsDel() {
		return isDel;
	}

	public void setIsDel(Byte isDel) {
		this.isDel = isDel;
	}

	public String getInvitationCode() {
		return invitationCode;
	}

	public void setInvitationCode(String invitationCode) {
		this.invitationCode = invitationCode == null ? null : invitationCode
				.trim();
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
		SysUser other = (SysUser) that;
		return (this.getSuserId() == null ? other.getSuserId() == null : this
				.getSuserId().equals(other.getSuserId()))
				&& (this.getRealName() == null ? other.getRealName() == null
						: this.getRealName().equals(other.getRealName()))
				&& (this.getLoginName() == null ? other.getLoginName() == null
						: this.getLoginName().equals(other.getLoginName()))
				&& (this.getLoginPwd() == null ? other.getLoginPwd() == null
						: this.getLoginPwd().equals(other.getLoginPwd()))
				&& (this.getSex() == null ? other.getSex() == null : this
						.getSex().equals(other.getSex()))
				&& (this.getEmail() == null ? other.getEmail() == null : this
						.getEmail().equals(other.getEmail()))
				&& (this.getRoleId() == null ? other.getRoleId() == null : this
						.getRoleId().equals(other.getRoleId()))
				&& (this.getProvince() == null ? other.getProvince() == null
						: this.getProvince().equals(other.getProvince()))
				&& (this.getCity() == null ? other.getCity() == null : this
						.getCity().equals(other.getCity()))
				&& (this.getArea() == null ? other.getArea() == null : this
						.getArea().equals(other.getArea()))
				&& (this.getCreateTime() == null ? other.getCreateTime() == null
						: this.getCreateTime().equals(other.getCreateTime()))
				&& (this.getUpdateTime() == null ? other.getUpdateTime() == null
						: this.getUpdateTime().equals(other.getUpdateTime()))
				&& (this.getIsDel() == null ? other.getIsDel() == null : this
						.getIsDel().equals(other.getIsDel()))
				&& (this.getInvitationCode() == null ? other
						.getInvitationCode() == null : this.getInvitationCode()
						.equals(other.getInvitationCode()));
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((getSuserId() == null) ? 0 : getSuserId().hashCode());
		result = prime * result
				+ ((getRealName() == null) ? 0 : getRealName().hashCode());
		result = prime * result
				+ ((getLoginName() == null) ? 0 : getLoginName().hashCode());
		result = prime * result
				+ ((getLoginPwd() == null) ? 0 : getLoginPwd().hashCode());
		result = prime * result
				+ ((getSex() == null) ? 0 : getSex().hashCode());
		result = prime * result
				+ ((getEmail() == null) ? 0 : getEmail().hashCode());
		result = prime * result
				+ ((getRoleId() == null) ? 0 : getRoleId().hashCode());
		result = prime * result
				+ ((getProvince() == null) ? 0 : getProvince().hashCode());
		result = prime * result
				+ ((getCity() == null) ? 0 : getCity().hashCode());
		result = prime * result
				+ ((getArea() == null) ? 0 : getArea().hashCode());
		result = prime * result
				+ ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
		result = prime * result
				+ ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
		result = prime * result
				+ ((getIsDel() == null) ? 0 : getIsDel().hashCode());
		result = prime
				* result
				+ ((getInvitationCode() == null) ? 0 : getInvitationCode()
						.hashCode());
		return result;
	}
}