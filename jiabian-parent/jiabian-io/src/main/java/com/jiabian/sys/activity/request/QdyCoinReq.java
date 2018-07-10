package com.jiabian.sys.activity.request;

import java.util.Date;

import com.jiabian.base.BaseReq;

public class QdyCoinReq extends BaseReq {
	
	private static final long serialVersionUID = 1L;
	
	private String checkIds;
	/**
	 * 家边通宝id
	 */
	private Long id;
	/**
	 * 家边通宝数量
	 */
	private Integer coinNum;
	/**
	 * 获得时间
	 */
	private Date coinTime;
	/**
	 * 获得支出时间
	 */
	private Date coinGetTime;
	/**
	 * 支出时间
	 */
	private Date coinPayTime;
	/**
	 * 获得方式(1.邀请获得2.幸运号获得)
	 */
	private Byte coinGetMethod;
	/**
	 * 支付状态(1.支出 2.收入)
	 */
	private Byte coinStatus;
	/**
	 * 用户id
	 */
	private Long userId;

	/**
	 * 描述
	 */
	private String coinDescribe;

	public String getCheckIds() {
		return checkIds;
	}

	public void setCheckIds(String checkIds) {
		this.checkIds = checkIds;
	}

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

	public Date getCoinGetTime() {
		return coinGetTime;
	}

	public void setCoinGetTime(Date coinGetTime) {
		this.coinGetTime = coinGetTime;
	}

	public Date getCoinPayTime() {
		return coinPayTime;
	}

	public void setCoinPayTime(Date coinPayTime) {
		this.coinPayTime = coinPayTime;
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

	public Date getCoinTime() {
		return coinTime;
	}

	public void setCoinTime(Date coinTime) {
		this.coinTime = coinTime;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void setCoinStatus(Byte coinStatus) {
		this.coinStatus = coinStatus;
	}

	public String getCoinDescribe() {
		return coinDescribe;
	}

	public void setCoinDescribe(String coinDescribe) {
		this.coinDescribe = coinDescribe;
	}
}
