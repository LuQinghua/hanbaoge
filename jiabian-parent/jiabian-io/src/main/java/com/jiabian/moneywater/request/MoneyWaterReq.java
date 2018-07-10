package com.jiabian.moneywater.request;

import java.math.BigDecimal;
import java.util.Date;

import com.jiabian.base.BaseReq;
import com.jiabian.base.io.request.IRequest;

public class MoneyWaterReq extends BaseReq implements IRequest{

	private static final long serialVersionUID = 1L;

	
	private Long id;
	/**
	 * 流水单号
	 */
	private String moneyWaterCode;
	
	/**
	 * 收入时间
	 */
	private Date incomeTime;
	
	/**
	 * 查询开始时间
	 */
	private Date seekStartDate;
	
	/**
	 * 查询结束时间
	 */
	private Date seekEndDate;

	/**
	 * 商店编号
	 */
	private Long shopId;
	
	/**
	 * 订单编号
	 */
	private Long orderId;
	 /**
     * 订单记录号
     */
    private Long order_recordId;
	
	/**
	 * 资金流水状态
	 */
	private Byte moneyStatus;
	
	/**
	 * 查询条件
	 */
	private Byte wayType;
	
	/**
	 * 查询条件开始
	 */
    private String startTime;
    
	/**
	 * 查询条件结束
	 */
    private String endTime;
    
    private String TheWaterCode;
    
	/**
	 * 提现时间
	 */
	private Date withdrawTime;
	/**
	 * 提现金额
	 */
	private BigDecimal withdrawMoney;
	/**
     * 用户提现账户id
     */
    private Long accountId;
    /**
     * 店铺名称
     */
    private String shopName;
    /**
     * 分页页码
     */
    private Integer currentPage;
    

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public Long getOrder_recordId() {
		return order_recordId;
	}

	public void setOrder_recordId(Long order_recordId) {
		this.order_recordId = order_recordId;
	}

	public Date getWithdrawTime() {
		return withdrawTime;
	}

	public void setWithdrawTime(Date withdrawTime) {
		this.withdrawTime = withdrawTime;
	}

	public BigDecimal getWithdrawMoney() {
		return withdrawMoney;
	}

	public void setWithdrawMoney(BigDecimal withdrawMoney) {
		this.withdrawMoney = withdrawMoney;
	}

	public Date getIncomeTime() {
		return incomeTime;
	}

	public void setIncomeTime(Date incomeTime) {
		this.incomeTime = incomeTime;
	}

	public Long getShopId() {
		return shopId;
	}

	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Byte getMoneyStatus() {
		return moneyStatus;
	}

	public void setMoneyStatus(Byte moneyStatus) {
		this.moneyStatus = moneyStatus;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public Date getSeekStartDate() {
		return seekStartDate;
	}

	public void setSeekStartDate(Date seekStartDate) {
		this.seekStartDate = seekStartDate;
	}

	public Date getSeekEndDate() {
		return seekEndDate;
	}

	public void setSeekEndDate(Date seekEndDate) {
		this.seekEndDate = seekEndDate;
	}

	public Byte getWayType() {
		return wayType;
	}

	public void setWayType(Byte wayType) {
		this.wayType = wayType;
	}
    
    public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getMoneyWaterCode() {
		return moneyWaterCode;
	}

	public void setMoneyWaterCode(String moneyWaterCode) {
		this.moneyWaterCode = moneyWaterCode;
	}

	public String getTheWaterCode() {
		return TheWaterCode;
	}

	public void setTheWaterCode(String theWaterCode) {
		TheWaterCode = theWaterCode;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
	

}
