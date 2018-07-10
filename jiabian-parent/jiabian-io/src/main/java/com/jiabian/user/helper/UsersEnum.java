package com.jiabian.user.helper;

public class UsersEnum {

	/*
	 * 用户状态
	 */
	public enum UsersResEnum {
		USER_PHONE_NULL(10001, "用户手机号码不能为空"), 
		USER_NOT_EXITS(10002, "用户不存在"), 
		USER_PWD_ERR(10003, "密码错误"), 
		USER_EXITS(10006, "用户已经存在"), 
		USER_SMS_NULL(10007, "短信验证码不能为空"), 
		USER_SMS_ERR(10008, "短信验证码错误"), 
		USER_PWD_NULL(10009, "密码不能为空"),
		USER_PHONE_EXITS(10010, "该手机号码已经注册过，请登录"),
		USER_PHONE_ERR(10011, "手机号码格式错误"),
		USER_REGISTER_ERR(10012,"用户注册失败"),
		USER_REGISTER_SUCCESS(10012,"用户注册成功"),
		USER_LOGIN_ERR(10013,"用户登录失败"),
		USER_LOGIN_SUCCESS(10014,"用户登录成功"),
		USER_SMS_NOT_EXITS(10015,"短信验证码失效"),
		USER_PHONE_NOT_EXITS(10016, "该手机号码未注册"),
		USER_BIDING_ERR(10017,"绑定失败"),
		USER_BIDING_PHONE_EXITS(10018,"该手机号码已经绑定过，请换其他号码"),
		USER_BIDING_SUCCESS(10019,"绑定成功"),
		USER_UPDATE_PASSWORD_ERR(10020,"修改密码失败，请稍后重试"),
		USER_BIDING_EXIST(10021,"该帐号已经绑定过"),
		USER_NOT_PWD(10022,"未设置登录密码"),
		USER_VERIFY_ERR(10023,"验证码错误"),
		USER_FROZEN(10024,"该账号已经冻结");
		
		private final int result;
		private final String desc;

		UsersResEnum(int result, String desc) {
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
	 * 
	 * ClassName: UserSource
	 * 
	 * @Description: 用户来源
	 * @author 潇洒
	 * @date 2016-10-13
	 */
	public enum UserSource {
		SH_WEB(Byte.valueOf("1")), // 书画PC
		SH_YD(Byte.valueOf("2")), // 书画移动
		JK_WEB(Byte.valueOf("3")), // 健康PC
		JK_YD(Byte.valueOf("4")), // 健康移动
		SC_WEB(Byte.valueOf("5")),   //商超  PC
		SC_YD(Byte.valueOf("6")),    //商超 移动
		FUN_H5(Byte.valueOf("7"));    //游趣乐园分享注册
		
		private final Byte value;

		private UserSource(Byte value) {
			this.value = value;
		}

		public Byte getValue() {
			return value;
		}
	}
	
	/**
	 * 
	 * ClassName: UserSource
	 * 
	 * @Description: 手机号是否被注册
	 * @author 潇洒
	 * @date 2016-10-13
	 */
	public enum UsersUserTelEnum {
		PHONE_NO(Byte.valueOf("1")), // 手机未注册
		PHONE_YET(Byte.valueOf("2")); // 手机已注册

		private final Byte value;

		private UsersUserTelEnum(Byte value) {
			this.value = value;
		}

		public Byte getValue() {
			return value;
		}
	}
	
	
	
	/**
	 * 用户类型
	 * UserType
	 * 创建人:何雪平 
	 * 时间：2016年11月25日-下午6:03:03 
	 * @version 1.0.0
	 *
	 */
	public enum UserType {
		
		USER_GENERAL(Byte.valueOf("1")), // 1：普通
		USER_BUSINESS(Byte.valueOf("2")), //2：商家
		USER_FAMOUS(Byte.valueOf("3")); //3：名家

		private final Byte value;

		private UserType(Byte value) {
			this.value = value;
		}

		public Byte getValue() {
			return value;
		}
	}
	
	/**
	 * 
	 * UserIsChangeName
	 * 创建人:熊天威
	 * 时间：2017年1月4日-下午3:06:56 
	 * @version 1.0.0
	 *
	 */
	public enum UserIsChangeName{
		USER_NORMAL(Byte.valueOf("0")), // 0：没有修改过用户名
		USER_CHANGED(Byte.valueOf("1")); //1：修改过用户名

		private final Byte value;

		private UserIsChangeName(Byte value) {
			this.value = value;
		}

		public Byte getValue() {
			return value;
		}
	}
	
	/**
	 * 快乐学习 等级
	 * LearnUserType
	 * 创建人:何雪平 
	 * 时间：2017年4月18日-上午10:34:44 
	 * @version 1.0.0
	 *
	 */
	public enum LearnUserType {

		BANWEI(Byte.valueOf("1")), // 班委
		MONITOR(Byte.valueOf("2")), // 班长
		INSTRUCTOR(Byte.valueOf("3"));    //辅导员
		
		private final Byte value;

		private LearnUserType(Byte value) {
			this.value = value;
		}
		public Byte getValue() {
			return value;
		}		
	}
}
