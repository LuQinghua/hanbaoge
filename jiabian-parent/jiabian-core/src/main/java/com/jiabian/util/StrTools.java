package com.jiabian.util;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.jiabian.cache.JedisUtil;

/**
 * @author huangshiping
 */
public class StrTools extends StringUtils {
	/**
	 * 一天发验证码最多次数
	 */
	private static final String JYJY = "jyjy";
	private static final String PRO_CODE = "PRO";
	private static final String PROD_KEY = "PROD_ID_";
	private static final String SALE_ORDER_CODE = "SALE";
	public static final String QDY_CODE = "QDY";
	public static final String BUSINESS_APPLY = "BA";
	private static final Logger logger = LogManager.getLogger(StrTools.class);

	public static String StringFilter(String mobiles) {
		String temp = mobiles.replaceAll(" ", "");
		String regEx = "[`~!@#$%^&*()+=|';'\\[\\].<>/?~！_@#￥%……&*（）——+|【】‘；”“’。，、？]";
		Pattern p = Pattern.compile(regEx);
		Matcher m = p.matcher(temp);
		return m.replaceAll("").trim();
	}

	public static boolean isCNMobile(String mobiles) {
		if (StringUtils.isEmpty(mobiles)) {
			return false;
		}
		return mobiles
				.matches("^((13[0-9])|(14[5,7])|(15[^4,\\D])|(17[0,6-8])|(18[0-9]))\\d{8}$");
	}

	public static String getPointPraise(Integer pointPraise) {
		String temp = null;
		if (pointPraise > 9 && pointPraise < 100) {
			temp = pointPraise / 10 + "0+";
		} else if (pointPraise > 99 && pointPraise < 1000) {
			temp = pointPraise / 100 + "00+";
		} else if (pointPraise > 999) {
			int i = pointPraise / 1000;
			int j = pointPraise % 1000 / 100;
			if (j != 0) {
				temp = i + "." + j + "k+";
			} else {
				temp = i + "k+";
			}
		} else {
			temp = pointPraise + "";
		}
		return temp;
	}

	/**
	 * 
	 * 获取用户名 com.jiabian.util 方法名：getUserName 创建人：黄世平 时间：2016年11月8日-上午9:12:19
	 * 
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public static String getUserName() {
		return appendString(JYJY, RandomStringUtils.randomAlphabetic(8));
	}

	/**
	 * 
	 * 生成产品编号 com.jiabian.util 方法名：getProCode 创建人：黄世平 时间：2016年11月21日-上午11:22:01
	 * 
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public static String getProCode() {
		return appendString(PRO_CODE, System.currentTimeMillis(),
				RandomStringUtils.randomAlphabetic(6).toUpperCase());
	}

	public static String getInvitationCode() {
		return RandomStringUtils.randomNumeric(5);
	}

	public static String getSaleOrderCode() {
		return new StringBuilder().append(SALE_ORDER_CODE)
				.append(RandomStringUtils.randomAlphabetic(2).toUpperCase())
				.append(DateUtil.getSysTime()).toString();
	}

	public static String getOrderCode(String platform) {
		return appendString(platform, RandomStringUtils.randomNumeric(19));
	}

	/**
	 * 
	 * 获取抢拍码 com.jiabian.util 方法名：getPartakeNum 创建人：张铁成 时间：2016年12月20日-下午3:46:28
	 * 
	 * @param prodId
	 *            商品Id
	 * @param prodPrice
	 *            商品价格
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public static String getPartakeNum(Long prodId, Integer prodPrice) {
		if (prodId == null || prodPrice == null) {
			return null;
		}
		logger.info("生成抢拍码开始");
		Long count = JedisUtil.incr(getParTakeKey(prodId));// 获得自增码
		int prodPriceLen = getNumLen(prodPrice.toString());// 获得商品价格长度
		int countLen = getNumLen(count.toString());// 获得自增码长度
		int num = prodPriceLen - countLen; // 差几位 就加几个零
		logger.info("生成抢拍码结束");
		if (count > prodPrice) {
			return getNextStr(prodId, count, Long.valueOf(prodPrice));
		}
		return getZer(num, count);
	}

	public static String getNextStr(Long prodId, Long count, Long prodPrice) {
		return appendString("proId", ",", ",", count - prodPrice);
	}

	public static String getZer(int num, Long count) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < num; i++) {
			sb.append("0");
		}
		return sb.append(count).toString();
	}

	public static int getNumLen(String prodPrice) {

		return prodPrice.length();
	}

	public static String getParTakeKey(Long prodId) {
		return appendString(PROD_KEY, prodId);
	}

	public static boolean GenerateImage(String imgStr) { // 对字节数组字符串进行Base64解码并生成图片
		if (imgStr == null) {
			return false;
		}

		try {
			// Base64解码
			byte[] b = Base64Utils.decode(imgStr);
			for (int i = 0; i < b.length; ++i) {
				if (b[i] < 0) {// 调整异常数据
					b[i] += 256;
				}
			}
			// 生成jpeg图片
			OutputStream out = new FileOutputStream("C:/Users/Star/Desktop/test22.png");
			out.write(b);
			out.flush();
			out.close();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	// 图片转化成base64字符串
	public static String GetImageStr(BufferedInputStream bufer) {// 将图片文件转化为字节数组字符串，并对其进行Base64编码处理

		String imgFile = "http://oe01jrh3d.bkt.clouddn.com/o_1b4g72vfi11dqkikb8omgqial7.jpg";// 待处理的图片
		InputStream in = null;
		byte[] data = null;
		// 读取图片字节数组
		try {
			data = new byte[bufer.available()];
			bufer.read(data);
			bufer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 对字节数组Base64编码

		return Base64Utils.encode(data);// 返回Base64编码过的字节数组字符串
	}

	// 将url路径上的图片转换成base64 加密
	public static String getSong(String _path, String _savePath) {
		String resString = "";
		String savePath = _savePath;
		String path = _path;
		int BYTE_SIZE = 1;
		int SAVE_SIZE = 1024;
		byte[] buff = new byte[BYTE_SIZE]; // 每次读的缓存
		byte[] save = new byte[SAVE_SIZE]; // 保存前缓存
		BufferedInputStream bf = null;
		URL url = null;
		HttpURLConnection httpUrl;
		try {
			url = new URL(path);
			httpUrl = (HttpURLConnection) url.openConnection();
			System.out.println("已经打开连接....");
			bf = new BufferedInputStream(httpUrl.getInputStream());
			// 将图片文件转换成base64码
			resString = GetImageStr(bf);
			System.out.println("开始读入......");
			System.out.println("下载成功！！！");
			httpUrl.disconnect();
			// file.close();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {

				bf.close();

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return resString;
	}

	/**
	 * 
	 * 字符串拼接处理 com.jiabian.util 方法名：appendString 创建人：黄世平 时间：2017年2月10日-上午9:42:45
	 * 
	 * @param args
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public static String appendString(Object... args) {
		StringBuilder sb = new StringBuilder();
		for (Object obj : args) {
			sb.append(obj);
		}
		return sb.toString();
	}

	// 生成商家申请提现单号
	public static String getBusinessApplyCode() {
		return appendString(BUSINESS_APPLY, System.currentTimeMillis(),
				RandomStringUtils.randomAlphabetic(6).toUpperCase());
	}

	/**
	 * 商品属性拼接 com.jiabian.util 方法名：prodAttrJoint 创建人：何雪平 时间：2017年4月1日-下午2:33:01
	 * 
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public static String prodAttrJoint(String str) {
		String resString = "";
		// 有序遍历结果
		LinkedHashMap<String, String> jsonMap = JSON.parseObject(str,
				new TypeReference<LinkedHashMap<String, String>>() {
				});
		for (Map.Entry<String, String> entry : jsonMap.entrySet()) {
			resString = resString + entry.getKey() + "：" + entry.getValue()
					+ "，";
		}
		return resString.substring(0, resString.length() - 1);
	}

	/**
	 * 从参数毛重中截取小数/纯数字 com.jiabian.util 方法名：isNumber 创建人：何雪平
	 * 时间：2017年4月8日-上午11:13:19
	 * 
	 * @param weightStr
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public static String isNumber(String weightStr) {
		String regEx = "[^0-9.]";
		Pattern p = Pattern.compile(regEx);
		Matcher m = p.matcher(weightStr);
		return m.replaceAll("").trim();
	}

}
