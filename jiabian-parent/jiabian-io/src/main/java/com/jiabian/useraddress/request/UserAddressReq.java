package com.jiabian.useraddress.request;

import java.util.Date;

public class UserAddressReq {
	/**
	 * 编号
	 */
	private Long id;
	/**
	 * 收货人
	 */
	private String receiver;
	/**
	 * 用户编号
	 */
	private Long userId;
	/**
	 * 联系电话
	 */
	private String telPhone;
	/**
	 * 家庭电话
	 */
	private String homeTel;
	/**
	 * 所在地址
	 */
	private String address;
	/**
	 * 详细地址
	 */
	private String addressInfo;
	/**
	 * 邮箱
	 */
	private String email;
	/**
	 * 邮政编码
	 */
	private String postCode;
	/**
	 * 地址别名
	 */
	private String addNickName;
	/**
	 * 备注
	 */
	private String remark;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 修改时间
	 */
	private Date updateTime;
	/**
	 * 性别 （0:没有选 1先生 , 2女生）
	 */
	private Byte gender;
	/**
	 * 是否楼梯房 （0不是，1是）
	 */
	private Byte isStair;
	/**
	 * 地址标签 （0无，1公司，2家 ，3学校）
	 */
	private Byte label;
	/**
	 * 是否默认（1：关闭，2：开启）
	 */
	private Byte isDefault;
	/**
	 * 楼层号
	 */
	private Integer floor;
	/**
	 * 所属区域： 省
	 */
	private Long province;
	/**
	 * 所属区域： 市
	 */
	private Long city;
	/**
	 * 坐标
	 */
	private String coordinate;
	/**
	 * 所属区域： 区
	 */
	private Long area;
	/**
	 * 删除标记（1：正常，2：删除）
	 */
	private Byte isDel;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver == null ? null : receiver.trim();
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getTelPhone() {
		return telPhone;
	}

	public void setTelPhone(String telPhone) {
		this.telPhone = telPhone == null ? null : telPhone.trim();
	}

	public String getHomeTel() {
		return homeTel;
	}

	public void setHomeTel(String homeTel) {
		this.homeTel = homeTel == null ? null : homeTel.trim();
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address == null ? null : address.trim();
	}

	public String getAddressInfo() {
		return addressInfo;
	}

	public void setAddressInfo(String addressInfo) {
		this.addressInfo = addressInfo == null ? null : addressInfo.trim();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email == null ? null : email.trim();
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode == null ? null : postCode.trim();
	}

	public String getAddNickName() {
		return addNickName;
	}

	public void setAddNickName(String addNickName) {
		this.addNickName = addNickName == null ? null : addNickName.trim();
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark == null ? null : remark.trim();
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

	public Byte getGender() {
		return gender;
	}

	public void setGender(Byte gender) {
		this.gender = gender;
	}

	public Byte getIsStair() {
		return isStair;
	}

	public void setIsStair(Byte isStair) {
		this.isStair = isStair;
	}

	public Byte getLabel() {
		return label;
	}

	public void setLabel(Byte label) {
		this.label = label;
	}

	public Byte getIsDefault() {
		return isDefault;
	}

	public void setIsDefault(Byte isDefault) {
		this.isDefault = isDefault;
	}

	public Integer getFloor() {
		return floor;
	}

	public void setFloor(Integer floor) {
		this.floor = floor;
	}

	public Long getProvince() {
		return province;
	}

	public void setProvince(Long province) {
		this.province = province;
	}

	public Long getCity() {
		return city;
	}

	public void setCity(Long city) {
		this.city = city;
	}

	public String getCoordinate() {
		return coordinate;
	}

	public void setCoordinate(String coordinate) {
		this.coordinate = coordinate == null ? null : coordinate.trim();
	}

	public Long getArea() {
		return area;
	}

	public void setArea(Long area) {
		this.area = area;
	}

	public Byte getIsDel() {
		return isDel;
	}

	public void setIsDel(Byte isDel) {
		this.isDel = isDel;
	}

}
