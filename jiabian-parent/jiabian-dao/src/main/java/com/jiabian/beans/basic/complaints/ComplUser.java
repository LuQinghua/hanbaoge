/*
 * ComplUser.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2018-07-05 Created
 */
package com.jiabian.beans.basic.complaints;

import java.io.Serializable;

/**
 * 用户表
 * 
 * @author 菠萝大象
 * @version 1.0 2018-07-05
 */
public class ComplUser implements Serializable {

    /**
     * 用户编号
     */
    private Long id;
    /**
     * 用户名
     */
    private String username;
    /**
     * 头像
     */
    private String img;
    /**
     * openid
     */
    private String openid;
    /**
     * 真实姓名
     */
    private String realname;
    /**
     * 联系方式
     */
    private String telephone;
    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }
    public String getImg() {
        return img;
    }
    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }
    public String getOpenid() {
        return openid;
    }
    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }
    public String getRealname() {
        return realname;
    }
    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }
    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
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
        ComplUser other = (ComplUser) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getImg() == null ? other.getImg() == null : this.getImg().equals(other.getImg()))
            && (this.getOpenid() == null ? other.getOpenid() == null : this.getOpenid().equals(other.getOpenid()))
            && (this.getRealname() == null ? other.getRealname() == null : this.getRealname().equals(other.getRealname()))
            && (this.getTelephone() == null ? other.getTelephone() == null : this.getTelephone().equals(other.getTelephone()));
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getImg() == null) ? 0 : getImg().hashCode());
        result = prime * result + ((getOpenid() == null) ? 0 : getOpenid().hashCode());
        result = prime * result + ((getRealname() == null) ? 0 : getRealname().hashCode());
        result = prime * result + ((getTelephone() == null) ? 0 : getTelephone().hashCode());
        return result;
    }
}