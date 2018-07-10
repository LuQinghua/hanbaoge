package com.jiabian.moneywater.response;

import java.math.BigDecimal;
import java.util.Date;

import com.jiabian.base.BaseRes;
import com.jiabian.base.io.request.IRequest;

public class MoneyWaterRes extends BaseRes implements IRequest{
    

	
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
	 * 收入金额
	 */
	private BigDecimal incomeMoney;
	
	/**
	 * 提现时间
	 */
	private Date withdrawTime;
	/**
	 * 提现金额
	 */
	private BigDecimal withdrawMoney;
	
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
	 * 总收入金额
	 */
	private BigDecimal totalIncome;
	
	/**
	 * 剩余金额
	 */
	private BigDecimal residueMoney;
	
	/**
	 * 总提现金额
	 */
	private BigDecimal totalWithdraw;
    
	/**
     * 经手人
     */
    private Long handlingManId;
	private Long recordNumber;
	/**
     * 用户提现账户id
     */
    private Long accountId;
    /**
     * 基础运费
     */
    private BigDecimal baseFreight;
    /**
     * 超重运费
     */
    private BigDecimal weightFreight;
    /**
     * 超限运费
     */
    private BigDecimal limitFreight;
    /**
     * 商品合计金额
     */
    private BigDecimal prodsPrice;
    /**
     * 退款金额
     */
    private BigDecimal returnMoney;
    /**
     * 总退款金额
     */
    private BigDecimal totalReturnMoney;
    /**
     * 总申请提现金额
     */
    private BigDecimal totalApplyMoney;
    /**
     * 总已经完成提现金额
     */
    private BigDecimal totalComplete;
    /**
     * 总销售金额
     */
    private BigDecimal totalSaleMoney;
    /**
     * 总可申请提现的金额
     */
    private BigDecimal totalCanWithdrawal;
    /**
     * 账户类型
     */
    private Byte accountType;
    /**
     * 支付宝账号
     */
    private String alipayId;
    /**
     * 支付宝用户名
     */
    private String alipayName;
    /**
     * 开户银行
     */
    private String openBankName;
    /**
     * 银行名称
     */
    private String bankName;
    /**
     * 银行地址
     */
    private String	bankAddress;
    /**
     * 银行卡号
     */
    private String	bankId;
    /**
     * 店铺名称
     */
    private String shopName;
    /**
     * 商店logo
     */
    private String  shopIcon;
    /**
     * 总提现金额
     */
    private BigDecimal totalWithdrawMoney;
    /**
     * 商家实时销售额
     */
    private BigDecimal NowSalsemoney;
    
    private Integer orderNum;
    
    private BigDecimal totalPrice;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMoneyWaterCode() {
		return moneyWaterCode;
	}

	public void setMoneyWaterCode(String moneyWaterCode) {
		this.moneyWaterCode = moneyWaterCode;
	}

	public Date getIncomeTime() {
		return incomeTime;
	}

	public void setIncomeTime(Date incomeTime) {
		this.incomeTime = incomeTime;
	}

	public BigDecimal getIncomeMoney() {
		return incomeMoney;
	}

	public void setIncomeMoney(BigDecimal incomeMoney) {
		this.incomeMoney = incomeMoney;
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

	public Long getOrder_recordId() {
		return order_recordId;
	}

	public void setOrder_recordId(Long order_recordId) {
		this.order_recordId = order_recordId;
	}

	public Byte getMoneyStatus() {
		return moneyStatus;
	}

	public void setMoneyStatus(Byte moneyStatus) {
		this.moneyStatus = moneyStatus;
	}

	public BigDecimal getTotalIncome() {
		return totalIncome;
	}

	public void setTotalIncome(BigDecimal totalIncome) {
		this.totalIncome = totalIncome;
	}

	public BigDecimal getResidueMoney() {
		return residueMoney;
	}

	public void setResidueMoney(BigDecimal residueMoney) {
		this.residueMoney = residueMoney;
	}

	public BigDecimal getTotalWithdraw() {
		return totalWithdraw;
	}

	public void setTotalWithdraw(BigDecimal totalWithdraw) {
		this.totalWithdraw = totalWithdraw;
	}

	public Long getHandlingManId() {
		return handlingManId;
	}

	public void setHandlingManId(Long handlingManId) {
		this.handlingManId = handlingManId;
	}

	public Long getRecordNumber() {
		return recordNumber;
	}

	public void setRecordNumber(Long recordNumber) {
		this.recordNumber = recordNumber;
	}

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public BigDecimal getBaseFreight() {
		return baseFreight;
	}

	public void setBaseFreight(BigDecimal baseFreight) {
		this.baseFreight = baseFreight;
	}

	public BigDecimal getWeightFreight() {
		return weightFreight;
	}

	public void setWeightFreight(BigDecimal weightFreight) {
		this.weightFreight = weightFreight;
	}

	public BigDecimal getLimitFreight() {
		return limitFreight;
	}

	public void setLimitFreight(BigDecimal limitFreight) {
		this.limitFreight = limitFreight;
	}

	public BigDecimal getProdsPrice() {
		return prodsPrice;
	}

	public void setProdsPrice(BigDecimal prodsPrice) {
		this.prodsPrice = prodsPrice;
	}

	public BigDecimal getReturnMoney() {
		return returnMoney;
	}

	public void setReturnMoney(BigDecimal returnMoney) {
		this.returnMoney = returnMoney;
	}

	public BigDecimal getTotalReturnMoney() {
		return totalReturnMoney;
	}

	public void setTotalReturnMoney(BigDecimal totalReturnMoney) {
		this.totalReturnMoney = totalReturnMoney;
	}

	public BigDecimal getTotalApplyMoney() {
		return totalApplyMoney;
	}

	public void setTotalApplyMoney(BigDecimal totalApplyMoney) {
		this.totalApplyMoney = totalApplyMoney;
	}

	public BigDecimal getTotalComplete() {
		return totalComplete;
	}

	public void setTotalComplete(BigDecimal totalComplete) {
		this.totalComplete = totalComplete;
	}

	public BigDecimal getTotalSaleMoney() {
		return totalSaleMoney;
	}

	public void setTotalSaleMoney(BigDecimal totalSaleMoney) {
		this.totalSaleMoney = totalSaleMoney;
	}

	public BigDecimal getTotalCanWithdrawal() {
		return totalCanWithdrawal;
	}

	public void setTotalCanWithdrawal(BigDecimal totalCanWithdrawal) {
		this.totalCanWithdrawal = totalCanWithdrawal;
	}

	public Byte getAccountType() {
		return accountType;
	}

	public void setAccountType(Byte accountType) {
		this.accountType = accountType;
	}

	public String getAlipayId() {
		return alipayId;
	}

	public void setAlipayId(String alipayId) {
		this.alipayId = alipayId;
	}

	public String getAlipayName() {
		return alipayName;
	}

	public void setAlipayName(String alipayName) {
		this.alipayName = alipayName;
	}

	public String getOpenBankName() {
		return openBankName;
	}

	public void setOpenBankName(String openBankName) {
		this.openBankName = openBankName;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankAddress() {
		return bankAddress;
	}

	public void setBankAddress(String bankAddress) {
		this.bankAddress = bankAddress;
	}

	public String getBankId() {
		return bankId;
	}

	public void setBankId(String bankId) {
		this.bankId = bankId;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getShopIcon() {
		return shopIcon;
	}

	public void setShopIcon(String shopIcon) {
		this.shopIcon = shopIcon;
	}

	public BigDecimal getTotalWithdrawMoney() {
		return totalWithdrawMoney;
	}

	public void setTotalWithdrawMoney(BigDecimal totalWithdrawMoney) {
		this.totalWithdrawMoney = totalWithdrawMoney;
	}

	public BigDecimal getNowSalsemoney() {
		return NowSalsemoney;
	}

	public void setNowSalsemoney(BigDecimal nowSalsemoney) {
		NowSalsemoney = nowSalsemoney;
	}

	public Integer getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(Integer orderNum) {
		this.orderNum = orderNum;
	}

	public BigDecimal getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}
    
	
}
