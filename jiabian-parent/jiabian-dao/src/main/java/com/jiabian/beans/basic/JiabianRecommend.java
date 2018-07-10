/*
 * JiabianRecommend.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-11-04 Created
 */
package com.jiabian.beans.basic;

import java.io.Serializable;

/**
 * 商品推荐表
 * 
 * @author 菠萝大象
 * @version 1.0 2016-11-04
 */
public class JiabianRecommend implements Serializable {

	private static final long serialVersionUID = 1L;
    /**
     * 编号
     */
    private Long id;
    /**
     * 区域
     */
    private Integer indexDomain;
    /**
     * 依赖id
     */
    private Long relyId;
    /**
     * 推荐区域(1:首页，2：环保公益)
     */
    private Byte region;
    /**
     * 删除标识（1：正常，2：删除）
     */
    private Byte isDel;
    /**
     * 推荐类型（1：商品，2：店铺，3：作家）
     */
    private Byte recomType;
    /**
     * 来源地区
     */
    private Integer addressType;
    /**
     * 相关排序
     */
    private Integer sort;
    /**
     * 平台来源（1：书画，2：健康，3：商超）
     */
    private Byte recomSource;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Integer getIndexDomain() {
        return indexDomain;
    }
    public void setIndexDomain(Integer indexDomain) {
        this.indexDomain = indexDomain;
    }
    public Long getRelyId() {
        return relyId;
    }
    public void setRelyId(Long relyId) {
        this.relyId = relyId;
    }
    public Byte getRegion() {
        return region;
    }
    public void setRegion(Byte region) {
        this.region = region;
    }
    public Byte getIsDel() {
        return isDel;
    }
    public void setIsDel(Byte isDel) {
        this.isDel = isDel;
    }
    public Byte getRecomType() {
        return recomType;
    }
    public void setRecomType(Byte recomType) {
        this.recomType = recomType;
    }
    public Integer getAddressType() {
        return addressType;
    }
    public void setAddressType(Integer addressType) {
        this.addressType = addressType;
    }
    public Integer getSort() {
        return sort;
    }
    public void setSort(Integer sort) {
        this.sort = sort;
    }
    public Byte getRecomSource() {
        return recomSource;
    }
    public void setRecomSource(Byte recomSource) {
        this.recomSource = recomSource;
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
        JiabianRecommend other = (JiabianRecommend) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getIndexDomain() == null ? other.getIndexDomain() == null : this.getIndexDomain().equals(other.getIndexDomain()))
            && (this.getRelyId() == null ? other.getRelyId() == null : this.getRelyId().equals(other.getRelyId()))
            && (this.getRegion() == null ? other.getRegion() == null : this.getRegion().equals(other.getRegion()))
            && (this.getIsDel() == null ? other.getIsDel() == null : this.getIsDel().equals(other.getIsDel()))
            && (this.getRecomType() == null ? other.getRecomType() == null : this.getRecomType().equals(other.getRecomType()))
            && (this.getAddressType() == null ? other.getAddressType() == null : this.getAddressType().equals(other.getAddressType()))
            && (this.getSort() == null ? other.getSort() == null : this.getSort().equals(other.getSort()))
            && (this.getRecomSource() == null ? other.getRecomSource() == null : this.getRecomSource().equals(other.getRecomSource()));
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getIndexDomain() == null) ? 0 : getIndexDomain().hashCode());
        result = prime * result + ((getRelyId() == null) ? 0 : getRelyId().hashCode());
        result = prime * result + ((getRegion() == null) ? 0 : getRegion().hashCode());
        result = prime * result + ((getIsDel() == null) ? 0 : getIsDel().hashCode());
        result = prime * result + ((getRecomType() == null) ? 0 : getRecomType().hashCode());
        result = prime * result + ((getAddressType() == null) ? 0 : getAddressType().hashCode());
        result = prime * result + ((getSort() == null) ? 0 : getSort().hashCode());
        result = prime * result + ((getRecomSource() == null) ? 0 : getRecomSource().hashCode());
        return result;
    }
}