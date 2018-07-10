package com.jiabian.rongyun.model;

import com.jiabian.rongyun.rongyun.io.rong.models.Message;

public class SystemMessage extends Message{
	private Long userId;
	private String nickName;
	
	private String headIcon;
	
	private Integer sex;
	
	private Integer msgType;
	
	private String tagType;
	
	private String content;
	
	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getHeadIcon() {
		return headIcon;
	}

	public void setHeadIcon(String headIcon) {
		this.headIcon = headIcon;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public Integer getMsgType() {
		return msgType;
	}

	public void setMsgType(Integer msgType) {
		this.msgType = msgType;
	}

	public String getTagType() {
		return tagType;
	}

	public void setTagType(String tagType) {
		this.type = tagType;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	
	
}
