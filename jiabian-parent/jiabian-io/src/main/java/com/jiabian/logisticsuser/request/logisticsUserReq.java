package com.jiabian.logisticsuser.request;

import java.util.Date;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.jiabian.base.BaseReq;
import com.jiabian.base.io.request.IRequest;

@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class logisticsUserReq extends BaseReq implements IRequest{
	private static final long serialVersionUID = 1L;
	/**
     * id编号
     */
    private Long id;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 手机号
     */
    private String userTel;
    /**
     * 0 未填 1 男 2 女
     */
    private Byte sex;
    /**
     * 工作号
     */
    private Long workId;
    /**
     * 物流人员账号
     */
    private String userName;
    /**
     * 物流人员登录密码
     */
    private String userPwd;
    
    /**
	 * 配送员形象图
	 */
    private String photograph;
    /**
     * 加盐
     */
    private String userSalt;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date updateTime;
    /**
     * 配送人员住址
     */
    private String address;
    private String idCard;
    private String idCardImg;
    /**
     * 真实姓名
     */
    private String realName;
    /**
     * 物流公司Id
     */
    private Long logComPanyId;
    /**
     * 省
     */
    private Long province;
    /**
     * 市
     */
    private Long city;
    /**
     * 配送区域
     */
    private Long area;
    /**
     * 是否删除(1：正常，2：删除)
     */
    private Byte isDel;
    /**
     * 区域经理id
     */
    private Long managerUserId;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserTel() {
		return userTel;
	}
	public void setUserTel(String userTel) {
		this.userTel = userTel;
	}
	public Byte getSex() {
		return sex;
	}
	public void setSex(Byte sex) {
		this.sex = sex;
	}
	public Long getWorkId() {
		return workId;
	}
	public void setWorkId(Long workId) {
		this.workId = workId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public String getPhotograph() {
		return photograph;
	}
	public void setPhotograph(String photograph) {
		this.photograph = photograph;
	}
	public String getUserSalt() {
		return userSalt;
	}
	public void setUserSalt(String userSalt) {
		this.userSalt = userSalt;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public String getIdCardImg() {
		return idCardImg;
	}
	public void setIdCardImg(String idCardImg) {
		this.idCardImg = idCardImg;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public Long getLogComPanyId() {
		return logComPanyId;
	}
	public void setLogComPanyId(Long logComPanyId) {
		this.logComPanyId = logComPanyId;
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
	public Long getManagerUserId() {
		return managerUserId;
	}
	public void setManagerUserId(Long managerUserId) {
		this.managerUserId = managerUserId;
	}
	
   
    
}
