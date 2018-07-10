package com.jiabian.rongyun.rongyun.io.rong;

import org.apache.http.HttpStatus;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.alibaba.fastjson.JSONObject;
import com.jiabian.rongyun.rongyun.io.rong.models.FormatType;
import com.jiabian.rongyun.rongyun.io.rong.models.SdkHttpResult;
import com.jiabian.util.ConfigUtil;
import com.jiabian.util.PropertiesUtil;


/**
 * 
 * @author ShanHe 获取token
 * 
 */
public class RongYunTokenUtil implements IToken {

	static Logger log = LogManager.getLogger(RongYunTokenUtil.class);

//	private final static String RONG_YUN_KEY = "pwe86ga5ep3u6";
//	private final static String RONG_YUN_SERCET = "8SMku6wjvqS";
	private final static String RY_KEY = "RY_KEY";
	private final static String RY_SERCET = "RY_SERCET";
	
	

	public static String getToken(String userId) {

		try {
			String key = PropertiesUtil.getProperties(ConfigUtil.getConfig(RY_KEY));
			String secret = PropertiesUtil.getProperties(ConfigUtil.getConfig(RY_SERCET));
			String userName = "";
			String portraitUri = "";
			String token = "";
			SdkHttpResult result = ApiHttpClient.getToken(key, secret, userId,
					userName, portraitUri, FormatType.json);
			// 将result.getResult()转为json后获取token
			if (result.getHttpCode() == HttpStatus.SC_OK) {
				JSONObject resultJson = JSONObject.parseObject(result
						.getResult());
				token = resultJson.getString("token");
				return token;
			} else {
				log.error("请求融去接口数异常，httpcode{}", result.getHttpCode());
				return "";
			}
		} catch (Exception e) {
			return "";
		}

	}

}
