package com.jiabian.dada.response;

import java.io.Serializable;

import com.jiabian.base.BaseRes;

public class DadaUserRes extends BaseRes implements Serializable {
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
}
