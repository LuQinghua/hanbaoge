/*
 * SendGoods.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-12-02 Created
 */
package com.jiabian.beans.basic;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 
 * 
 * @author 菠萝大象
 * @version 1.0 2016-12-02
 */
public class SendGoods implements Serializable {

	private static final long serialVersionUID = 1L;
    /**
     * 物流状态编号
     */
    private Long id;
    /**
     * 店铺id
     */
    private Long sendShopId;
    /**
     * 发货状态（0：待发货，1：已发货,待签收，2：已收货,待评价，3：已评价）
     */
    private Byte sendStatus;
    /**
     * 发货时间
     */
    private Date postTime;
    /**
     * 收货时间(用户确认)
     */
    private Date getTime;
    /**
     * 物流公司id
     */
    private Long logisticsCompanyId;
    /**
     * 商超配送人员id
     */
    private Long scLogiUserId;
    /**
     * 配送结束时间
     */
    private Date sendOverTime;
    /**
     * 运费
     */
    private BigDecimal freight;
    /**
     * 运费险
     */
    private BigDecimal insurance;
    private Long recordId;
    /**
     * 订单id
     */
    private Long orderId;
    
    /**
     * 是否删除
     */
    private Byte isDel;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getSendShopId() {
        return sendShopId;
    }
    public void setSendShopId(Long sendShopId) {
        this.sendShopId = sendShopId;
    }
    public Byte getSendStatus() {
        return sendStatus;
    }
    public void setSendStatus(Byte sendStatus) {
        this.sendStatus = sendStatus;
    }
    public Date getPostTime() {
        return postTime;
    }
    public void setPostTime(Date postTime) {
        this.postTime = postTime;
    }
    public Date getGetTime() {
        return getTime;
    }
    public void setGetTime(Date getTime) {
        this.getTime = getTime;
    }
    public Long getLogisticsCompanyId() {
        return logisticsCompanyId;
    }
    public void setLogisticsCompanyId(Long logisticsCompanyId) {
        this.logisticsCompanyId = logisticsCompanyId;
    }
    public Long getScLogiUserId() {
        return scLogiUserId;
    }
    public void setScLogiUserId(Long scLogiUserId) {
        this.scLogiUserId = scLogiUserId;
    }
    public Date getSendOverTime() {
        return sendOverTime;
    }
    public void setSendOverTime(Date sendOverTime) {
        this.sendOverTime = sendOverTime;
    }
    public BigDecimal getFreight() {
        return freight;
    }
    public void setFreight(BigDecimal freight) {
        this.freight = freight;
    }
    public BigDecimal getInsurance() {
        return insurance;
    }
    public void setInsurance(BigDecimal insurance) {
        this.insurance = insurance;
    }
    public Long getRecordId() {
        return recordId;
    }
    public void setRecordId(Long recordId) {
        this.recordId = recordId;
    }
    public Long getOrderId() {
        return orderId;
    }
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
    public Byte getIsDel() {
        return isDel;
    }
    public void setIsDel(Byte isDel) {
        this.isDel = isDel;
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
        SendGoods other = (SendGoods) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSendShopId() == null ? other.getSendShopId() == null : this.getSendShopId().equals(other.getSendShopId()))
            && (this.getSendStatus() == null ? other.getSendStatus() == null : this.getSendStatus().equals(other.getSendStatus()))
            && (this.getPostTime() == null ? other.getPostTime() == null : this.getPostTime().equals(other.getPostTime()))
            && (this.getGetTime() == null ? other.getGetTime() == null : this.getGetTime().equals(other.getGetTime()))
            && (this.getLogisticsCompanyId() == null ? other.getLogisticsCompanyId() == null : this.getLogisticsCompanyId().equals(other.getLogisticsCompanyId()))
            && (this.getScLogiUserId() == null ? other.getScLogiUserId() == null : this.getScLogiUserId().equals(other.getScLogiUserId()))
            && (this.getSendOverTime() == null ? other.getSendOverTime() == null : this.getSendOverTime().equals(other.getSendOverTime()))
            && (this.getFreight() == null ? other.getFreight() == null : this.getFreight().equals(other.getFreight()))
            && (this.getInsurance() == null ? other.getInsurance() == null : this.getInsurance().equals(other.getInsurance()))
            && (this.getRecordId() == null ? other.getRecordId() == null : this.getRecordId().equals(other.getRecordId()))
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getIsDel() == null ? other.getIsDel() == null : this.getIsDel().equals(other.getIsDel()));
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSendShopId() == null) ? 0 : getSendShopId().hashCode());
        result = prime * result + ((getSendStatus() == null) ? 0 : getSendStatus().hashCode());
        result = prime * result + ((getPostTime() == null) ? 0 : getPostTime().hashCode());
        result = prime * result + ((getGetTime() == null) ? 0 : getGetTime().hashCode());
        result = prime * result + ((getLogisticsCompanyId() == null) ? 0 : getLogisticsCompanyId().hashCode());
        result = prime * result + ((getScLogiUserId() == null) ? 0 : getScLogiUserId().hashCode());
        result = prime * result + ((getSendOverTime() == null) ? 0 : getSendOverTime().hashCode());
        result = prime * result + ((getFreight() == null) ? 0 : getFreight().hashCode());
        result = prime * result + ((getInsurance() == null) ? 0 : getInsurance().hashCode());
        result = prime * result + ((getRecordId() == null) ? 0 : getRecordId().hashCode());
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getIsDel() == null) ? 0 : getIsDel().hashCode());
        return result;
    }
}