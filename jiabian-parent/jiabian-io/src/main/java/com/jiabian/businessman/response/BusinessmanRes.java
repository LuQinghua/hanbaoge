package com.jiabian.businessman.response;

import java.io.Serializable;
import java.util.Date;

public class BusinessmanRes implements Serializable{
	private static final long serialVersionUID = 1L;
	/**
     * 商家编号
     */
    private Long id;
    /**
     * 名称
     */
    private String busName;
    /**
     * 用户id
     */
    private Long userId;
    /**
     * 商家账户
     */
    private String busAccount;
    /**
     * 联系电话
     */
    private String busTel;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 联系地址
     */
    private String address;
    /**
     * 营业执照
     */
    private String license;
    /**
     * 备注
     */
    private String remark;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date updateTime;
    /**
     * 账户状态（1：待审 ，2：审核 ，3：通过，4：驳回）
     */
    private Byte busStatus;
    /**
     * 账户状态（1：正常 ，2：删除，3：强制下架）
     */
    private Byte isDel;
    /**
     * 商家类型书画（1:商家.2:名家,3:企业）  / 商超 （  4. 直营；5.普通）
     */
    private Byte busType;
    /**
     * 作者姓名
     */
    private String authName;
    /**
     * 作者简介
     */
    private String authSynopsis;
    /**
     * 个人履历
     */
    private String authProfile;
    /**
     * 名家照片
     */
    private String authImg;
    /**
     * 作家状态
     */
    private Byte authStatus;
    /**
     * 作家类型（1：现代，2：近现代）
     */
    private Byte authType;
    
    /**
     * 商家规模（商家线下规模）
     */
    private String businessScale;
    /**
     * 营业执照照片
     */
    private String licenseImg;
    /**
     * 商家形象图
     */
    private String busImg;
    /**
     * 企业名称
     */
    private String enterprise;
    /**
     * 法定代表人姓名
     */
    private String corporateName;
    /**
     * 法定代表人身份证号码
     */
    private Long corporateIdentityCard;
    /**
     * 法定代表人身份证照片（正反2张）
     */
    private String corporateIdentityCardImg;
    /**
     * 公司联系人
     */
    private String companyContacts;
    /**
     * 公司联系人电话
     */
    private Long companyTel;
    /**
     * 银行开户人名
     */
    private String openBankName;
    /**
     * 银行账户
     */
    private String bankId;
    /**
     * 开户银行支行名称
     */
    private String bankName;
    /**
     * 开户银行地址
     */
    private String bankAddress;
    /**
     * 资质证书
     */
    private String qualificationImg;
    /**
     * 名家头衔
     */
    private String authTitle;
    /**
     * 名家所得奖项
     */
    private String authAwards;
    /**
     * 商家留言
     */
    private String leaveMessage;  
    /**
     * 店铺名称
     */
    private String shopName;
    /**
     * 商家id
     */
    private Long busId;
    /**
     * 父级店铺id
     */
    private Long parentShopId;
    /**
     * 店铺类型id
     */
    private Long shoptId;
    /**
     * 店铺图片
     */
    private String shopImg;
    /**
     * 店铺状态（1:待审核，2：审核通过，3:审核不通过）
     */
    private Byte shopStatus;
    /**
     * 商店标签
     */
    private String businessLable;
    /**
     * 店铺图标
     */
    private String shopIcon;
    /**
     * 店铺来源（书画1，健康2，商超3）
     */
    private Byte shopSource;
    /**
     * 被收藏次数
     */
    private Integer shopCollection;
    /**
     * 主营品牌
     */
    private String shopMajor;
    /**
     * 店铺规模
     */
    private String shopScale;
    /**
     * 店铺所在地
     */
    private String shopAddress;
    /**
     * 商店简介
     */
    private String shopText;
  
    /**
     * 坐标
     */
    private String coordinate;
    /**
     * 省
     */
    private Long province;
    /**
     * 市
     */
    private Long city;
    
    /**
     * 县
     */
    private Long area;
    /**
	 * 健康证
	 */
	private String healthCards;  
	/**
	 * 食品流通许可证
	 */	 
	private String foodpermit; 
    
    
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBusName() {
		return busName;
	}
	public void setBusName(String busName) {
		this.busName = busName;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getBusAccount() {
		return busAccount;
	}
	public void setBusAccount(String busAccount) {
		this.busAccount = busAccount;
	}
	public String getBusTel() {
		return busTel;
	}
	public void setBusTel(String busTel) {
		this.busTel = busTel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getLicense() {
		return license;
	}
	public void setLicense(String license) {
		this.license = license;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public Byte getBusStatus() {
		return busStatus;
	}
	public void setBusStatus(Byte busStatus) {
		this.busStatus = busStatus;
	}
	public Byte getIsDel() {
		return isDel;
	}
	public void setIsDel(Byte isDel) {
		this.isDel = isDel;
	}
	public Byte getBusType() {
		return busType;
	}
	public void setBusType(Byte busType) {
		this.busType = busType;
	}
	public String getAuthName() {
		return authName;
	}
	public void setAuthName(String authName) {
		this.authName = authName;
	}
	public String getAuthSynopsis() {
		return authSynopsis;
	}
	public void setAuthSynopsis(String authSynopsis) {
		this.authSynopsis = authSynopsis;
	}
	public String getAuthProfile() {
		return authProfile;
	}
	public void setAuthProfile(String authProfile) {
		this.authProfile = authProfile;
	}
	public String getAuthImg() {
		return authImg;
	}
	public void setAuthImg(String authImg) {
		this.authImg = authImg;
	}
	public Byte getAuthStatus() {
		return authStatus;
	}
	public void setAuthStatus(Byte authStatus) {
		this.authStatus = authStatus;
	}
	public Byte getAuthType() {
		return authType;
	}
	public void setAuthType(Byte authType) {
		this.authType = authType;
	}
   
    public String getHealthCards() {
		return healthCards;
	}
	public void setHealthCards(String healthCards) {
		this.healthCards = healthCards;
	}
	public String getFoodpermit() {
		return foodpermit;
	}
	public void setFoodpermit(String foodpermit) {
		this.foodpermit = foodpermit;
	}
	public String getBusinessScale() {
		return businessScale;
	}
	public void setBusinessScale(String businessScale) {
		this.businessScale = businessScale;
	}
	public String getLicenseImg() {
		return licenseImg;
	}
	public void setLicenseImg(String licenseImg) {
		this.licenseImg = licenseImg;
	}
	public String getBusImg() {
		return busImg;
	}
	public void setBusImg(String busImg) {
		this.busImg = busImg;
	}
	public String getEnterprise() {
		return enterprise;
	}
	public void setEnterprise(String enterprise) {
		this.enterprise = enterprise;
	}
	public String getCorporateName() {
		return corporateName;
	}
	public void setCorporateName(String corporateName) {
		this.corporateName = corporateName;
	}
	public Long getCorporateIdentityCard() {
		return corporateIdentityCard;
	}
	public void setCorporateIdentityCard(Long corporateIdentityCard) {
		this.corporateIdentityCard = corporateIdentityCard;
	}
	public String getCorporateIdentityCardImg() {
		return corporateIdentityCardImg;
	}
	public void setCorporateIdentityCardImg(String corporateIdentityCardImg) {
		this.corporateIdentityCardImg = corporateIdentityCardImg;
	}
	public String getCompanyContacts() {
		return companyContacts;
	}
	public void setCompanyContacts(String companyContacts) {
		this.companyContacts = companyContacts;
	}
	public Long getCompanyTel() {
		return companyTel;
	}
	public void setCompanyTel(Long companyTel) {
		this.companyTel = companyTel;
	}
	public String getOpenBankName() {
		return openBankName;
	}
	public void setOpenBankName(String openBankName) {
		this.openBankName = openBankName;
	}
	public String getBankId() {
		return bankId;
	}
	public void setBankId(String bankId) {
		this.bankId = bankId;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankAddress() {
		return bankAddress;
	}
	public void setBankAddress(String bankAddress) {
		this.bankAddress = bankAddress;
	}
	public String getQualificationImg() {
		return qualificationImg;
	}
	public void setQualificationImg(String qualificationImg) {
		this.qualificationImg = qualificationImg;
	}
	public String getAuthTitle() {
		return authTitle;
	}
	public void setAuthTitle(String authTitle) {
		this.authTitle = authTitle;
	}
	public String getAuthAwards() {
		return authAwards;
	}
	public void setAuthAwards(String authAwards) {
		this.authAwards = authAwards;
	}
	public String getLeaveMessage() {
		return leaveMessage;
	}
	public void setLeaveMessage(String leaveMessage) {
		this.leaveMessage = leaveMessage;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public Long getBusId() {
		return busId;
	}
	public void setBusId(Long busId) {
		this.busId = busId;
	}
	public Long getParentShopId() {
		return parentShopId;
	}
	public void setParentShopId(Long parentShopId) {
		this.parentShopId = parentShopId;
	}
	public Long getShoptId() {
		return shoptId;
	}
	public void setShoptId(Long shoptId) {
		this.shoptId = shoptId;
	}
	public String getShopImg() {
		return shopImg;
	}
	public void setShopImg(String shopImg) {
		this.shopImg = shopImg;
	}
	public Byte getShopStatus() {
		return shopStatus;
	}
	public void setShopStatus(Byte shopStatus) {
		this.shopStatus = shopStatus;
	}
	public String getBusinessLable() {
		return businessLable;
	}
	public void setBusinessLable(String businessLable) {
		this.businessLable = businessLable;
	}
	public String getShopIcon() {
		return shopIcon;
	}
	public void setShopIcon(String shopIcon) {
		this.shopIcon = shopIcon;
	}
	public Byte getShopSource() {
		return shopSource;
	}
	public void setShopSource(Byte shopSource) {
		this.shopSource = shopSource;
	}
	public Integer getShopCollection() {
		return shopCollection;
	}
	public void setShopCollection(Integer shopCollection) {
		this.shopCollection = shopCollection;
	}
	public String getShopMajor() {
		return shopMajor;
	}
	public void setShopMajor(String shopMajor) {
		this.shopMajor = shopMajor;
	}
	public String getShopScale() {
		return shopScale;
	}
	public void setShopScale(String shopScale) {
		this.shopScale = shopScale;
	}
	public String getShopAddress() {
		return shopAddress;
	}
	public void setShopAddress(String shopAddress) {
		this.shopAddress = shopAddress;
	}
	public String getShopText() {
		return shopText;
	}
	public void setShopText(String shopText) {
		this.shopText = shopText;
	}
	public String getCoordinate() {
		return coordinate;
	}
	public void setCoordinate(String coordinate) {
		this.coordinate = coordinate;
	}
	public Long getProvince() {
		return province;
	}
	public void setProvince(Long province) {
		this.province = province;
	}
	public Long getCity() {
		return city;
	}
	public void setCity(Long city) {
		this.city = city;
	}
	public Long getArea() {
		return area;
	}
	public void setArea(Long area) {
		this.area = area;
	}
	
	
}
