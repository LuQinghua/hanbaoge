package com.jiabian.wankong.response;

import java.io.Serializable;
import java.util.Date;

import com.jiabian.base.BaseRes;

public class CompanyprofileRes extends BaseRes implements Serializable  {
    private Long id;
    /**
     * 图片
     */
    private String img;
    /**
     * 标题
     */
    private String title;
    /**
     * 内容
     */
    private String content;
    /**
     * 1.联系我们  2. 关于我们
     */
    private Byte type;
    /**
     * 合作专线
     */
    private String cooperativeline;
    /**
     * 销售负责人
     */
    private String sale;
    /**
     * 销售负责人号码
     */
    private String telephoneXS;
    /**
     * 短号
     */
    private String shortTelephone;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 传真
     */
    private String fax;
    /**
     * 技术负责人
     */
    private String technology;
    /**
     * 技术号码
     */
    private String telephoneJS;
    /**
     * 售后负责人
     */
    private String afterSale;
    /**
     * 售后
     */
    private String telephoneSH;
    /**
     * 地址
     */
    private String address;
    /**
     * 添加时间
     */
    private Date createTime;
    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getImg() {
        return img;
    }
    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
    public Byte getType() {
        return type;
    }
    public void setType(Byte type) {
        this.type = type;
    }
    public String getCooperativeline() {
        return cooperativeline;
    }
    public void setCooperativeline(String cooperativeline) {
        this.cooperativeline = cooperativeline == null ? null : cooperativeline.trim();
    }
    public String getSale() {
        return sale;
    }
    public void setSale(String sale) {
        this.sale = sale == null ? null : sale.trim();
    }
    public String getTelephoneXS() {
        return telephoneXS;
    }
    public void setTelephoneXS(String telephoneXS) {
        this.telephoneXS = telephoneXS == null ? null : telephoneXS.trim();
    }
    public String getShortTelephone() {
        return shortTelephone;
    }
    public void setShortTelephone(String shortTelephone) {
        this.shortTelephone = shortTelephone == null ? null : shortTelephone.trim();
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }
    public String getFax() {
        return fax;
    }
    public void setFax(String fax) {
        this.fax = fax == null ? null : fax.trim();
    }
    public String getTechnology() {
        return technology;
    }
    public void setTechnology(String technology) {
        this.technology = technology == null ? null : technology.trim();
    }
    public String getTelephoneJS() {
        return telephoneJS;
    }
    public void setTelephoneJS(String telephoneJS) {
        this.telephoneJS = telephoneJS == null ? null : telephoneJS.trim();
    }
    public String getAfterSale() {
        return afterSale;
    }
    public void setAfterSale(String afterSale) {
        this.afterSale = afterSale == null ? null : afterSale.trim();
    }
    public String getTelephoneSH() {
        return telephoneSH;
    }
    public void setTelephoneSH(String telephoneSH) {
        this.telephoneSH = telephoneSH == null ? null : telephoneSH.trim();
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }
    public Date getCreateTime() {
        return createTime;
    }
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
