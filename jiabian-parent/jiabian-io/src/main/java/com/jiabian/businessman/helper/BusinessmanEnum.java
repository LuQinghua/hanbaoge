package com.jiabian.businessman.helper;

public class BusinessmanEnum {

	/**
	 * 
	 * 商家类型
	 * BusinessmanType
	 * 创建人:彭振锋 
	 * 时间：Nov 11, 2016-5:44:50 PM 
	 * @version 1.0.0
	 *
	 */
	public enum BusinessmanBusType{
		BUSTYPE_MERCHANT(Byte.valueOf("1")),   // 书画    个体户
		BUSTYPE_CELEBRITY(Byte.valueOf("2")),  // 书画    名家
		BUSTYPE_COMPANTY(Byte.valueOf("3")),   //  企业入驻
		BUSTYPE_DIRECT(Byte.valueOf("4")),     // 商超    直营
		BUSTYPE_ORDINARY(Byte.valueOf("5"));   //  商超    普通
		private final Byte value; 
		
		private BusinessmanBusType(Byte value) {
			this.value = value;
		}

		public Byte getValue() {
			return value;
		}
		
	}
	
	
	public  enum BusinessmanBusStatus{		
		BUSSTATUS_APPROVEING(Byte.valueOf("1")),  //待审核
		BUSSTATUS_APPROVE(Byte.valueOf("2")),	  //审核通过
		BUSSTATUS_UNAPPROVE(Byte.valueOf("3"));   //审核不通过
		private final Byte value;
		
		private BusinessmanBusStatus(Byte value) {
			this.value = value;
		}
		public Byte getValue() {
			return value;
		}
		
	}
	
	
	public enum BusinessmanIsDel{
		NORMAL(Byte.valueOf("1")),   // 正常
		DELETE(Byte.valueOf("2"));// 删除
		
		private final Byte value; 
		
		private BusinessmanIsDel(Byte value) {
			this.value = value;
		}

		public Byte getValue() {
			return value;
		}
		
	}
	
	
}
