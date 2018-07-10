package com.jiabian.sys.sysreturnmoney.request;

import java.math.BigDecimal;
import java.util.Date;

import com.jiabian.base.BaseReq;
import com.jiabian.base.io.request.IRequest;

public class SysReturnMoneyReq extends BaseReq implements IRequest {

	private static final long serialVersionUID = 1L;

	/**
	 * 退款编号
	 */
	private Long id;
	/**
	 * 用户名
	 */
	private String userName;
	/**
	 * 支付时间 （抢大运有毫秒）
	 */
	private Date payTime;
	/**
	 * 所属平台 ： 1.抢大运 2.商超 3.书画 4.健康
	 */
	private Byte belongPlatform;
	/**
	 * 付款方式 ： 1.家边通宝 2.支付宝 3.一网通 4.微信
	 */
	private Byte payWay;
	/**
	 * 查询开始时间
	 */
	private Date seekStarTime;
	/**
	 * 查询结束时间
	 */
	private Date seekEndTime;
	/**
	 * 查询开始时间
	 */
	private String theSeekStarTime;
	/**
	 * 查询结束时间
	 */
	private String theSeekEndTime;
	/**
	 * 处理时间
	 */
	private Date dealTime;
	/**
	 * 审核人
	 */
	private Long verifier;
	/**
	 * 退款状态： 0.申请退款 1.拒绝退款 2.同意退款 3.已退款
	 */
	private Byte returnStatus;
	/**
	 * 提示信息
	 */
	private String msg;
	/**
	 * 溢出金额
	 */
	private BigDecimal spilMoney;
	/**
	 * 商品名称
	 */
	private String prodName;
	/**
	 * 商品编号
	 */
	private Long prodId;
	/**
	 * 商品编号数组
	 */
	private String[] prodIdArr;
	/**
	 * 用户编号数组
	 */
	private String[] userIdArr;
	/**
	 * 抢大运支付记录Id
	 */
	private Long paypartake_Id;
	/**
	 * 抢大运支付记录Id数组
	 */
	private String[] paypartake_IdArr;
	/**
	 * 当前页
	 */
	private Long parentOffset;
	/**
	 * 状态（0.未开始1开始2.结束）
	 */
	private Byte status;

	/**
	 * 订单号
	 */
	private String OrderCode;

	/**
	 * 退款金额
	 */
	private BigDecimal refundAmount;

	/**
	 * 退款原因
	 */
	private String refundReason;

	/**
	 * 来自于哪个平台，例如：来自于书画的订单就写SH
	 */
	private String platform;

	/**
	 * 总金额
	 */
	private BigDecimal totalAmount;

	/**
	 * 店铺Id
	 */
	private Long shopId;

	public Long getShopId() {
		return shopId;
	}

	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}

	public BigDecimal getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getOrderCode() {
		return OrderCode;
	}

	public void setOrderCode(String orderCode) {
		OrderCode = orderCode;
	}

	public BigDecimal getRefundAmount() {
		return refundAmount;
	}

	public void setRefundAmount(BigDecimal refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getRefundReason() {
		return refundReason;
	}

	public void setRefundReason(String refundReason) {
		this.refundReason = refundReason;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public Byte getStatus() {
		return status;
	}

	public void setStatus(Byte status) {
		this.status = status;
	}

	public Long getParentOffset() {
		return parentOffset;
	}

	public void setParentOffset(Long parentOffset) {
		this.parentOffset = parentOffset;
	}

	public String[] getPaypartake_IdArr() {
		return paypartake_IdArr;
	}

	public void setPaypartake_IdArr(String[] paypartake_IdArr) {
		this.paypartake_IdArr = paypartake_IdArr;
	}

	public Long getPaypartake_Id() {
		return paypartake_Id;
	}

	public void setPaypartake_Id(Long paypartake_Id) {
		this.paypartake_Id = paypartake_Id;
	}

	public String[] getUserIdArr() {
		return userIdArr;
	}

	public void setUserIdArr(String[] userIdArr) {
		this.userIdArr = userIdArr;
	}

	public Long getProdId() {
		return prodId;
	}

	public void setProdId(Long prodId) {
		this.prodId = prodId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public BigDecimal getSpilMoney() {
		return spilMoney;
	}

	public void setSpilMoney(BigDecimal spilMoney) {
		this.spilMoney = spilMoney;
	}

	public String[] getProdIdArr() {
		return prodIdArr;
	}

	public void setProdIdArr(String[] prodIdArr) {
		this.prodIdArr = prodIdArr;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Date getDealTime() {
		return dealTime;
	}

	public void setDealTime(Date dealTime) {
		this.dealTime = dealTime;
	}

	public Long getVerifier() {
		return verifier;
	}

	public void setVerifier(Long verifier) {
		this.verifier = verifier;
	}

	public Byte getReturnStatus() {
		return returnStatus;
	}

	public void setReturnStatus(Byte returnStatus) {
		this.returnStatus = returnStatus;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getPayTime() {
		return payTime;
	}

	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}

	public Byte getBelongPlatform() {
		return belongPlatform;
	}

	public void setBelongPlatform(Byte belongPlatform) {
		this.belongPlatform = belongPlatform;
	}

	public Byte getPayWay() {
		return payWay;
	}

	public void setPayWay(Byte payWay) {
		this.payWay = payWay;
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

	public void setTheSeekStarTime(String theSeekStarTime) {
		this.theSeekStarTime = theSeekStarTime;
	}

	public String getTheSeekEndTime() {
		return theSeekEndTime;
	}

	public void setTheSeekEndTime(String theSeekEndTime) {
		this.theSeekEndTime = theSeekEndTime;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
