/*
 * UserFavorite.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-11-12 Created
 */
package com.jiabian.userfavorite.request;

import java.util.Date;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.jiabian.base.BaseReq;
import com.jiabian.base.io.request.IRequest;

/**
 * UserFavoriteReq
 * 创建人:熊天威
 * 时间：2016年11月12日-下午6:11:47 
 * @version 1.0.0
 */
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class UserFavoriteReq extends BaseReq implements IRequest {
	
	private static final long serialVersionUID = 1L;
	
	/**
     * 收藏类型  商品，商家，店铺 xtw
     */
	private byte typeFlag;
	
	/**
     * 运算符 xtw
     */
	private String operation;
	
	/**
     * 运算数目 xtw
     */
	private int number;
	

    /**
     * 收藏编号
     */
    private Long id;
    /**
     * 用户id
     */
    private Long userId;
    /**
     * 商品id
     */
    private Long prodId;
    /**
     * 店铺id
     */
    private Long shopId;
    /**
     * 名家id
     */
    private Long busId;
    /**
     * 收藏时间
     */
    private Date createTime;
    /**
     * 删除标识（1：正常，2：删除）
     */
    private Byte isDel;
    /**
     * 收藏类型（1：商品，2：店铺，3：名家）
     */
    private Byte favoType;

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
    public Long getProdId() {
        return prodId;
    }
    public void setProdId(Long prodId) {
        this.prodId = prodId;
    }
    public Long getShopId() {
        return shopId;
    }
    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }
    public Long getBusId() {
        return busId;
    }
    public void setBusId(Long busId) {
        this.busId = busId;
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
    public Byte getFavoType() {
        return favoType;
    }
    public void setFavoType(Byte favoType) {
        this.favoType = favoType;
    }
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public byte getTypeFlag() {
		return typeFlag;
	}
	public void setTypeFlag(byte typeFlag) {
		this.typeFlag = typeFlag;
	}
	
    
	
}