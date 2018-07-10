/*
 * UserSafe.java
 * Copyright(C) 20xx-2015 xxxxxx鍏徃
 * All rights reserved.
 * -----------------------------------------------
 * 2016-10-10 Created
 */
package com.jiabian.beans.basic;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户安全中心表
 * 
 * @author 鑿犺悵澶ц薄
 * @version 1.0 2016-10-10
 */
public class UserSafe implements Serializable {

	private static final long serialVersionUID = 1L;
    /**
     * 编号
     */
    private Long id;
    /**
     * 用户编号
     */
    private Long userId;
    /**
     * 密保问题
     */
    private String userSafe;
    /**
     * 密保答案
     */
    private String safeAnwer;
    /**
     * 用户安全等级（1,2,3,4,5）
     */
    private Byte safeLevel;
    /**
     * 录入时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date updateTime;
    /**
     * 删除标识（1：正常，2,：删除）
     */
    private Byte isDel;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getUserId() {
        return userId;
    }
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    public String getUserSafe() {
        return userSafe;
    }
    public void setUserSafe(String userSafe) {
        this.userSafe = userSafe == null ? null : userSafe.trim();
    }
    public String getSafeAnwer() {
        return safeAnwer;
    }
    public void setSafeAnwer(String safeAnwer) {
        this.safeAnwer = safeAnwer == null ? null : safeAnwer.trim();
    }
    public Byte getSafeLevel() {
        return safeLevel;
    }
    public void setSafeLevel(Byte safeLevel) {
        this.safeLevel = safeLevel;
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
        UserSafe other = (UserSafe) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getUserSafe() == null ? other.getUserSafe() == null : this.getUserSafe().equals(other.getUserSafe()))
            && (this.getSafeAnwer() == null ? other.getSafeAnwer() == null : this.getSafeAnwer().equals(other.getSafeAnwer()))
            && (this.getSafeLevel() == null ? other.getSafeLevel() == null : this.getSafeLevel().equals(other.getSafeLevel()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getIsDel() == null ? other.getIsDel() == null : this.getIsDel().equals(other.getIsDel()));
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getUserSafe() == null) ? 0 : getUserSafe().hashCode());
        result = prime * result + ((getSafeAnwer() == null) ? 0 : getSafeAnwer().hashCode());
        result = prime * result + ((getSafeLevel() == null) ? 0 : getSafeLevel().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getIsDel() == null) ? 0 : getIsDel().hashCode());
        return result;
    }
}