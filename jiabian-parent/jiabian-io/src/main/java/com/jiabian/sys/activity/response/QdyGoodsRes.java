package com.jiabian.sys.activity.response;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class QdyGoodsRes implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	 * id
	 */
	private Long id;
	/**
	 * 活动商品名称
	 */
	private String prodName;

	/**
	 * 商品图片
	 */
	private String prodImg;
	/**
	 * 用户头像
	 */
	private String userImg;
	/**
	 * 用户名称
	 */
	private String userName;
	/**
	 * 数量
	 */
	private int total;
	/**
	 * 商品描述
	 */
	private String prodText;
	/**
	 * 类型（1.数码 2.保健品3.书画4.奢侈品5.电器6.珠宝7.汽车8.其他）
	 */
	private String classify;
	/**
	 * 运算过的正在抢开始 时间
	 */
	private String resTime;
	/**
	 * 价格
	 */
	private BigDecimal price;
	/**
	 * 添加时间
	 */
	private Date creatTime;
	/**
	 * 修改时间
	 */
	private Date updateTime;
	/**
	 * 是否删除 1：正常，2：删除
	 */
	private Byte isDel;
	/**
	 * 状态（0.未开始1开始2.结束）
	 */
	private Byte status;
	/**
	 * 活动开始时间
	 */
	private Date startTime;
	/**
	 * 1.(一元区)2.（多元区）
	 */
	private Byte region;

	/**
	 * 商品上架下架状态(1.上架 0.未上架)
	 */
	private Byte isShow;
	/**
	 * 期数
	 */
	private Integer periods;
	/**
	 * 是否进入下一轮（1：是 ，2：否）
	 */
	private Byte isGoOn;
	
	/**
	 * 本期开奖时间
	 */
	private String drawingTime;

    private Integer common;

    private String groups;
    
    private BigDecimal spilMoney;
	public BigDecimal getSpilMoney() {
		return spilMoney;
	}

	public void setSpilMoney(BigDecimal spilMoney) {
		this.spilMoney = spilMoney;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getProdImg() {
		return prodImg;
	}

	public void setProdImg(String prodImg) {
		this.prodImg = prodImg;
	}

	public String getProdText() {
		return prodText;
	}

	public void setProdText(String prodText) {
		this.prodText = prodText;
	}

	public String getClassify() {
		return classify;
	}

	public void setClassify(String classify) {
		this.classify = classify;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Date getCreatTime() {
		return creatTime;
	}

	public void setCreatTime(Date creatTime) {
		this.creatTime = creatTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Byte getIsShow() {
		return isShow;
	}

	public void setIsShow(Byte isShow) {
		this.isShow = isShow;
	}

	public Integer getPeriods() {
		return periods;
	}

	public void setPeriods(Integer periods) {
		this.periods = periods;
	}

	public Byte getIsGoOn() {
		return isGoOn;
	}

	public void setIsGoOn(Byte isGoOn) {
		this.isGoOn = isGoOn;
	}

	public String getResTime() {
		return resTime;
	}

	public Byte getIsDel() {
		return isDel;
	}

	public void setResTime(String resTime) {
		this.resTime = resTime;
	}

	public void setIsDel(Byte isDel) {
		this.isDel = isDel;
	}

	public Byte getStatus() {
		return status;
	}

	public void setStatus(Byte status) {
		this.status = status;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getUserImg() {
		return userImg;
	}

	public void setUserImg(String userImg) {
		this.userImg = userImg;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public Byte getRegion() {
		return region;
	}

	public void setRegion(Byte region) {
		this.region = region;
	}

	public Integer getCommon() {
		return common;
	}

	public void setCommon(Integer common) {
		this.common = common;
	}

	public String getGroups() {
		return groups;
	}

	public void setGroups(String groups) {
		this.groups = groups;
	}

	public String getDrawingTime() {
		return drawingTime;
	}

	public void setDrawingTime(String drawingTime) {
		this.drawingTime = drawingTime;
	}

}
