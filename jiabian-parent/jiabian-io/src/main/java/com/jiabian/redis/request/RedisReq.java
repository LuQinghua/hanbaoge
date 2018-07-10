package com.jiabian.redis.request;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.jiabian.base.BaseReq;
import com.jiabian.base.io.request.IRequest;

@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class RedisReq extends BaseReq implements IRequest{

	private static final long serialVersionUID = 1L;
    
	/**
	 * redis key值
	 */
	private String key;
    
	/**
	 * redis key值的数组
	 */
	private String[] keysArr;
	
	public String[] getKeysArr() {
		return keysArr;
	}

	public void setKeysArr(String[] keysArr) {
		this.keysArr = keysArr;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

}
