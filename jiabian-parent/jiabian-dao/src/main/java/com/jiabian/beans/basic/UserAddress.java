/*
 * UserAddress.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-12-06 Created
 */
package com.jiabian.beans.basic;

import java.io.Serializable;
import java.util.Date;

/**
 * 收货地址表
 * 
 * @author 菠萝大象
 * @version 1.0 2016-12-06
 */
public class UserAddress implements Serializable {

	private static final long serialVersionUID = 1L;
    /**
     * 编号
     */
    private Long id;
    /**
     * 收货人
     */
    private String receiver;
    /**
     * 用户编号
     */
    private Long userId;
    /**
     * 联系电话
     */
    private String telPhone;
    /**
     * 家庭电话
     */
    private String homeTel;
    /**
     * 所在地址
     */
    private String address;
    /**
     * 详细地址
     */
    private String addressInfo;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 邮政编码
     */
    private String postCode;
    /**
     * 地址别名
     */
    private String addNickName;
    /**
     * 备注
     */
    private String remark;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date updateTime;
    /**
     * 性别   （0:没有选 1先生 , 2女生）
     */
    private Byte gender;
    /**
     * 是否楼梯房  （0不是，1是）
     */
    private Byte isStair;
    /**
     * 地址标签  （0无，1公司，2家 ，3学校）
     */
    private Byte label;
    /**
     * 是否默认（1：关闭，2：开启）
     */
    private Byte isDefault;
    /**
     * 楼层号
     */
    private Integer floor;
    /**
     * 所属区域： 省
     */
    private Long province;
    /**
     * 所属区域： 市
     */
    private Long city;
    /**
     * 坐标
     */
    private String coordinate;
    /**
     * 所属区域： 区
     */
    private Long area;
    /**
     * 删除标记（1：正常，2：删除）
     */
    private Byte isDel;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getReceiver() {
        return receiver;
    }
    public void setReceiver(String receiver) {
        this.receiver = receiver == null ? null : receiver.trim();
    }
    public Long getUserId() {
        return userId;
    }
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    public String getTelPhone() {
        return telPhone;
    }
    public void setTelPhone(String telPhone) {
        this.telPhone = telPhone == null ? null : telPhone.trim();
    }
    public String getHomeTel() {
        return homeTel;
    }
    public void setHomeTel(String homeTel) {
        this.homeTel = homeTel == null ? null : homeTel.trim();
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }
    public String getAddressInfo() {
        return addressInfo;
    }
    public void setAddressInfo(String addressInfo) {
        this.addressInfo = addressInfo == null ? null : addressInfo.trim();
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }
    public String getPostCode() {
        return postCode;
    }
    public void setPostCode(String postCode) {
        this.postCode = postCode == null ? null : postCode.trim();
    }
    public String getAddNickName() {
        return addNickName;
    }
    public void setAddNickName(String addNickName) {
        this.addNickName = addNickName == null ? null : addNickName.trim();
    }
    public String getRemark() {
        return remark;
    }
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
    public Date getCreateTime() {
        return createTime;
    }
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    public Date getUpdateTime() {
        return updateTime;
    }
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    public Byte getGender() {
        return gender;
    }
    public void setGender(Byte gender) {
        this.gender = gender;
    }
    public Byte getIsStair() {
        return isStair;
    }
    public void setIsStair(Byte isStair) {
        this.isStair = isStair;
    }
    public Byte getLabel() {
        return label;
    }
    public void setLabel(Byte label) {
        this.label = label;
    }
    public Byte getIsDefault() {
        return isDefault;
    }
    public void setIsDefault(Byte isDefault) {
        this.isDefault = isDefault;
    }
    public Integer getFloor() {
        return floor;
    }
    public void setFloor(Integer floor) {
        this.floor = floor;
    }
    public Long getProvince() {
        return province;
    }
    public void setProvince(Long province) {
        this.province = province;
    }
    public Long getCity() {
        return city;
    }
    public void setCity(Long city) {
        this.city = city;
    }
    public String getCoordinate() {
        return coordinate;
    }
    public void setCoordinate(String coordinate) {
        this.coordinate = coordinate == null ? null : coordinate.trim();
    }
    public Long getArea() {
        return area;
    }
    public void setArea(Long area) {
        this.area = area;
    }
    public Byte getIsDel() {
        return isDel;
    }
    public void setIsDel(Byte isDel) {
        this.isDel = isDel;
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
        UserAddress other = (UserAddress) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getReceiver() == null ? other.getReceiver() == null : this.getReceiver().equals(other.getReceiver()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getTelPhone() == null ? other.getTelPhone() == null : this.getTelPhone().equals(other.getTelPhone()))
            && (this.getHomeTel() == null ? other.getHomeTel() == null : this.getHomeTel().equals(other.getHomeTel()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getAddressInfo() == null ? other.getAddressInfo() == null : this.getAddressInfo().equals(other.getAddressInfo()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getPostCode() == null ? other.getPostCode() == null : this.getPostCode().equals(other.getPostCode()))
            && (this.getAddNickName() == null ? other.getAddNickName() == null : this.getAddNickName().equals(other.getAddNickName()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getGender() == null ? other.getGender() == null : this.getGender().equals(other.getGender()))
            && (this.getIsStair() == null ? other.getIsStair() == null : this.getIsStair().equals(other.getIsStair()))
            && (this.getLabel() == null ? other.getLabel() == null : this.getLabel().equals(other.getLabel()))
            && (this.getIsDefault() == null ? other.getIsDefault() == null : this.getIsDefault().equals(other.getIsDefault()))
            && (this.getFloor() == null ? other.getFloor() == null : this.getFloor().equals(other.getFloor()))
            && (this.getProvince() == null ? other.getProvince() == null : this.getProvince().equals(other.getProvince()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getCoordinate() == null ? other.getCoordinate() == null : this.getCoordinate().equals(other.getCoordinate()))
            && (this.getArea() == null ? other.getArea() == null : this.getArea().equals(other.getArea()))
            && (this.getIsDel() == null ? other.getIsDel() == null : this.getIsDel().equals(other.getIsDel()));
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getReceiver() == null) ? 0 : getReceiver().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getTelPhone() == null) ? 0 : getTelPhone().hashCode());
        result = prime * result + ((getHomeTel() == null) ? 0 : getHomeTel().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getAddressInfo() == null) ? 0 : getAddressInfo().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getPostCode() == null) ? 0 : getPostCode().hashCode());
        result = prime * result + ((getAddNickName() == null) ? 0 : getAddNickName().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getGender() == null) ? 0 : getGender().hashCode());
        result = prime * result + ((getIsStair() == null) ? 0 : getIsStair().hashCode());
        result = prime * result + ((getLabel() == null) ? 0 : getLabel().hashCode());
        result = prime * result + ((getIsDefault() == null) ? 0 : getIsDefault().hashCode());
        result = prime * result + ((getFloor() == null) ? 0 : getFloor().hashCode());
        result = prime * result + ((getProvince() == null) ? 0 : getProvince().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getCoordinate() == null) ? 0 : getCoordinate().hashCode());
        result = prime * result + ((getArea() == null) ? 0 : getArea().hashCode());
        result = prime * result + ((getIsDel() == null) ? 0 : getIsDel().hashCode());
        return result;
    }
}