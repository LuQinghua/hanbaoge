/*
 * UserCard.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2017-04-12 Created
 */
package com.jiabian.beans.basic;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 
 * 
 * @author 菠萝大象
 * @version 1.0 2017-04-12
 */
public class UserCard implements Serializable {

    /**
     * id编号
     */
    private Long id;
    /**
     * 会员卡价格
     */
    private BigDecimal price;
    /**
     * 会员卡优惠价
     */
    private BigDecimal lowPrice;
    /**
     * 时间期限 （月）
     */
    private Integer timePeriod;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 会员卡描述
     */
    private String description;
    /**
     * 更新时间
     */
    private Date updateTime;
    /**
     * 删除标记（1：正常，2：删除）
     */
    private Byte isDel;
    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public BigDecimal getPrice() {
        return price;
    }
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    public BigDecimal getLowPrice() {
        return lowPrice;
    }
    public void setLowPrice(BigDecimal lowPrice) {
        this.lowPrice = lowPrice;
    }
    public Integer getTimePeriod() {
        return timePeriod;
    }
    public void setTimePeriod(Integer timePeriod) {
        this.timePeriod = timePeriod;
    }
    public Date getCreateTime() {
        return createTime;
    }
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
    public Date getUpdateTime() {
        return updateTime;
    }
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
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
        UserCard other = (UserCard) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getLowPrice() == null ? other.getLowPrice() == null : this.getLowPrice().equals(other.getLowPrice()))
            && (this.getTimePeriod() == null ? other.getTimePeriod() == null : this.getTimePeriod().equals(other.getTimePeriod()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getIsDel() == null ? other.getIsDel() == null : this.getIsDel().equals(other.getIsDel()));
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getLowPrice() == null) ? 0 : getLowPrice().hashCode());
        result = prime * result + ((getTimePeriod() == null) ? 0 : getTimePeriod().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getIsDel() == null) ? 0 : getIsDel().hashCode());
        return result;
    }
}