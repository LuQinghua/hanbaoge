package com.jiabian.wankong.response;

import java.io.Serializable;
import java.util.Date;

import com.jiabian.base.BaseRes;

public class ClassifyRes extends BaseRes implements Serializable  {
	private Long id;
    /**
     * 分类名
     */
    private String name;
    /**
     * 添加时间
     */
    private Date createTime;
    /**
     * 图片
     */
    private String img;
    /**
     * 标题
     */
    private String title;
    /**
     * 简介
     */
    private String content;
    /**
     * 1.低压成套开关柜系列 2.箱式变电站系列 3.高压成套开关柜系列 4.高低压元件系列
     */
    private Byte type;
    /**
     * 依赖id
     */
    private Long relyId;
    private static final long serialVersionUID = 1L;

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
    public Byte getType() {
        return type;
    }
    public void setType(Byte type) {
        this.type = type;
    }
    public Long getRelyId() {
        return relyId;
    }
    public void setRelyId(Long relyId) {
        this.relyId = relyId;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
    public Date getCreateTime() {
        return createTime;
    }
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
