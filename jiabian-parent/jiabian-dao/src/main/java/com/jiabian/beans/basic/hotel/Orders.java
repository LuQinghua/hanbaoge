/*
 * Orders.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2018-06-17 Created
 */
package com.jiabian.beans.basic.hotel;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 
 * 
 * @author 菠萝大象
 * @version 1.0 2018-06-17
 */
public class Orders implements Serializable {

    private Long id;
    /**
     * 用户id
     */
    private Long userId;
    /**
     * 商品id
     */
    private Long homeId;
    /**
     * 订单号
     */
    private String orderCode;
    /**
     * 添加时间
     */
    private Date createTime;
    /**
     * 支付时间
     */
    private Date paymentTime;
    /**
     * 类型 1.未支付 2.已支付
     */
    private Byte type;
    /**
     * 1.未入住  2.已入住
     */
    private Byte state;
    /**
     * 1.未申请 2.已申请
     */
    private Byte refund;
    /**
     * 订单价格
     */
    private BigDecimal price;
    /**
     * 天数
     */
    private Integer days;
    /**
     * 姓名
     */
    private String username;
    /**
     * 电话
     */
    private String telephone;
    /**
     * 数量
     */
    private Integer number;
    private static final long serialVersionUID = 1L;

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
    public Long getHomeId() {
        return homeId;
    }
    public void setHomeId(Long homeId) {
        this.homeId = homeId;
    }
    public String getOrderCode() {
        return orderCode;
    }
    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode == null ? null : orderCode.trim();
    }
    public Date getCreateTime() {
        return createTime;
    }
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    public Date getPaymentTime() {
        return paymentTime;
    }
    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }
    public Byte getType() {
        return type;
    }
    public void setType(Byte type) {
        this.type = type;
    }
    public Byte getState() {
        return state;
    }
    public void setState(Byte state) {
        this.state = state;
    }
    public Byte getRefund() {
        return refund;
    }
    public void setRefund(Byte refund) {
        this.refund = refund;
    }
    public BigDecimal getPrice() {
        return price;
    }
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    public Integer getDays() {
        return days;
    }
    public void setDays(Integer days) {
        this.days = days;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }
    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }
    public Integer getNumber() {
        return number;
    }
    public void setNumber(Integer number) {
        this.number = number;
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
        Orders other = (Orders) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getHomeId() == null ? other.getHomeId() == null : this.getHomeId().equals(other.getHomeId()))
            && (this.getOrderCode() == null ? other.getOrderCode() == null : this.getOrderCode().equals(other.getOrderCode()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getPaymentTime() == null ? other.getPaymentTime() == null : this.getPaymentTime().equals(other.getPaymentTime()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getRefund() == null ? other.getRefund() == null : this.getRefund().equals(other.getRefund()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getDays() == null ? other.getDays() == null : this.getDays().equals(other.getDays()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getTelephone() == null ? other.getTelephone() == null : this.getTelephone().equals(other.getTelephone()))
            && (this.getNumber() == null ? other.getNumber() == null : this.getNumber().equals(other.getNumber()));
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getHomeId() == null) ? 0 : getHomeId().hashCode());
        result = prime * result + ((getOrderCode() == null) ? 0 : getOrderCode().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getPaymentTime() == null) ? 0 : getPaymentTime().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getRefund() == null) ? 0 : getRefund().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getDays() == null) ? 0 : getDays().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getTelephone() == null) ? 0 : getTelephone().hashCode());
        result = prime * result + ((getNumber() == null) ? 0 : getNumber().hashCode());
        return result;
    }
}