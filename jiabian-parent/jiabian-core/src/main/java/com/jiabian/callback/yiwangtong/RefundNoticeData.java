package com.jiabian.callback.yiwangtong;

import java.io.Serializable;

public class RefundNoticeData implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 请求时间，银行返回该数据的时间，精确到秒
	 */
	private String dateTime;

	/**
	 * 商户分行号，4位数字
	 */
	private String branchNo;

	/**
	 * 商户号，6位数字
	 */
	private String merchantNo;

	/**
	 * 商户订单日期
	 */
	private String date;

	/**
	 * 商户订单号
	 */
	private String orderNo;

	/**
	 * 退款流水号
	 */
	private String refundSerialNo;

	/**
	 * 退款金额
	 */
	private String amount;

	/**
	 * 退款描述
	 */
	private String desc;

	/**
	 * 商户结账系统的操作员号
	 */
	private String operatorNo;

	/**
	 * 操作员密码加密算法
	 */
	private String encrypType;

	/**
	 * 操作员登录密码
	 */
	private String pwd;

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
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

	public String getRefundSerialNo() {
		return refundSerialNo;
	}

	public void setRefundSerialNo(String refundSerialNo) {
		this.refundSerialNo = refundSerialNo;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getOperatorNo() {
		return operatorNo;
	}

	public void setOperatorNo(String operatorNo) {
		this.operatorNo = operatorNo;
	}

	public String getEncrypType() {
		return encrypType;
	}

	public void setEncrypType(String encrypType) {
		this.encrypType = encrypType;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

}
