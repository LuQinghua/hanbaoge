package com.jiabian.pay.wxpay;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.RandomStringUtils;

import com.jiabian.util.ConfigUtil;
  
public class PayCommonUtil {  
      
    /** 
     * 是否签名正确,规则是:按参数名称a-z排序,遇到空值的参数不参加签名。 
     * @return boolean 
     */  
    public static boolean isTenpaySign(String characterEncoding, SortedMap<Object, Object> packageParams, String API_KEY) {  
        StringBuffer sb = new StringBuffer();  
        Set<Entry<Object, Object>> es = packageParams.entrySet();  
        Iterator<Entry<Object, Object>> it = es.iterator();  
        while(it.hasNext()) {  
            Map.Entry entry = (Map.Entry)it.next();  
            String k = (String)entry.getKey();  
            String v = (String)entry.getValue();  
            if(!"sign".equals(k) && null != v && !"".equals(v)) {  
                sb.append(k + "=" + v + "&");  
            }  
        }  
        sb.append("key=" + API_KEY);  
        //算出摘要  
        String mysign = MD5Util.MD5Encode(sb.toString(), characterEncoding).toLowerCase();  
        String tenpaySign = ((String)packageParams.get("sign")).toLowerCase();  
        return tenpaySign.equals(mysign);  
    }  
  
    /** 
     * @author 
     * @date 2016-4-22 
     * @Description：sign签名 
     * @param characterEncoding 
     *            编码格式 
     * @param parameters 
     *            请求参数 
     * @return 
     */  
    public static String createSign(String characterEncoding, SortedMap<String, Object> map, String API_KEY) {  
        StringBuffer sb = new StringBuffer();  
        Set<Entry<String, Object>> es = map.entrySet();  
        Iterator<Entry<String, Object>> it = es.iterator();  
        while (it.hasNext()) {  
            Map.Entry entry = (Map.Entry) it.next();  
            String k = (String) entry.getKey();  
            String v = (String) entry.getValue();  
            if (null != v && !"".equals(v) && !"sign".equals(k) && !"key".equals(k)) {  
                sb.append(k + "=" + v + "&");  
            }  
        }  
        sb.append("key=" + API_KEY);
        String sign = MD5Util.MD5Encode(sb.toString(), characterEncoding).toUpperCase();  
        return sign;  
    }  
  
    /** 
     * @author 
     * @date 2016-4-22 
     * @Description：将请求参数转换为xml格式的string 
     * @param parameters 
     *            请求参数 
     * @return 
     */  
    public static String getRequestXml(SortedMap<String, Object> parameters) {  
        StringBuffer sb = new StringBuffer();  
        sb.append("<xml>");  
        Set<Entry<String, Object>> es = parameters.entrySet();  
        Iterator<Entry<String, Object>> it = es.iterator();  
        while (it.hasNext()) {  
            Map.Entry entry = (Map.Entry) it.next();  
            String k = (String) entry.getKey();  
            String v = (String) entry.getValue();  
            if ("attach".equalsIgnoreCase(k) || "body".equalsIgnoreCase(k) || "sign".equalsIgnoreCase(k)) {  
                sb.append("<" + k + ">" + v + "</" + k + ">");
            } else {  
                sb.append("<" + k + ">" + v + "</" + k + ">");  
            }  
        }  
        sb.append("</xml>");  
        return sb.toString();  
    }  
  
    /** 
     * 取出一个指定长度大小的随机正整数. 
     *  
     * @param length 
     *            int 设定所取出随机数的长度。length小于11 
     * @return int 返回生成的随机数。 
     */  
    public static int buildRandom(int length) {  
        int num = 1;  
        double random = Math.random();  
        if (random < 0.1) {  
            random = random + 0.1;  
        }  
        for (int i = 0; i < length; i++) {  
            num = num * 10;  
        }  
        return (int) ((random * num));  
    }  
  
    
    /**
     * 获取一定长度的随机字符串
     * @param length 指定字符串长度
     * @return 一定长度的字符串
     */
    public static String getRandomStringByLength(int length) {
        String base = "abcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(base.length());
            sb.append(base.charAt(number));
        }
        return sb.toString();
    }
    
    //获取iP地址
  	public static String getRemoteIP(HttpServletRequest request) {
  		String ip = request.getHeader("x-forwarded-for");
  		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
  			ip = request.getHeader("Proxy-Client-IP");
  		}
  		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
  			ip = request.getHeader("WL-Proxy-Client-IP");
  		}
  		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
  			ip = "183.129.165.206";
  		}
  		if (ip != null && ip.length() > 0) {
  			String[] ipArray = ip.split(",");
  			if (ipArray != null && ipArray.length > 1) {
  				return ipArray[0];
  			}
  			return ip;
  		}

  		return "未知IP";
  	}
  	
  	/**
  	 * 微信支付前组装数据
  	 * com.jiabian.pay.wxpay 
  	 * 方法名：packSource
  	 * 创建人：熊天威
  	 * 时间：2017年2月8日-上午10:06:01 
  	 * @param payInfo
  	 * @param out_trade_no
  	 * @param order_price
  	 * @param notify_url
  	 * @param request
  	 * @return SortedMap<String,Object>
  	 * @exception 
  	 * @since  1.0.0
  	 */
  	public static SortedMap<String, Object> packSource(String payInfo,String out_trade_no,String order_price,String notify_url,HttpServletRequest request){
  		SortedMap<String, Object> map = new TreeMap<>();
        map.put("appid",ConfigUtil.getConfig(PayConfigUtil.WX_PC_ID));
        map.put("mch_id",ConfigUtil.getConfig(PayConfigUtil.WX_PC_MCH_ID));
        map.put("nonce_str",RandomStringUtils.randomAlphabetic(20));
        map.put("body",payInfo);
        map.put("out_trade_no",out_trade_no);
        map.put("total_fee",String.valueOf(order_price));
        map.put("spbill_create_ip",getRemoteIP(request));
        map.put("notify_url",notify_url);
        map.put("trade_type",PayConfigUtil.getTrade_type());
        return map;
  	}
}  