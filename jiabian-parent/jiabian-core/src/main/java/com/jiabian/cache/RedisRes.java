package com.jiabian.cache;

import java.io.Serializable;

public class RedisRes implements Serializable{

	private static final long serialVersionUID = 1L;
	
	/**
	 * redis key值
	 */
    private String key;
    /**
     * redis values值
     */
    private String value;
    
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
    
}
