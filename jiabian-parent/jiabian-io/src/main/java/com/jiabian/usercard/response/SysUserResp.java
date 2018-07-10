package com.jiabian.usercard.response;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class SysUserResp implements Serializable {
	private static final long serialVersionUID = 1L;
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
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 更新时间
	 */
	private Date updateTime;
	/**
	 * 删除标记（0：正常，1：删除）
	 */
	private Byte isDel;

	/**
	 * 角色编号
	 */
	private Long roleId;

	/**
	 * 省
	 */
	private Long province;

	/**
	 * 市
	 */
	private Long city;

	/**
	 * 区域
	 */
	private Long area;

	/**
	 * 角色名称
	 */
	private String roleName;
	/**
	 * 角色描述
	 */
	private String roleDesc;

	/**
	 * 推广获得总金额
	 */
	private BigDecimal totalMoney;
	/**
	 * 推广总人数
	 */
	private Long PeopleNumber;

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

	public Long getPeopleNumber() {
		return PeopleNumber;
	}

	public void setPeopleNumber(Long peopleNumber) {
		PeopleNumber = peopleNumber;
	}

	public BigDecimal getTotalMoney() {
		return totalMoney;
	}

	public void setTotalMoney(BigDecimal totalMoney) {
		this.totalMoney = totalMoney;
	}

	private String invitationCode;

	public String getInvitationCode() {
		return invitationCode;
	}

	public void setInvitationCode(String invitationCode) {
		this.invitationCode = invitationCode;

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

	public String getLoginPwd() {
		return loginPwd;
	}

	public void setLoginPwd(String loginPwd) {
		this.loginPwd = loginPwd;
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
