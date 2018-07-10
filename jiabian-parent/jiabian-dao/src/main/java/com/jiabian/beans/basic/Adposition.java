/*
 * Adposition.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2017-01-13 Created
 */
package com.jiabian.beans.basic;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author 菠萝大象
 * @version 1.0 2017-01-13
 */
public class Adposition implements Serializable {

	private static final long serialVersionUID = 1L;
	/**
	 * 图片id
	 */
	private Long id;
	/**
	 * 平台(1：书画pc，2:书画移动端，3：健康PC，4：健康移动，5：商超移动，6:书画H5， 7：H5大首页 ,8 : 抢大运首页)
	 */
	private Byte platform;
	/**
	 * 图片地址
	 */
	private String adImg;
	/**
	 * 跳转地址
	 */
	private String adUrl;
	/**
	 * 类型(1:图片，2：店铺，3：商品 )
	 */
	private Byte type;
	/**
	 * 广告位位置(1：上，2：中，3：下，4：商超首页banner，5：商超首页中 左抢购，6 ：商超首页中 右上，7：商超首页中
	 * 右下一，8：商超首页中 右 下二)
	 */
	private Byte site;
	/**
	 * 所在页面（1:书画H5广告位 2：环保公益，3：当代名家，4：近现代书画,5:存世之作,6:书画店铺,7:书画拍卖，8：商超首页）
	 */
	private Byte domain;
	/**
	 * 描述
	 */
	private String description;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 更改时间
	 */
	private Date updateTime;
	/**
	 * 账户状态（1：正常 ，2：删除）
	 */
	private Byte isDel;
	/**
	 * 排序序号
	 */
	private Long sort;
	/**
	 * 头标题
	 */
	private String title;
	/**
	 * 中部广告位的来源(1：书画。2：健康，3：商超）
	 */
	private Long source;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Byte getPlatform() {
		return platform;
	}

	public void setPlatform(Byte platform) {
		this.platform = platform;
	}

	public String getAdImg() {
		return adImg;
	}

	public void setAdImg(String adImg) {
		this.adImg = adImg == null ? null : adImg.trim();
	}

	public String getAdUrl() {
		return adUrl;
	}

	public void setAdUrl(String adUrl) {
		this.adUrl = adUrl == null ? null : adUrl.trim();
	}

	public Byte getType() {
		return type;
	}

	public void setType(Byte type) {
		this.type = type;
	}

	public Byte getSite() {
		return site;
	}

	public void setSite(Byte site) {
		this.site = site;
	}

	public Byte getDomain() {
		return domain;
	}

	public void setDomain(Byte domain) {
		this.domain = domain;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description == null ? null : description.trim();
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

	public Byte getIsDel() {
		return isDel;
	}

	public void setIsDel(Byte isDel) {
		this.isDel = isDel;
	}

	public Long getSort() {
		return sort;
	}

	public void setSort(Long sort) {
		this.sort = sort;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title == null ? null : title.trim();
	}

	public Long getSource() {
		return source;
	}

	public void setSource(Long source) {
		this.source = source;
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
		Adposition other = (Adposition) that;
		return (this.getId() == null ? other.getId() == null : this.getId()
				.equals(other.getId()))
				&& (this.getPlatform() == null ? other.getPlatform() == null
						: this.getPlatform().equals(other.getPlatform()))
				&& (this.getAdImg() == null ? other.getAdImg() == null : this
						.getAdImg().equals(other.getAdImg()))
				&& (this.getAdUrl() == null ? other.getAdUrl() == null : this
						.getAdUrl().equals(other.getAdUrl()))
				&& (this.getType() == null ? other.getType() == null : this
						.getType().equals(other.getType()))
				&& (this.getSite() == null ? other.getSite() == null : this
						.getSite().equals(other.getSite()))
				&& (this.getDomain() == null ? other.getDomain() == null : this
						.getDomain().equals(other.getDomain()))
				&& (this.getDescription() == null ? other.getDescription() == null
						: this.getDescription().equals(other.getDescription()))
				&& (this.getCreateTime() == null ? other.getCreateTime() == null
						: this.getCreateTime().equals(other.getCreateTime()))
				&& (this.getUpdateTime() == null ? other.getUpdateTime() == null
						: this.getUpdateTime().equals(other.getUpdateTime()))
				&& (this.getIsDel() == null ? other.getIsDel() == null : this
						.getIsDel().equals(other.getIsDel()))
				&& (this.getSort() == null ? other.getSort() == null : this
						.getSort().equals(other.getSort()))
				&& (this.getTitle() == null ? other.getTitle() == null : this
						.getTitle().equals(other.getTitle()))
				&& (this.getSource() == null ? other.getSource() == null : this
						.getSource().equals(other.getSource()));
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
		result = prime * result
				+ ((getPlatform() == null) ? 0 : getPlatform().hashCode());
		result = prime * result
				+ ((getAdImg() == null) ? 0 : getAdImg().hashCode());
		result = prime * result
				+ ((getAdUrl() == null) ? 0 : getAdUrl().hashCode());
		result = prime * result
				+ ((getType() == null) ? 0 : getType().hashCode());
		result = prime * result
				+ ((getSite() == null) ? 0 : getSite().hashCode());
		result = prime * result
				+ ((getDomain() == null) ? 0 : getDomain().hashCode());
		result = prime
				* result
				+ ((getDescription() == null) ? 0 : getDescription().hashCode());
		result = prime * result
				+ ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
		result = prime * result
				+ ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
		result = prime * result
				+ ((getIsDel() == null) ? 0 : getIsDel().hashCode());
		result = prime * result
				+ ((getSort() == null) ? 0 : getSort().hashCode());
		result = prime * result
				+ ((getTitle() == null) ? 0 : getTitle().hashCode());
		result = prime * result
				+ ((getSource() == null) ? 0 : getSource().hashCode());
		return result;
	}
}