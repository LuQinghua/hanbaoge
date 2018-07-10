/*
 * Home.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2018-06-14 Created
 */
package com.jiabian.beans.basic.hotel;

import java.io.Serializable;
import java.util.Date;

/**
 * 房型表
 * 
 * @author 菠萝大象
 * @version 1.0 2018-06-14
 */
public class Home implements Serializable {

    /**
     * 房子编号
     */
    private Integer id;
    /**
     * 房子名称
     */
    private String name;
    /**
     * 价格
     */
    private Double price;
    /**
     * 发布时间
     */
    private Date time;
    /**
     * 简介
     */
    private String introduce;
    /**
     * 展示图
     */
    private String img;
    /**
     * 依赖id
     */
    private Long classifyId;
    /**
     * 可住人数
     */
    private Integer peopleNumber;
    /**
     * 面积
     */
    private String area;
    /**
     * 有无窗户  1.有  2.无
     */
    private Byte type;
    /**
     * 有无早餐  1.有 2.无
     */
    private Byte breakfast;
    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public Date getTime() {
        return time;
    }
    public void setTime(Date time) {
        this.time = time;
    }
    public String getIntroduce() {
        return introduce;
    }
    public void setIntroduce(String introduce) {
        this.introduce = introduce == null ? null : introduce.trim();
    }
    public String getImg() {
        return img;
    }
    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }
    public Long getClassifyId() {
        return classifyId;
    }
    public void setClassifyId(Long classifyId) {
        this.classifyId = classifyId;
    }
    public Integer getPeopleNumber() {
        return peopleNumber;
    }
    public void setPeopleNumber(Integer peopleNumber) {
        this.peopleNumber = peopleNumber;
    }
    public String getArea() {
        return area;
    }
    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }
    public Byte getType() {
        return type;
    }
    public void setType(Byte type) {
        this.type = type;
    }
    public Byte getBreakfast() {
        return breakfast;
    }
    public void setBreakfast(Byte breakfast) {
        this.breakfast = breakfast;
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
        Home other = (Home) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getTime() == null ? other.getTime() == null : this.getTime().equals(other.getTime()))
            && (this.getIntroduce() == null ? other.getIntroduce() == null : this.getIntroduce().equals(other.getIntroduce()))
            && (this.getImg() == null ? other.getImg() == null : this.getImg().equals(other.getImg()))
            && (this.getClassifyId() == null ? other.getClassifyId() == null : this.getClassifyId().equals(other.getClassifyId()))
            && (this.getPeopleNumber() == null ? other.getPeopleNumber() == null : this.getPeopleNumber().equals(other.getPeopleNumber()))
            && (this.getArea() == null ? other.getArea() == null : this.getArea().equals(other.getArea()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getBreakfast() == null ? other.getBreakfast() == null : this.getBreakfast().equals(other.getBreakfast()));
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getTime() == null) ? 0 : getTime().hashCode());
        result = prime * result + ((getIntroduce() == null) ? 0 : getIntroduce().hashCode());
        result = prime * result + ((getImg() == null) ? 0 : getImg().hashCode());
        result = prime * result + ((getClassifyId() == null) ? 0 : getClassifyId().hashCode());
        result = prime * result + ((getPeopleNumber() == null) ? 0 : getPeopleNumber().hashCode());
        result = prime * result + ((getArea() == null) ? 0 : getArea().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getBreakfast() == null) ? 0 : getBreakfast().hashCode());
        return result;
    }
}