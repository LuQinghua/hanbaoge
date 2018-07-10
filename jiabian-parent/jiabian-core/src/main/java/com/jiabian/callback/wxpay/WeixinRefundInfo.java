package com.jiabian.callback.wxpay;

/**
 * 微信退款 WeixinRefundInfo 创建人:潇洒 时间：2016年12月30日-下午4:48:15
 */
public class WeixinRefundInfo {

	/**
	 * 应用ID
	 */
	private String appid;

	/**
	 * 商户号
	 */
	private String mch_id;

	/**
	 * 随机字符串
	 */
	private String nonce_str;

	/**
	 * 签名
	 */
	private String sign;

	/**
	 * 商户订单号
	 */
	private String out_trade_no;

	/**
	 * 商户退款单号
	 */
	private String out_refund_no;

	/**
	 * 总金额
	 */
	private String total_fee;

	/**
	 * 退款金额
	 */
	private String refund_fee;

	/**
	 * 操作员帐号, 默认为商户号
	 */
	private String op_user_id;

	public String getAppid() {
		return appid;
	}

	public void setAppid(String appid) {
		this.appid = appid;
	}

	public String getMch_id() {
		return mch_id;
	}

	public void setMch_id(String mch_id) {
		this.mch_id = mch_id;
	}

	public String getNonce_str() {
		return nonce_str;
	}

	public void setNonce_str(String nonce_str) {
		this.nonce_str = nonce_str;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public String getOut_trade_no() {
		return out_trade_no;
	}

	public void setOut_trade_no(String out_trade_no) {
		this.out_trade_no = out_trade_no;
	}

	public String getOut_refund_no() {
		return out_refund_no;
	}

	public void setOut_refund_no(String out_refund_no) {
		this.out_refund_no = out_refund_no;
	}

	public String getTotal_fee() {
		return total_fee;
	}

	public void setTotal_fee(String total_fee) {
		this.total_fee = total_fee;
	}

	public String getRefund_fee() {
		return refund_fee;
	}

	public void setRefund_fee(String refund_fee) {
		this.refund_fee = refund_fee;
	}

	public String getOp_user_id() {
		return op_user_id;
	}

	public void setOp_user_id(String op_user_id) {
		this.op_user_id = op_user_id;
	}

}
