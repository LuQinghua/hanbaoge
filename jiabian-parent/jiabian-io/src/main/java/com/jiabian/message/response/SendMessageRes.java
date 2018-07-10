package com.jiabian.message.response;

import java.io.Serializable;

public class SendMessageRes implements Serializable{
	
	private static final long serialVersionUID = 1L;
    
	/**
	 * 消息发送状态码
	 */
	private int resultCode;
	/**
	 * 接收消息的用户编号
	 */
	private Long receiveUserId;
	public int getResultCode() {
		return resultCode;
	}
	public void setResultCode(int resultCode) {
		this.resultCode = resultCode;
	}
	public Long getReceiveUserId() {
		return receiveUserId;
	}
	public void setReceiveUserId(Long receiveUserId) {
		this.receiveUserId = receiveUserId;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
