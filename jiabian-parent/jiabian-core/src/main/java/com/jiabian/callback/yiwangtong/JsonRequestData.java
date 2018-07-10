package com.jiabian.callback.yiwangtong;

import java.io.Serializable;
import java.util.List;

public class JsonRequestData implements Serializable{

	private static final long serialVersionUID = 1L;

	/**
	 * 接口版本号，固定为”1.0”
	 */
	private String version;

	/**
	 * 参数编码，固定为UTF-8
	 */
	private String charset;

	/**
	 * 报文签名
	 */
	private String sign;

	/**
	 * 签名算法，固定为”RSA”
	 */
	private String signType;

	/**
	 * 应答数据
	 */
	private List<CallBackNoticeData> noticeData;

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getCharset() {
		return charset;
	}

	public void setCharset(String charset) {
		this.charset = charset;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public String getSignType() {
		return signType;
	}

	public void setSignType(String signType) {
		this.signType = signType;
	}

	public List<CallBackNoticeData> getNoticeData() {
		return noticeData;
	}

	public void setNoticeData(List<CallBackNoticeData> noticeData) {
		this.noticeData = noticeData;
	}

}
