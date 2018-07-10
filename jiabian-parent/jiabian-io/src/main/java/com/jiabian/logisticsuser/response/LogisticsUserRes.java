/*
 * LogisticsUser.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-10-29 Created
 */
package com.jiabian.logisticsuser.response;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * 配送员信息实体返回类 LogisticsUser 创建人:何雪平 时间：2016年12月3日-上午9:57:52
 * 
 * @version 1.0.0
 * 
 */
@SuppressWarnings("deprecation")
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class LogisticsUserRes implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	 * id编号
	 */
	private Long id;
	/**
	 * 邮箱
	 */
	private String email;
	/**
	 * 手机号
	 */
	private String userTel;
	/**
	 * 0 未填 1 男 2 女
	 */
	private Byte sex;
	/**
	 * 物流人员账号
	 */
	private String userName;
	/**
	 * 物流人员登录密码
	 */
	private String userPwd;
	/**
	 * 加盐
	 */
	private String userSalt;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 修改时间
	 */
	private Date updateTime;
	/**
	 * 真实姓名
	 */
	private String realName;
	/**
	 * 物流公司Id
	 */
	private Long logComPanyId;
	/**
	 * 是否删除(1：正常，2：删除)
	 */
	private Byte isDel;
	/**
	 * 省
	 */
	private Long province;
	/**
	 * 区
	 */
	private Long city;
	/**
	 * 地址
	 */
	private String address;
	/**
	 * 身份证号
	 */
	private String idCard;
	/**
	 * 身份证照片
	 */
	private String idCardImg;
	/**
	 * 配送员形象图
	 */
	private String photograph;
	/**
	 * 工作号
	 */
	private Long workId;
	/**
	 * 区域经理id
	 */
	private Long managerUserId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email == null ? null : email.trim();
	}

	public String getUserTel() {
		return userTel;
	}

	public void setUserTel(String userTel) {
		this.userTel = userTel == null ? null : userTel.trim();
	}

	public Byte getSex() {
		return sex;
	}

	public void setSex(Byte sex) {
		this.sex = sex;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName == null ? null : userName.trim();
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd == null ? null : userPwd.trim();
	}

	public String getUserSalt() {
		return userSalt;
	}

	public void setUserSalt(String userSalt) {
		this.userSalt = userSalt == null ? null : userSalt.trim();
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

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName == null ? null : realName.trim();
	}

	public Long getLogComPanyId() {
		return logComPanyId;
	}

	public void setLogComPanyId(Long logComPanyId) {
		this.logComPanyId = logComPanyId;
	}

	public Byte getIsDel() {
		return isDel;
	}

	public void setIsDel(Byte isDel) {
		this.isDel = isDel;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getIdCardImg() {
		return idCardImg;
	}

	public void setIdCardImg(String idCardImg) {
		this.idCardImg = idCardImg;
	}

	public String getPhotograph() {
		return photograph;
	}

	public void setPhotograph(String photograph) {
		this.photograph = photograph;
	}

	public Long getWorkId() {
		return workId;
	}

	public void setWorkId(Long workId) {
		this.workId = workId;
	}

	public Long getManagerUserId() {
		return managerUserId;
	}

	public void setManagerUserId(Long managerUserId) {
		this.managerUserId = managerUserId;
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
		LogisticsUserRes other = (LogisticsUserRes) that;
		return (this.getId() == null ? other.getId() == null : this.getId()
				.equals(other.getId()))
				&& (this.getEmail() == null ? other.getEmail() == null : this
						.getEmail().equals(other.getEmail()))
				&& (this.getUserTel() == null ? other.getUserTel() == null
						: this.getUserTel().equals(other.getUserTel()))
				&& (this.getSex() == null ? other.getSex() == null : this
						.getSex().equals(other.getSex()))
				&& (this.getUserName() == null ? other.getUserName() == null
						: this.getUserName().equals(other.getUserName()))
				&& (this.getUserPwd() == null ? other.getUserPwd() == null
						: this.getUserPwd().equals(other.getUserPwd()))
				&& (this.getUserSalt() == null ? other.getUserSalt() == null
						: this.getUserSalt().equals(other.getUserSalt()))
				&& (this.getCreateTime() == null ? other.getCreateTime() == null
						: this.getCreateTime().equals(other.getCreateTime()))
				&& (this.getUpdateTime() == null ? other.getUpdateTime() == null
						: this.getUpdateTime().equals(other.getUpdateTime()))
				&& (this.getRealName() == null ? other.getRealName() == null
						: this.getRealName().equals(other.getRealName()))
				&& (this.getLogComPanyId() == null ? other.getLogComPanyId() == null
						: this.getLogComPanyId()
								.equals(other.getLogComPanyId()))
				&& (this.getIsDel() == null ? other.getIsDel() == null : this
						.getIsDel().equals(other.getIsDel()));
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
		result = prime * result
				+ ((getEmail() == null) ? 0 : getEmail().hashCode());
		result = prime * result
				+ ((getUserTel() == null) ? 0 : getUserTel().hashCode());
		result = prime * result
				+ ((getSex() == null) ? 0 : getSex().hashCode());
		result = prime * result
				+ ((getUserName() == null) ? 0 : getUserName().hashCode());
		result = prime * result
				+ ((getUserPwd() == null) ? 0 : getUserPwd().hashCode());
		result = prime * result
				+ ((getUserSalt() == null) ? 0 : getUserSalt().hashCode());
		result = prime * result
				+ ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
		result = prime * result
				+ ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
		result = prime * result
				+ ((getRealName() == null) ? 0 : getRealName().hashCode());
		result = prime
				* result
				+ ((getLogComPanyId() == null) ? 0 : getLogComPanyId()
						.hashCode());
		result = prime * result
				+ ((getIsDel() == null) ? 0 : getIsDel().hashCode());
		return result;
	}
}