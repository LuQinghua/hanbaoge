package com.jiabian.json;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

/**
 * 
 * 定制json 转换
 * CustomObjectMapper
 * 创建人:黄世平
 * 时间：2016年11月8日-上午9:32:51 
 * @version 1.0.0
 *
 */
public class CustomObjectMapper extends ObjectMapper {
	private static final long serialVersionUID = 1L;

	public CustomObjectMapper() {
		// json序列化时将number类型转成string，保证小数点.00的显示
		// this.configure(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS, true); // 前台来处理
		this.configure(JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN, true);
		// this.configure(SerializationFeature.WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS,true);
		// 空串不处理
		 this.setSerializationInclusion(Include.NON_NULL);

		// 时间改为毫秒
		this.configure(SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS, false);
		// 格式化输入出
		this.configure(SerializationFeature.INDENT_OUTPUT, true);
	}
}
