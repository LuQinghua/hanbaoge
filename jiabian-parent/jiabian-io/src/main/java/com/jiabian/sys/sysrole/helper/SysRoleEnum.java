package com.jiabian.sys.sysrole.helper;



public class SysRoleEnum {

	
	/*
	 * 角色
	 */
	public enum roleIdEnum {
		regionalManager(Long.valueOf("44")),//区域经理
		agency(Long.valueOf("50")),//代理商
		saller(Long.valueOf("51")),//销售商
		superManager(Long.valueOf("4")), // 超级管理员
		clientService(Long.valueOf("3")); // 客服人员
		
		private final Long value;

		private roleIdEnum(Long value) {
			this.value = value;
		}

		public Long getValue() {
			return value;
		}
	}
	
}
