/*
 * SaleOrderDetail.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2017-02-10 Created
 */
package com.jiabian.beans.basic;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 
 * 
 * @author 菠萝大象
 * @version 1.0 2017-02-10
 */
public class SaleOrderDetail implements Serializable {

	private static final long serialVersionUID = 1L;
    /**
     * id主键
     */
    private Long id;
    /**
     * 订单id
     */
    private Long orderId;
    /**
     * 商品id
     */
    private Long prodId;
    /**
     * 销售单价
     */
    private BigDecimal salePrice;
    /**
     * 交易数量
     */
    private Integer saleNum;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getOrderId() {
        return orderId;
    }
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
    public Long getProdId() {
        return prodId;
    }
    public void setProdId(Long prodId) {
        this.prodId = prodId;
    }
    public BigDecimal getSalePrice() {
        return salePrice;
    }
    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
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
        SaleOrderDetail other = (SaleOrderDetail) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getProdId() == null ? other.getProdId() == null : this.getProdId().equals(other.getProdId()))
            && (this.getSalePrice() == null ? other.getSalePrice() == null : this.getSalePrice().equals(other.getSalePrice()))
            && (this.getSaleNum() == null ? other.getSaleNum() == null : this.getSaleNum().equals(other.getSaleNum()));
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getProdId() == null) ? 0 : getProdId().hashCode());
        result = prime * result + ((getSalePrice() == null) ? 0 : getSalePrice().hashCode());
        result = prime * result + ((getSaleNum() == null) ? 0 : getSaleNum().hashCode());
        return result;
    }
}