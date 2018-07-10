package com.jiabian.kuaidi100;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;
import com.jiabian.json.JsonUtils;
import com.jiabian.util.ConfigUtil;
import com.jiabian.util.Constants;
import com.jiabian.util.HttpRequest;
import com.jiabian.util.MD5;

/**
 * 快递查询工具类
 * 
 * Kuaidi
 * 创建人:黄世平
 * 时间：2017年1月19日-下午3:55:10 
 * @version 1.0.0
 *
 */
public class Kuaidi {

	
	/**
	 * 
	 * 获取快递信息
	 * com.jiabian.util 
	 * 方法名：getExpressAgeInfo
	 * 创建人：黄世平
	 * 时间：2017年1月18日-下午5:37:30 
	 * @param com
	 * @param num
	 * @return JSONObject
	 * @exception 
	 * @since  1.0.0
	 */
	public static JSONObject getExpressAgeInfo(String com,String num){
		HashMap<String, String> params = new HashMap<String, String>();
		String param = getParam(com, num);
	    params.put("param",param);
		params.put("sign",MD5.encryptionStr(param+ConfigUtil.getConfig(Constants.K_KEY)+ConfigUtil.getConfig(Constants.K_CUSTOMER)));
		params.put("customer",ConfigUtil.getConfig(Constants.K_CUSTOMER));
		String resp = null;;
		try {
			resp = new HttpRequest().postData(Constants.K_URL, params, Constants.ENCODING).toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return JSONObject.parseObject(resp);
	}
	
	public static String getParam(String com,String num){
		Map<String,String> map = new HashMap<>();
		map.put("com", com.trim());
		map.put("num", num.trim());
		return JsonUtils.objectToJson(map);
	}
	
}
