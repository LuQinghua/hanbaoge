/*
 * AfterSale.java
 * Copyright(C) 20xx-2015 xxxxxx鍏徃
 * All rights reserved.
 * -----------------------------------------------
 * 2018-06-11 Created
 */
package com.jiabian.beans.basic;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author 鑿犺悵澶ц薄
 * @version 1.0 2018-06-11
 */
public class AfterSale implements Serializable {

    private Long id;
    /**
     * 名称
     */
    private String name;
    /**
     * 编号
     */
    private String number;
    /**
     * 出厂时间
     */
    private String factoryTime;
    /**
     * 联系人
     */
    private String contacts;
    /**
     * 号码
     */
    private String telephone;
    /**
     * 问题
     */
    private String content;
    /**
     * 添加时间
     */
    private Date createTime;
    private Byte type;
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
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }
    public String getFactoryTime() {
        return factoryTime;
    }
    public void setFactoryTime(String factoryTime) {
        this.factoryTime = factoryTime == null ? null : factoryTime.trim();
    }
    public String getContacts() {
        return contacts;
    }
    public void setContacts(String contacts) {
        this.contacts = contacts == null ? null : contacts.trim();
    }
    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
    public Date getCreateTime() {
        return createTime;
    }
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    public Byte getType() {
        return type;
    }
    public void setType(Byte type) {
        this.type = type;
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
        AfterSale other = (AfterSale) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getNumber() == null ? other.getNumber() == null : this.getNumber().equals(other.getNumber()))
            && (this.getFactoryTime() == null ? other.getFactoryTime() == null : this.getFactoryTime().equals(other.getFactoryTime()))
            && (this.getContacts() == null ? other.getContacts() == null : this.getContacts().equals(other.getContacts()))
            && (this.getTelephone() == null ? other.getTelephone() == null : this.getTelephone().equals(other.getTelephone()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()));
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getNumber() == null) ? 0 : getNumber().hashCode());
        result = prime * result + ((getFactoryTime() == null) ? 0 : getFactoryTime().hashCode());
        result = prime * result + ((getContacts() == null) ? 0 : getContacts().hashCode());
        result = prime * result + ((getTelephone() == null) ? 0 : getTelephone().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        return result;
    }
}