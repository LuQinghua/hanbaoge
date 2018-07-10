/*
 * LogisticsCompany.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2017-01-18 Created
 */
package com.jiabian.beans.basic;

import java.io.Serializable;
import java.util.Date;

/**
 * 物流信息表
 * 
 * @author 菠萝大象
 * @version 1.0 2017-01-18
 */
public class LogisticsCompany implements Serializable {

	private static final long serialVersionUID = 1L;
    /**
     * 编号
     */
    private Long id;
    /**
     * 快递公司代码
     */
    private String companyCode;
    /**
     * 物流公司
     */
    private String logiCompany;
    /**
     * 联系人
     */
    private String contacts;
    /**
     * 联系地址
     */
    private String logiAddress;
    /**
     * 联系电话
     */
    private String logiTell;
    /**
     * 公司网址
     */
    private String logiWebsite;
    /**
     * 备注
     */
    private String remark;
    /**
     * 录入时间
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

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getCompanyCode() {
        return companyCode;
    }
    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode == null ? null : companyCode.trim();
    }
    public String getLogiCompany() {
        return logiCompany;
    }
    public void setLogiCompany(String logiCompany) {
        this.logiCompany = logiCompany == null ? null : logiCompany.trim();
    }
    public String getContacts() {
        return contacts;
    }
    public void setContacts(String contacts) {
        this.contacts = contacts == null ? null : contacts.trim();
    }
    public String getLogiAddress() {
        return logiAddress;
    }
    public void setLogiAddress(String logiAddress) {
        this.logiAddress = logiAddress == null ? null : logiAddress.trim();
    }
    public String getLogiTell() {
        return logiTell;
    }
    public void setLogiTell(String logiTell) {
        this.logiTell = logiTell == null ? null : logiTell.trim();
    }
    public String getLogiWebsite() {
        return logiWebsite;
    }
    public void setLogiWebsite(String logiWebsite) {
        this.logiWebsite = logiWebsite == null ? null : logiWebsite.trim();
    }
    public String getRemark() {
        return remark;
    }
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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
        LogisticsCompany other = (LogisticsCompany) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCompanyCode() == null ? other.getCompanyCode() == null : this.getCompanyCode().equals(other.getCompanyCode()))
            && (this.getLogiCompany() == null ? other.getLogiCompany() == null : this.getLogiCompany().equals(other.getLogiCompany()))
            && (this.getContacts() == null ? other.getContacts() == null : this.getContacts().equals(other.getContacts()))
            && (this.getLogiAddress() == null ? other.getLogiAddress() == null : this.getLogiAddress().equals(other.getLogiAddress()))
            && (this.getLogiTell() == null ? other.getLogiTell() == null : this.getLogiTell().equals(other.getLogiTell()))
            && (this.getLogiWebsite() == null ? other.getLogiWebsite() == null : this.getLogiWebsite().equals(other.getLogiWebsite()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getIsDel() == null ? other.getIsDel() == null : this.getIsDel().equals(other.getIsDel()));
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCompanyCode() == null) ? 0 : getCompanyCode().hashCode());
        result = prime * result + ((getLogiCompany() == null) ? 0 : getLogiCompany().hashCode());
        result = prime * result + ((getContacts() == null) ? 0 : getContacts().hashCode());
        result = prime * result + ((getLogiAddress() == null) ? 0 : getLogiAddress().hashCode());
        result = prime * result + ((getLogiTell() == null) ? 0 : getLogiTell().hashCode());
        result = prime * result + ((getLogiWebsite() == null) ? 0 : getLogiWebsite().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getIsDel() == null) ? 0 : getIsDel().hashCode());
        return result;
    }
}