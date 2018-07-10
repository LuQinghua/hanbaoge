package com.jiabian.pay.wxpay;

import javax.servlet.http.HttpServletRequest;

import com.jiabian.util.PropertiesUtil;
/**
 * PayConfigUtil
 * 创建人:熊天威
 * 时间：2017年3月7日-上午9:35:33 
 * @version 1.0.0
 *
 */
public class PayConfigUtil {
    //每次自己Post数据给API的时候都要用这个key来对所有字段进行签名，生成的签名会放在Sign这个字段，API收到Post数据的时候也会用同样的签名算法对Post过来的数据进行签名和验证  
    //收到API的返回的时候也要用这个key来对返回的数据算下签名，跟API的Sign数据进行比较，如果值不一致，有可能数据被第三方给篡改  
    public final static String WX_PC_KEY = "WX_PC_KEY";  
  
    //微信分配的公众号ID（开通公众号之后可以获取到）  
    public final static String WX_PC_ID = "WX_PC_ID";  
  
    //微信支付分配的商户号ID（开通公众号的微信支付功能之后可以获取到）  
    public final static String WX_PC_MCH_ID = "WX_PC_MCH_ID"; 
    
    //交易类型	
    private static String trade_type = "NATIVE";  
    
    //回调地址  
    public static String NOTIFY_URL = PropertiesUtil.getProperties("pay.link")+"/pay/weixin_notify";
    
    //后台经销商微信回调地址  
    public static String sys_sale_NOTIFY_URL = PropertiesUtil.getProperties("pay.link")+"/saleProduct/weixin_notify";
    
    //后台经销商微信跳转地址
    public static String sys_sale_return_URL = PropertiesUtil.getProperties("pay.link");
    
    //抢大运回调地址  
    public static String WX_URL = PropertiesUtil.getProperties("pay.link")+"/index/wxotify";
  
    //1）被扫支付API  
    public static String PAY_API = "https://api.mch.weixin.qq.com/pay/unifiedorder";
    
    //商户给微信的回应
  	public static final String WXPAY_RESULT = "<xml><return_code><![CDATA[SUCCESS]]></return_code><return_msg><![CDATA[OK]]></return_msg></xml>";
    
    /*//2）被扫支付查询API  
    public static String PAY_QUERY_API = "https://api.mch.weixin.qq.com/pay/orderquery";  
  
    //3）退款API  
    public static String REFUND_API = "https://api.mch.weixin.qq.com/secapi/pay/refund";  
  
    //4）退款查询API  
    public static String REFUND_QUERY_API = "https://api.mch.weixin.qq.com/pay/refundquery";  
  
    //5）撤销API  
    public static String REVERSE_API = "https://api.mch.weixin.qq.com/secapi/pay/reverse";  
  
    //6）下载对账单API  
    public static String DOWNLOAD_BILL_API = "https://api.mch.weixin.qq.com/pay/downloadbill";  
  
    //7) 统计上报API  
    public static String REPORT_API = "https://api.mch.weixin.qq.com/payitil/report";  
      
    //测试  
    public static String HttpsRequestClassName = "com.entplus.wxpay.util.HttpsRequest";  */
  
  	
  	
    //获取id地址
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


	public static String getTrade_type() {
		return trade_type;
	}

	public static void setTrade_type(String trade_type) {
		PayConfigUtil.trade_type = trade_type;
	}

	public static String getNOTIFY_URL() {
		return NOTIFY_URL;
	}

	public static void setNOTIFY_URL(String nOTIFY_URL) {
		NOTIFY_URL = nOTIFY_URL;
	}

	public static String getPAY_API() {
		return PAY_API;
	}

	public static void setPAY_API(String pAY_API) {
		PAY_API = pAY_API;
	}
  	
}  

