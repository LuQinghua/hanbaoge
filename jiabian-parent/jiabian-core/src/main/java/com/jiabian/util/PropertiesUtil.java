package com.jiabian.util;

import java.io.InputStream;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PropertiesUtil {
	private static final String DEFAULT_RESULT_CODE_PROPERTIES_FILE = "global.properties";
	private static Properties resultCode = new Properties();
	private static final Logger logger = LogManager.getLogger(PropertiesUtil.class);
	private static boolean isLoad;
	
	private static boolean init() {
		boolean ret = false;
		InputStream fis = null;
		try {
			// 构造时获取到项目的物理根目录
			fis = PropertiesUtil.class.getClassLoader().getResourceAsStream(DEFAULT_RESULT_CODE_PROPERTIES_FILE);
			if (fis == null) {
				logger.error("{}-文件未找到。", DEFAULT_RESULT_CODE_PROPERTIES_FILE);
			}
			if (fis != null) {
				resultCode.load(fis);
				isLoad = true;
				ret = true;
			}
		} catch (Exception e) {
			logger.error("PropertiesUtil-初始化异常", e);
		} finally {
			try {
				if (fis != null) {
					fis.close();
				}
			} catch (Exception e) {
				logger.error("PropertiesUtil-初始化异常", e);
			}
		}
		return ret;
	}
	
	
	public static String getProperties(String key){
		try {
			if (!isLoad) {
				init();
			}
			String ret = resultCode.getProperty(key);
			if (ret == null) {
				return key;
			}
			return ret;
		} catch (Exception e) {
			logger.error("PropertiesUtil-字符转换异常", e);
		}
		return "";
	}
}
