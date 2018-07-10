/*
 * UserCard.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2017-04-12 Created
 */
package com.jiabian.usercard.response;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * 
 * 
 * @author 菠萝大象
 * @version 1.0 2017-04-12
 */
@SuppressWarnings("deprecation")
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class OrderRes implements Serializable {

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
}