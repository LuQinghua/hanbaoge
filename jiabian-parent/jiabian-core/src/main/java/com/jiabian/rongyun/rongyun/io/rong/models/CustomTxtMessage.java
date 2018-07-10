package com.jiabian.rongyun.rongyun.io.rong.models;

import com.jiabian.rongyun.rongyun.io.rong.util.GsonUtil;


//自定义消息
public class CustomTxtMessage extends Message {

	private String content;
	private String extra;
	
	public CustomTxtMessage(String content) {
	 //	this.type = "KM:TxtMsg";
		this.type = "JYJYRCMessageContent";
		this.content = content;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getExtra() {
		return extra;
		
	}

	public void setExtra(String extra) {
		this.extra = extra;
	}
	@Override
	public String toString() {
		return GsonUtil.toJson(this, CustomTxtMessage.class);
	}


}
