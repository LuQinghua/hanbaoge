package com.jiabian.base.io.request;

/**
 * 请求的头部
 * 
 * @author Administrator
 * 
 */
public class ReqHttpHeaders {

	private String iss;//网址
	private String exp;//时间搓
	private String company;//公司名
	private String awesome;//true
	/**
	 * 签名
	 */
	private String signing;


	public String getIss() {
		return iss;
	}

	public void setIss(String iss) {
		this.iss = iss;
	}

	public String getExp() {
		return exp;
	}

	public void setExp(String exp) {
		this.exp = exp;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getAwesome() {
		return awesome;
	}

	public void setAwesome(String awesome) {
		this.awesome = awesome;
	}

	public String getSigning() {
		return signing;
	}

	public void setSigning(String signing) {
		this.signing = signing;
	}
 

}
