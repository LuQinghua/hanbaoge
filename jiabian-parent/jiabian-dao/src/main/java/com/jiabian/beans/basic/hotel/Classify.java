/*
 * Classify.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2018-06-14 Created
 */
package com.jiabian.beans.basic.hotel;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 
 * 
 * @author 菠萝大象
 * @version 1.0 2018-06-14
 */
public class Classify implements Serializable {

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
     * 分类展示图
     */
    private String img;
    /**
     * 评分
     */
    private String score;
    /**
     * 评价
     */
    private Integer evaluate;
    /**
     * 描述
     */
    private String content;
    /**
     * 价格
     */
    private BigDecimal price;
    private static final long serialVersionUID = 1L;

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
    public String getImg() {
        return img;
    }
    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }
    public String getScore() {
        return score;
    }
    public void setScore(String score) {
        this.score = score == null ? null : score.trim();
    }
    public Integer getEvaluate() {
        return evaluate;
    }
    public void setEvaluate(Integer evaluate) {
        this.evaluate = evaluate;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
    public BigDecimal getPrice() {
        return price;
    }
    public void setPrice(BigDecimal price) {
        this.price = price;
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
        Classify other = (Classify) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getImg() == null ? other.getImg() == null : this.getImg().equals(other.getImg()))
            && (this.getScore() == null ? other.getScore() == null : this.getScore().equals(other.getScore()))
            && (this.getEvaluate() == null ? other.getEvaluate() == null : this.getEvaluate().equals(other.getEvaluate()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()));
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getImg() == null) ? 0 : getImg().hashCode());
        result = prime * result + ((getScore() == null) ? 0 : getScore().hashCode());
        result = prime * result + ((getEvaluate() == null) ? 0 : getEvaluate().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        return result;
    }
}