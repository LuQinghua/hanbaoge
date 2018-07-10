package com.jiabian.dada.response;

import java.io.Serializable;
import java.util.Date;

import com.jiabian.base.BaseRes;

public class DadaNewsRes extends BaseRes implements Serializable {

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
	
}
