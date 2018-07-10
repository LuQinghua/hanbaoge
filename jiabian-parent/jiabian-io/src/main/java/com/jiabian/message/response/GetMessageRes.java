package com.jiabian.message.response;

import java.io.Serializable;

public class GetMessageRes implements Serializable{

	
	private static final long serialVersionUID = 1L;
	/**
	 * 返回状态码
	 */
	private int resultCode;
	/**
	 * 客服登录名称
	 */
	private String sendName;
	public int getResultCode() {
		return resultCode;
	}
	public void setResultCode(int resultCode) {
		this.resultCode = resultCode;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getSendName() {
		return sendName;
	}
	public void setSendName(String sendName) {
		this.sendName = sendName;
	}
	

}
