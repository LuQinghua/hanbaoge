/*
 * Comment.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2018-07-05 Created
 */
package com.jiabian.beans.basic.complaints;

import java.io.Serializable;
import java.util.Date;

/**
 * 评论表
 * 
 * @author 菠萝大象
 * @version 1.0 2018-07-05
 */
public class Comment implements Serializable {

    /**
     * 评论编号
     */
    private Long id;
    /**
     * 投诉单编号
     */
    private Long compid;
    /**
     * 用户编号
     */
    private Long userid;
    /**
     * 用户头像
     */
    private String img;
    /**
     * 用户名
     */
    private String username;
    /**
     * 评论内容
     */
    private String comment;
    /**
     * 评论时间
     */
    private Date time;
    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getCompid() {
        return compid;
    }
    public void setCompid(Long compid) {
        this.compid = compid;
    }
    public Long getUserid() {
        return userid;
    }
    public void setUserid(Long userid) {
        this.userid = userid;
    }
    public String getImg() {
        return img;
    }
    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }
    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }
    public Date getTime() {
        return time;
    }
    public void setTime(Date time) {
        this.time = time;
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
        Comment other = (Comment) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCompid() == null ? other.getCompid() == null : this.getCompid().equals(other.getCompid()))
            && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getImg() == null ? other.getImg() == null : this.getImg().equals(other.getImg()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getComment() == null ? other.getComment() == null : this.getComment().equals(other.getComment()))
            && (this.getTime() == null ? other.getTime() == null : this.getTime().equals(other.getTime()));
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCompid() == null) ? 0 : getCompid().hashCode());
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getImg() == null) ? 0 : getImg().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getComment() == null) ? 0 : getComment().hashCode());
        result = prime * result + ((getTime() == null) ? 0 : getTime().hashCode());
        return result;
    }
}