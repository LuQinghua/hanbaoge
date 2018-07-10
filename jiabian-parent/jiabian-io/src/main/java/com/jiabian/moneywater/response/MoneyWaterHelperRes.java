package com.jiabian.moneywater.response;

import java.math.BigDecimal;
import java.util.Date;

public class MoneyWaterHelperRes {
	  private Long id;
	  private Long orderId;
	  private String cateName;
	  private Long prodId;
	  private String prodName;
	  private Long cateId;
	  private BigDecimal prodsPrice;
	  private Date acceptOrderTime;
	  private String userName;
	  private BigDecimal priceNow;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public String getCateName() {
		return cateName;
	}
	public void setCateName(String cateName) {
		this.cateName = cateName;
	}
	public Long getProdId() {
		return prodId;
	}
	public void setProdId(Long prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public Long getCateId() {
		return cateId;
	}
	public void setCateId(Long cateId) {
		this.cateId = cateId;
	}
	public BigDecimal getProdsPrice() {
		return prodsPrice;
	}
	public void setProdsPrice(BigDecimal prodsPrice) {
		this.prodsPrice = prodsPrice;
	}
	public Date getAcceptOrderTime() {
		return acceptOrderTime;
	}
	public void setAcceptOrderTime(Date acceptOrderTime) {
		this.acceptOrderTime = acceptOrderTime;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public BigDecimal getPriceNow() {
		return priceNow;
	}
	public void setPriceNow(BigDecimal priceNow) {
		this.priceNow = priceNow;
	}
	  
	  
}
