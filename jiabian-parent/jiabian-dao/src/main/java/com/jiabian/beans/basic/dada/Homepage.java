/*
 * Homepage.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2018-06-27 Created
 */
package com.jiabian.beans.basic.dada;

import java.io.Serializable;

/**
 * 首页表
 * 
 * @author 菠萝大象
 * @version 1.0 2018-06-27
 */
public class Homepage implements Serializable {

    /**
     * 编号
     */
    private Integer id;
    /**
     * 首页图片
     */
    private String imgs;
    /**
     * 图片链接地址
     */
    private String url;
    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getImgs() {
        return imgs;
    }
    public void setImgs(String imgs) {
        this.imgs = imgs == null ? null : imgs.trim();
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
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
        Homepage other = (Homepage) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getImgs() == null ? other.getImgs() == null : this.getImgs().equals(other.getImgs()))
            && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()));
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getImgs() == null) ? 0 : getImgs().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        return result;
    }
}