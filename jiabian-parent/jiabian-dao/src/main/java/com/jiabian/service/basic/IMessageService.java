package com.jiabian.service.basic;

import java.util.List;

import com.jiabian.beans.basic.Message;
import com.jiabian.message.request.MessageReq;
import com.jiabian.message.response.MessageRes;

public interface IMessageService {

	/**
	 * 
	 * (添加消息记录)
	 * com.jiabian.service.basic 
	 * 方法名：insertMessage
	 * 创建人：彭振锋 
	 * 时间：2016年12月15日-下午2:59:30 
	 * @param message
	 * @return int
	 * @exception 
	 * @since  1.0.0
	 */
	int insertMessage(Message message);
	
	/**
	 * 
	 * (显示和商家聊天的用户列表)
	 * com.jiabian.service.basic 
	 * 方法名：selectUserList
	 * 创建人：彭振锋 
	 * 时间：2016年12月17日-下午4:56:39 
	 * @param messageReq
	 * @return List<MessageRes>
	 * @exception 
	 * @since  1.0.0
	 */
	List<MessageRes> selectUserList(MessageReq messageReq);
	
	/**
	 * 
	 * (显示聊天信息)
	 * com.jiabian.service.basic 
	 * 方法名：messageDetail
	 * 创建人：彭振锋 
	 * 时间：2016年12月19日-下午1:40:11 
	 * @param messageReq
	 * @return List<MessageRes>
	 * @exception 
	 * @since  1.0.0
	 */
	 List<MessageRes> messageDetail(MessageReq messageReq);
	 
	 /**
	  * 
	  * (获取到未读消息条数)
	  * com.jiabian.service.basic 
	  * 方法名：getUnreadCount
	  * 创建人：彭振锋 
	  * 时间：2016年12月19日-下午3:30:08 
	  * @param messageReq
	  * @return Integer
	  * @exception 
	  * @since  1.0.0
	  */
	 Integer getUnreadCount(MessageReq messageReq);
	 
	 /**
	  * 
	  * (修改已读消息状态)
	  * com.jiabian.service.basic 
	  * 方法名：updateUnread
	  * 创建人：彭振锋 
	  * 时间：2016年12月19日-下午4:23:35 
	  * @param messageReq
	  * @return Integer
	  * @exception 
	  * @since  1.0.0
	  */
     Integer updateUnread(MessageReq messageReq);
     
     /**
      * 
      * (商家接收到客服的未读消息条数)
      * com.jiabian.service.basic 
      * 方法名：unreadServiceCount
      * 创建人：彭振锋 
      * 时间：2016年12月27日-下午4:33:15 
      * @param messageReq
      * @return Integer
      * @exception 
      * @since  1.0.0
      */
     Integer unreadServiceCount(MessageReq messageReq);
     
     /**
      * 
      * (商家和客服聊天消息回显)
      * com.jiabian.service.basic 
      * 方法名：serviceDetail
      * 创建人：彭振锋 
      * 时间：2016年12月27日-下午5:24:59 
      * @param messageReq
      * @return List<MessageRes>
      * @exception 
      * @since  1.0.0
      */
     List<MessageRes> serviceDetail(MessageReq messageReq);
     
     /**
      * 
      * (修改商家和客服聊天的已读状态)
      * com.jiabian.service.basic 
      * 方法名：updateServiceUnread
      * 创建人：彭振锋 
      * 时间：2016年12月27日-下午7:15:34 
      * @param messageReq
      * @return Integer
      * @exception 
      * @since  1.0.0
      */
     Integer updateServiceUnread(MessageReq messageReq);
}
