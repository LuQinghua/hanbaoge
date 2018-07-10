package com.jiabian.userfavorite.helper;


/**
 * 用户收藏枚举信息
 * FavoriteEnum
 * 创建人:何雪平 
 * 时间：2016年10月26日-下午5:36:38 
 * @version 1.0.0
 *
 */
public enum FavoriteEnum {

	
	ADD_ERR(60000, "收藏失败"), 
	ADD_SUCCEED(60001, "收藏成功"),
	ADD_EXIST(60002, "很识货，您已经收藏过了"),
	ADD_ERROR(60003, "系统异常，请联系客服人员"),
	
	RUN_ERR(500, "操作失败"), 
	EXISTS(201,"已经收藏过"),

	DEL_ERR(40000, "取消失败"), 
	DEL_SUCCEED(40001, "取消成功");


	private final int result;
	private final String desc;

	FavoriteEnum(int result, String desc) {
		this.result = result;
		this.desc = desc;
	}

	public int result() {
		return result;
	}

	public String desc() {
		return desc;
	}
	
	public enum UserFavoriteFavoType  {
		PRODUCT(Byte.valueOf("1")),//商品
		SHOP(Byte.valueOf("2")),//店铺
		MINGJIA(Byte.valueOf("3"));//名家
		
		private  final Byte value;
		
		private UserFavoriteFavoType(Byte value) {
	        this.value = value;
	    }
	 
	    public Byte getValue() {
	        return value;
	    }
    }
	
	/**
	 * 运算符号
	 * favoriteOperationType
	 * 创建人:熊天威
	 * 时间：2017年2月9日-下午1:42:14 
	 * @version 1.0.0
	 *
	 */
	public enum favoriteOperationType  {
		ADDNUMBER("+"),
		MINNUMBER("-");
		
		private  final String value;
		
		private favoriteOperationType(String value) {
	        this.value = value;
	    }
	 
	    public String getValue() {
	        return value;
	    }
    }

	
	/**
	 * 是否收藏
	 */
	public enum UsersCollectEnum {
		COLLECT_NO(Byte.valueOf("0")),// 未收藏
		COLLECT_YES(Byte.valueOf("1")); // 已收藏

		private final Byte value;

		private UsersCollectEnum(Byte value) {
			this.value = value;
		}

		public Byte getValue() {
			return value;
		}
	}
	
}
