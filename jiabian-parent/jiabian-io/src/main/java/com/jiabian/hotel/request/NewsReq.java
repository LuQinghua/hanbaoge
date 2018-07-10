package com.jiabian.hotel.request;

import java.io.Serializable;
import java.util.Date;

import com.jiabian.base.BaseReq;

public class NewsReq extends BaseReq implements Serializable  {
	/**
     * 新闻编号
     */
    private Long id;
    /**
     * 新闻图片
     */
    private String img;
    /**
     * 新闻标题
     */
    private String title;
    /**
     * 新闻内容
     */
    private String content;
    /**
     * 新闻发布时间
     */
    private Date createTime;
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
    public Date getCreateTime() {
        return createTime;
    }
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
