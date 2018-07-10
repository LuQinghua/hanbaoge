package com.jiabian.sys.activity.helper;

public class QdyGoodsEnum {
    
	/**
	 * 抢大运活动状态
	 * Status
	 * 创建人:彭振锋 
	 * 时间：2017年1月5日-下午5:03:53 
	 * @version 1.0.0
	 */
	public enum activityStatus {
		STATUS_NOTSTARTED(Byte.valueOf("0")),   // 未开始
		STATUS_STARTED(Byte.valueOf("1")),      // 开始
		STATUS_END(Byte.valueOf("2"));          // 已结束
		
		private final Byte value;

		private activityStatus(Byte value) {
			this.value = value;
		}

		public Byte getValue() {
			return value;
		}
	}
	
	/**
	 * 是否领取奖品
	 * isReceive
	 * 创建人:彭振锋 
	 * 时间：2017年1月5日-下午5:44:37 
	 * @version 1.0.0
	 */
	public enum isReceive {
		RECEIVE_NOTGET(Byte.valueOf("0")),      // 未领取
		STATUS_HAVEGET(Byte.valueOf("1"));      // 已领取
		
		private final Byte value;

		private isReceive(Byte value) {
			this.value = value;
		}

		public Byte getValue() {
			return value;
		}
	}
	
	/**
	 * 抢大运  奖品发货状态
	 * distribution
	 * 创建人:彭振锋 
	 * 时间：2017年1月6日-下午2:19:58 
	 * @version 1.0.0
	 */
	public enum distribution {
		RECEIVE_NOTSEND(Byte.valueOf("0")),        // 未领取
		STATUS_HAVESEND(Byte.valueOf("1")),        // 已发货
		STATUS_HAVEARRIVE(Byte.valueOf("2"));      // 已到达
		
		private final Byte value;

		private distribution(Byte value) {
			this.value = value;
		}

		public Byte getValue() {
			return value;
		}
	}
	
}
