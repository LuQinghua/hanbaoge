/*
 * Resume.java
 * Copyright(C) 20xx-2015 xxxxxx鍏徃
 * All rights reserved.
 * -----------------------------------------------
 * 2018-06-04 Created
 */
package com.jiabian.beans.basic;

import java.io.Serializable;

/**
 * 
 * 
 * @author 鑿犺悵澶ц薄
 * @version 1.0 2018-06-04
 */
public class Resume implements Serializable {

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
        Resume other = (Resume) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getAge() == null ? other.getAge() == null : this.getAge().equals(other.getAge()))
            && (this.getTelephone() == null ? other.getTelephone() == null : this.getTelephone().equals(other.getTelephone()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getSalary() == null ? other.getSalary() == null : this.getSalary().equals(other.getSalary()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getRid() == null ? other.getRid() == null : this.getRid().equals(other.getRid()));
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getAge() == null) ? 0 : getAge().hashCode());
        result = prime * result + ((getTelephone() == null) ? 0 : getTelephone().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getSalary() == null) ? 0 : getSalary().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getRid() == null) ? 0 : getRid().hashCode());
        return result;
    }
}