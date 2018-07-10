package com.jiabian.usercapitalinfo.request;

import java.util.Date;

import com.jiabian.base.BaseReq;
import com.jiabian.base.io.request.IRequest;

public class UserCapitalInfoReq extends BaseReq implements IRequest{
	private static final long serialVersionUID = 1L;
	/**
     * 编号
     */
    private Long id;
    /**
     * 用户类型（1.C端用户、2后台用户）
     */
    private Byte userType;
    /**
     * 用户编号
     */
    private Long userId;
    /**
     * 银行账号
     */
    private String bankId;
    /**
     * 开户行地址
     */
    private String bankAddress;
    /**
     * 开户行名称
     */
    private String bankName;
    /**
     * 开户人名
     */
    private String openBankName;
    /**
     * 支付宝账号
     */
    private String alipayId;
    /**
     * 支付宝用户名
     */
    private String alipayName;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date updateTime;
    /**
     * 账户类型（1银行卡、2支付宝）
     */
    private Byte accountType;
    /**
     * 删除标记（1：正常 ，2：删除 ，3：锁定）
     */
    private Byte isDel;
    /**
     * 页数
     */
    private Integer currentPage;
    

	public Integer getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Byte getUserType() {
		return userType;
	}
	public void setUserType(Byte userType) {
		this.userType = userType;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getBankId() {
		return bankId;
	}
	public void setBankId(String bankId) {
		this.bankId = bankId;
	}
	public String getBankAddress() {
		return bankAddress;
	}
	public void setBankAddress(String bankAddress) {
		this.bankAddress = bankAddress;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getOpenBankName() {
		return openBankName;
	}
	public void setOpenBankName(String openBankName) {
		this.openBankName = openBankName;
	}
	public String getAlipayId() {
		return alipayId;
	}
	public void setAlipayId(String alipayId) {
		this.alipayId = alipayId;
	}
	public String getAlipayName() {
		return alipayName;
	}
	public void setAlipayName(String alipayName) {
		this.alipayName = alipayName;
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
	public Byte getAccountType() {
		return accountType;
	}
	public void setAccountType(Byte accountType) {
		this.accountType = accountType;
	}
	public Byte getIsDel() {
		return isDel;
	}
	public void setIsDel(Byte isDel) {
		this.isDel = isDel;
	}
    
}
