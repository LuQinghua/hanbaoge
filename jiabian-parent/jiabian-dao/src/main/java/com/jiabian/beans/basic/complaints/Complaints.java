/*
 * Complaints.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2018-07-06 Created
 */
package com.jiabian.beans.basic.complaints;

import java.io.Serializable;
import java.util.Date;

/**
 * 投诉表
 * 
 * @author 菠萝大象
 * @version 1.0 2018-07-06
 */
public class Complaints implements Serializable {

    /**
     * 投诉编号
     */
    private Long id;
    /**
     * 投诉人编号
     */
    private Long userid;
    /**
     * 被投诉对象
     */
    private String compName;
    /**
     * 投诉事由： 1、款项问题 2、事故问题 3、品质问题 4、盗图问题 5、其他问题
     */
    private Byte reason;
    /**
     * 事情经过
     */
    private String details;
    /**
     * 投诉凭证
     */
    private String img;
    /**
     * 投诉人
     */
    private String name;
    /**
     * 身份证号
     */
    private String idcard;
    /**
     * 电话
     */
    private String telephone;
    /**
     * 投诉人公司
     */
    private String company;
    /**
     * 投诉时间
     */
    private Date time;
    /**
     * 审核状态：1、待审核 2、审核通过 3、审核未通过 
     */
    private Byte status;
    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getUserid() {
        return userid;
    }
    public void setUserid(Long userid) {
        this.userid = userid;
    }
    public String getCompName() {
        return compName;
    }
    public void setCompName(String compName) {
        this.compName = compName == null ? null : compName.trim();
    }
    public Byte getReason() {
        return reason;
    }
    public void setReason(Byte reason) {
        this.reason = reason;
    }
    public String getDetails() {
        return details;
    }
    public void setDetails(String details) {
        this.details = details == null ? null : details.trim();
    }
    public String getImg() {
        return img;
    }
    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
    public String getIdcard() {
        return idcard;
    }
    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }
    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }
    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }
    public Date getTime() {
        return time;
    }
    public void setTime(Date time) {
        this.time = time;
    }
    public Byte getStatus() {
        return status;
    }
    public void setStatus(Byte status) {
        this.status = status;
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
        Complaints other = (Complaints) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getCompName() == null ? other.getCompName() == null : this.getCompName().equals(other.getCompName()))
            && (this.getReason() == null ? other.getReason() == null : this.getReason().equals(other.getReason()))
            && (this.getDetails() == null ? other.getDetails() == null : this.getDetails().equals(other.getDetails()))
            && (this.getImg() == null ? other.getImg() == null : this.getImg().equals(other.getImg()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getIdcard() == null ? other.getIdcard() == null : this.getIdcard().equals(other.getIdcard()))
            && (this.getTelephone() == null ? other.getTelephone() == null : this.getTelephone().equals(other.getTelephone()))
            && (this.getCompany() == null ? other.getCompany() == null : this.getCompany().equals(other.getCompany()))
            && (this.getTime() == null ? other.getTime() == null : this.getTime().equals(other.getTime()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getCompName() == null) ? 0 : getCompName().hashCode());
        result = prime * result + ((getReason() == null) ? 0 : getReason().hashCode());
        result = prime * result + ((getDetails() == null) ? 0 : getDetails().hashCode());
        result = prime * result + ((getImg() == null) ? 0 : getImg().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getIdcard() == null) ? 0 : getIdcard().hashCode());
        result = prime * result + ((getTelephone() == null) ? 0 : getTelephone().hashCode());
        result = prime * result + ((getCompany() == null) ? 0 : getCompany().hashCode());
        result = prime * result + ((getTime() == null) ? 0 : getTime().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }
}