/*
 * jkproduct.java
 * Copyright(C) 20xx-2015 xxxxxx鍏徃
 * All rights reserved.
 * -----------------------------------------------
 * 2017-05-31 Created
 */
package com.jiabian.beans.basic;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author 鑿犺悵澶ц薄
 * @version 1.0 2017-05-31
 */
public class jkproduct implements Serializable {

    /**
     * id
     */
    private Long id;
    /**
     * 商品名
     */
    private String imgName;
    /**
     * 分类名
     */
    private Byte classify;
    /**
     * 图片
     */
    private String img;
    /**
     * 风格
     */
    private Byte style;
    /**
     * 颜色
     */
    private Byte colour;
    /**
     * 材质
     */
    private Byte material;
    /**
     * 链接
     */
    private String url;
    /**
     * 添加时间
     */
    private Date creatTime;
    /**
     * 修改时间
     */
    private Date updateTime;
    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getImgName() {
        return imgName;
    }
    public void setImgName(String imgName) {
        this.imgName = imgName == null ? null : imgName.trim();
    }
    public Byte getClassify() {
        return classify;
    }
    public void setClassify(Byte classify) {
        this.classify = classify;
    }
    public String getImg() {
        return img;
    }
    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }
    public Byte getStyle() {
        return style;
    }
    public void setStyle(Byte style) {
        this.style = style;
    }
    public Byte getColour() {
        return colour;
    }
    public void setColour(Byte colour) {
        this.colour = colour;
    }
    public Byte getMaterial() {
        return material;
    }
    public void setMaterial(Byte material) {
        this.material = material;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }
    public Date getCreatTime() {
        return creatTime;
    }
    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }
    public Date getUpdateTime() {
        return updateTime;
    }
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
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
        jkproduct other = (jkproduct) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getImgName() == null ? other.getImgName() == null : this.getImgName().equals(other.getImgName()))
            && (this.getClassify() == null ? other.getClassify() == null : this.getClassify().equals(other.getClassify()))
            && (this.getImg() == null ? other.getImg() == null : this.getImg().equals(other.getImg()))
            && (this.getStyle() == null ? other.getStyle() == null : this.getStyle().equals(other.getStyle()))
            && (this.getColour() == null ? other.getColour() == null : this.getColour().equals(other.getColour()))
            && (this.getMaterial() == null ? other.getMaterial() == null : this.getMaterial().equals(other.getMaterial()))
            && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()))
            && (this.getCreatTime() == null ? other.getCreatTime() == null : this.getCreatTime().equals(other.getCreatTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getImgName() == null) ? 0 : getImgName().hashCode());
        result = prime * result + ((getClassify() == null) ? 0 : getClassify().hashCode());
        result = prime * result + ((getImg() == null) ? 0 : getImg().hashCode());
        result = prime * result + ((getStyle() == null) ? 0 : getStyle().hashCode());
        result = prime * result + ((getColour() == null) ? 0 : getColour().hashCode());
        result = prime * result + ((getMaterial() == null) ? 0 : getMaterial().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        result = prime * result + ((getCreatTime() == null) ? 0 : getCreatTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}