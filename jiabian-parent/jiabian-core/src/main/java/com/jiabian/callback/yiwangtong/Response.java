/**
 * 家边网络科技有限公司
 * jiabian-core
 * com.jiabian.callback.yiwangtong
 * Response.java
 * 创建人:潇洒
 * 时间：2016-12-1-上午11:28:56 
 * 2016家边网络科技有限公司-版权所有
 */
package com.jiabian.callback.yiwangtong;

import java.util.Map;

/**
 * Response 创建人:潇洒 时间：2016-12-1-上午11:28:56
 */
public class Response<K, V> {

	private String version = "1.0";

	private String charset = "UTF-8";

	private String sign;

	private String signType = "SHA-256";

	private Map<K, V> reqData;

	public Response() {

	}

	public Map<K, V> getReqData() {
		return reqData;
	}

	public void setReqData(Map<K, V> reqData) {
		this.reqData = reqData;
	}

	public void setResponse(String version, String charset, String signType,
			String sign) {
		this.sign = sign;
		this.charset = charset;
		this.version = version;
	}

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

	public void setSign(String sign) {
		this.sign = sign;
	}

	public String getSignType() {
		return signType;
	}

	public void setSignType(String signType) {
		this.signType = signType;
	}

	public String getSign() {
		return sign;
	}

}
