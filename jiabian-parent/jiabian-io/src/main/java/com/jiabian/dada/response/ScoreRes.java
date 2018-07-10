package com.jiabian.dada.response;

import java.io.Serializable;
import java.util.Date;

import com.jiabian.base.BaseRes;

public class ScoreRes extends BaseRes implements Serializable {

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
	
}
