package com.jiabian.tspt.response;

import java.io.Serializable;
import java.util.Date;

import com.jiabian.base.BaseRes;

public class ComplaintsRes extends BaseRes implements Serializable {

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
	
}
