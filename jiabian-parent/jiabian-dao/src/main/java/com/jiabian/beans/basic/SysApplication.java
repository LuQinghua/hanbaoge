/*
 * SysApplication.java
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
public class SysApplication implements Serializable {

	private static final long serialVersionUID = 1L;
    /**
     * 主键自增
     */
    private Long id;
    /**
     * 申请人姓名
     */
    private String name;
    /**
     * 身份证号码
     */
    private String cardNo;
    /**
     * 身份证照片
     */
    private String cardImg;
    /**
     * 申请人电话
     */
    private String mobile;
    /**
     * 联系邮箱
     */
    private String email;
    /**
     * 联系地址
     */
    private String address;
    /**
     * 银行名称
     */
    private String bankName;
    /**
     * 银行卡号
     */
    private String bankNo;
    /**
     * 入驻类型 1 区域经理 2 代理/经销商 3 销售/招商人员
     */
    private Byte type;
    /**
     * 省份
     */
    private Integer province;
    /**
     * 城市
     */
    private Integer city;
    /**
     * 区
     */
    private Integer area;
    /**
     * 招商入驻 1 底薪+绩效 2 全绩效
     */
    private Byte attractInvestment;
    /**
     * 物流收入 1 底薪+绩效  2 全绩效 
     */
    private Byte logistics;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 1 未删除 2 删除
     */
    private Byte isDel;
    private String subbranchName;
    /**
     * 1 未审核 2 审核
     */
    private Byte status;
    /**
     * 修改时间
     */
    private Date updateTime;
    /**
     * 审核人
     */
    private Long reviewer;
    /**
     * 审核时间
     */
    private Date reviewTime;
    /**
     * 区域经理关联Id
     */
    private Long suserId;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
    public String getCardNo() {
        return cardNo;
    }
    public void setCardNo(String cardNo) {
        this.cardNo = cardNo == null ? null : cardNo.trim();
    }
    public String getCardImg() {
        return cardImg;
    }
    public void setCardImg(String cardImg) {
        this.cardImg = cardImg == null ? null : cardImg.trim();
    }
    public String getMobile() {
        return mobile;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }
    public String getBankName() {
        return bankName;
    }
    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }
    public String getBankNo() {
        return bankNo;
    }
    public void setBankNo(String bankNo) {
        this.bankNo = bankNo == null ? null : bankNo.trim();
    }
    public Byte getType() {
        return type;
    }
    public void setType(Byte type) {
        this.type = type;
    }
    public Integer getProvince() {
        return province;
    }
    public void setProvince(Integer province) {
        this.province = province;
    }
    public Integer getCity() {
        return city;
    }
    public void setCity(Integer city) {
        this.city = city;
    }
    public Integer getArea() {
        return area;
    }
    public void setArea(Integer area) {
        this.area = area;
    }
    public Byte getAttractInvestment() {
        return attractInvestment;
    }
    public void setAttractInvestment(Byte attractInvestment) {
        this.attractInvestment = attractInvestment;
    }
    public Byte getLogistics() {
        return logistics;
    }
    public void setLogistics(Byte logistics) {
        this.logistics = logistics;
    }
    public Date getCreateTime() {
        return createTime;
    }
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    public Byte getIsDel() {
        return isDel;
    }
    public void setIsDel(Byte isDel) {
        this.isDel = isDel;
    }
    public String getSubbranchName() {
        return subbranchName;
    }
    public void setSubbranchName(String subbranchName) {
        this.subbranchName = subbranchName == null ? null : subbranchName.trim();
    }
    public Byte getStatus() {
        return status;
    }
    public void setStatus(Byte status) {
        this.status = status;
    }
    public Date getUpdateTime() {
        return updateTime;
    }
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    public Long getReviewer() {
        return reviewer;
    }
    public void setReviewer(Long reviewer) {
        this.reviewer = reviewer;
    }
    public Date getReviewTime() {
        return reviewTime;
    }
    public void setReviewTime(Date reviewTime) {
        this.reviewTime = reviewTime;
    }
    public Long getSuserId() {
        return suserId;
    }
    public void setSuserId(Long suserId) {
        this.suserId = suserId;
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
        SysApplication other = (SysApplication) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getCardNo() == null ? other.getCardNo() == null : this.getCardNo().equals(other.getCardNo()))
            && (this.getCardImg() == null ? other.getCardImg() == null : this.getCardImg().equals(other.getCardImg()))
            && (this.getMobile() == null ? other.getMobile() == null : this.getMobile().equals(other.getMobile()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getBankName() == null ? other.getBankName() == null : this.getBankName().equals(other.getBankName()))
            && (this.getBankNo() == null ? other.getBankNo() == null : this.getBankNo().equals(other.getBankNo()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getProvince() == null ? other.getProvince() == null : this.getProvince().equals(other.getProvince()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getArea() == null ? other.getArea() == null : this.getArea().equals(other.getArea()))
            && (this.getAttractInvestment() == null ? other.getAttractInvestment() == null : this.getAttractInvestment().equals(other.getAttractInvestment()))
            && (this.getLogistics() == null ? other.getLogistics() == null : this.getLogistics().equals(other.getLogistics()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getIsDel() == null ? other.getIsDel() == null : this.getIsDel().equals(other.getIsDel()))
            && (this.getSubbranchName() == null ? other.getSubbranchName() == null : this.getSubbranchName().equals(other.getSubbranchName()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getReviewer() == null ? other.getReviewer() == null : this.getReviewer().equals(other.getReviewer()))
            && (this.getReviewTime() == null ? other.getReviewTime() == null : this.getReviewTime().equals(other.getReviewTime()))
            && (this.getSuserId() == null ? other.getSuserId() == null : this.getSuserId().equals(other.getSuserId()));
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getCardNo() == null) ? 0 : getCardNo().hashCode());
        result = prime * result + ((getCardImg() == null) ? 0 : getCardImg().hashCode());
        result = prime * result + ((getMobile() == null) ? 0 : getMobile().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getBankName() == null) ? 0 : getBankName().hashCode());
        result = prime * result + ((getBankNo() == null) ? 0 : getBankNo().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getProvince() == null) ? 0 : getProvince().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getArea() == null) ? 0 : getArea().hashCode());
        result = prime * result + ((getAttractInvestment() == null) ? 0 : getAttractInvestment().hashCode());
        result = prime * result + ((getLogistics() == null) ? 0 : getLogistics().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getIsDel() == null) ? 0 : getIsDel().hashCode());
        result = prime * result + ((getSubbranchName() == null) ? 0 : getSubbranchName().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getReviewer() == null) ? 0 : getReviewer().hashCode());
        result = prime * result + ((getReviewTime() == null) ? 0 : getReviewTime().hashCode());
        result = prime * result + ((getSuserId() == null) ? 0 : getSuserId().hashCode());
        return result;
    }
}