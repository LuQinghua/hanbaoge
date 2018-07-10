/*
 * SysApplication.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-12-05 Created
 */
package com.jiabian.hotel.request;

import java.io.Serializable;
import com.jiabian.base.BaseReq;

/**
 * 
 * 
 * @author 菠萝大象
 * @version 1.0 2016-12-05
 */
public class UserReq extends BaseReq implements Serializable {

	private static final long serialVersionUID = 1L;

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
		this.img = img;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getTelephone() {
		return telephone;
	}
	
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	public String getOpenId() {
		return openId;
	}
	
	public void setOpenId(String openId) {
		this.openId = openId;
	}

}