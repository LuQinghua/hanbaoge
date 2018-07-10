/*
 * DadaUser.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2018-06-26 Created
 */
package com.jiabian.beans.basic.dada;

import java.io.Serializable;

/**
 * 用户表
 * 
 * @author 菠萝大象
 * @version 1.0 2018-06-26
 */
public class DadaUser implements Serializable {

    /**
     * 用户编号
     */
    private Long id;
    /**
     * 用户名
     */
    private String name;
    /**
     * openId
     */
    private String openId;
    /**
     * 积分
     */
    private Integer score;
    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
    public String getOpenId() {
        return openId;
    }
    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }
    public Integer getScore() {
        return score;
    }
    public void setScore(Integer score) {
        this.score = score;
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
        DadaUser other = (DadaUser) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getOpenId() == null ? other.getOpenId() == null : this.getOpenId().equals(other.getOpenId()))
            && (this.getScore() == null ? other.getScore() == null : this.getScore().equals(other.getScore()));
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getOpenId() == null) ? 0 : getOpenId().hashCode());
        result = prime * result + ((getScore() == null) ? 0 : getScore().hashCode());
        return result;
    }
}