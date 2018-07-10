/*
 * UserFavorite.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-11-12 Created
 */
package com.jiabian.userfavorite.response;

import java.io.Serializable;
import java.util.Date;

import com.jiabian.base.BaseRes;

/**
 * UserFavoriteReq 
 * 创建人:熊天威 
 * 时间：2016年11月12日-下午6:11:47
 * @version 1.0.0
 */
public class UserFavoriteRes extends BaseRes implements Serializable {

	private static final long serialVersionUID = 1L;
	/**
	 * 收藏编号
	 */
	private Long id;
	/**
	 * 用户id
	 */
	private Long userId;
	/**
	 * 商品id
	 */
	private Long prodId;
	/**
	 * 店铺id
	 */
	private Long shopId;
	/**
	 * 名家id
	 */
	private Long busId;
	/**
	 * 收藏时间
	 */
	private Date createTime;
	/**
	 * 删除标识（1：正常，2：删除）
	 */
	private Byte isDel;
	/**
	 * 收藏类型（1：商品，2：店铺，3：名家）
	 */
	private Byte favoType;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getProdId() {
		return prodId;
	}

	public void setProdId(Long prodId) {
		this.prodId = prodId;
	}

	public Long getShopId() {
		return shopId;
	}

	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}

	public Long getBusId() {
		return busId;
	}

	public void setBusId(Long busId) {
		this.busId = busId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Byte getIsDel() {
		return isDel;
	}

	public void setIsDel(Byte isDel) {
		this.isDel = isDel;
	}

	public Byte getFavoType() {
		return favoType;
	}

	public void setFavoType(Byte favoType) {
		this.favoType = favoType;
	}

	@Override
	public boolean equals(Object that) {
		if (this == that) {
			return true;
		}
		if (that == null) {
			return false;
		}
		if (getClass() != that.getClass()) {
			return false;
		}
		UserFavoriteRes other = (UserFavoriteRes) that;
		return (this.getId() == null ? other.getId() == null : this.getId()
				.equals(other.getId()))
				&& (this.getUserId() == null ? other.getUserId() == null : this
						.getUserId().equals(other.getUserId()))
				&& (this.getProdId() == null ? other.getProdId() == null : this
						.getProdId().equals(other.getProdId()))
				&& (this.getShopId() == null ? other.getShopId() == null : this
						.getShopId().equals(other.getShopId()))
				&& (this.getBusId() == null ? other.getBusId() == null : this
						.getBusId().equals(other.getBusId()))
				&& (this.getCreateTime() == null ? other.getCreateTime() == null
						: this.getCreateTime().equals(other.getCreateTime()))
				&& (this.getIsDel() == null ? other.getIsDel() == null : this
						.getIsDel().equals(other.getIsDel()))
				&& (this.getFavoType() == null ? other.getFavoType() == null
						: this.getFavoType().equals(other.getFavoType()));
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
		result = prime * result
				+ ((getUserId() == null) ? 0 : getUserId().hashCode());
		result = prime * result
				+ ((getProdId() == null) ? 0 : getProdId().hashCode());
		result = prime * result
				+ ((getShopId() == null) ? 0 : getShopId().hashCode());
		result = prime * result
				+ ((getBusId() == null) ? 0 : getBusId().hashCode());
		result = prime * result
				+ ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
		result = prime * result
				+ ((getIsDel() == null) ? 0 : getIsDel().hashCode());
		result = prime * result
				+ ((getFavoType() == null) ? 0 : getFavoType().hashCode());
		return result;
	}
}