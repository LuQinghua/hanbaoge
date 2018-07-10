package com.jiabian.wankong.response;

import java.io.Serializable;
import java.util.Date;

import com.jiabian.base.BaseRes;

public class ResumeRes extends BaseRes implements Serializable  {
	private Long id;
    /**
     * 名字
     */
    private String name;
    /**
     * 年龄
     */
    private Integer age;
    /**
     * 电话
     */
    private String telephone;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 薪资
     */
    private String salary;
    /**
     * 介绍
     */
    private String content;
    /**
     * 依赖id
     */
    private Long rid;
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
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }
    public String getSalary() {
        return salary;
    }
    public void setSalary(String salary) {
        this.salary = salary == null ? null : salary.trim();
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
    public Long getRid() {
        return rid;
    }
    public void setRid(Long rid) {
        this.rid = rid;
    }
}
