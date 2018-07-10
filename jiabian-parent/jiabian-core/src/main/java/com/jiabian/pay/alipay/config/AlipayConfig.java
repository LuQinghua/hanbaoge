package com.jiabian.pay.alipay.config;

import com.jiabian.util.PropertiesUtil;

/**
 * AlipayConfig
 * 创建人:熊天威
 * 时间：2017年3月7日-上午9:33:06 
 * @version 1.0.0
 *
 */
public class AlipayConfig {

	//商户的私钥,需要PKCS8格式，RSA公私钥生成：https://doc.open.alipay.com/doc2/detail.htm?spm=a219a.7629140.0.0.nBDxfy&treeId=58&articleId=103242&docType=1
	public static final String PC_PRIVATE_KEY ="AL_PC_PRIVATE_KEY";
	
	// 支付宝的公钥,查看地址：https://b.alipay.com/order/pidAndKey.htm
	public static final String PC_PUBLIC_KEY  = "AL_PC_PUBLIC_KEY";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static final String NOTIFY_URL = PropertiesUtil.getProperties("pay.link")+"/pay/alipayNotify";
	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	//抢大运回调
    public static final String QDY_NOTIFY_URL = PropertiesUtil.getProperties("pay.link")+"/index/hdAlipay";
    
    //系统后台经销商回调地址
    public static final String SYS_SALE_NOTIFY_URL= PropertiesUtil.getProperties("pay.link")+"/saleProduct/alipayNotify";
    
    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
 	public static final String SYS_SALE_RETURN_URL = PropertiesUtil.getProperties("pay.link");
    
	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static final String RETURN_URL = PropertiesUtil.getProperties("pay.link")+"/personal/goMyOrders";
	
	//抢大运
	public static final String QDY_RETURN_URL = PropertiesUtil.getProperties("pay.link")+"/index/activityList";
	
	// 调试用，创建TXT日志文件夹路径，见AlipayCore.java类中的logResult(String sWord)打印方法。
	public static final String log_path = "C:\\";
		
	// 支付类型 ，无需修改
	public static final String PAYMENT_TYPE = "1";
		
	// 调用的接口名，无需修改
	public static final String SERVICE = "create_direct_pay_by_user";

//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑
	
//↓↓↓↓↓↓↓↓↓↓ 请在这里配置防钓鱼信息，如果没开通防钓鱼功能，为空即可 ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
	
	// 防钓鱼时间戳  若要使用请调用类文件submit中的query_timestamp函数
	public static final String anti_phishing_key = "";
	
	// 客户端的IP地址 非局域网的外网IP地址，如：221.0.0.1
	public static final String exter_invoke_ip = "";
		
	
}
