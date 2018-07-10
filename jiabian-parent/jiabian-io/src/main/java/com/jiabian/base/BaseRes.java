package com.jiabian.base;

import org.apache.commons.lang3.builder.ToStringBuilder;


/**
 * 
 * 响应参数基类
 * BaseRes
 * 创建人:黄世平
 * 时间：2016年11月8日-上午9:16:31 
 * @version 1.0.0
 *
 */
public abstract class BaseRes {
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
