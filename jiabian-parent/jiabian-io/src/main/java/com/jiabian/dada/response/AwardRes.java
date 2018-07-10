package com.jiabian.dada.response;

import java.io.Serializable;
import java.util.Date;

import com.jiabian.base.BaseRes;

public class AwardRes extends BaseRes implements Serializable {

	/**
     * 编号
     */
    private Long id;
    /**
     * 领取类型：1、京东卡 2、油卡
     */
    private Byte type;
    /**
     * 领取时间
     */
    private Date time;
    /**
     * 用户id
     */
    private Long userid;
    /**
     * 消费积分
     */
    private Integer consume;
    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Byte getType() {
        return type;
    }
    public void setType(Byte type) {
        this.type = type;
    }
    public Date getTime() {
        return time;
    }
    public void setTime(Date time) {
        this.time = time;
    }
    public Long getUserid() {
        return userid;
    }
    public void setUserid(Long userid) {
        this.userid = userid;
    }
    public Integer getConsume() {
        return consume;
    }
    public void setConsume(Integer consume) {
        this.consume = consume;
    }
	
}
