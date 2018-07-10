/*
 * Message.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2017-02-10 Created
 */
package com.jiabian.beans.basic;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author 菠萝大象
 * @version 1.0 2017-02-10
 */
public class Message implements Serializable {

	private static final long serialVersionUID = 1L;
    /**
     * 消息编号id
     */
    private Long id;
    /**
     * 接收者Id
     */
    private Long receiveUserId;
    /**
     * 发送者Id
     */
    private Long sendUserId;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 文字消息内容 / 图片消息略缩图
     */
    private String content;
    /**
     *  1 文字  2 图片
     */
    private Byte type;
    /**
     * 1.正常 2.删除
     */
    private Byte isDel;
    /**
     * 图片消息路径
     */
    private String img;
    /**
     * 消息状态 1 未读  2 已读
     */
    private Byte status;
    /**
     * 消息附加字段，区分消息来源   
     */
    private String extra;

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
        this.content = content == null ? null : content.trim();
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
        this.img = img == null ? null : img.trim();
    }
    public Byte getStatus() {
        return status;
    }
    public void setStatus(Byte status) {
        this.status = status;
    }
    public String getExtra() {
        return extra;
    }
    public void setExtra(String extra) {
        this.extra = extra == null ? null : extra.trim();
    }
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Message other = (Message) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getReceiveUserId() == null ? other.getReceiveUserId() == null : this.getReceiveUserId().equals(other.getReceiveUserId()))
            && (this.getSendUserId() == null ? other.getSendUserId() == null : this.getSendUserId().equals(other.getSendUserId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getIsDel() == null ? other.getIsDel() == null : this.getIsDel().equals(other.getIsDel()))
            && (this.getImg() == null ? other.getImg() == null : this.getImg().equals(other.getImg()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getExtra() == null ? other.getExtra() == null : this.getExtra().equals(other.getExtra()));
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getReceiveUserId() == null) ? 0 : getReceiveUserId().hashCode());
        result = prime * result + ((getSendUserId() == null) ? 0 : getSendUserId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getIsDel() == null) ? 0 : getIsDel().hashCode());
        result = prime * result + ((getImg() == null) ? 0 : getImg().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getExtra() == null) ? 0 : getExtra().hashCode());
        return result;
    }
}