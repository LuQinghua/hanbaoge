package com.jiabian.message.response;

import java.io.Serializable;
import java.util.Date;

public class MessageRes implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	/**
     *  接收者用户编号
     */
    private Long receiveUserId;
    /**
     *  发送者用户编号
     */
    private Long sendUserId;
    /**
     *  消息接收/发送时间
     */
    private Date createTime;
    /**
     *  消息内容
     */
    private String content;
    /**
     *  1 文字  2 语言
     */
    private Byte type;
    /**
     *  1 正常  2 删除
     */
    private Byte isDel;
    /**
     *  图片
     */
    private String img;
    /**
     * 消息状态 1 未读  2 已读
     */
    private Byte status;
    /**
     * 未读信息条数
     */
    private Integer unReadCount;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 用户头像
     */
    private String userImg;
    /**
     * 附加消息
     */
    private String extra;
    /**
     * 客服登录名
     */
    private String loginName;
   
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserImg() {
		return userImg;
	}
	public void setUserImg(String userImg) {
		this.userImg = userImg;
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
	public Integer getUnReadCount() {
		return unReadCount;
	}
	public void setUnReadCount(Integer unReadCount) {
		this.unReadCount = unReadCount;
	}
	public String getExtra() {
		return extra;
	}
	public void setExtra(String extra) {
		this.extra = extra;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

}
