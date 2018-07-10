/*
 * SysUser.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-09-22 Created
 */
package com.jiabian.hotel.request;

import java.util.Date;

import com.jiabian.base.BaseReq;
import com.jiabian.base.io.request.IRequest;

/**
 * 
 * 
 * @author 菠萝大象
 * @version 1.0 2016-09-22
 */
public class OrderReq extends BaseReq implements IRequest {
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
	    private String number;
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
	    public String getNumber() {
	        return number;
	    }
	    public void setNumber(String number) {
	        this.number = number == null ? null : number.trim();
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
}