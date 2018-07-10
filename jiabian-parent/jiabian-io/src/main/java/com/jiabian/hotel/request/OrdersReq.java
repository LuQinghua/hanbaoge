/*
 * SysUser.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-09-22 Created
 */
package com.jiabian.hotel.request;

import java.math.BigDecimal;
import java.util.Date;

import com.jiabian.base.BaseReq;
import com.jiabian.base.io.request.IRequest;

/**
 * 
 * 
 * @author 菠萝大象
 * @version 1.0 2016-09-22
 */
public class OrdersReq extends BaseReq implements IRequest {
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
}