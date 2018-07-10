/*
 * MoneyWater.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2017-02-22 Created
 */
package com.jiabian.beans.basic;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 
 * 
 * @author 菠萝大象
 * @version 1.0 2017-02-22
 */
public class MoneyWater implements Serializable {

    /**
     * 主键。非空
     */
    private Long id;
    /**
     * 订单记录号
     */
    private Long order_recordId;
    /**
     * 店铺id
     */
    private Long shopId;
    /**
     * 流水号
     */
    private String moneyWaterCode;
    /**
     * 退款金额
     */
    private BigDecimal returnMoney;
    /**
     * 收入时间
     */
    private Date incomeTime;
    /**
     * 提现金额
     */
    private BigDecimal withdrawMoney;
    /**
     * 提现时间
     */
    private Date withdrawTime;
    /**
     * 提现状态：0.待提现   1.申请提现   2.审核中  3.已提现
     */
    private Byte moneyStatus;
    /**
     * 经手人
     */
    private Long handlingManId;
    /**
     * 审核人
     */
    private Long auditManId;
    /**
     * 审核时间
     */
    private Date auditTime;
    /**
     * 流水类型  1：收入    2：提现   3：退款
     */
    private Byte waterType;
    /**
     * 用户提现账户id
     */
    private Long accountId;
    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getOrder_recordId() {
        return order_recordId;
    }
    public void setOrder_recordId(Long order_recordId) {
        this.order_recordId = order_recordId;
    }
    public Long getShopId() {
        return shopId;
    }
    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }
    public String getMoneyWaterCode() {
        return moneyWaterCode;
    }
    public void setMoneyWaterCode(String moneyWaterCode) {
        this.moneyWaterCode = moneyWaterCode == null ? null : moneyWaterCode.trim();
    }
    public BigDecimal getReturnMoney() {
        return returnMoney;
    }
    public void setReturnMoney(BigDecimal returnMoney) {
        this.returnMoney = returnMoney;
    }
    public Date getIncomeTime() {
        return incomeTime;
    }
    public void setIncomeTime(Date incomeTime) {
        this.incomeTime = incomeTime;
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
    public Byte getMoneyStatus() {
        return moneyStatus;
    }
    public void setMoneyStatus(Byte moneyStatus) {
        this.moneyStatus = moneyStatus;
    }
    public Long getHandlingManId() {
        return handlingManId;
    }
    public void setHandlingManId(Long handlingManId) {
        this.handlingManId = handlingManId;
    }
    public Long getAuditManId() {
        return auditManId;
    }
    public void setAuditManId(Long auditManId) {
        this.auditManId = auditManId;
    }
    public Date getAuditTime() {
        return auditTime;
    }
    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }
    public Byte getWaterType() {
        return waterType;
    }
    public void setWaterType(Byte waterType) {
        this.waterType = waterType;
    }
    public Long getAccountId() {
        return accountId;
    }
    public void setAccountId(Long accountId) {
        this.accountId = accountId;
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
        MoneyWater other = (MoneyWater) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrder_recordId() == null ? other.getOrder_recordId() == null : this.getOrder_recordId().equals(other.getOrder_recordId()))
            && (this.getShopId() == null ? other.getShopId() == null : this.getShopId().equals(other.getShopId()))
            && (this.getMoneyWaterCode() == null ? other.getMoneyWaterCode() == null : this.getMoneyWaterCode().equals(other.getMoneyWaterCode()))
            && (this.getReturnMoney() == null ? other.getReturnMoney() == null : this.getReturnMoney().equals(other.getReturnMoney()))
            && (this.getIncomeTime() == null ? other.getIncomeTime() == null : this.getIncomeTime().equals(other.getIncomeTime()))
            && (this.getWithdrawMoney() == null ? other.getWithdrawMoney() == null : this.getWithdrawMoney().equals(other.getWithdrawMoney()))
            && (this.getWithdrawTime() == null ? other.getWithdrawTime() == null : this.getWithdrawTime().equals(other.getWithdrawTime()))
            && (this.getMoneyStatus() == null ? other.getMoneyStatus() == null : this.getMoneyStatus().equals(other.getMoneyStatus()))
            && (this.getHandlingManId() == null ? other.getHandlingManId() == null : this.getHandlingManId().equals(other.getHandlingManId()))
            && (this.getAuditManId() == null ? other.getAuditManId() == null : this.getAuditManId().equals(other.getAuditManId()))
            && (this.getAuditTime() == null ? other.getAuditTime() == null : this.getAuditTime().equals(other.getAuditTime()))
            && (this.getWaterType() == null ? other.getWaterType() == null : this.getWaterType().equals(other.getWaterType()))
            && (this.getAccountId() == null ? other.getAccountId() == null : this.getAccountId().equals(other.getAccountId()));
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrder_recordId() == null) ? 0 : getOrder_recordId().hashCode());
        result = prime * result + ((getShopId() == null) ? 0 : getShopId().hashCode());
        result = prime * result + ((getMoneyWaterCode() == null) ? 0 : getMoneyWaterCode().hashCode());
        result = prime * result + ((getReturnMoney() == null) ? 0 : getReturnMoney().hashCode());
        result = prime * result + ((getIncomeTime() == null) ? 0 : getIncomeTime().hashCode());
        result = prime * result + ((getWithdrawMoney() == null) ? 0 : getWithdrawMoney().hashCode());
        result = prime * result + ((getWithdrawTime() == null) ? 0 : getWithdrawTime().hashCode());
        result = prime * result + ((getMoneyStatus() == null) ? 0 : getMoneyStatus().hashCode());
        result = prime * result + ((getHandlingManId() == null) ? 0 : getHandlingManId().hashCode());
        result = prime * result + ((getAuditManId() == null) ? 0 : getAuditManId().hashCode());
        result = prime * result + ((getAuditTime() == null) ? 0 : getAuditTime().hashCode());
        result = prime * result + ((getWaterType() == null) ? 0 : getWaterType().hashCode());
        result = prime * result + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        return result;
    }
}