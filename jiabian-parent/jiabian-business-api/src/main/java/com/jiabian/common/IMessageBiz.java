package com.jiabian.common;

import java.util.List;

import com.jiabian.message.request.MessageReq;
import com.jiabian.message.response.MessageRes;
import com.jiabian.message.response.SendMessageRes;

public interface IMessageBiz {
  
	/**
	 * 
	 * (添加消息记录)
	 * com.jiabian.common 
	 * 方法名：insertMessage
	 * 创建人：彭振锋 
	 * 时间：2016年12月15日-下午3:09:16 
	 * @param messageReq
	 * @return int
	 * @exception 
	 * @since  1.0.0
	 */
   int insertMessage(MessageReq messageReq);
   
   /**
    * 
    * (向融云发送消息)
    * com.jiabian.common 
    * 方法名：sendMessage
    * 创建人：彭振锋 
    * 时间：2016年12月15日-下午4:53:39 
    * @param messageReq void
    * @exception 
    * @since  1.0.0
    */
   SendMessageRes sendMessage(MessageReq messageReq);
  
  /**
   * 
   * (显示和商家聊天的用户列表)
   * com.jiabian.common 
   * 方法名：selectUserList
   * 创建人：彭振锋 
   * 时间：2016年12月17日-下午4:59:01 
   * @param messageReq
   * @return List<MessageRes>
   * @exception 
   * @since  1.0.0
   */
  List<MessageRes> selectUserList(MessageReq messageReq);
  
  /**
   * 
   * (聊天消息内容)
   * com.jiabian.common 
   * 方法名：messageDetail
   * 创建人：彭振锋 
   * 时间：2016年12月19日-下午1:41:58 
   * @param messageReq
   * @return List<MessageRes>
   * @exception 
   * @since  1.0.0
   */
  List<MessageRes> messageDetail(MessageReq messageReq);
  
  /**
   * 
   * (修改消息已读状态)
   * com.jiabian.common 
   * 方法名：updateUnread
   * 创建人：彭振锋 
   * 时间：2016年12月19日-下午4:29:15 
   * @param messageReq
   * @return Integer
   * @exception 
   * @since  1.0.0
   */
  Integer updateUnread(MessageReq messageReq);
  
  /**
   * 
   * (商家接收客服的未读消息条数)
   * com.jiabian.common 
   * 方法名：unreadServiceCount
   * 创建人：彭振锋 
   * 时间：2016年12月27日-下午4:37:12 
   * @param messageReq
   * @return Integer
   * @exception 
   * @since  1.0.0
   */
  Integer unreadServiceCount(MessageReq messageReq);
  
  /**
   * 
   * (商家和客服聊天消息的回显)
   * com.jiabian.common 
   * 方法名：serviceDetail
   * 创建人：彭振锋 
   * 时间：2016年12月27日-下午5:27:22 
   * @param messageReq
   * @return List<MessageRes>
   * @exception 
   * @since  1.0.0
   */
  List<MessageRes> serviceDetail(MessageReq messageReq);
  
  /**
   * 
   * (修改商家和客服聊天的已读消息状态)
   * com.jiabian.common 
   * 方法名：updateServiceUnread
   * 创建人：彭振锋 
   * 时间：2016年12月27日-下午7:22:12 
   * @param messageReq
   * @return Integer
   * @exception 
   * @since  1.0.0
   */
  Integer updateServiceUnread(MessageReq messageReq);
}
