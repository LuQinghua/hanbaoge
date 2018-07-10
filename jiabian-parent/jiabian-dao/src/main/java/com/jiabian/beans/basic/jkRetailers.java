/*
 * jkRetailers.java
 * Copyright(C) 20xx-2015 xxxxxx鍏徃
 * All rights reserved.
 * -----------------------------------------------
 * 2017-05-29 Created
 */
package com.jiabian.beans.basic;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author 鑿犺悵澶ц薄
 * @version 1.0 2017-05-29
 */
public class jkRetailers implements Serializable {

    /**
     * id
     */
    private Long id;
    /**
     * 标题
     */
    private String headline;
    /**
     * 内容
     */
    private String content;
    /**
     * 图片
     */
    private String img;
    /**
     * 跳转链接
     */
    private String url;
    /**
     * 地址
     */
    private String address;
    /**
     * 备案号码
     */
    private String record_Number;
    /**
     * 1.轮播图底部 2.我们可以做什么 3.如何做的 4.选择我们 6.联系我们 7.logo
     */
    private Byte classify;
    /**
     * 添加时间
     */
    private Date creatTime;
    /**
     * 修改时间
     */
    private Date updateTime;
    /**
     * 1.今客 2.客盟
     */
    private Byte port;
    /**
     * 1.内容 2.图片 3.地址4.招聘
     */
    private Byte classification;
    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getHeadline() {
        return headline;
    }
    public void setHeadline(String headline) {
        this.headline = headline == null ? null : headline.trim();
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
    public String getImg() {
        return img;
    }
    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }
    public String getRecord_Number() {
        return record_Number;
    }
    public void setRecord_Number(String record_Number) {
        this.record_Number = record_Number == null ? null : record_Number.trim();
    }
    public Byte getClassify() {
        return classify;
    }
    public void setClassify(Byte classify) {
        this.classify = classify;
    }
    public Date getCreatTime() {
        return creatTime;
    }
    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }
    public Date getUpdateTime() {
        return updateTime;
    }
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    public Byte getPort() {
        return port;
    }
    public void setPort(Byte port) {
        this.port = port;
    }
    public Byte getClassification() {
        return classification;
    }
    public void setClassification(Byte classification) {
        this.classification = classification;
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
        jkRetailers other = (jkRetailers) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getHeadline() == null ? other.getHeadline() == null : this.getHeadline().equals(other.getHeadline()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getImg() == null ? other.getImg() == null : this.getImg().equals(other.getImg()))
            && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getRecord_Number() == null ? other.getRecord_Number() == null : this.getRecord_Number().equals(other.getRecord_Number()))
            && (this.getClassify() == null ? other.getClassify() == null : this.getClassify().equals(other.getClassify()))
            && (this.getCreatTime() == null ? other.getCreatTime() == null : this.getCreatTime().equals(other.getCreatTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getPort() == null ? other.getPort() == null : this.getPort().equals(other.getPort()))
            && (this.getClassification() == null ? other.getClassification() == null : this.getClassification().equals(other.getClassification()));
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getHeadline() == null) ? 0 : getHeadline().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getImg() == null) ? 0 : getImg().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getRecord_Number() == null) ? 0 : getRecord_Number().hashCode());
        result = prime * result + ((getClassify() == null) ? 0 : getClassify().hashCode());
        result = prime * result + ((getCreatTime() == null) ? 0 : getCreatTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getPort() == null) ? 0 : getPort().hashCode());
        result = prime * result + ((getClassification() == null) ? 0 : getClassification().hashCode());
        return result;
    }
}