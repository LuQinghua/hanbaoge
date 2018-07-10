/*
 * UserCoupons.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-10-31 Created
 */
package com.jiabian.beans.basic;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author 菠萝大象
 * @version 1.0 2016-10-31
 */
public class UserCoupons implements Serializable {

	private static final long serialVersionUID = 1L;
    /**
     * 主键id
     */
    private Long id;
    /**
     * 优惠券id
     */
    private Long couponsId;
    /**
     * 用户id
     */
    private Long userId;
    /**
     * 优惠券状态(1:未使用，2：已使用，3：已过期)
     */
    private Byte couponsStatus;
    /**
     * 领取时间
     */
    private Date getTime;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getCouponsId() {
        return couponsId;
    }
    public void setCouponsId(Long couponsId) {
        this.couponsId = couponsId;
    }
    public Long getUserId() {
        return userId;
    }
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    public Byte getCouponsStatus() {
        return couponsStatus;
    }
    public void setCouponsStatus(Byte couponsStatus) {
        this.couponsStatus = couponsStatus;
    }
    public Date getGetTime() {
        return getTime;
    }
    public void setGetTime(Date getTime) {
        this.getTime = getTime;
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
        UserCoupons other = (UserCoupons) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCouponsId() == null ? other.getCouponsId() == null : this.getCouponsId().equals(other.getCouponsId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getCouponsStatus() == null ? other.getCouponsStatus() == null : this.getCouponsStatus().equals(other.getCouponsStatus()))
            && (this.getGetTime() == null ? other.getGetTime() == null : this.getGetTime().equals(other.getGetTime()));
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCouponsId() == null) ? 0 : getCouponsId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getCouponsStatus() == null) ? 0 : getCouponsStatus().hashCode());
        result = prime * result + ((getGetTime() == null) ? 0 : getGetTime().hashCode());
        return result;
    }
}