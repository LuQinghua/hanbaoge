package com.jiabian.wankong.response;

import java.io.Serializable;
import java.util.Date;

import com.jiabian.base.BaseRes;

public class AfterSaleRes extends BaseRes implements Serializable  {
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
        this.telephone = telephone;
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
}
