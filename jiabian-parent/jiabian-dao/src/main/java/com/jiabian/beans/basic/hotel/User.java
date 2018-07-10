/*
 * User.java
 * Copyright(C) 20xx-2015 xxxxxx鍏徃
 * All rights reserved.
 * -----------------------------------------------
 * 2018-06-12 Created
 */
package com.jiabian.beans.basic.hotel;

import java.io.Serializable;

/**
 * 用户表
 * 
 * @author 鑿犺悵澶ц薄
 * @version 1.0 2018-06-12
 */
public class User implements Serializable {

    /**
     * 用户编号
     */
    private Integer id;
    /**
     * 头像
     */
    private String img;
    /**
     * 账号
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * 电话
     */
    private String telephone;
    /**
     * 用户openId
     */
    private String openId;
    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
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
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }
    public String getOpenId() {
        return openId;
    }
    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
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
        User other = (User) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getImg() == null ? other.getImg() == null : this.getImg().equals(other.getImg()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getTelephone() == null ? other.getTelephone() == null : this.getTelephone().equals(other.getTelephone()))
            && (this.getOpenId() == null ? other.getOpenId() == null : this.getOpenId().equals(other.getOpenId()));
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getImg() == null) ? 0 : getImg().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getTelephone() == null) ? 0 : getTelephone().hashCode());
        result = prime * result + ((getOpenId() == null) ? 0 : getOpenId().hashCode());
        return result;
    }
}