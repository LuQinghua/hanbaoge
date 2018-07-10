package com.jiabian.moneywater.helper;

public class MoneyWaterEnum {
	
    /**
     * 
     * 资金流水状态
     * MoneyWaterStatus
     * 创建人:彭振锋 
     * 时间：Nov 29, 2016-2:11:19 PM 
     * @version 1.0.0
     *
     */
	public enum MoneyWaterStatus{
		
		MONEYSTATUS_WAITWITHDRAW(Byte.valueOf("0")),          //  待提现
		MONEYSTATUS_APPLYWITHDRAW(Byte.valueOf("1")),         //  申请提现
		MONEYSTATUS_HAVEWITHDRAW(Byte.valueOf("2")),          //  已提现
		MONEYSTATUS_REFUSEWITHDRAW(Byte.valueOf("3"));        //  不同意提现
		
		private final Byte value;

		private MoneyWaterStatus(Byte value) {
			this.value = value;
		}
		
		public Byte getValue() {
			return value;
		}
		
	}
	
	public enum MoneyWaterWayType{
		
		WAYTYPE_WAITWITHDRAW(Byte.valueOf("1")),        //待提现
		WAYTYPE_WITHDRAWING(Byte.valueOf("2")),         //提现中 （已申请提现）
		WAYTYPE_HAVEWITHDRAW(Byte.valueOf("3")),        //已提现
		WAYTYPE_REFUSEWITHDRAW(Byte.valueOf("4")),      //不同意提现  (未完成提现)
		WAYTYPE_ALLMONEYWATER(Byte.valueOf("5")),       //所有流水
		WAYTYPE_ONEMONTHWATER(Byte.valueOf("6")),       //近一个月流水
		WAYTYPE_TIMEANDCODEWATER(Byte.valueOf("7"));    //时间段或流水号查询
		
		private final Byte value;

		private MoneyWaterWayType(Byte value) {
			this.value = value;
		}
		
		public Byte getValue() {
			return value;
		}
		
	}
	
	public enum  MoneywaterType{
		
		WATERTYPE_INCOME(Byte.valueOf("1")),          // 收入
		WATERTYPE_DRAWMONEY(Byte.valueOf("2")),//提现
		WATERTYPE_RETURN(Byte.valueOf("3")); // 退款
		
		private final Byte value;

		private MoneywaterType(Byte value) {
			this.value = value;
		}
		
		public Byte getValue() {
			return value;
		}
	}
	
	public enum MoneyWaterCode {
		SH_CODE(String.valueOf("SHZJ")), // 书画
		JK_CODE(String.valueOf("JKZJ")), // 健康
		SC_CODE(String.valueOf("SCZJ")); // 商超

		private final String value;

		private MoneyWaterCode(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}
	}
}
