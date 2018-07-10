package com.jiabian.user.request;

import java.util.Date;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.jiabian.base.BaseReq;
import com.jiabian.base.io.request.IRequest;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class UsersReq extends BaseReq implements IRequest {
	private static final long serialVersionUID = 1L;
	/**
	 * 登录来源
	 */
	private String loginSource;
	/**
	 * 账号编号
	 */
	private Long id;
	/**
	 * 邮箱
	 */
	private String email;
	/**
	 * 手机号
	 */
	private String userTel;
	/**
	 * 1 男 2 女
	 */
	private Byte sex;
	/**
	 * 用户名
	 */
	private String userName;
	/**
	 * 是否默认
	 */
	private Byte isDefault;
	/**
	 * 账户密码
	 */
	private String userPwd;
	/**
	 * 加盐
	 */
	private String userSalt;
	/**
	 * 邮政编码
	 */
	private String postCode;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 修改时间
	 */
	private Date updateTime;
	/**
	 * 最后登录时间
	 */
	private Date lastLogTime;
	/**
	 * 省份
	 */
	private Integer porovince;
	/**
	 * 用户类型（1：普通，2：商家，3：名家）
	 */
	private Byte userType;
	/**
	 * 用户收藏店铺数量
	 */
	private Integer userShopNum;
	/**
	 * 用户收藏商品数量
	 */
	private Integer userProdNum;
	/**
	 * 用户来源（1：后台，2：app，3：web）
	 */
	private Byte userSource;

	/**
	 * 城市
	 */
	private Integer city;

	/**
	 * 用户id
	 */
	private Long userId;
	/**
	 * 真实姓名
	 */
	private String realName;
	/**
	 * 身份证号
	 */
	private String idCard;
	/**
	 * 地址
	 */
	private String address;
	/**
	 * 出生日期
	 */
	private Date birthday;
	/**
	 * 兴趣爱好
	 */
	private String hobby;
	/**
	 * 用户头像
	 */
	private String userImg;
	/**
	 * 用户积分
	 */
	private Integer integral;
	/**
	 * 购物次数
	 */
	private Integer shoppingNum;
	/**
	 * 成长值
	 */
	private Integer growthVal;
	/**
	 * 手机号码验证状态（1：未验证，2：已验证）
	 */
	private Byte phoneVer;
	/**
	 * 邮箱验证状态（1：未验证，2：已验证）
	 */
	private Byte emailVer;
	/**
	 * 身份认证状态（1：未认证，2：已认证）
	 */
	private Byte idVer;
	/**
	 * 密保验证状态（1：未设置，2：已设置）
	 */
	private Byte securityType;
	/**
	 * 设备号
	 */
	private String device;
	/**
	 * 删除标识（1：正常，2：删除）
	 */
	private Byte isDel;

	private String smsCode;
	/**
	 * 用户登录标识
	 */
	private String sid;
	/**
	 * 商家名称
	 */
	private String busName;
	/**
	 * 商家id
	 */
	private Long businessmanID;
	/**
	 * 商店ID
	 */
	private Long shopID;
	/**
	 * 商店名称
	 */
	private String shopName;

	/**
	 * qqopenId
	 */
	private String qqopenId;

	/**
	 * 微信openId
	 */
	private String weixinopenId;

	/**
	 * 微博openId
	 */
	private String weiboopenId;
	/**
	 * 验证码
	 */
	private String Captcha;

	/**
	 * 收货人
	 */
	private String receiver;

	/**
	 * 详细地址
	 */
	private String addressInfo;

	/**
	 * 联系电话
	 */
	private String telPhone;

	/**
	 * dx标记
	 */
	private String flag;

	/**
	 * 查询开始时间
	 */
	private Date seekStarTime;

	/**
	 * 查询结束时间
	 */
	private Date seekEndTime;
	private Integer currentPage;
	
	private String theSeekStarTime;
	private String theSeekEndTime;

	public String getLoginSource() {
		return loginSource;
	}

	public void setLoginSource(String loginSource) {
		this.loginSource = loginSource;
	}

	public String getTheSeekStarTime() {
		return theSeekStarTime;
	}

	public void setTheSeekStarTime(String theSeekStarTime) {
		this.theSeekStarTime = theSeekStarTime;
	}

	public String getTheSeekEndTime() {
		return theSeekEndTime;
	}

	public void setTheSeekEndTime(String theSeekEndTime) {
		this.theSeekEndTime = theSeekEndTime;
	}

	public Date getSeekStarTime() {
		return seekStarTime;
	}

	public void setSeekStarTime(Date seekStarTime) {
		this.seekStarTime = seekStarTime;
	}

	public Date getSeekEndTime() {
		return seekEndTime;
	}

	public void setSeekEndTime(Date seekEndTime) {
		this.seekEndTime = seekEndTime;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getCaptcha() {
		return Captcha;
	}

	public void setCaptcha(String captcha) {
		Captcha = captcha;
	}

	public void setBusinessmanID(Long businessmanID) {
		this.businessmanID = businessmanID;
	}

	public void setShopID(Long shopID) {
		this.shopID = shopID;
	}

	public String getQqopenId() {
		return qqopenId;
	}

	public void setQqopenId(String qqopenId) {
		this.qqopenId = qqopenId;
	}

	public String getWeixinopenId() {
		return weixinopenId;
	}

	public void setWeixinopenId(String weixinopenId) {
		this.weixinopenId = weixinopenId;
	}

	public String getWeiboopenId() {
		return weiboopenId;
	}

	public void setWeiboopenId(String weiboopenId) {
		this.weiboopenId = weiboopenId;
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getBusName() {
		return busName;
	}

	public void setBusName(String busName) {
		this.busName = busName;
	}

	public long getBusinessmanID() {
		return businessmanID;
	}

	public void setBusinessmanID(long businessmanID) {
		this.businessmanID = businessmanID;
	}

	public long getShopID() {
		return shopID;
	}

	public void setShopID(long shopID) {
		this.shopID = shopID;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserTel() {
		return userTel;
	}

	public void setUserTel(String userTel) {
		this.userTel = userTel;
	}

	public Byte getSex() {
		return sex;
	}

	public void setSex(Byte sex) {
		this.sex = sex;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getUserSalt() {
		return userSalt;
	}

	public void setUserSalt(String userSalt) {
		this.userSalt = userSalt;
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

	public Date getLastLogTime() {
		return lastLogTime;
	}

	public Byte getIsDefault() {
		return isDefault;
	}

	public void setIsDefault(Byte isDefault) {
		this.isDefault = isDefault;
	}

	public void setLastLogTime(Date lastLogTime) {
		this.lastLogTime = lastLogTime;
	}

	public Integer getPorovince() {
		return porovince;
	}

	public void setPorovince(Integer porovince) {
		this.porovince = porovince;
	}

	public Byte getUserType() {
		return userType;
	}

	public void setUserType(Byte userType) {
		this.userType = userType;
	}

	public Integer getUserShopNum() {
		return userShopNum;
	}

	public void setUserShopNum(Integer userShopNum) {
		this.userShopNum = userShopNum;
	}

	public Integer getUserProdNum() {
		return userProdNum;
	}

	public void setUserProdNum(Integer userProdNum) {
		this.userProdNum = userProdNum;
	}

	public Byte getUserSource() {
		return userSource;
	}

	public void setUserSource(Byte userSource) {
		this.userSource = userSource;
	}

	public Integer getCity() {
		return city;
	}

	public void setCity(Integer city) {
		this.city = city;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public String getUserImg() {
		return userImg;
	}

	public void setUserImg(String userImg) {
		this.userImg = userImg;
	}

	public Integer getIntegral() {
		return integral;
	}

	public void setIntegral(Integer integral) {
		this.integral = integral;
	}

	public Integer getShoppingNum() {
		return shoppingNum;
	}

	public void setShoppingNum(Integer shoppingNum) {
		this.shoppingNum = shoppingNum;
	}

	public Integer getGrowthVal() {
		return growthVal;
	}

	public void setGrowthVal(Integer growthVal) {
		this.growthVal = growthVal;
	}

	public Byte getPhoneVer() {
		return phoneVer;
	}

	public void setPhoneVer(Byte phoneVer) {
		this.phoneVer = phoneVer;
	}

	public Byte getEmailVer() {
		return emailVer;
	}

	public void setEmailVer(Byte emailVer) {
		this.emailVer = emailVer;
	}

	public Byte getIdVer() {
		return idVer;
	}

	public void setIdVer(Byte idVer) {
		this.idVer = idVer;
	}

	public Byte getSecurityType() {
		return securityType;
	}

	public void setSecurityType(Byte securityType) {
		this.securityType = securityType;
	}

	public String getDevice() {
		return device;
	}

	public void setDevice(String device) {
		this.device = device;
	}

	public Byte getIsDel() {
		return isDel;
	}

	public void setIsDel(Byte isDel) {
		this.isDel = isDel;
	}

	public String getSmsCode() {
		return smsCode;
	}

	public void setSmsCode(String smsCode) {
		this.smsCode = smsCode;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public String getAddressInfo() {
		return addressInfo;
	}

	public void setAddressInfo(String addressInfo) {
		this.addressInfo = addressInfo;
	}

	public String getTelPhone() {
		return telPhone;
	}

	public void setTelPhone(String telPhone) {
		this.telPhone = telPhone;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}
	

}
