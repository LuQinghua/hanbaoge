/*
 * SysConfig.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-10-18 Created
 */
package com.jiabian.beans.basic;

import java.io.Serializable;
import java.util.Date;

/**
 * 系统配置表
 * 
 * @author 菠萝大象
 * @version 1.0 2016-10-18
 */
public class SysConfig implements Serializable {

	private static final long serialVersionUID = 1L;
    /**
     * 编号
     */
    private Long id;
    /**
     * 键
     */
    private String conKey;
    /**
     * 值
     */
    private String conValue;
    /**
     * 描述
     */
    private String reMark;
    /**
     * 修改人
     */
    private Long userId;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date updateTime;
    /**
     * 删除标识（1：正常，2：删除）
     */
    private Byte isDel;
    /**
     * 配置项名
     */
    private String conForName;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getConKey() {
        return conKey;
    }
    public void setConKey(String conKey) {
        this.conKey = conKey == null ? null : conKey.trim();
    }
    public String getConValue() {
        return conValue;
    }
    public void setConValue(String conValue) {
        this.conValue = conValue == null ? null : conValue.trim();
    }
    public String getReMark() {
        return reMark;
    }
    public void setReMark(String reMark) {
        this.reMark = reMark == null ? null : reMark.trim();
    }
    public Long getUserId() {
        return userId;
    }
    public void setUserId(Long userId) {
        this.userId = userId;
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
    public Byte getIsDel() {
        return isDel;
    }
    public void setIsDel(Byte isDel) {
        this.isDel = isDel;
    }
    public String getConForName() {
        return conForName;
    }
    public void setConForName(String conForName) {
        this.conForName = conForName == null ? null : conForName.trim();
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
        SysConfig other = (SysConfig) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getConKey() == null ? other.getConKey() == null : this.getConKey().equals(other.getConKey()))
            && (this.getConValue() == null ? other.getConValue() == null : this.getConValue().equals(other.getConValue()))
            && (this.getReMark() == null ? other.getReMark() == null : this.getReMark().equals(other.getReMark()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getIsDel() == null ? other.getIsDel() == null : this.getIsDel().equals(other.getIsDel()))
            && (this.getConForName() == null ? other.getConForName() == null : this.getConForName().equals(other.getConForName()));
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getConKey() == null) ? 0 : getConKey().hashCode());
        result = prime * result + ((getConValue() == null) ? 0 : getConValue().hashCode());
        result = prime * result + ((getReMark() == null) ? 0 : getReMark().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getIsDel() == null) ? 0 : getIsDel().hashCode());
        result = prime * result + ((getConForName() == null) ? 0 : getConForName().hashCode());
        return result;
    }
}