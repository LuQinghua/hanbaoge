/*
 * UserEvaluate.java
 * Copyright(C) 20xx-2015 xxxxxx鍏徃
 * All rights reserved.
 * -----------------------------------------------
 * 2016-10-10 Created
 */
package com.jiabian.beans.basic;

import java.io.Serializable;
import java.util.Date;

/**
 * 商品评价表
 * 
 * @author 鑿犺悵澶ц薄
 * @version 1.0 2016-10-10
 */
public class UserEvaluate implements Serializable {

	private static final long serialVersionUID = 1L;
    /**
     * 评论编号
     */
    private Long id;
    /**
     * 用户编号
     */
    private Long userId;
    /**
     * 商品编号
     */
    private Long prodId;
    /**
     * 评价星级（1,2,3,4,5）
     */
    private Byte evalLevel;
    /**
     * 评论内容
     */
    private String evalText;
    /**
     * 评论时间
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
    public Long getProdId() {
        return prodId;
    }
    public void setProdId(Long prodId) {
        this.prodId = prodId;
    }
    public Byte getEvalLevel() {
        return evalLevel;
    }
    public void setEvalLevel(Byte evalLevel) {
        this.evalLevel = evalLevel;
    }
    public String getEvalText() {
        return evalText;
    }
    public void setEvalText(String evalText) {
        this.evalText = evalText == null ? null : evalText.trim();
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
        UserEvaluate other = (UserEvaluate) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getProdId() == null ? other.getProdId() == null : this.getProdId().equals(other.getProdId()))
            && (this.getEvalLevel() == null ? other.getEvalLevel() == null : this.getEvalLevel().equals(other.getEvalLevel()))
            && (this.getEvalText() == null ? other.getEvalText() == null : this.getEvalText().equals(other.getEvalText()))
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
        result = prime * result + ((getProdId() == null) ? 0 : getProdId().hashCode());
        result = prime * result + ((getEvalLevel() == null) ? 0 : getEvalLevel().hashCode());
        result = prime * result + ((getEvalText() == null) ? 0 : getEvalText().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getIsDel() == null) ? 0 : getIsDel().hashCode());
        return result;
    }
}