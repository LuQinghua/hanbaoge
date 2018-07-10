/*
 * SysConfig.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-10-18 Created
 */
package com.jiabian.sys.sysconfig.request;

import java.util.Date;

import com.jiabian.base.BaseReq;
import com.jiabian.base.io.request.IRequest;

/**
 * 系统配置表
 * 
 * @author 菠萝大象
 * @version 1.0 2016-10-18
 */
public class SysConfigReq extends BaseReq implements IRequest {
	private String checkIds;

	/**
	 * 编号
	 */
	private Long id;
	/**
	 * 键
	 */
	private String conKey;
	/**
	 * 值
	 */
	private String conValue;
	/**
	 * 描述
	 */
	private String reMark;
	/**
	 * 修改人
	 */
	private Long userId;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 修改时间
	 */
	private Date updateTime;
	/**
	 * 删除标识（1：正常，2：删除）
	 */
	private Byte isDel;
	/**
	 * 配置项名
	 */
	private String conForName;

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
	 * 性别（1：男，2：女）
	 */
	private Byte sex;

	/**
	 * 电子邮箱
	 */
	private String email;

	public String getCheckIds() {
		return checkIds;
	}

	public void setCheckIds(String checkIds) {
		this.checkIds = checkIds;
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
		this.realName = realName;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	private static final long serialVersionUID = 1L;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getConKey() {
		return conKey;
	}

	public void setConKey(String conKey) {
		this.conKey = conKey == null ? null : conKey.trim();
	}

	public String getConValue() {
		return conValue;
	}

	public void setConValue(String conValue) {
		this.conValue = conValue == null ? null : conValue.trim();
	}

	public String getReMark() {
		return reMark;
	}

	public void setReMark(String reMark) {
		this.reMark = reMark == null ? null : reMark.trim();
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
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

	public String getConForName() {
		return conForName;
	}

	public void setConForName(String conForName) {
		this.conForName = conForName == null ? null : conForName.trim();
	}
}