/*
 * VersionApp.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2017-02-10 Created
 */
package com.jiabian.beans.basic;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author 菠萝大象
 * @version 1.0 2017-02-10
 */
public class VersionApp implements Serializable {

	private static final long serialVersionUID = 1L;
    private Long id;
    /**
     * 版本描述
     */
    private String versionDesc;
    /**
     * 版本号
     */
    private String versionNo;
    /**
     * 类型（1：书画，2：健康，3：商超）
     */
    private Byte type;
    /**
     * 版本url
     */
    private String versionUrl;
    /**
     * 来源   1：Android  2：ios
     */
    private Byte source;
    /**
     * 是否删除  1：正常  2：删除
     */
    private Byte isDel;
    /**
     * 创建时间
     */
    private Date createTime;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getVersionDesc() {
        return versionDesc;
    }
    public void setVersionDesc(String versionDesc) {
        this.versionDesc = versionDesc == null ? null : versionDesc.trim();
    }
    public String getVersionNo() {
        return versionNo;
    }
    public void setVersionNo(String versionNo) {
        this.versionNo = versionNo == null ? null : versionNo.trim();
    }
    public Byte getType() {
        return type;
    }
    public void setType(Byte type) {
        this.type = type;
    }
    public String getVersionUrl() {
        return versionUrl;
    }
    public void setVersionUrl(String versionUrl) {
        this.versionUrl = versionUrl == null ? null : versionUrl.trim();
    }
    public Byte getSource() {
        return source;
    }
    public void setSource(Byte source) {
        this.source = source;
    }
    public Byte getIsDel() {
        return isDel;
    }
    public void setIsDel(Byte isDel) {
        this.isDel = isDel;
    }
    public Date getCreateTime() {
        return createTime;
    }
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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
        VersionApp other = (VersionApp) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getVersionDesc() == null ? other.getVersionDesc() == null : this.getVersionDesc().equals(other.getVersionDesc()))
            && (this.getVersionNo() == null ? other.getVersionNo() == null : this.getVersionNo().equals(other.getVersionNo()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getVersionUrl() == null ? other.getVersionUrl() == null : this.getVersionUrl().equals(other.getVersionUrl()))
            && (this.getSource() == null ? other.getSource() == null : this.getSource().equals(other.getSource()))
            && (this.getIsDel() == null ? other.getIsDel() == null : this.getIsDel().equals(other.getIsDel()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getVersionDesc() == null) ? 0 : getVersionDesc().hashCode());
        result = prime * result + ((getVersionNo() == null) ? 0 : getVersionNo().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getVersionUrl() == null) ? 0 : getVersionUrl().hashCode());
        result = prime * result + ((getSource() == null) ? 0 : getSource().hashCode());
        result = prime * result + ((getIsDel() == null) ? 0 : getIsDel().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return result;
    }
}