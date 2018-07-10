package com.jiabian.sys.sysreturnmoney.response;

import java.math.BigDecimal;
import java.util.Date;

import com.jiabian.base.BaseRes;
import com.jiabian.base.io.request.IRequest;

public class SysReturnMoneyRes extends BaseRes implements IRequest {

	/**
	 * 退款Id
	 */
	private Long id;
	/**
	 * 用户编号
	 */
	private Long userId;
	/**
	 * 退款金额
	 */
	private BigDecimal returnMoney;
	/**
	 * 订单单号
	 */
	private String orderCode;
	/**
	 * 所属平台 ： 1.抢大运 2.商超 3.书画 4.健康
	 */
	private Byte belongPlatform;
	/**
	 * 付款方式 ： 1.家边通宝 2.支付宝 3.一网通 4.微信
	 */
	private Byte payWay;
	/**
	 * 付款账号
	 */
	private String payAccount;
	/**
	 * 支付时间
	 */
	private Date payTime;
	/**
	 * 退款状态： 0.申请退款 1.拒绝退款 2.同意退款 3.已退款
	 */
	private Byte returnStatus;
	/**
	 * 申请时间
	 */
	private Date applyTime;
	/**
	 * 处理时间
	 */
	private Date dealTime;
	/**
	 * 审核人
	 */
	private Long verifier;
	/**
	 * 审批人名称
	 */
	private String realName;
	/**
	 * 退款原因
	 */
	private String refundCause;
	/**
	 * 用户名称
	 */
	private String userName;
	/**
	 * 用户手机
	 */
	private String userTel;
	/**
	 * 商品编号
	 */
	private Long prodId;
	/**
	 * 商品名称
	 */
	private String prodName;
	/**
	 * 活动开始时间
	 */
	private Date startTime;
	/**
	 * 期数
	 */
	private Integer periods;
	/**
	 * 溢出金额
	 */
	private BigDecimal spilMoney;
	private String payPartake_time;
	
	

	public String getPayPartake_time() {
		return payPartake_time;
	}

	public void setPayPartake_time(String payPartake_time) {
		this.payPartake_time = payPartake_time;
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

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Integer getPeriods() {
		return periods;
	}

	public void setPeriods(Integer periods) {
		this.periods = periods;
	}

	public BigDecimal getSpilMoney() {
		return spilMoney;
	}

	public void setSpilMoney(BigDecimal spilMoney) {
		this.spilMoney = spilMoney;
	}

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

	public BigDecimal getReturnMoney() {
		return returnMoney;
	}

	public void setReturnMoney(BigDecimal returnMoney) {
		this.returnMoney = returnMoney;
	}

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
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

	public String getPayAccount() {
		return payAccount;
	}

	public void setPayAccount(String payAccount) {
		this.payAccount = payAccount;
	}

	public Date getPayTime() {
		return payTime;
	}

	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}

	public Byte getReturnStatus() {
		return returnStatus;
	}

	public void setReturnStatus(Byte returnStatus) {
		this.returnStatus = returnStatus;
	}

	public Date getApplyTime() {
		return applyTime;
	}

	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
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

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getRefundCause() {
		return refundCause;
	}

	public void setRefundCause(String refundCause) {
		this.refundCause = refundCause;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserTel() {
		return userTel;
	}

	public void setUserTel(String userTel) {
		this.userTel = userTel;
	}

}
