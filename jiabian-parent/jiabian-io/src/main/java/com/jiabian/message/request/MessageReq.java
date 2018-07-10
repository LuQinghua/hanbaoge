package com.jiabian.message.request;

import java.io.Serializable;
import java.util.Date;

public class MessageReq implements Serializable {

	private static final long serialVersionUID = 1L;
	/**
	 * cookies商家对应的用户编号
	 */
	private Long userId;
	/**
	 * 消息记录编号
	 */
	private Long id;
	/**
	 * 接收者用户编号
	 */
	private Long receiveUserId;
	/**
	 * 发送者用户编号
	 */
	private Long sendUserId;
	/**
	 * 消息接收/发送时间
	 */
	private Date createTime;
	/**
	 * 消息内容
	 */
	private String content;
	/**
	 * 1 文字 2 语言
	 */
	private Byte type;
	/**
	 * 1 正常 2 删除
	 */
	private Byte isDel;
	/**
	 * 图片
	 */
	private String img;
	/**
	 * 消息状态 1 未读 2 已读
	 */
	private Byte status;
	/**
	 * 消息类型 1.文本 2.图片 3.图文类型 4.自定义
	 */
	private Byte messageType;
	/**
	 * 附加消息
	 */
	private String extra;
	/**
	 * 头像
	 */
	private String emoji;

	public String getExtra() {
		return extra;
	}

	public void setExtra(String extra) {
		this.extra = extra;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getReceiveUserId() {
		return receiveUserId;
	}

	public void setReceiveUserId(Long receiveUserId) {
		this.receiveUserId = receiveUserId;
	}

	public Long getSendUserId() {
		return sendUserId;
	}

	public void setSendUserId(Long sendUserId) {
		this.sendUserId = sendUserId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Byte getType() {
		return type;
	}

	public void setType(Byte type) {
		this.type = type;
	}

	public Byte getIsDel() {
		return isDel;
	}

	public void setIsDel(Byte isDel) {
		this.isDel = isDel;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public Byte getStatus() {
		return status;
	}

	public void setStatus(Byte status) {
		this.status = status;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Byte getMessageType() {
		return messageType;
	}

	public void setMessageType(Byte messageType) {
		this.messageType = messageType;
	}

	public String getEmoji() {
		return emoji;
	}

	public void setEmoji(String emoji) {
		this.emoji = emoji;
	}

}
