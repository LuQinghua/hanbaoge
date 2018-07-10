package com.jiabian.util;

import java.util.HashMap;
import java.util.Map;


/**
 * author huangshiping
 * 
 * @date:Aug 28, 201511:48:42 AM
 * @version:1.0
 * 
 */

public final class ConfigUtil {

	public static Map<String, String> map = new HashMap<String, String>();

	/**
	 * 
	 * 获取配置文件值
	 * com.jiabian.util 
	 * 方法名：getConfig
	 * 创建人：黄世平
	 * 时间：2017年1月18日-上午11:23:38 
	 * @param key
	 * @return String
	 * @exception 
	 * @since  1.0.0
	 */
	public static String getConfig(String key) {
		return map.get(key);
	}

}
