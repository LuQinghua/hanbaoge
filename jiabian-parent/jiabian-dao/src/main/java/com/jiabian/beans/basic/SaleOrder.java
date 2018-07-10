/*
 * SaleOrder.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2017-01-17 Created
 */
package com.jiabian.beans.basic;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 
 * 
 * @author 菠萝大象
 * @version 1.0 2017-01-17
 */
public class SaleOrder implements Serializable {

	private static final long serialVersionUID = 1L;
    /**
     * id主键
     */
    private Long id;
    /**
     * 交易订单号
     */
    private String orderCode;
    /**
     * 购买人Id
     */
    private Long suserId;
    /**
     * 应付总额
     */
    private BigDecimal payableTotal;
    /**
     * 实付总额
     */
    private BigDecimal paidTotal;
    /**
     * 发货时间
     */
    private Date deliveryTime;
    /**
     * 下单时间
     */
    private Date orderTime;
    /**
     * 用户收货信息id
     */
    private Long receiveId;
    /**
     * 订单状态（1：已下单，待支付，2：已取消，3，已支付，待付款，4：已完成）
     */
    private Byte orderStatus;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getOrderCode() {
        return orderCode;
    }
    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode == null ? null : orderCode.trim();
    }
    public Long getSuserId() {
        return suserId;
    }
    public void setSuserId(Long suserId) {
        this.suserId = suserId;
    }
    public BigDecimal getPayableTotal() {
        return payableTotal;
    }
    public void setPayableTotal(BigDecimal payableTotal) {
        this.payableTotal = payableTotal;
    }
    public BigDecimal getPaidTotal() {
        return paidTotal;
    }
    public void setPaidTotal(BigDecimal paidTotal) {
        this.paidTotal = paidTotal;
    }
    public Date getDeliveryTime() {
        return deliveryTime;
    }
    public void setDeliveryTime(Date deliveryTime) {
        this.deliveryTime = deliveryTime;
    }
    public Date getOrderTime() {
        return orderTime;
    }
    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }
    public Long getReceiveId() {
        return receiveId;
    }
    public void setReceiveId(Long receiveId) {
        this.receiveId = receiveId;
    }
    public Byte getOrderStatus() {
        return orderStatus;
    }
    public void setOrderStatus(Byte orderStatus) {
        this.orderStatus = orderStatus;
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
        SaleOrder other = (SaleOrder) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrderCode() == null ? other.getOrderCode() == null : this.getOrderCode().equals(other.getOrderCode()))
            && (this.getSuserId() == null ? other.getSuserId() == null : this.getSuserId().equals(other.getSuserId()))
            && (this.getPayableTotal() == null ? other.getPayableTotal() == null : this.getPayableTotal().equals(other.getPayableTotal()))
            && (this.getPaidTotal() == null ? other.getPaidTotal() == null : this.getPaidTotal().equals(other.getPaidTotal()))
            && (this.getDeliveryTime() == null ? other.getDeliveryTime() == null : this.getDeliveryTime().equals(other.getDeliveryTime()))
            && (this.getOrderTime() == null ? other.getOrderTime() == null : this.getOrderTime().equals(other.getOrderTime()))
            && (this.getReceiveId() == null ? other.getReceiveId() == null : this.getReceiveId().equals(other.getReceiveId()))
            && (this.getOrderStatus() == null ? other.getOrderStatus() == null : this.getOrderStatus().equals(other.getOrderStatus()));
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrderCode() == null) ? 0 : getOrderCode().hashCode());
        result = prime * result + ((getSuserId() == null) ? 0 : getSuserId().hashCode());
        result = prime * result + ((getPayableTotal() == null) ? 0 : getPayableTotal().hashCode());
        result = prime * result + ((getPaidTotal() == null) ? 0 : getPaidTotal().hashCode());
        result = prime * result + ((getDeliveryTime() == null) ? 0 : getDeliveryTime().hashCode());
        result = prime * result + ((getOrderTime() == null) ? 0 : getOrderTime().hashCode());
        result = prime * result + ((getReceiveId() == null) ? 0 : getReceiveId().hashCode());
        result = prime * result + ((getOrderStatus() == null) ? 0 : getOrderStatus().hashCode());
        return result;
    }
}