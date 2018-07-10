package com.jiabian.sys.activity.request;

import java.util.Date;

import com.jiabian.base.BaseReq;

public class QdyJoinReq extends BaseReq{
	private Long id;
	private String checkIds;
	/**
	 * 查询开始时间
	 */
	private Date seekStarTime;
	/**
	 * 查询结束时间
	 */
	private Date seekEndTime;
	
	private String theSeekStarTime;
	private String theSeekEndTime;
	private Long partake_id;
	/**
	 * 商品编号
	 */
	private Long prodId;
    private String partake_num;
    private Integer periods;
    private String partake_time;
    /**
     * 物流单号
     */
    private String logisticsCode;
    
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
     * 是否领取(0未领取 ,1已领取)
     */
    private Byte isReceive;
    /**
     * 商品名称
     */
    private String prodName;
    /**
     * 用户编号
     */
    private Long userId;
    
    /**
     * 用户电话
     */
    private String userTel;
    
    /**
     * 是否领奖
     */
    private Byte receive;
    /**
     * 当前页
     */
    private Long parentOffset;
    /**
     * 物流公司id
     */
    private Long logisticsCompanyId;
    
    /**
     * 判断是是否中奖
     */
    private Byte isStatus;
    
	public Long getLogisticsCompanyId() {
		return logisticsCompanyId;
	}
	public void setLogisticsCompanyId(Long logisticsCompanyId) {
		this.logisticsCompanyId = logisticsCompanyId;
	}
	public Long getParentOffset() {
		return parentOffset;
	}
	public void setParentOffset(Long parentOffset) {
		this.parentOffset = parentOffset;
	}
	public Byte getReceive() {
		return receive;
	}
	public void setReceive(Byte receive) {
		this.receive = receive;
	}
	public String getUserTel() {
		return userTel;
	}
	public void setUserTel(String userTel) {
		this.userTel = userTel;
	}
	private String orderBy;
    
    private Byte status;
    
    public Byte getStatus() {
		return status;
	}
	public void setStatus(Byte status) {
		this.status = status;
	}

    
    public String getOrderBy() {
		return orderBy;
	}
	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

    public Byte getIsStatus() {
		return isStatus;
	}
	public void setIsStatus(Byte isStatus) {
		this.isStatus = isStatus;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	private String userName;
    
    public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getLogisticsCode() {
		return logisticsCode;
	}
	public void setLogisticsCode(String logisticsCode) {
		this.logisticsCode = logisticsCode;
	}
	private static final long serialVersionUID = 1L;

    public Long getPartake_id() {
        return partake_id;
    }
    public void setPartake_id(Long partake_id) {
        this.partake_id = partake_id;
    }
    public Byte getPartake_isStatus() {
        return partake_isStatus;
    }
    public Long getProdId() {
		return prodId;
	}
	public void setProdId(Long prodId) {
		this.prodId = prodId;
	}
	public void setPartake_isStatus(Byte partake_isStatus) {
        this.partake_isStatus = partake_isStatus;
    }
    public String getPrize_id() {
        return prize_id;
    }
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
    public void setPrize_id(String prize_id) {
        this.prize_id = prize_id == null ? null : prize_id.trim();
    }
    public String getPartake_num() {
		return partake_num;
	}
	public void setPartake_num(String partake_num) {
		this.partake_num = partake_num;
	}
	public Integer getPeriods() {
		return periods;
	}
	public void setPeriods(Integer periods) {
		this.periods = periods;
	}
	public String getCheckIds() {
		return checkIds;
	}
	public void setCheckIds(String checkIds) {
		this.checkIds = checkIds;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getPrize_ip() {
        return prize_ip;
    }
    public void setPrize_ip(String prize_ip) {
        this.prize_ip = prize_ip == null ? null : prize_ip.trim();
    }
	public String getPartake_time() {
		return partake_time;
	}
	public void setPartake_time(String partake_time) {
		this.partake_time = partake_time;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
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
	public String getTheSeekStarTime() {
		return theSeekStarTime;
	}
	public Byte getIsReceive() {
		return isReceive;
	}
	public void setIsReceive(Byte isReceive) {
		this.isReceive = isReceive;
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
}
