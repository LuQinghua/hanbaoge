package com.jiabian.callback.yiwangtong;

import java.io.Serializable;


public class CallBackNoticeData implements Serializable{

	private static final long serialVersionUID = 1L;

	/**
	 * 请求时间，银行返回该数据的时间，精确到秒
	 */
	private String dateTime;

	/**
	 * 回调HTTP地址，支付请求时填写的支付结果通知地址
	 */
	private String noticeUrl;

	/**
	 * 回调HTTP方法，固定为“POST
	 */
	private String httpMethod;

	/**
	 * 商户分行号，4位数字
	 */
	private String branchNo;

	/**
	 * 商户号，6位数字
	 */
	private String merchantNo;

	/**
	 * 通知类型，本接口固定为：“BKPAYRTN”
	 */
	private String noticeType;

	/**
	 * 银行通知序号
	 */
	private String noticeSerialNo;

	/**
	 * 商户订单日期
	 */
	private String date;

	/**
	 * 商户订单号
	 */
	private String orderNo;

	/**
	 * 订单金额
	 */
	private String amount;

	/**
	 * 银行受理日期
	 */
	private String bankDate;

	/**
	 * 银行订单流水号
	 */
	private String bankSerialNo;

	/**
	 * 优惠标志，Y:有优惠 N：无优惠
	 */
	private String discountFlag;

	/**
	 * 优惠金额，单位为元
	 */
	private String discountAmount;

	/**
	 * 商户附加参数
	 */
	private String merchantPara;

	/**
	 * 付款卡类型，CreditCard:信用卡,DebitCard:借记卡
	 */
	private String AccountType;

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	public String getNoticeUrl() {
		return noticeUrl;
	}

	public void setNoticeUrl(String noticeUrl) {
		this.noticeUrl = noticeUrl;
	}

	public String getHttpMethod() {
		return httpMethod;
	}

	public void setHttpMethod(String httpMethod) {
		this.httpMethod = httpMethod;
	}

	public String getBranchNo() {
		return branchNo;
	}

	public void setBranchNo(String branchNo) {
		this.branchNo = branchNo;
	}

	public String getMerchantNo() {
		return merchantNo;
	}

	public void setMerchantNo(String merchantNo) {
		this.merchantNo = merchantNo;
	}

	public String getNoticeType() {
		return noticeType;
	}

	public void setNoticeType(String noticeType) {
		this.noticeType = noticeType;
	}

	public String getNoticeSerialNo() {
		return noticeSerialNo;
	}

	public void setNoticeSerialNo(String noticeSerialNo) {
		this.noticeSerialNo = noticeSerialNo;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBankDate() {
		return bankDate;
	}

	public void setBankDate(String bankDate) {
		this.bankDate = bankDate;
	}

	public String getBankSerialNo() {
		return bankSerialNo;
	}

	public void setBankSerialNo(String bankSerialNo) {
		this.bankSerialNo = bankSerialNo;
	}

	public String getDiscountFlag() {
		return discountFlag;
	}

	public void setDiscountFlag(String discountFlag) {
		this.discountFlag = discountFlag;
	}

	public String getDiscountAmount() {
		return discountAmount;
	}

	public void setDiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
	}

	public String getMerchantPara() {
		return merchantPara;
	}

	public void setMerchantPara(String merchantPara) {
		this.merchantPara = merchantPara;
	}

	public String getAccountType() {
		return AccountType;
	}

	public void setAccountType(String accountType) {
		AccountType = accountType;
	}

}
