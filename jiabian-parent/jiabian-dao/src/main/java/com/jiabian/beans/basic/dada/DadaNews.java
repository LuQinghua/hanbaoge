/*
 * DadaNews.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2018-06-26 Created
 */
package com.jiabian.beans.basic.dada;

import java.io.Serializable;
import java.util.Date;

/**
 * 汽车新闻表
 * 
 * @author 菠萝大象
 * @version 1.0 2018-06-26
 */
public class DadaNews implements Serializable {

    /**
     * 新闻编号
     */
    private Long id;
    /**
     * 新闻图片
     */
    private String img;
    /**
     * 作者
     */
    private String author;
    /**
     * 新闻标题
     */
    private String title;
    /**
     * 新闻内容
     */
    private String content;
    /**
     * 发布时间
     */
    private Date time;
    /**
     * 新闻展现类型 1:单图 2:多图
     */
    private Byte type;
    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getImg() {
        return img;
    }
    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
    public Date getTime() {
        return time;
    }
    public void setTime(Date time) {
        this.time = time;
    }
    public Byte getType() {
        return type;
    }
    public void setType(Byte type) {
        this.type = type;
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
        DadaNews other = (DadaNews) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getImg() == null ? other.getImg() == null : this.getImg().equals(other.getImg()))
            && (this.getAuthor() == null ? other.getAuthor() == null : this.getAuthor().equals(other.getAuthor()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getTime() == null ? other.getTime() == null : this.getTime().equals(other.getTime()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()));
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getImg() == null) ? 0 : getImg().hashCode());
        result = prime * result + ((getAuthor() == null) ? 0 : getAuthor().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getTime() == null) ? 0 : getTime().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        return result;
    }
}