/*
 * SysReturnMoney.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2017-01-20 Created
 */
package com.jiabian.beans.basic;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 
 * 
 * @author 菠萝大象
 * @version 1.0 2017-01-20
 */
public class SysReturnMoney implements Serializable {

	private static final long serialVersionUID = 1L;
    private Long id;
    /**
     * 用户编号
     */
    private Long userId;
    /**
     * 退款金额
     */
    private BigDecimal returnMoney;
    /**
     * 订单单号
     */
    private String orderCode;
    /**
     * 所属平台 ：   1.抢大运   2.商超   3.书画   4.健康
     */
    private Byte belongPlatform;
    /**
     * 付款方式  ：  1.家边通宝   2.支付宝   3.一网通   4.微信
     */
    private Byte payWay;
    /**
     * 付款账号
     */
    private String payAccount;
    /**
     * 支付时间 （抢大运有毫秒）
     */
    private Date payTime;
    /**
     * 退款状态：   1.申请退款   2.拒绝退款  3.同意退款  4.已退款
     */
    private Byte returnStatus;
    /**
     * 申请时间
     */
    private Date applyTime;
    /**
     * 处理时间
     */
    private Date dealTime;
    /**
     * 审核人
     */
    private Long verifier;
    /**
     * 退款原因
     */
    private String refundCause;
    /**
     * 活动 商品编号
     */
    private Long prodId;

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
    public BigDecimal getReturnMoney() {
        return returnMoney;
    }
    public void setReturnMoney(BigDecimal returnMoney) {
        this.returnMoney = returnMoney;
    }
    public String getOrderCode() {
        return orderCode;
    }
    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode == null ? null : orderCode.trim();
    }
    public Byte getBelongPlatform() {
        return belongPlatform;
    }
    public void setBelongPlatform(Byte belongPlatform) {
        this.belongPlatform = belongPlatform;
    }
    public Byte getPayWay() {
        return payWay;
    }
    public void setPayWay(Byte payWay) {
        this.payWay = payWay;
    }
    public String getPayAccount() {
        return payAccount;
    }
    public void setPayAccount(String payAccount) {
        this.payAccount = payAccount == null ? null : payAccount.trim();
    }
    public Date getPayTime() {
        return payTime;
    }
    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }
    public Byte getReturnStatus() {
        return returnStatus;
    }
    public void setReturnStatus(Byte returnStatus) {
        this.returnStatus = returnStatus;
    }
    public Date getApplyTime() {
        return applyTime;
    }
    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }
    public Date getDealTime() {
        return dealTime;
    }
    public void setDealTime(Date dealTime) {
        this.dealTime = dealTime;
    }
    public Long getVerifier() {
        return verifier;
    }
    public void setVerifier(Long verifier) {
        this.verifier = verifier;
    }
    public String getRefundCause() {
        return refundCause;
    }
    public void setRefundCause(String refundCause) {
        this.refundCause = refundCause == null ? null : refundCause.trim();
    }
    public Long getProdId() {
        return prodId;
    }
    public void setProdId(Long prodId) {
        this.prodId = prodId;
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
        SysReturnMoney other = (SysReturnMoney) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getReturnMoney() == null ? other.getReturnMoney() == null : this.getReturnMoney().equals(other.getReturnMoney()))
            && (this.getOrderCode() == null ? other.getOrderCode() == null : this.getOrderCode().equals(other.getOrderCode()))
            && (this.getBelongPlatform() == null ? other.getBelongPlatform() == null : this.getBelongPlatform().equals(other.getBelongPlatform()))
            && (this.getPayWay() == null ? other.getPayWay() == null : this.getPayWay().equals(other.getPayWay()))
            && (this.getPayAccount() == null ? other.getPayAccount() == null : this.getPayAccount().equals(other.getPayAccount()))
            && (this.getPayTime() == null ? other.getPayTime() == null : this.getPayTime().equals(other.getPayTime()))
            && (this.getReturnStatus() == null ? other.getReturnStatus() == null : this.getReturnStatus().equals(other.getReturnStatus()))
            && (this.getApplyTime() == null ? other.getApplyTime() == null : this.getApplyTime().equals(other.getApplyTime()))
            && (this.getDealTime() == null ? other.getDealTime() == null : this.getDealTime().equals(other.getDealTime()))
            && (this.getVerifier() == null ? other.getVerifier() == null : this.getVerifier().equals(other.getVerifier()))
            && (this.getRefundCause() == null ? other.getRefundCause() == null : this.getRefundCause().equals(other.getRefundCause()))
            && (this.getProdId() == null ? other.getProdId() == null : this.getProdId().equals(other.getProdId()));
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getReturnMoney() == null) ? 0 : getReturnMoney().hashCode());
        result = prime * result + ((getOrderCode() == null) ? 0 : getOrderCode().hashCode());
        result = prime * result + ((getBelongPlatform() == null) ? 0 : getBelongPlatform().hashCode());
        result = prime * result + ((getPayWay() == null) ? 0 : getPayWay().hashCode());
        result = prime * result + ((getPayAccount() == null) ? 0 : getPayAccount().hashCode());
        result = prime * result + ((getPayTime() == null) ? 0 : getPayTime().hashCode());
        result = prime * result + ((getReturnStatus() == null) ? 0 : getReturnStatus().hashCode());
        result = prime * result + ((getApplyTime() == null) ? 0 : getApplyTime().hashCode());
        result = prime * result + ((getDealTime() == null) ? 0 : getDealTime().hashCode());
        result = prime * result + ((getVerifier() == null) ? 0 : getVerifier().hashCode());
        result = prime * result + ((getRefundCause() == null) ? 0 : getRefundCause().hashCode());
        result = prime * result + ((getProdId() == null) ? 0 : getProdId().hashCode());
        return result;
    }
}