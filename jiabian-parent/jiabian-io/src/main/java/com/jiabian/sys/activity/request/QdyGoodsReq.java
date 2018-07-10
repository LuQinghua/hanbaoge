package com.jiabian.sys.activity.request;

import java.math.BigDecimal;
import java.util.Date;

import com.jiabian.base.BaseReq;

public class QdyGoodsReq extends BaseReq{
	private String checkIds;
	
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
     * 商品描述	
     */
    private String prodText;
    /**
     * 类型（1.数码 2.保健品3.书画4.奢侈品5.电器6.珠宝7.汽车8.其他）
     */
    private Byte classify;
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
     * 运算过的开始时间
     */
    private String resTime;
    
    private int  total;
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
	private Byte partake_isStatus;
	
	private Integer common;
    
    private String startTimeStr;
    
    /**
     * 溢出金额
     */
    private BigDecimal spilMoney;
    
    /**
     * 退还金额
     */
    private BigDecimal returnMoney;
    /**
     *  查询的开始时间
     */
    private Date seekStarTime;
    /**
     * 查询的结束时间
     */
    private Date seekEndTime;
    
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
	public BigDecimal getReturnMoney() {
		return returnMoney;
	}
	public void setReturnMoney(BigDecimal returnMoney) {
		this.returnMoney = returnMoney;
	}
	private String[] prodIdArr;
    
    public String[] getProdIdArr() {
		return prodIdArr;
	}
	public void setProdIdArr(String[] prodIdArr) {
		this.prodIdArr = prodIdArr;
	}
	public BigDecimal getSpilMoney() {
		return spilMoney;
	}
	public void setSpilMoney(BigDecimal spilMoney) {
		this.spilMoney = spilMoney;
	}
	private static final long serialVersionUID = 1L;
	public String getCheckIds() {
		return checkIds;
	}
	public void setCheckIds(String checkIds) {
		this.checkIds = checkIds;
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
	public Byte getClassify() {
		return classify;
	}
	public void setClassify(Byte classify) {
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
	public Byte getIsDel() {
		return isDel;
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
	public String getResTime() {
		return resTime;
	}
	public void setResTime(String resTime) {
		this.resTime = resTime;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Byte getRegion() {
		return region;
	}
	public void setRegion(Byte region) {
		this.region = region;
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
	public Byte getPartake_isStatus() {
		return partake_isStatus;
	}
	public void setPartake_isStatus(Byte partake_isStatus) {
		this.partake_isStatus = partake_isStatus;
	}
	public String getStartTimeStr() {
		return startTimeStr;
	}
	public void setStartTimeStr(String startTimeStr) {
		this.startTimeStr = startTimeStr;
	}
	public Integer getCommon() {
		return common;
	}
	public void setCommon(Integer common) {
		this.common = common;
	}
	

}
