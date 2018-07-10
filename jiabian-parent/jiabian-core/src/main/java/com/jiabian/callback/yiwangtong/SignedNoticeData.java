package com.jiabian.callback.yiwangtong;

import java.io.Serializable;

public class SignedNoticeData implements Serializable {
	
	private static final long serialVersionUID = 1L;

	/**
	 * 请求时间
	 */
	private String dateTime;

	/**
	 * 处理结果
	 */
	private String rspCode;

	/**
	 * 详细信息
	 */
	private String rspMsg;

	/**
	 * 通知类型
	 */
	private String noticeType;

	/**
	 * 银行通知序号
	 */
	private String noticeSerialNo;

	/**
	 * 商户分行号
	 */
	private String branchNo;

	/**
	 * 签约请求时填写的签约结果通知地址
	 */
	private String merchantNo;

	/**
	 * 请求时间
	 */
	private String noticeUrl;

	/**
	 * 回调HTTP地址,固定为“POST”
	 */
	private String httpMethod;

	/**
	 * 签约请求时填写的客户协议号
	 */
	private String agrNo;

	/**
	 * 原样返回商户在签约或一网通支付请求报文中传送的成功签约通知附加参数
	 */
	private String noticePara;

	/**
	 * 签约请求时填写的用于标识商户用户的唯一ID
	 */
	private String userID;

	/**
	 * 用户证件类型，1：身份证
	 */
	private String userPidType;

	/**
	 * 证件号映射的30位hash值，成功交易返回
	 */
	private String userPidHash;

	/**
	 * 免密标识，固定为“N”，表示不开通免密。
	 */
	private String noPwdPay;

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	public String getRspCode() {
		return rspCode;
	}

	public void setRspCode(String rspCode) {
		this.rspCode = rspCode;
	}

	public String getRspMsg() {
		return rspMsg;
	}

	public void setRspMsg(String rspMsg) {
		this.rspMsg = rspMsg;
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

	public String getAgrNo() {
		return agrNo;
	}

	public void setAgrNo(String agrNo) {
		this.agrNo = agrNo;
	}

	public String getNoticePara() {
		return noticePara;
	}

	public void setNoticePara(String noticePara) {
		this.noticePara = noticePara;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getUserPidType() {
		return userPidType;
	}

	public void setUserPidType(String userPidType) {
		this.userPidType = userPidType;
	}

	public String getUserPidHash() {
		return userPidHash;
	}

	public void setUserPidHash(String userPidHash) {
		this.userPidHash = userPidHash;
	}

	public String getNoPwdPay() {
		return noPwdPay;
	}

	public void setNoPwdPay(String noPwdPay) {
		this.noPwdPay = noPwdPay;
	}

}
