/*
 * Equipment.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2018-06-14 Created
 */
package com.jiabian.beans.basic.hotel;

import java.io.Serializable;

/**
 * 
 * 
 * @author 菠萝大象
 * @version 1.0 2018-06-14
 */
public class Equipment implements Serializable {

    private Long id;
    /**
     * 设备名
     */
    private String name;
    /**
     * 依赖id
     */
    private Long classifyId;
    /**
     * 依赖房型
     */
    private Classify classify;
    
    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
    public Long getClassifyId() {
        return classifyId;
    }
    public void setClassifyId(Long classifyId) {
        this.classifyId = classifyId;
    }
    public Classify getClassify() {
		return classify;
	}
	public void setClassify(Classify classify) {
		this.classify = classify;
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
        Equipment other = (Equipment) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getClassify() == null ? other.getClassify() == null : this.getClassify().equals(other.getClassify()))
            && (this.getClassifyId() == null ? other.getClassifyId() == null : this.getClassifyId().equals(other.getClassifyId()));
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getClassifyId() == null) ? 0 : getClassifyId().hashCode());
        result = prime * result + ((getClassify() == null) ? 0 : getClassify().hashCode());
        return result;
    }
}