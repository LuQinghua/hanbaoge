package com.jiabian.wankong.request;

import java.util.Date;

import com.jiabian.base.BaseReq;
import com.jiabian.base.io.request.IRequest;

public class InvestigationReq extends BaseReq implements IRequest{

	private Long id;
    /**
     * 公司名
     */
    private String companyName;
    /**
     * 地址
     */
    private String address;
    /**
     * 姓名
     */
    private String name;
    /**
     * 电话
     */
    private String telephone;
    /**
     * 型号
     */
    private String model;
    /**
     * 1.满意 2.一般 2.不满意
     */
    private Byte quality;
    /**
     * 1.满意 2.一般 2.不满意
     */
    private Byte price;
    /**
     * 1.满意 2.一般 2.不满意
     */
    private Byte packing;
    /**
     * 1.满意 2.一般 2.不满意
     */
    private Byte guarantee;
    /**
     * 内容
     */
    private String content;
    /**
     * 时间
     */
    private Date createTime;
    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
    }
    public Byte getQuality() {
        return quality;
    }
    public void setQuality(Byte quality) {
        this.quality = quality;
    }
    public Byte getPrice() {
        return price;
    }
    public void setPrice(Byte price) {
        this.price = price;
    }
    public Byte getPacking() {
        return packing;
    }
    public void setPacking(Byte packing) {
        this.packing = packing;
    }
    public Byte getGuarantee() {
        return guarantee;
    }
    public void setGuarantee(Byte guarantee) {
        this.guarantee = guarantee;
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
}
