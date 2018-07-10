/*
 * JiabianShare.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2017-03-09 Created
 */
package com.jiabian.beans.basic;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author 菠萝大象
 * @version 1.0 2017-03-09
 */
public class JiabianShare implements Serializable {

    /**
     * 编号
     */
    private Long id;
    /**
     * 分享人Id
     */
    private Long shareUserId;
    /**
     * 注册人Id
     */
    private Long enrollUserId;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 首次登录时间
     */
    private Date firstLoginTime;
    /**
     * 首次购买时间
     */
    private Date firstPayTime;
    /**
     * 登录标识（1：未登录，2：已登录）
     */
    private Byte isLogin;
    /**
     * 购买标识（1：未支付，2：已支付）
     */
    private Byte isPay;
    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getShareUserId() {
        return shareUserId;
    }
    public void setShareUserId(Long shareUserId) {
        this.shareUserId = shareUserId;
    }
    public Long getEnrollUserId() {
        return enrollUserId;
    }
    public void setEnrollUserId(Long enrollUserId) {
        this.enrollUserId = enrollUserId;
    }
    public Date getCreateTime() {
        return createTime;
    }
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    public Date getFirstLoginTime() {
        return firstLoginTime;
    }
    public void setFirstLoginTime(Date firstLoginTime) {
        this.firstLoginTime = firstLoginTime;
    }
    public Date getFirstPayTime() {
        return firstPayTime;
    }
    public void setFirstPayTime(Date firstPayTime) {
        this.firstPayTime = firstPayTime;
    }
    public Byte getIsLogin() {
        return isLogin;
    }
    public void setIsLogin(Byte isLogin) {
        this.isLogin = isLogin;
    }
    public Byte getIsPay() {
        return isPay;
    }
    public void setIsPay(Byte isPay) {
        this.isPay = isPay;
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
        JiabianShare other = (JiabianShare) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getShareUserId() == null ? other.getShareUserId() == null : this.getShareUserId().equals(other.getShareUserId()))
            && (this.getEnrollUserId() == null ? other.getEnrollUserId() == null : this.getEnrollUserId().equals(other.getEnrollUserId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getFirstLoginTime() == null ? other.getFirstLoginTime() == null : this.getFirstLoginTime().equals(other.getFirstLoginTime()))
            && (this.getFirstPayTime() == null ? other.getFirstPayTime() == null : this.getFirstPayTime().equals(other.getFirstPayTime()))
            && (this.getIsLogin() == null ? other.getIsLogin() == null : this.getIsLogin().equals(other.getIsLogin()))
            && (this.getIsPay() == null ? other.getIsPay() == null : this.getIsPay().equals(other.getIsPay()));
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getShareUserId() == null) ? 0 : getShareUserId().hashCode());
        result = prime * result + ((getEnrollUserId() == null) ? 0 : getEnrollUserId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getFirstLoginTime() == null) ? 0 : getFirstLoginTime().hashCode());
        result = prime * result + ((getFirstPayTime() == null) ? 0 : getFirstPayTime().hashCode());
        result = prime * result + ((getIsLogin() == null) ? 0 : getIsLogin().hashCode());
        result = prime * result + ((getIsPay() == null) ? 0 : getIsPay().hashCode());
        return result;
    }
}