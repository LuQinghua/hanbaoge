package com.jiabian.sys.activity.helper;

public class QdyPayPartakeEnum {
   
	/**
	 * 支付状态 是否支付( 1.已支付 , 0.未支付 )
	 * payPartake_isPay
	 * 创建人:张铁成
	 * 时间：2017年2月6日-上午11:06:37 
	 * @version 1.0.0
	 *
	 */
	public enum payPartake_isPay{
		
		YZF_ISPAY(Byte.valueOf("1")),  // 1.已支付
		WZF_ISPAY(Byte.valueOf("0"));  // 0.未支付
		
		private final Byte value;
		
		private payPartake_isPay(Byte value) {
			this.value = value;
		}
		
		public Byte getValue() {
			return value;
		}
	}
	
	/**
	 * 家边通宝获得方式(1.邀请获得2.幸运号获得3.超级幸运号 )
	 * coinGetMethod
	 * 创建人:张铁成
	 * 时间：2017年2月21日-上午10:14:09 
	 * @version 1.0.0
	 *
	 */
	public enum coinGetMethod{
		
		YQ_COINGETMETHOD(Byte.valueOf("1"),"邀请获得通宝"),  //邀请获得
		XYH_COINGETMETHOD(Byte.valueOf("2"),"幸运号获得通宝"),  //幸运号获得
		CJXYH_COINGETMETHOD(Byte.valueOf("3"),"超级幸运号获得通宝");  //超级幸运号 
		
		private final Byte value;
		private final String desc;

		private coinGetMethod(Byte value , String desc) {
			this.value = value;
			this.desc = desc;
		}

		public Byte getValue() {
			return value;
		}

		public String getDesc() {
			return desc;
		}
	}
	
	/**
	 * 支付状态(1.支出 2.收入)
	 * coinStatus
	 * 创建人:张铁成
	 * 时间：2017年2月21日-上午10:23:53 
	 * @version 1.0.0
	 *
	 */
	public enum coinStatus{
		
		SR_COINSTATUS(Byte.valueOf("2")),//收入
		ZC_COINSTATUS(Byte.valueOf("1")); //支出 
		
		private final Byte value;
		
		private coinStatus(Byte value) {
			this.value = value;
		}
		
		public Byte getValue() {
			return value;
		}

	}
	
	
	
}
