/*
 * SalesCommissions.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2017-01-12 Created
 */
package com.jiabian.beans.basic;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 
 * 
 * @author 菠萝大象
 * @version 1.0 2017-01-12
 */
public class SalesCommissions implements Serializable {

	private static final long serialVersionUID = 1L;
    private Long id;
    /**
     * 买家id
     */
    private Long userId;
    /**
     * 销售商品ID(家边健康的商品)
     */
    private Long productId;
    /**
     * 商品金额
     */
    private BigDecimal productMoney;
    /**
     * 提成金额
     */
    private BigDecimal commissionsMoney;
    /**
     * 邀请码
     */
    private String invitationCode;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 提现状态：0.待提现   1.申请提现   2.已提现   3.不同意提现
     */
    private Byte moneyStatus;
    /**
     * 审核时间
     */
    private Date auditTime;
    /**
     * 审核人id
     */
    private Long auditManId;
    /**
     * 流水类型（1：收入    2：提现）
     */
    private Byte waterType;
    /**
     * 提现金额
     */
    private BigDecimal withdrawMoney;
    /**
     * 提现时间
     */
    private Date withdrawTime;
    /**
     * 删除标识（1：正常，2：删除）
     */
    private Byte isDel;
    /**
     * 订单id
     */
    private Long orderId;
    /**
     * 是否支付  1：未支付  2：支付  
     */
    private Byte isPay;
    /**
     * 资金账号Id
     */
    private Long capitalInfoId;
    /**
     * 销售数量
     */
    private Integer saleNum;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getUserId() {
        return userId;
    }
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    public Long getProductId() {
        return productId;
    }
    public void setProductId(Long productId) {
        this.productId = productId;
    }
    public BigDecimal getProductMoney() {
        return productMoney;
    }
    public void setProductMoney(BigDecimal productMoney) {
        this.productMoney = productMoney;
    }
    public BigDecimal getCommissionsMoney() {
        return commissionsMoney;
    }
    public void setCommissionsMoney(BigDecimal commissionsMoney) {
        this.commissionsMoney = commissionsMoney;
    }
    public String getInvitationCode() {
        return invitationCode;
    }
    public void setInvitationCode(String invitationCode) {
        this.invitationCode = invitationCode == null ? null : invitationCode.trim();
    }
    public Date getCreateTime() {
        return createTime;
    }
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    public Byte getMoneyStatus() {
        return moneyStatus;
    }
    public void setMoneyStatus(Byte moneyStatus) {
        this.moneyStatus = moneyStatus;
    }
    public Date getAuditTime() {
        return auditTime;
    }
    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }
    public Long getAuditManId() {
        return auditManId;
    }
    public void setAuditManId(Long auditManId) {
        this.auditManId = auditManId;
    }
    public Byte getWaterType() {
        return waterType;
    }
    public void setWaterType(Byte waterType) {
        this.waterType = waterType;
    }
    public BigDecimal getWithdrawMoney() {
        return withdrawMoney;
    }
    public void setWithdrawMoney(BigDecimal withdrawMoney) {
        this.withdrawMoney = withdrawMoney;
    }
    public Date getWithdrawTime() {
        return withdrawTime;
    }
    public void setWithdrawTime(Date withdrawTime) {
        this.withdrawTime = withdrawTime;
    }
    public Byte getIsDel() {
        return isDel;
    }
    public void setIsDel(Byte isDel) {
        this.isDel = isDel;
    }
    public Long getOrderId() {
        return orderId;
    }
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
    public Byte getIsPay() {
        return isPay;
    }
    public void setIsPay(Byte isPay) {
        this.isPay = isPay;
    }
    public Long getCapitalInfoId() {
        return capitalInfoId;
    }
    public void setCapitalInfoId(Long capitalInfoId) {
        this.capitalInfoId = capitalInfoId;
    }
    public Integer getSaleNum() {
        return saleNum;
    }
    public void setSaleNum(Integer saleNum) {
        this.saleNum = saleNum;
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
        SalesCommissions other = (SalesCommissions) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getProductId() == null ? other.getProductId() == null : this.getProductId().equals(other.getProductId()))
            && (this.getProductMoney() == null ? other.getProductMoney() == null : this.getProductMoney().equals(other.getProductMoney()))
            && (this.getCommissionsMoney() == null ? other.getCommissionsMoney() == null : this.getCommissionsMoney().equals(other.getCommissionsMoney()))
            && (this.getInvitationCode() == null ? other.getInvitationCode() == null : this.getInvitationCode().equals(other.getInvitationCode()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getMoneyStatus() == null ? other.getMoneyStatus() == null : this.getMoneyStatus().equals(other.getMoneyStatus()))
            && (this.getAuditTime() == null ? other.getAuditTime() == null : this.getAuditTime().equals(other.getAuditTime()))
            && (this.getAuditManId() == null ? other.getAuditManId() == null : this.getAuditManId().equals(other.getAuditManId()))
            && (this.getWaterType() == null ? other.getWaterType() == null : this.getWaterType().equals(other.getWaterType()))
            && (this.getWithdrawMoney() == null ? other.getWithdrawMoney() == null : this.getWithdrawMoney().equals(other.getWithdrawMoney()))
            && (this.getWithdrawTime() == null ? other.getWithdrawTime() == null : this.getWithdrawTime().equals(other.getWithdrawTime()))
            && (this.getIsDel() == null ? other.getIsDel() == null : this.getIsDel().equals(other.getIsDel()))
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getIsPay() == null ? other.getIsPay() == null : this.getIsPay().equals(other.getIsPay()))
            && (this.getCapitalInfoId() == null ? other.getCapitalInfoId() == null : this.getCapitalInfoId().equals(other.getCapitalInfoId()))
            && (this.getSaleNum() == null ? other.getSaleNum() == null : this.getSaleNum().equals(other.getSaleNum()));
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getProductId() == null) ? 0 : getProductId().hashCode());
        result = prime * result + ((getProductMoney() == null) ? 0 : getProductMoney().hashCode());
        result = prime * result + ((getCommissionsMoney() == null) ? 0 : getCommissionsMoney().hashCode());
        result = prime * result + ((getInvitationCode() == null) ? 0 : getInvitationCode().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getMoneyStatus() == null) ? 0 : getMoneyStatus().hashCode());
        result = prime * result + ((getAuditTime() == null) ? 0 : getAuditTime().hashCode());
        result = prime * result + ((getAuditManId() == null) ? 0 : getAuditManId().hashCode());
        result = prime * result + ((getWaterType() == null) ? 0 : getWaterType().hashCode());
        result = prime * result + ((getWithdrawMoney() == null) ? 0 : getWithdrawMoney().hashCode());
        result = prime * result + ((getWithdrawTime() == null) ? 0 : getWithdrawTime().hashCode());
        result = prime * result + ((getIsDel() == null) ? 0 : getIsDel().hashCode());
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getIsPay() == null) ? 0 : getIsPay().hashCode());
        result = prime * result + ((getCapitalInfoId() == null) ? 0 : getCapitalInfoId().hashCode());
        result = prime * result + ((getSaleNum() == null) ? 0 : getSaleNum().hashCode());
        return result;
    }
}