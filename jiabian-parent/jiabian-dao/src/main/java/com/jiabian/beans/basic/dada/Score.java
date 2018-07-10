/*
 * Score.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2018-06-27 Created
 */
package com.jiabian.beans.basic.dada;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author 菠萝大象
 * @version 1.0 2018-06-27
 */
public class Score implements Serializable {

    /**
     * 积分编号
     */
    private Long id;
    /**
     * 用户id
     */
    private Long userid;
    /**
     * 积分获取时间
     */
    private Date time;
    /**
     * 分值
     */
    private Integer points;
    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getUserid() {
        return userid;
    }
    public void setUserid(Long userid) {
        this.userid = userid;
    }
    public Date getTime() {
        return time;
    }
    public void setTime(Date time) {
        this.time = time;
    }
    public Integer getPoints() {
        return points;
    }
    public void setPoints(Integer points) {
        this.points = points;
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
        Score other = (Score) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getTime() == null ? other.getTime() == null : this.getTime().equals(other.getTime()))
            && (this.getPoints() == null ? other.getPoints() == null : this.getPoints().equals(other.getPoints()));
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getTime() == null) ? 0 : getTime().hashCode());
        result = prime * result + ((getPoints() == null) ? 0 : getPoints().hashCode());
        return result;
    }
}