package com.jiabian.base;



public class BaseEnum {

	public enum ResponseEnum{
		/*
		 * 系统参数
		 */
		SUCCESS(200, "OK"),
		FAIL_SYS_BAD_REQUEST(201, "错误的请求,参数不完整"),
		FAIL_SYS_API_NOT_FOUND(203, "访问了不存在的API"),
		FAIL_SYS_API_REJECT(204, "访问的API拒绝了对特定用户的请求"),
		FAIL_SYS_EXPIRED_REQUEST(205, "请求时间戳已失效"),
		FAIL_SYS_UNAUTHORIZED(206,  "app试图访问未授权的api"),
		FAIL_SYS_REQUEST_TIMEOUT(251,  "请求超时会话失效"),
		FAIL_SYS_SERVICE_FAULT(252,  "后端服务调用失败"),
		FAIL_SYS_SERVICE_NOT_EXIST(254, "服务器异常,API调用失败!"),
		FAIL_AUTH_NOT(255,  "你没有操作权限"),
		FAIL_SYS_ERROR(500,  "系统异常，系统不支持该请求方式"),
		SMS_NULL(501, "还没有发送验证码"),
		SMS_ERR(502,  "短信验证码错误"),
		FAIL_SERVER_ERROR(409,"系统业务异常");
		
		private final int result;
	    private final String desc;
	    
	    ResponseEnum(int result, String desc) {
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
	 * ClassName: isDel 
	 * @Description: 每个表的isDel字段统一在此
	 * @author 潇洒
	 * @date 2016-10-29
	 */
	public enum isDel {
		NORMAL(Byte.valueOf("1")),		//正常
		DEL(Byte.valueOf("2")),          		//删除
		FROZEN(Byte.valueOf("3"));          		//冻结
		
		private  final Byte value;
		
		private isDel(Byte value) {
	        this.value = value;
	    }
	 
	    public Byte getValue() {
	        return value;
	    }
    }
	
	/**
	 * 增删改 ClassName: address
	 * 
	 * @Description: TODO
	 * @author 潇洒
	 * @date 2016-10-18
	 */
	public enum CRUDEnum {
		ADD_ERR(20001, "添加失败"), 
		ADD_SUCCEED(20002, "添加成功"),
		DEL_ERR(20003, "删除失败"), 
		DEL_SUCCEED(20004, "删除成功"),
		UPDATE_ERR(20005, "修改失败"), 
		UPDATE_SUCCEED(20006, "修改成功"),
		set_ERR(20007, "操作失败"), 
		set_SUCCEED(20008, "操作成功");
		

		private final int result;
		private final String desc;

		CRUDEnum(int result, String desc) {
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
	
	/*
	 * 商品分类来源cateSource
	 */
	public enum ProductCategorySource {
		SH(Byte.valueOf("1")), // 书画
		JK(Byte.valueOf("2")),// 健康
		SC(Byte.valueOf("3"));// 商超

		private final Byte value;

		private ProductCategorySource(Byte value) {
			this.value = value;
		}

		public Byte getValue() {
			return value;
		}
	}

	
	/*
	 * 价格排序
	 */
	public enum PriceSort {
		PRICE_SORT_DESC(Byte.valueOf("0")), // 降序
		PRICE_SORT_ASC(Byte.valueOf("1"));// 升序

		private final Byte value;

		private PriceSort(Byte value) {
			this.value = value;
		}

		public Byte getValue() {
			return value;
		}
	}
	
	
	/*
	 * 一网通签约状态
	 */
	public enum status {
		NO(Byte.valueOf("0")), // 待签约
		YES(Byte.valueOf("1"));// 已签约

		private final Byte value;

		private status(Byte value) {
			this.value = value;
		}

		public Byte getValue() {
			return value;
		}
	}
	
	/*
	 * 性别
	 */
	public enum sexEnum {
		SECRET(Byte.valueOf("0")),//保密
		BOY(Byte.valueOf("1")), // 男
		GRIL(Byte.valueOf("2"));// 女

		private final Byte value;

		private sexEnum(Byte value) {
			this.value = value;
		}

		public Byte getValue() {
			return value;
		}
	}
	
	
	/**
	 * 支付方式(1.家边通宝 2.一网通 3.微信支付 4.支付宝)
	 * PayWayEnum
	 * 创建人:潇洒
	 * 时间：2017年2月24日-下午5:33:21
	 */
	
	public enum PayWayEnum{
		JBTB_PAYMETHOD(Byte.valueOf("1")),	// 1.家边通宝
		YWT_PAYMETHOD(Byte.valueOf("2")),	// 2.一网通
		WECHAT_PAYMETHOD(Byte.valueOf("3")), // 3.微信支付
		ALIPAY_PAYMETHOD(Byte.valueOf("4"));	// 4.支付宝
		
		private final Byte value;

		private PayWayEnum(Byte value) {
			this.value = value;
		}
		public Byte getValue() {
			return value;
		}
	}
	
}
