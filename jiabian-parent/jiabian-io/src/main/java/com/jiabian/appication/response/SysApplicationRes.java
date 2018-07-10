/*
 * SysApplication.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-12-05 Created
 */
package com.jiabian.appication.response;

import java.io.Serializable;
import java.util.Date;

import com.jiabian.base.BaseRes;

/**
 * 
 * 
 * @author 菠萝大象
 * @version 1.0 2016-12-05
 */
public class SysApplicationRes extends BaseRes implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	 * 主键自增
	 */
	private Long id;
	/**
	 * 申请人姓名
	 */
	private String name;
	/**
	 * 身份证号码
	 */
	private String cardNo;
	/**
	 * 身份证照片
	 */
	private String cardImg;
	/**
	 * 申请人电话
	 */
	private String mobile;
	/**
	 * 联系邮箱
	 */
	private String email;
	/**
	 * 联系地址
	 */
	private String address;
	/**
	 * 银行名称
	 */
	private String bankName;
	/**
	 * 银行卡号
	 */
	private String bankNo;
	/**
	 * 入驻类型 1 区域经理 2 代理/经销商 3 销售/招商人员
	 */
	private Byte type;
	/**
	 * 省份
	 */
	private Integer province;
	/**
	 * 城市
	 */
	private Integer city;
	/**
	 * 区
	 */
	private Integer area;
	/**
	 * 招商入驻 1 底薪+绩效 2 全绩效
	 */
	private Byte attractInvestment;
	/**
	 * 物流收入 1 底薪+绩效 2 全绩效
	 */
	private Byte logistics;
	/**
	 * 创建时间
	 */
	private Date createTime;

	/**
	 * 修改时间
	 */
	private Date updateTime;

	/**
	 * 审核人
	 */
	private Long reviewer;

	/**
	 * 审核人姓名
	 */
	private String reviewName;

	/**
	 * 审核时间
	 */
	private Date reviewTime;

	/**
	 * 区域经理关联Id
	 */
	private Long suserId;

	/**
	 * 1 未删除 2 删除
	 */
	private Byte isDel;
	/**
	 * 1 未审核 2 审核
	 */
	private Byte status;

	private String subbranchName;

	public String getReviewName() {
		return reviewName;
	}

	public void setReviewName(String reviewName) {
		this.reviewName = reviewName;
	}

	public Date getReviewTime() {
		return reviewTime;
	}

	public void setReviewTime(Date reviewTime) {
		this.reviewTime = reviewTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Long getReviewer() {
		return reviewer;
	}

	public void setReviewer(Long reviewer) {
		this.reviewer = reviewer;
	}

	public Long getSuserId() {
		return suserId;
	}

	public void setSuserId(Long suserId) {
		this.suserId = suserId;
	}

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
		this.name = name;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getCardImg() {
		return cardImg;
	}

	public void setCardImg(String cardImg) {
		this.cardImg = cardImg;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankNo() {
		return bankNo;
	}

	public void setBankNo(String bankNo) {
		this.bankNo = bankNo;
	}

	public Byte getType() {
		return type;
	}

	public void setType(Byte type) {
		this.type = type;
	}

	public Integer getProvince() {
		return province;
	}

	public void setProvince(Integer province) {
		this.province = province;
	}

	public Integer getCity() {
		return city;
	}

	public void setCity(Integer city) {
		this.city = city;
	}

	public Integer getArea() {
		return area;
	}

	public void setArea(Integer area) {
		this.area = area;
	}

	public Byte getAttractInvestment() {
		return attractInvestment;
	}

	public void setAttractInvestment(Byte attractInvestment) {
		this.attractInvestment = attractInvestment;
	}

	public Byte getLogistics() {
		return logistics;
	}

	public void setLogistics(Byte logistics) {
		this.logistics = logistics;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Byte getIsDel() {
		return isDel;
	}

	public void setIsDel(Byte isDel) {
		this.isDel = isDel;
	}

	public Byte getStatus() {
		return status;
	}

	public void setStatus(Byte status) {
		this.status = status;
	}

	public String getSubbranchName() {
		return subbranchName;
	}

	public void setSubbranchName(String subbranchName) {
		this.subbranchName = subbranchName;
	}

}