/*
 * Recruit.java
 * Copyright(C) 20xx-2015 xxxxxx鍏徃
 * All rights reserved.
 * -----------------------------------------------
 * 2018-06-04 Created
 */
package com.jiabian.beans.basic;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author 鑿犺悵澶ц薄
 * @version 1.0 2018-06-04
 */
public class Recruit implements Serializable {

    private Long id;
    /**
     * 名称
     */
    private String title;
    /**
     * 要求
     */
    private String requirement;
    /**
     * 职责
     */
    private String duty;
    /**
     * 时间
     */
    private Date createTime;
    /**
     * 学历
     */
    private String education;
    /**
     * 人数
     */
    private String number;
    /**
     * 薪资
     */
    private String salary;
    /**
     * 地点
     */
    private String place;
    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }
    public String getRequirement() {
        return requirement;
    }
    public void setRequirement(String requirement) {
        this.requirement = requirement == null ? null : requirement.trim();
    }
    public String getDuty() {
        return duty;
    }
    public void setDuty(String duty) {
        this.duty = duty == null ? null : duty.trim();
    }
    public Date getCreateTime() {
        return createTime;
    }
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    public String getEducation() {
        return education;
    }
    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }
    public String getSalary() {
        return salary;
    }
    public void setSalary(String salary) {
        this.salary = salary == null ? null : salary.trim();
    }
    public String getPlace() {
        return place;
    }
    public void setPlace(String place) {
        this.place = place == null ? null : place.trim();
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
        Recruit other = (Recruit) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getRequirement() == null ? other.getRequirement() == null : this.getRequirement().equals(other.getRequirement()))
            && (this.getDuty() == null ? other.getDuty() == null : this.getDuty().equals(other.getDuty()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getEducation() == null ? other.getEducation() == null : this.getEducation().equals(other.getEducation()))
            && (this.getNumber() == null ? other.getNumber() == null : this.getNumber().equals(other.getNumber()))
            && (this.getSalary() == null ? other.getSalary() == null : this.getSalary().equals(other.getSalary()))
            && (this.getPlace() == null ? other.getPlace() == null : this.getPlace().equals(other.getPlace()));
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getRequirement() == null) ? 0 : getRequirement().hashCode());
        result = prime * result + ((getDuty() == null) ? 0 : getDuty().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getEducation() == null) ? 0 : getEducation().hashCode());
        result = prime * result + ((getNumber() == null) ? 0 : getNumber().hashCode());
        result = prime * result + ((getSalary() == null) ? 0 : getSalary().hashCode());
        result = prime * result + ((getPlace() == null) ? 0 : getPlace().hashCode());
        return result;
    }
}