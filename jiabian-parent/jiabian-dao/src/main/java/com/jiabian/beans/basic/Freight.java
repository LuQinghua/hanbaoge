/*
 * Freight.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-11-15 Created
 */
package com.jiabian.beans.basic;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 
 * 
 * @author 菠萝大象
 * @version 1.0 2016-11-15
 */
public class Freight implements Serializable {

	private static final long serialVersionUID = 1L;
    /**
     * 编号
     */
    private Long id;
    /**
     * 会员等级
     */
    private String member;
    /**
     * 订单金额
     */
    private BigDecimal ordermoney;
    /**
     * 商品重量
     */
    private BigDecimal weight;
    /**
     * 基础配送费
     */
    private BigDecimal basefreight;
    /**
     * 超重增加费
     */
    private BigDecimal overweightfreight;
    /**
     * 无电梯房上四楼费用
     */
    private BigDecimal unelevatorfreight;
    /**
     * 电梯房
     */
    private BigDecimal elevatorfreight;
    /**
     * 超限增加费
     */
    private Integer overrestrict;
    /**
     * 优惠金额
     */
    private BigDecimal couponmoney;
    /**
     * 删除标识（1：正常，2：删除）
     */
    private Byte isDel;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getMember() {
        return member;
    }
    public void setMember(String member) {
        this.member = member == null ? null : member.trim();
    }
    public BigDecimal getOrdermoney() {
        return ordermoney;
    }
    public void setOrdermoney(BigDecimal ordermoney) {
        this.ordermoney = ordermoney;
    }
    public BigDecimal getWeight() {
        return weight;
    }
    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }
    public BigDecimal getBasefreight() {
        return basefreight;
    }
    public void setBasefreight(BigDecimal basefreight) {
        this.basefreight = basefreight;
    }
    public BigDecimal getOverweightfreight() {
        return overweightfreight;
    }
    public void setOverweightfreight(BigDecimal overweightfreight) {
        this.overweightfreight = overweightfreight;
    }
    public BigDecimal getUnelevatorfreight() {
        return unelevatorfreight;
    }
    public void setUnelevatorfreight(BigDecimal unelevatorfreight) {
        this.unelevatorfreight = unelevatorfreight;
    }
    public BigDecimal getElevatorfreight() {
        return elevatorfreight;
    }
    public void setElevatorfreight(BigDecimal elevatorfreight) {
        this.elevatorfreight = elevatorfreight;
    }
    public Integer getOverrestrict() {
        return overrestrict;
    }
    public void setOverrestrict(Integer overrestrict) {
        this.overrestrict = overrestrict;
    }
    public BigDecimal getCouponmoney() {
        return couponmoney;
    }
    public void setCouponmoney(BigDecimal couponmoney) {
        this.couponmoney = couponmoney;
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
        Freight other = (Freight) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMember() == null ? other.getMember() == null : this.getMember().equals(other.getMember()))
            && (this.getOrdermoney() == null ? other.getOrdermoney() == null : this.getOrdermoney().equals(other.getOrdermoney()))
            && (this.getWeight() == null ? other.getWeight() == null : this.getWeight().equals(other.getWeight()))
            && (this.getBasefreight() == null ? other.getBasefreight() == null : this.getBasefreight().equals(other.getBasefreight()))
            && (this.getOverweightfreight() == null ? other.getOverweightfreight() == null : this.getOverweightfreight().equals(other.getOverweightfreight()))
            && (this.getUnelevatorfreight() == null ? other.getUnelevatorfreight() == null : this.getUnelevatorfreight().equals(other.getUnelevatorfreight()))
            && (this.getElevatorfreight() == null ? other.getElevatorfreight() == null : this.getElevatorfreight().equals(other.getElevatorfreight()))
            && (this.getOverrestrict() == null ? other.getOverrestrict() == null : this.getOverrestrict().equals(other.getOverrestrict()))
            && (this.getCouponmoney() == null ? other.getCouponmoney() == null : this.getCouponmoney().equals(other.getCouponmoney()))
            && (this.getIsDel() == null ? other.getIsDel() == null : this.getIsDel().equals(other.getIsDel()));
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMember() == null) ? 0 : getMember().hashCode());
        result = prime * result + ((getOrdermoney() == null) ? 0 : getOrdermoney().hashCode());
        result = prime * result + ((getWeight() == null) ? 0 : getWeight().hashCode());
        result = prime * result + ((getBasefreight() == null) ? 0 : getBasefreight().hashCode());
        result = prime * result + ((getOverweightfreight() == null) ? 0 : getOverweightfreight().hashCode());
        result = prime * result + ((getUnelevatorfreight() == null) ? 0 : getUnelevatorfreight().hashCode());
        result = prime * result + ((getElevatorfreight() == null) ? 0 : getElevatorfreight().hashCode());
        result = prime * result + ((getOverrestrict() == null) ? 0 : getOverrestrict().hashCode());
        result = prime * result + ((getCouponmoney() == null) ? 0 : getCouponmoney().hashCode());
        result = prime * result + ((getIsDel() == null) ? 0 : getIsDel().hashCode());
        return result;
    }
}