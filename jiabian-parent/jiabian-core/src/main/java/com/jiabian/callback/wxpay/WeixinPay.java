/**
 * 家边网络科技有限公司
 * jiabian-core
 * com.jiabian.callback.wxpay
 * WeixinPay.java
 * 创建人:潇洒
 * 时间：2016-11-25-下午4:19:30 
 * 2016家边网络科技有限公司-版权所有
 */
package com.jiabian.callback.wxpay;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.springframework.ui.ModelMap;

import com.jiabian.util.ConfigUtil;
import com.jiabian.util.MD5;

/**
 * WeixinPay 
 * 创建人:潇洒 
 * 时间：2016-11-25-下午4:19:30
 */
public class WeixinPay {
	private static final Logger logger = LogManager.getLogger(WeixinPay.class.getName());
	
	
	/**
	 * 给移动端的参数
	 * @param notify_url 
	 */
	public static ModelMap weiXinAppPay(HttpServletRequest request, String orderPay,String wxNotify_url) {
		logger.info("WeixinPay--->weiXinAppPay");
		// 获取appid
		String appid = request.getParameter("appid");
		// 商品描述
		String body = request.getParameter("body");
		// 商户订单号
		String out_trade_no = request.getParameter("out_trade_no");
		if (StringUtils.isBlank(appid) || StringUtils.isBlank(body)
				|| StringUtils.isBlank(out_trade_no)||StringUtils.isBlank(orderPay)) {
			return null;
		}
		logger.info("移动端参数支付总额：" + orderPay);
		// 总金额
		String total_fee = new BigDecimal(orderPay).multiply(new BigDecimal("100")).setScale(0).toString();
		logger.info("移动端参数支付总额转换string：" + total_fee);
		return WxPayUtils.getModelMap(request, appid, body, out_trade_no,total_fee,wxNotify_url);
	}
	
	
	
	/**
	 * 微信回调
	 */
	
	public static Map<String, Object> weiXinCallBack(HttpServletRequest request) {
		Document inputdoc = null;
		try {
			SAXBuilder builder = new SAXBuilder();
			inputdoc = builder.build(request.getInputStream());
			logger.info("微信返回的流信息："+inputdoc);
		} catch (Exception e) {
			return null;
		}
		if (inputdoc == null) {
			return null;
		}
		Map<String, String> payParams = new HashMap<String, String>();
		Element root_in = inputdoc.getRootElement();
		List<Element> list = root_in.getChildren();
		
		logger.info("List:"+list.size());
		// 签名
		String sign = root_in.getChild("sign").getText();
		
		logger.info("签名："+sign);
		// 订单金额
		String total_fee = root_in.getChild("total_fee").getText();
		// 订单号
		String out_trade_no = root_in.getChild("out_trade_no").getText();
		
		for (Element em : list) {
			if (em.getText() != null && !"".equals(em.getName())
					&& !em.getName().equals("sign")) {
				payParams.put(em.getName(), em.getText());
			}
		}
		
		String[] keyArray2 = payParams.keySet().toArray(new String[0]);
		Arrays.sort(keyArray2);
		StringBuilder paySb = new StringBuilder();
		for (String key : keyArray2) {
			paySb.append(key).append("=").append(payParams.get(key)) 
					.append("&");
		}
		paySb.append("key=").append(ConfigUtil.getConfig(WxPayUtils.WX_APP_KEY));
		String paySign = MD5.MD5Encode(paySb.toString()).toUpperCase();
		Map<String, Object> map = new HashMap<>();
		map.put("total_fee", total_fee);
		map.put("out_trade_no", out_trade_no);
		map.put("sign", sign);
		map.put("paySign", paySign);
		return map;
	}
}
