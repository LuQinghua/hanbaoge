/*
 * UserDetail.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2017-04-18 Created
 */
package com.jiabian.beans.basic;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户详情表
 * 
 * @author 菠萝大象
 * @version 1.0 2017-04-18
 */
public class UserDetail implements Serializable {

    /**
     * 编号
     */
    private Long id;
    /**
     * 用户id
     */
    private Long userId;
    /**
     * 真实姓名
     */
    private String realName;
    /**
     * 身份证号
     */
    private String idCard;
    /**
     * 地址
     */
    private String address;
    /**
     * 出生日期
     */
    private Date birthday;
    /**
     * 兴趣爱好
     */
    private String hobby;
    /**
     * 用户头像
     */
    private String userImg;
    /**
     * 家边通宝
     */
    private Integer integral;
    /**
     * 购物次数
     */
    private Integer shoppingNum;
    /**
     * 成长值
     */
    private Integer growthVal;
    /**
     * 手机号码验证状态（1：未验证，2：已验证）
     */
    private Byte phoneVer;
    /**
     * 邮箱验证状态（1：未验证，2：已验证）
     */
    private Byte emailVer;
    /**
     * 身份认证状态（1：未认证，2：已认证）
     */
    private Byte idVer;
    /**
     * 密保验证状态（1：未设置，2：已设置）
     */
    private Byte securityType;
    /**
     * 设备号
     */
    private String device;
    /**
     * 删除标识（1：正常，2：删除）
     */
    private Byte isDel;
    /**
     * 来源
     */
    private String source;
    /**
     * QQ返回的openId
     */
    private String qqopenId;
    /**
     * 微信返回的openId
     */
    private String weixinopenId;
    /**
     * 微博返回的openId
     */
    private String weiboopenId;
    /**
     * 书签
     */
    private Integer bookMark;
    private Byte grade;
    /**
     * 快乐学习等级（1：班委，2：班长，3：辅导员）
     */
    private Byte rank;
    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getUserId() {
        return userId;
    }
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    public String getRealName() {
        return realName;
    }
    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }
    public String getIdCard() {
        return idCard;
    }
    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }
    public Date getBirthday() {
        return birthday;
    }
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    public String getHobby() {
        return hobby;
    }
    public void setHobby(String hobby) {
        this.hobby = hobby == null ? null : hobby.trim();
    }
    public String getUserImg() {
        return userImg;
    }
    public void setUserImg(String userImg) {
        this.userImg = userImg == null ? null : userImg.trim();
    }
    public Integer getIntegral() {
        return integral;
    }
    public void setIntegral(Integer integral) {
        this.integral = integral;
    }
    public Integer getShoppingNum() {
        return shoppingNum;
    }
    public void setShoppingNum(Integer shoppingNum) {
        this.shoppingNum = shoppingNum;
    }
    public Integer getGrowthVal() {
        return growthVal;
    }
    public void setGrowthVal(Integer growthVal) {
        this.growthVal = growthVal;
    }
    public Byte getPhoneVer() {
        return phoneVer;
    }
    public void setPhoneVer(Byte phoneVer) {
        this.phoneVer = phoneVer;
    }
    public Byte getEmailVer() {
        return emailVer;
    }
    public void setEmailVer(Byte emailVer) {
        this.emailVer = emailVer;
    }
    public Byte getIdVer() {
        return idVer;
    }
    public void setIdVer(Byte idVer) {
        this.idVer = idVer;
    }
    public Byte getSecurityType() {
        return securityType;
    }
    public void setSecurityType(Byte securityType) {
        this.securityType = securityType;
    }
    public String getDevice() {
        return device;
    }
    public void setDevice(String device) {
        this.device = device == null ? null : device.trim();
    }
    public Byte getIsDel() {
        return isDel;
    }
    public void setIsDel(Byte isDel) {
        this.isDel = isDel;
    }
    public String getSource() {
        return source;
    }
    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }
    public String getQqopenId() {
        return qqopenId;
    }
    public void setQqopenId(String qqopenId) {
        this.qqopenId = qqopenId == null ? null : qqopenId.trim();
    }
    public String getWeixinopenId() {
        return weixinopenId;
    }
    public void setWeixinopenId(String weixinopenId) {
        this.weixinopenId = weixinopenId == null ? null : weixinopenId.trim();
    }
    public String getWeiboopenId() {
        return weiboopenId;
    }
    public void setWeiboopenId(String weiboopenId) {
        this.weiboopenId = weiboopenId == null ? null : weiboopenId.trim();
    }
    public Integer getBookMark() {
        return bookMark;
    }
    public void setBookMark(Integer bookMark) {
        this.bookMark = bookMark;
    }
    public Byte getGrade() {
        return grade;
    }
    public void setGrade(Byte grade) {
        this.grade = grade;
    }
    public Byte getRank() {
        return rank;
    }
    public void setRank(Byte rank) {
        this.rank = rank;
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
        UserDetail other = (UserDetail) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getRealName() == null ? other.getRealName() == null : this.getRealName().equals(other.getRealName()))
            && (this.getIdCard() == null ? other.getIdCard() == null : this.getIdCard().equals(other.getIdCard()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getBirthday() == null ? other.getBirthday() == null : this.getBirthday().equals(other.getBirthday()))
            && (this.getHobby() == null ? other.getHobby() == null : this.getHobby().equals(other.getHobby()))
            && (this.getUserImg() == null ? other.getUserImg() == null : this.getUserImg().equals(other.getUserImg()))
            && (this.getIntegral() == null ? other.getIntegral() == null : this.getIntegral().equals(other.getIntegral()))
            && (this.getShoppingNum() == null ? other.getShoppingNum() == null : this.getShoppingNum().equals(other.getShoppingNum()))
            && (this.getGrowthVal() == null ? other.getGrowthVal() == null : this.getGrowthVal().equals(other.getGrowthVal()))
            && (this.getPhoneVer() == null ? other.getPhoneVer() == null : this.getPhoneVer().equals(other.getPhoneVer()))
            && (this.getEmailVer() == null ? other.getEmailVer() == null : this.getEmailVer().equals(other.getEmailVer()))
            && (this.getIdVer() == null ? other.getIdVer() == null : this.getIdVer().equals(other.getIdVer()))
            && (this.getSecurityType() == null ? other.getSecurityType() == null : this.getSecurityType().equals(other.getSecurityType()))
            && (this.getDevice() == null ? other.getDevice() == null : this.getDevice().equals(other.getDevice()))
            && (this.getIsDel() == null ? other.getIsDel() == null : this.getIsDel().equals(other.getIsDel()))
            && (this.getSource() == null ? other.getSource() == null : this.getSource().equals(other.getSource()))
            && (this.getQqopenId() == null ? other.getQqopenId() == null : this.getQqopenId().equals(other.getQqopenId()))
            && (this.getWeixinopenId() == null ? other.getWeixinopenId() == null : this.getWeixinopenId().equals(other.getWeixinopenId()))
            && (this.getWeiboopenId() == null ? other.getWeiboopenId() == null : this.getWeiboopenId().equals(other.getWeiboopenId()))
            && (this.getBookMark() == null ? other.getBookMark() == null : this.getBookMark().equals(other.getBookMark()))
            && (this.getGrade() == null ? other.getGrade() == null : this.getGrade().equals(other.getGrade()))
            && (this.getRank() == null ? other.getRank() == null : this.getRank().equals(other.getRank()));
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getRealName() == null) ? 0 : getRealName().hashCode());
        result = prime * result + ((getIdCard() == null) ? 0 : getIdCard().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getBirthday() == null) ? 0 : getBirthday().hashCode());
        result = prime * result + ((getHobby() == null) ? 0 : getHobby().hashCode());
        result = prime * result + ((getUserImg() == null) ? 0 : getUserImg().hashCode());
        result = prime * result + ((getIntegral() == null) ? 0 : getIntegral().hashCode());
        result = prime * result + ((getShoppingNum() == null) ? 0 : getShoppingNum().hashCode());
        result = prime * result + ((getGrowthVal() == null) ? 0 : getGrowthVal().hashCode());
        result = prime * result + ((getPhoneVer() == null) ? 0 : getPhoneVer().hashCode());
        result = prime * result + ((getEmailVer() == null) ? 0 : getEmailVer().hashCode());
        result = prime * result + ((getIdVer() == null) ? 0 : getIdVer().hashCode());
        result = prime * result + ((getSecurityType() == null) ? 0 : getSecurityType().hashCode());
        result = prime * result + ((getDevice() == null) ? 0 : getDevice().hashCode());
        result = prime * result + ((getIsDel() == null) ? 0 : getIsDel().hashCode());
        result = prime * result + ((getSource() == null) ? 0 : getSource().hashCode());
        result = prime * result + ((getQqopenId() == null) ? 0 : getQqopenId().hashCode());
        result = prime * result + ((getWeixinopenId() == null) ? 0 : getWeixinopenId().hashCode());
        result = prime * result + ((getWeiboopenId() == null) ? 0 : getWeiboopenId().hashCode());
        result = prime * result + ((getBookMark() == null) ? 0 : getBookMark().hashCode());
        result = prime * result + ((getGrade() == null) ? 0 : getGrade().hashCode());
        result = prime * result + ((getRank() == null) ? 0 : getRank().hashCode());
        return result;
    }
}