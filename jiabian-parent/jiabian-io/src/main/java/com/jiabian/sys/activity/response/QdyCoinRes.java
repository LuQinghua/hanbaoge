package com.jiabian.sys.activity.response;

import java.io.Serializable;
import java.util.Date;

public class QdyCoinRes implements Serializable{
	private static final long serialVersionUID = 1L;
    /**
     * 家边通宝id
     */
    private Long id;
    /**
     * 家边通宝数量
     */
    private Integer coinNum;
    /**
     * 获得/支出时间
     */
    private Date coinTime;
    /**
     * 获得方式(1.邀请获得2.幸运号获得)
     */
    private Byte coinGetMethod;
    /**
     * 用户id
     */
    private Long userId;
    
    private int integral;
    /**
     * 支付状态(1.支出 2.收入)
     */
    private Byte coinStatus;
    /**
     * 文字描述
     */
    private String coinDescribe;

    /**
     * 获得时间
     */
    private Date coinGetTime;
    /**
     * 支出时间
     */
    private Date coinPayTime;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Integer getCoinNum() {
        return coinNum;
    }
    public void setCoinNum(Integer coinNum) {
        this.coinNum = coinNum;
    }
    public Date getCoinTime() {
        return coinTime;
    }
    public void setCoinTime(Date coinTime) {
        this.coinTime = coinTime;
    }
    public Byte getCoinGetMethod() {
        return coinGetMethod;
    }
    public void setCoinGetMethod(Byte coinGetMethod) {
        this.coinGetMethod = coinGetMethod;
    }
    public Long getUserId() {
        return userId;
    }
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    public Byte getCoinStatus() {
        return coinStatus;
    }
    public void setCoinStatus(Byte coinStatus) {
        this.coinStatus = coinStatus;
    }
    public String getCoinDescribe() {
        return coinDescribe;
    }
    public void setCoinDescribe(String coinDescribe) {
        this.coinDescribe = coinDescribe == null ? null : coinDescribe.trim();
    }
   
    public Date getCoinGetTime() {
        return coinGetTime;
    }
    public void setCoinGetTime(Date coinGetTime) {
        this.coinGetTime = coinGetTime;
    }
	public int getIntegral() {
		return integral;
	}
	public void setIntegral(int integral) {
		this.integral = integral;
	}
	public Date getCoinPayTime() {
        return coinPayTime;
    }
    public void setCoinPayTime(Date coinPayTime) {
        this.coinPayTime = coinPayTime;
    }
}
