package com.jiabian.hotel.response;

import java.io.Serializable;
import java.util.Date;

import com.jiabian.base.BaseRes;

public class HomeRes extends BaseRes implements Serializable  {
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
}
