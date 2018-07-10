package com.jiabian.adposition.helper;

public class AdpositionEnum {
	
	public enum AdpositionStatusEnum {
		ADS_STATUS_SUCCESS(2000, "操作状态成功"), 
		ADS_STATUS_ERR(5000, "操作状态失败");
		
		private final int result;
		private final String desc;

		AdpositionStatusEnum(int result, String desc) {
			this.result = result;
			this.desc = desc;
		}

		public int result() {
			return result;
		}

		public String desc() {
			return desc;
		}
	}
	
	/**
	 * AdpositionDomain
	 * 创建人:熊天威
	 * 时间：2017年1月12日-上午11:23:01 
	 * @version 1.0.0
	 *
	 */
	public enum AdpositionDomain {
		SH_WEB_HBGY(Byte.valueOf("2")), // 书画PC 环保公益 广告位
		SH_WEB_DDMJ(Byte.valueOf("3")), // 书画PC 当代名家 广告位
		SH_WEB_JXDSH(Byte.valueOf("4")), // 书画PC 近现代书画 广告位
		SH_WEB_CSZZ(Byte.valueOf("5")), // 书画PC 存世之作 广告位
		SH_WEB_SHDP(Byte.valueOf("6")), // 书画PC 书画店铺 广告位
		SH_WEB_SHPM(Byte.valueOf("7")),// 书画PC 书画拍卖 广告位
		SH_H5_BANNER(Byte.valueOf("8"));// 书画H5banner

		private final Byte value;

		private AdpositionDomain(Byte value) {
			this.value = value;
		}

		public Byte getValue() {
			return value;
		}
	}


	/**
	 * 
	 * ClassName: AdPositionIdSource
	 * 
	 * @Description: 广告位来源
	 * @author 潇洒
	 * @date 2016-10-24
	 */
	public enum AdPositionIdPlatform {
		SH_WEB(Byte.valueOf("1")), // 书画PC
		SH_YD(Byte.valueOf("2")), // 书画移动
		JK_WEB(Byte.valueOf("3")), // 健康PC
		JK_YD(Byte.valueOf("4")),// 健康移动
		SC_YD(Byte.valueOf("5")),// 商超移动
		SH_H5(Byte.valueOf("6")), // 书画H5
		HOME_PAGE_H5(Byte.valueOf("7")), //商超大首页
		JK_H5(Byte.valueOf("8")),//健康H5
		LUCK_HOME_PAGE_H5(Byte.valueOf("9")),//抢大运H5
		LUCK_HOME_PAGE(Byte.valueOf("10")); // 抢大运PC首页
		

		private final Byte value;

		private AdPositionIdPlatform(Byte value) {
			this.value = value;
		}

		public Byte getValue() {
			return value;
		}
	}
	
	/**
	 * 首页广告位置
	 * AdPositionIdPlatform
	 * 创建人:潇洒
	 * 时间：2017年1月13日-上午9:56:48
	 */
	public enum AdPositionIdSite {
		UP(Byte.valueOf("1")), // 上
		MIDDLE(Byte.valueOf("2")), // 中
		DOWN(Byte.valueOf("3")), // 下
		MIDDLE_LEFT(Byte.valueOf("5")),// 商超/大首页中 左抢购
		MIDDLE_RIGHT_UP(Byte.valueOf("6")), // （中右上）商超/大首页中 右上
		MIDDLE_RIGHT_DOWN(Byte.valueOf("7")), // 商超/大首页中 右下一
		MIDDLE_RIGHT_DOWN2(Byte.valueOf("8"));//商超首页中 右 下二

		private final Byte value;

		private AdPositionIdSite(Byte value) {
			this.value = value;
		}

		public Byte getValue() {
			return value;
		}
	}		
	
	/**
	 * 
	 * 广告位的类型
	 * adPositionIdType
	 * 创建人:李文凯
	 * 时间：2017年2月15日-上午9:31:28 
	 * @version 1.0.0
	 *
	 */
	public enum adPositionIdType{
		PICTURE(Byte.valueOf("1")),//图片类型
		SHOP(Byte.valueOf("2")),//店铺类型
		GOODS(Byte.valueOf("3"));//商品类型
		
		private final Byte value;
		
		private adPositionIdType(Byte value){
			this.value=value;
		}
		
		public Byte getValue(){
			return value;
		}
	}
}
