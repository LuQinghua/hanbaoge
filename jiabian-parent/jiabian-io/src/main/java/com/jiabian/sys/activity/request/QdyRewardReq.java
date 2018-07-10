package com.jiabian.sys.activity.request;

import java.math.BigDecimal;

import com.jiabian.base.BaseReq;

public class QdyRewardReq extends BaseReq {

	private String checkIds;

	/**
	 * 订单编号
	 */
	private String payPartakeNum;
	/**
	 * 支付记录id
	 */
	private Long paypartake_Id;

	/**
	 * 商品价格
	 */
	private Integer prodPrice;

	private Long prodId;
	/**
	 * 买入注数
	 */
	private Integer prodPricePart;
	/**
	 * 中奖id
	 */
	private Long id;

	/**
	 * 期数
	 */
	private Long reward_phase;
	/**
	 * 最后一名抢拍时间
	 */
	private String reward_time;
	/**
	 * 奖项id
	 */
	private Long prize_id;
	/**
	 * 商品Id
	 */
	private Long goods_id;
	/**
	 * 用户id
	 */
	private Long userId;
	/**
	 * 中奖号码
	 */
	private String reward_NO;

	private String ip;

	private BigDecimal price;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getReward_NO() {
		return reward_NO;
	}

	public void setReward_NO(String reward_NO) {
		this.reward_NO = reward_NO;
	}

	public Integer getProdPricePart() {
		return prodPricePart;
	}

	public void setProdPricePart(Integer prodPricePart) {
		this.prodPricePart = prodPricePart;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	private static final long serialVersionUID = 1L;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getReward_phase() {
		return reward_phase;
	}

	public void setReward_phase(Long reward_phase) {
		this.reward_phase = reward_phase;
	}

	public String getReward_time() {
		return reward_time;
	}

	public void setReward_time(String reward_time) {
		this.reward_time = reward_time == null ? null : reward_time.trim();
	}

	public Long getPrize_id() {
		return prize_id;
	}

	public void setPrize_id(Long prize_id) {
		this.prize_id = prize_id;
	}

	public Long getGoods_id() {
		return goods_id;
	}

	public void setGoods_id(Long goods_id) {
		this.goods_id = goods_id;
	}

	public Long getProdId() {
		return prodId;
	}

	public void setProdId(Long prodId) {
		this.prodId = prodId;
	}

	public Integer getProdPrice() {
		return prodPrice;
	}

	public void setProdPrice(Integer prodPrice) {
		this.prodPrice = prodPrice;
	}

	public String getCheckIds() {
		return checkIds;
	}

	public void setCheckIds(String checkIds) {
		this.checkIds = checkIds;
	}

	public String getIp() {
		return ip;
	}

	public Long getPaypartake_Id() {
		return paypartake_Id;
	}

	public void setPaypartake_Id(Long paypartake_Id) {
		this.paypartake_Id = paypartake_Id;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getPayPartakeNum() {
		return payPartakeNum;
	}

	public void setPayPartakeNum(String payPartakeNum) {
		this.payPartakeNum = payPartakeNum;
	}

}
