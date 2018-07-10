package com.jiabian.cache;


/**
 * 
 * redis 异常处理
 * RedisException
 * 创建人:黄世平
 * 时间：2016年11月8日-上午9:30:18 
 * @version 1.0.0
 *
 */
public class RedisException extends RuntimeException {

	private static final long serialVersionUID = 7548999587337586754L;

	public RedisException(String message) {
		super(message);
	}

	public RedisException(String message, Throwable throwable) {
		super(message, throwable);
	}

}