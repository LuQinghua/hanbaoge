package com.jiabian.sys.activity.request;

import java.util.Date;

import com.jiabian.base.BaseReq;

public class QdyBuyReq extends BaseReq {
	private static final long serialVersionUID = 1L;
	private Long id;
	
	private String checkIds;

	private Long buyPartake_id;

	private Date buyPartake_time;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCheckIds() {
		return checkIds;
	}

	public void setCheckIds(String checkIds) {
		this.checkIds = checkIds;
	}

	public Long getBuyPartake_id() {
		return buyPartake_id;
	}

	public void setBuyPartake_id(Long buyPartake_id) {
		this.buyPartake_id = buyPartake_id;
	}

	public Date getBuyPartake_time() {
		return buyPartake_time;
	}

	public void setBuyPartake_time(Date buyPartake_time) {
		this.buyPartake_time = buyPartake_time;
	}

}
