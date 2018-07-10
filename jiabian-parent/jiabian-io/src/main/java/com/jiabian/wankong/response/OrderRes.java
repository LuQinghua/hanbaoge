package com.jiabian.wankong.response;

import java.io.Serializable;
import java.util.Date;

import com.jiabian.base.BaseRes;

public class OrderRes extends BaseRes implements Serializable  {
	private Long id;
    /**
     * 名称
     */
    private String name;
    /**
     * 订单号
     */
    private String number;
    /**
     * 类型
     */
    private Byte type;
    /**
     * 时间
     */
    private Date createTime;
    /**
     * 订单状态
     */
    private String content;
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
    public Byte getType() {
        return type;
    }
    public void setType(Byte type) {
        this.type = type;
    }
    public Date getCreateTime() {
        return createTime;
    }
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}
