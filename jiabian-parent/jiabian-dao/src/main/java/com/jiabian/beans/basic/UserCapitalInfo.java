/*
 * UserCapitalInfo.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2017-01-10 Created
 */
package com.jiabian.beans.basic;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author 菠萝大象
 * @version 1.0 2017-01-10
 */
public class UserCapitalInfo implements Serializable {

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
        this.bankId = bankId == null ? null : bankId.trim();
    }
    public String getBankAddress() {
        return bankAddress;
    }
    public void setBankAddress(String bankAddress) {
        this.bankAddress = bankAddress == null ? null : bankAddress.trim();
    }
    public String getBankName() {
        return bankName;
    }
    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }
    public String getOpenBankName() {
        return openBankName;
    }
    public void setOpenBankName(String openBankName) {
        this.openBankName = openBankName == null ? null : openBankName.trim();
    }
    public String getAlipayId() {
        return alipayId;
    }
    public void setAlipayId(String alipayId) {
        this.alipayId = alipayId == null ? null : alipayId.trim();
    }
    public String getAlipayName() {
        return alipayName;
    }
    public void setAlipayName(String alipayName) {
        this.alipayName = alipayName == null ? null : alipayName.trim();
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
        UserCapitalInfo other = (UserCapitalInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserType() == null ? other.getUserType() == null : this.getUserType().equals(other.getUserType()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getBankId() == null ? other.getBankId() == null : this.getBankId().equals(other.getBankId()))
            && (this.getBankAddress() == null ? other.getBankAddress() == null : this.getBankAddress().equals(other.getBankAddress()))
            && (this.getBankName() == null ? other.getBankName() == null : this.getBankName().equals(other.getBankName()))
            && (this.getOpenBankName() == null ? other.getOpenBankName() == null : this.getOpenBankName().equals(other.getOpenBankName()))
            && (this.getAlipayId() == null ? other.getAlipayId() == null : this.getAlipayId().equals(other.getAlipayId()))
            && (this.getAlipayName() == null ? other.getAlipayName() == null : this.getAlipayName().equals(other.getAlipayName()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getAccountType() == null ? other.getAccountType() == null : this.getAccountType().equals(other.getAccountType()))
            && (this.getIsDel() == null ? other.getIsDel() == null : this.getIsDel().equals(other.getIsDel()));
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserType() == null) ? 0 : getUserType().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getBankId() == null) ? 0 : getBankId().hashCode());
        result = prime * result + ((getBankAddress() == null) ? 0 : getBankAddress().hashCode());
        result = prime * result + ((getBankName() == null) ? 0 : getBankName().hashCode());
        result = prime * result + ((getOpenBankName() == null) ? 0 : getOpenBankName().hashCode());
        result = prime * result + ((getAlipayId() == null) ? 0 : getAlipayId().hashCode());
        result = prime * result + ((getAlipayName() == null) ? 0 : getAlipayName().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getAccountType() == null) ? 0 : getAccountType().hashCode());
        result = prime * result + ((getIsDel() == null) ? 0 : getIsDel().hashCode());
        return result;
    }
}