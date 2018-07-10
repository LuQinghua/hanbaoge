/**
 * 家边网络科技有限公司
 * jiabian-core
 * com.jiabian.callback.yiwangtong
 * PublicKey.java
 * 创建人:潇洒
 * 时间：2016-12-3-上午9:50:08 
 * 2016家边网络科技有限公司-版权所有
 */
package com.jiabian.callback.yiwangtong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import redis.clients.jedis.JedisCluster;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.jiabian.cache.JedisUtil;
import com.jiabian.util.ConfigUtil;
import com.jiabian.util.Constants;

/**
 * PublicKey
 * 创建人:潇洒
 * 时间：2016-12-3-上午9:50:08 
 * 查询招行公钥
 */
public class FbPubKey {
	private static final Logger logger = LogManager.getLogger(FbPubKey.class.getName());
	@Autowired
	JedisCluster jedisCluster;
	/**
	 * 把待签名的数据放到map里
	 */
	public static Map<String, String> reqDataMap(){
		
		Map<String, String> reqDataMap = new HashMap<String, String>();
		reqDataMap.put("dateTime",YwtUtils.getTime());
		reqDataMap.put("txCode", YwtUtils.TXCODE);
		reqDataMap.put("branchNo", ConfigUtil.getConfig(YwtUtils.YWT_BRANCHNO));
		reqDataMap.put("merchantNo", ConfigUtil.getConfig(YwtUtils.YWT_MERCHANTNO));
		logger.info("获取公钥待签名的map.reqDataMap:"+reqDataMap);
		return reqDataMap;
	}
	
	/**
	 * 对待签名的数据进行字典排序,并签名(加上商户密钥)
	 */
	public static String strToSign(Map<String, String> reqDataMap){
		
		List<String> sortParams = YwtUtils.sortParams(reqDataMap);
		String sign = YwtUtils.sign(reqDataMap);
		return sign;
	}
	
	
	/**
	 * 待发送的数据
	 */
	public static String jsonRequestData() {
		Response<String, String> jsonRequestData = new Response<>();
		jsonRequestData.setReqData(reqDataMap());
		jsonRequestData.setSign(strToSign(reqDataMap()));
		String jsonParam = JSON.toJSONString(jsonRequestData);
		return jsonParam;
		
	}
	
	
	/**
	 * 发送POST请求
	 */  
	public static String getResponse(String jsonParam) {
		OutputStreamWriter out = null;
		BufferedReader in = null;
		StringBuffer result = new StringBuffer();
		try {
			URL httpUrl = new URL(YwtUtils.COMMONKET);
			HttpURLConnection urlCon = (HttpURLConnection) httpUrl.openConnection();
			urlCon.setRequestMethod("POST");
			urlCon.setRequestProperty("Content-type", "application/x-www-form-urlencoded");
			urlCon.setDoOutput(true);
			urlCon.setDoInput(true);
			urlCon.setReadTimeout(5 * 1000);
			out = new OutputStreamWriter(urlCon.getOutputStream(),Constants.ENCODING);
			out.write("jsonRequestData=" + jsonParam);
			out.flush();

			in = new BufferedReader(new InputStreamReader(urlCon.getInputStream(), Constants.ENCODING));
			String str = null;
			while ((str = in.readLine()) != null) {
				result.append(str);
			}

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (out != null) {
					out.close();
				}
				if (in != null) {
					in.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return result.toString();
	}
	
	
	/**
	 * 获得招行公钥
	 */
	public static void getFbPubKey(){
		String response = getResponse(jsonRequestData());
		JSONObject json = new JSONObject().parseObject(response);
		JSONObject rspData = new JSONObject().parseObject(json.getString(("rspData")));
		if(rspData.get("rspCode").equals("SUC0000")){
			String fbPubKey = (String) rspData.get("fbPubKey");
			logger.info("fbPubKey:"+fbPubKey);
			JedisUtil.save(YwtUtils.FBPUBKEY,24*60*60, fbPubKey);
		}
	}
}
