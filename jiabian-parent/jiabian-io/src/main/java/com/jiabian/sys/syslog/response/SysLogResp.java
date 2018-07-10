/*
 * SysLog.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-10-19 Created
 */
package com.jiabian.sys.syslog.response;

import java.io.Serializable;
import java.util.Date;

import org.codehaus.jackson.map.annotate.JsonSerialize;

/**
 * 
 * 
 * @author 菠萝大象
 * @version 1.0 2016-10-19
 */
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class SysLogResp implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 手机号
	 */
	private String userTel;

	/**
	 * 日志模块
	 */
	private String logModule;
	/**
	 * 日志内容
	 */
	private String logContext;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 操作用户ID
	 */
	private Long userId;
	/**
	 * IP地址
	 */
	private String userIP;

	/**
	 * 后台用户名称
	 */
	private String realName;
	/**
	 * 登录账号
	 */
	private String loginName;

	/**
	 * 性别（1：男，2：女）
	 */
	private Byte sex;

	private int roleId;

	private String roleName;

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public Byte getSex() {
		return sex;
	}

	public void setSex(Byte sex) {
		this.sex = sex;
	}

	public String getUserTel() {
		return userTel;
	}

	public void setUserTel(String userTel) {
		this.userTel = userTel;
	}

	public String getLogModule() {
		return logModule;
	}

	public void setLogModule(String logModule) {
		this.logModule = logModule == null ? null : logModule.trim();
	}

	public String getLogContext() {
		return logContext;
	}

	public void setLogContext(String logContext) {
		this.logContext = logContext == null ? null : logContext.trim();
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserIP() {
		return userIP;
	}

	public void setUserIP(String userIP) {
		this.userIP = userIP == null ? null : userIP.trim();
	}
}