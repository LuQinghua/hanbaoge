/**
 * 家边网络科技有限公司
 * jiabian-shop-api shop
 * com.jiabian.shop.api.test.util
 * GetDistance.java
 * 创建人:何雪平 
 * 时间：2016年11月24日-上午9:52:49 
 * 2016家边网络科技有限公司-版权所有
 */
package com.jiabian.shop.api.test.util;

/**
 * 
 * 计算地球上任意两点(经纬度)距离
 * GetDistance
 * 创建人:何雪平 
 * 时间：2016年11月24日-上午9:58:31 
 * @version 1.0.0
 *
 */
public class GetDistance {

	/**
	 * 计算地球上任意两点(经纬度)距离
	 * 
	 * @param long1
	 *            第一点经度
	 * @param lat1
	 *            第一点纬度
	 * @param long2
	 *            第二点经度
	 * @param lat2
	 *            第二点纬度
	 * @return 返回距离 单位：米
	 */
	public static double Distance(double long1, double lat1, double long2,
			double lat2) {
		double a, b, R;
		R = 6378137; // 地球半径
		lat1 = lat1 * Math.PI / 180.0;
		lat2 = lat2 * Math.PI / 180.0;
		a = lat1 - lat2;
		b = (long1 - long2) * Math.PI / 180.0;
		double d;
		double sa2, sb2;
		sa2 = Math.sin(a / 2.0);
		sb2 = Math.sin(b / 2.0);
		d = 2
				* R
				* Math.asin(Math.sqrt(sa2 * sa2 + Math.cos(lat1)
						* Math.cos(lat2) * sb2 * sb2));
		return d;
	}

	public static void main(String[] args) {
		System.out.println(Distance(121.491909, 31.233234, 121.411994,
				31.206134));
	}
}