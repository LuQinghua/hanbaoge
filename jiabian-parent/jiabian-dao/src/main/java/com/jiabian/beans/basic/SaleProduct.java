/*
 * SaleProduct.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2017-02-10 Created
 */
package com.jiabian.beans.basic;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 
 * 
 * @author 菠萝大象
 * @version 1.0 2017-02-10
 */
public class SaleProduct implements Serializable {

	private static final long serialVersionUID = 1L;
    /**
     * id主键
     */
    private Long id;
    /**
     * 商品名称
     */
    private String prodName;
    /**
     * 商品价格
     */
    private BigDecimal prodPrice;
    /**
     * 商品图片
     */
    private String prodImg;
    /**
     * 录入时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date updateTime;
    /**
     * 最后修改人Id
     */
    private Long updateUserId;
    /**
     * 库存数量
     */
    private Integer prodDNum;
    /**
     * 商品简介
     */
    private String profile;
    /**
     * 是否删除
     */
    private Integer isDel;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getProdName() {
        return prodName;
    }
    public void setProdName(String prodName) {
        this.prodName = prodName == null ? null : prodName.trim();
    }
    public BigDecimal getProdPrice() {
        return prodPrice;
    }
    public void setProdPrice(BigDecimal prodPrice) {
        this.prodPrice = prodPrice;
    }
    public String getProdImg() {
        return prodImg;
    }
    public void setProdImg(String prodImg) {
        this.prodImg = prodImg == null ? null : prodImg.trim();
    }
    public Date getCreateTime() {
        return createTime;
    }
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    public Date getUpdateTime() {
        return updateTime;
    }
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    public Long getUpdateUserId() {
        return updateUserId;
    }
    public void setUpdateUserId(Long updateUserId) {
        this.updateUserId = updateUserId;
    }
    public Integer getProdDNum() {
        return prodDNum;
    }
    public void setProdDNum(Integer prodDNum) {
        this.prodDNum = prodDNum;
    }
    public String getProfile() {
        return profile;
    }
    public void setProfile(String profile) {
        this.profile = profile == null ? null : profile.trim();
    }
    public Integer getIsDel() {
        return isDel;
    }
    public void setIsDel(Integer isDel) {
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
        SaleProduct other = (SaleProduct) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getProdName() == null ? other.getProdName() == null : this.getProdName().equals(other.getProdName()))
            && (this.getProdPrice() == null ? other.getProdPrice() == null : this.getProdPrice().equals(other.getProdPrice()))
            && (this.getProdImg() == null ? other.getProdImg() == null : this.getProdImg().equals(other.getProdImg()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getUpdateUserId() == null ? other.getUpdateUserId() == null : this.getUpdateUserId().equals(other.getUpdateUserId()))
            && (this.getProdDNum() == null ? other.getProdDNum() == null : this.getProdDNum().equals(other.getProdDNum()))
            && (this.getProfile() == null ? other.getProfile() == null : this.getProfile().equals(other.getProfile()))
            && (this.getIsDel() == null ? other.getIsDel() == null : this.getIsDel().equals(other.getIsDel()));
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getProdName() == null) ? 0 : getProdName().hashCode());
        result = prime * result + ((getProdPrice() == null) ? 0 : getProdPrice().hashCode());
        result = prime * result + ((getProdImg() == null) ? 0 : getProdImg().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getUpdateUserId() == null) ? 0 : getUpdateUserId().hashCode());
        result = prime * result + ((getProdDNum() == null) ? 0 : getProdDNum().hashCode());
        result = prime * result + ((getProfile() == null) ? 0 : getProfile().hashCode());
        result = prime * result + ((getIsDel() == null) ? 0 : getIsDel().hashCode());
        return result;
    }
}