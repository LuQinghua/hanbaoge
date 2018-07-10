package com.jiabian.sys.activity.response;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class QdyJoinRes implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	 * 活动开始时间
	 */
	private Date startTime;
	/**
	 * 价格 /数量
	 */
	private BigDecimal price;
	/**
	 * 商品描述
	 */
	private String prodText;
	/**
	 * 商品id
	 */
	private Long prodId;
	private Long id;
	private int periods;
	private int total;
	private String drawingTime;
	private Byte groups;

	/**
	 * 状态（0.未开始1开始2.结束）
	 */
	private Byte status;
	/**
	 * 是否领取(0未领取 ,1已领取)
	 */
	private Byte receive;
	private Byte region;

	private String prodImg;
	private Date partake_winningTime;

	private Long partake_id;
	private String partake_num;

	private String prize_name;

	private Long userId;

	private Integer coinNum;
	private Date coinTime;
	private Byte coinGetMethod;
	private Byte coinStatus;
	/**
	 * 抢购时间
	 */
	private String partake_time;
	/**
	 * 是否中奖
	 */
	private Byte partake_isStatus;
	private String prize_id;
	/**
	 * IP
	 */
	private String prize_ip;

	/**
	 * 收货地址
	 */
	private Long addressId;
	/**
	 * 地址
	 */
	private String address;
	/**
	 * 物流单号
	 */
	private String logisticsCode;
	/**
	 * 配送状态：0.未发货 1.已发货 2.确认收货
	 */
	private Byte sendStatus;
	/**
	 * 配送状态：0.未发货 1.已发货 2.确认收货
	 */
	private Byte distribution;
	/**
	 * 收货人
	 */
	private String receiver;
	/**
	 * 收货人联系电话
	 */
	private String telPhone;
	/**
	 * 详细地址
	 */
	private String addressInfo;
	/**
	 * 物流公司id
	 */
	private Long logisticsCompanyId;
	/**
	 * 物流公司id
	 */
	private String logiCompany;
	/**
	 * 抢大运支付记录Id
	 */
	private Long paypartake_Id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getPeriods() {
		return periods;
	}

	public void setPeriods(int periods) {
		this.periods = periods;
	}

	public String getProdImg() {
		return prodImg;
	}

	public void setProdImg(String prodImg) {
		this.prodImg = prodImg;
	}

	public Long getPaypartake_Id() {
		return paypartake_Id;
	}

	public void setPaypartake_Id(Long paypartake_Id) {
		this.paypartake_Id = paypartake_Id;
	}

	public Long getLogisticsCompanyId() {
		return logisticsCompanyId;
	}

	public void setLogisticsCompanyId(Long logisticsCompanyId) {
		this.logisticsCompanyId = logisticsCompanyId;
	}

	public String getLogiCompany() {
		return logiCompany;
	}

	public void setLogiCompany(String logiCompany) {
		this.logiCompany = logiCompany;
	}

	public Long getAddressId() {
		return addressId;
	}

	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}

	public String getLogisticsCode() {
		return logisticsCode;
	}

	public void setLogisticsCode(String logisticsCode) {
		this.logisticsCode = logisticsCode;
	}

	public Byte getSendStatus() {
		return sendStatus;
	}

	public void setSendStatus(Byte sendStatus) {
		this.sendStatus = sendStatus;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public String getTelPhone() {
		return telPhone;
	}

	public void setTelPhone(String telPhone) {
		this.telPhone = telPhone;
	}

	public String getAddressInfo() {
		return addressInfo;
	}

	public void setAddressInfo(String addressInfo) {
		this.addressInfo = addressInfo;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getProdText() {
		return prodText;
	}

	public void setProdText(String prodText) {
		this.prodText = prodText == null ? null : prodText.trim();
	}

	public Long getProdId() {
		return prodId;
	}

	public void setProdId(Long prodId) {
		this.prodId = prodId;
	}

	public Byte getStatus() {
		return status;
	}

	public void setStatus(Byte status) {
		this.status = status;
	}

	public Integer getCoinNum() {
		return coinNum;
	}

	public void setCoinNum(Integer coinNum) {
		this.coinNum = coinNum;
	}

	public Date getCoinTime() {
		return coinTime;
	}

	public void setCoinTime(Date coinTime) {
		this.coinTime = coinTime;
	}

	public Byte getCoinGetMethod() {
		return coinGetMethod;
	}

	public void setCoinGetMethod(Byte coinGetMethod) {
		this.coinGetMethod = coinGetMethod;
	}

	public Byte getCoinStatus() {
		return coinStatus;
	}

	public void setCoinStatus(Byte coinStatus) {
		this.coinStatus = coinStatus;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/*
	 * 商品名称
	 */
	private String prodName;
	/*
	 * 用户名称
	 */
	private String userName;
	/**
	 * 用户电话
	 */
	private String userTel;
	/**
	 * 活动结束时间
	 */
	private Date endTime;
	/**
	 * 抽奖号码数量
	 */
	private Integer number;

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Long getPartake_id() {
		return partake_id;
	}

	public void setPartake_id(Long partake_id) {
		this.partake_id = partake_id;
	}

	public String getPartake_num() {
		return partake_num;
	}

	public void setPartake_num(String partake_num) {
		this.partake_num = partake_num;
	}

	public Byte getPartake_isStatus() {
		return partake_isStatus;
	}

	public void setPartake_isStatus(Byte partake_isStatus) {
		this.partake_isStatus = partake_isStatus;
	}

	public String getPrize_id() {
		return prize_id;
	}

	public void setPrize_id(String prize_id) {
		this.prize_id = prize_id == null ? null : prize_id.trim();
	}

	public String getPrize_ip() {
		return prize_ip;
	}

	public void setPrize_ip(String prize_ip) {
		this.prize_ip = prize_ip == null ? null : prize_ip.trim();
	}

	public Date getPartake_winningTime() {
		return partake_winningTime;
	}

	public String getPartake_time() {
		return partake_time;
	}

	public void setPartake_time(String partake_time) {
		this.partake_time = partake_time;
	}

	public void setPartake_winningTime(Date partake_winningTime) {
		this.partake_winningTime = partake_winningTime;
	}

	public String getPrize_name() {
		return prize_name;
	}

	public void setPrize_name(String prize_name) {
		this.prize_name = prize_name;
	}

	public String getUserTel() {
		return userTel;
	}

	public void setUserTel(String userTel) {
		this.userTel = userTel;
	}

	public Byte getReceive() {
		return receive;
	}

	public void setReceive(Byte receive) {
		this.receive = receive;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Byte getRegion() {
		return region;
	}

	public void setRegion(Byte region) {
		this.region = region;
	}

	public String getDrawingTime() {
		return drawingTime;
	}

	public void setDrawingTime(String drawingTime) {
		this.drawingTime = drawingTime;
	}

	public Byte getDistribution() {
		return distribution;
	}

	public void setDistribution(Byte distribution) {
		this.distribution = distribution;
	}

	public Byte getGroups() {
		return groups;
	}

	public void setGroups(Byte groups) {
		this.groups = groups;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
