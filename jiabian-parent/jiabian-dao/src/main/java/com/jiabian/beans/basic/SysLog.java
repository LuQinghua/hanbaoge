/*
 * SysLog.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-10-19 Created
 */
package com.jiabian.beans.basic;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author 菠萝大象
 * @version 1.0 2016-10-19
 */
public class SysLog implements Serializable {

	private static final long serialVersionUID = 1L;
    /**
     * ID
     */
    private Long id;
    /**
     * 日志模块
     */
    private String logModule;
    /**
     * 日志内容
     */
    private String logContext;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 操作用户ID
     */
    private Long userId;
    /**
     * IP地址
     */
    private String userIP;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getLogModule() {
        return logModule;
    }
    public void setLogModule(String logModule) {
        this.logModule = logModule == null ? null : logModule.trim();
    }
    public String getLogContext() {
        return logContext;
    }
    public void setLogContext(String logContext) {
        this.logContext = logContext == null ? null : logContext.trim();
    }
    public Date getCreateTime() {
        return createTime;
    }
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    public Long getUserId() {
        return userId;
    }
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    public String getUserIP() {
        return userIP;
    }
    public void setUserIP(String userIP) {
        this.userIP = userIP == null ? null : userIP.trim();
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
        SysLog other = (SysLog) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getLogModule() == null ? other.getLogModule() == null : this.getLogModule().equals(other.getLogModule()))
            && (this.getLogContext() == null ? other.getLogContext() == null : this.getLogContext().equals(other.getLogContext()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getUserIP() == null ? other.getUserIP() == null : this.getUserIP().equals(other.getUserIP()));
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getLogModule() == null) ? 0 : getLogModule().hashCode());
        result = prime * result + ((getLogContext() == null) ? 0 : getLogContext().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getUserIP() == null) ? 0 : getUserIP().hashCode());
        return result;
    }
}