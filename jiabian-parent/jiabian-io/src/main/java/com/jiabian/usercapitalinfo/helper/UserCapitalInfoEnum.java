package com.jiabian.usercapitalinfo.helper;

public class UserCapitalInfoEnum {

	
	
	/**
	 * 
	 * 用户类型
	 * UserCapitalInfoUserType
	 * 创建人:李文凯
	 * 时间：2017年2月17日-上午9:56:16 
	 * @version 1.0.0
	 *
	 */
	public enum UserCapitalInfoUserType {
		USERTYPE_PLATFORMUSER(Byte.valueOf("1")), // C端用户
		USERTYPE_BACKUSER(Byte.valueOf("2")); // 后台用户
		
		private final Byte value;

		private UserCapitalInfoUserType(Byte value) {
			this.value = value;
		}

		public Byte getValue() {
			return value;
		}
	}
	
	
	/**
	 * 
	 * 账户类型
	 * UserCapitalInfoAccountType
	 * 创建人:李文凯
	 * 时间：2017年2月17日-上午9:59:06 
	 * @version 1.0.0
	 *
	 */
	public enum UserCapitalInfoAccountType {
		ACCOUNTTYPE_BANK(Byte.valueOf("1")), // 银行账户
		ACCOUNTTYPE_ALIPAY(Byte.valueOf("2")); // 支付宝账户
		
		private final Byte value;

		private UserCapitalInfoAccountType(Byte value) {
			this.value = value;
		}

		public Byte getValue() {
			return value;
		}
	}
	
	


}
