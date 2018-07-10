package com.jiabian.tspt.response;

import java.io.Serializable;

import com.jiabian.base.BaseRes;

public class ComplUserRes extends BaseRes implements Serializable {

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
	
}
