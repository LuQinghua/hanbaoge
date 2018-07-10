package com.jiabian.sys.activity.response;

import java.io.Serializable;

public class QdyRewardRes implements Serializable {
	private static final long serialVersionUID = 1L;
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
}
