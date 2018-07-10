package com.jiabian.wankong.request;

import java.io.Serializable;
import java.util.Date;

import com.jiabian.base.BaseReq;

public class RecruitReq extends BaseReq implements Serializable  {
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
}
