package com.jiabian.message.helper;

public class MessageEnum {
    
	
	/**
	 * 
	 * 发送消息类型
	 * messageType
	 * 创建人:彭振锋 
	 * 时间：2016年12月15日-下午5:12:29 
	 * @version 1.0.0
	 *
	 */
	public enum MessageType{
		MESSAGE_TEXTTYPE(Byte.valueOf("1")),        //  文本类型
		MESSAGE_IMGTYPE(Byte.valueOf("2")),         //  图片类型
		MESSAGE_IMGTEXTTYPE(Byte.valueOf("3")),     //  图文类型
		MESSAGE_CUSTOMTYPE(Byte.valueOf("4"));      //  自定义类型 
		
		private final Byte value;
		
		private MessageType(Byte value) {
			this.value = value;
		}

		public Byte getValue() {
			return value;
		}
	}
	
	
	/**
	 * 
	 * 融云推送消息 返回状态码
	 * HttpStatus
	 * 创建人:彭振锋 
	 * 时间：2016年12月16日-上午9:34:29 
	 * @version 1.0.0
	 *
	 */
	public enum HttpStatus{
		SUCCESS(200,"成功"),
		BAD_REQUEST(400,"错误的请求"),
		CHECK_ERROR(401,"验证错误"),
		REFUSED(403,"被拒绝"),
		NOT_FIND(404,"无法找到"),
		OVERRUN(405,"群容量超限"),
		EXCEED_REQUEST_Time(429,"过多的请求"),
		INSIDE_SERVE_ERROR(500,"内部服务错误"),
		INSIDE_SERVE_OVERTIME(504,"内部服务响应超时");
		
		private final int result;
		
		private final String desc;
	    
		HttpStatus(int result, String desc) {
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
	
}
