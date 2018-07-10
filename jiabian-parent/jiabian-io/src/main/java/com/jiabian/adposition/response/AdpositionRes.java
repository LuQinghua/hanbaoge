package com.jiabian.adposition.response;

import java.util.Date;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.jiabian.base.BaseRes;
import com.jiabian.base.io.request.IRequest;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class AdpositionRes extends BaseRes implements IRequest {


	/**
	 * 图片id
	 */
	private Long id;

	/**
	 * 平台(1：书画pc，2:书画移动端，3：健康PC，4：健康移动，5：商超移动)
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
	 * 类型(1:图片，2：视频)
	 */
	private Byte type;

	/**
	 * 广告位位置(1：上，2：中，3：下，4：商超移动首页banner，5：中 左抢购，6 ：中 右上，7：中 右下一，8：中 右 下二)
	 */
	private Byte site;

	/**
	 * 所在页面（1：书画PC 环保公益，2：书画PC 当代名家...）
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
	 * 修改时间
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
	 * 
	 * 头标题
	 */
	private String title;

	/**
	 * 中部广告位的来源(1：书画。2：健康，3：商超）
	 */
	private Long source;

	/**
	 * 区域
	 */
	private Byte assortment;

	private Integer tabType;
	
	public Long getSource() {
		return source;
	}

	public void setSource(Long source) {
		this.source = source;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Long getSort() {
		return sort;
	}

	public void setSort(Long sort) {
		this.sort = sort;
	}

	public Byte getAssortment() {
		return assortment;
	}

	public void setAssortment(Byte assortment) {
		this.assortment = assortment;
	}

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
		this.description = description;
	}

	public Byte getIsDel() {
		return isDel;
	}

	public void setIsDel(Byte isDel) {
		this.isDel = isDel;
	}

	public String getAdImg() {
		return adImg;
	}

	public void setAdImg(String adImg) {
		this.adImg = adImg;
	}

	public String getAdUrl() {
		return adUrl;
	}

	public void setAdUrl(String adUrl) {
		this.adUrl = adUrl;
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

	public Integer getTabType() {
		return tabType;
	}

	public void setTabType(Integer tabType) {
		this.tabType = tabType;
	}
}
