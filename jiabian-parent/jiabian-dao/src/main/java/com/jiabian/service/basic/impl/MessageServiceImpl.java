package com.jiabian.service.basic.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jiabian.beans.basic.Message;
import com.jiabian.dao.basic.MessageMapper;
import com.jiabian.message.request.MessageReq;
import com.jiabian.message.response.MessageRes;
import com.jiabian.service.basic.IMessageService;

@Service
public class MessageServiceImpl implements IMessageService{
   
   @Resource
   private MessageMapper messageMapper;
	
	/**
	 * 
	 * (添加消息记录)
	 * com.jiabian.service.basic.impl 
	 * 方法名：insertMessage
	 * 创建人：彭振锋 
	 * 时间：2016年12月15日-下午3:03:54 
	 * @param message
	 * @return
	 * @see com.jiabian.service.basic.IMessageService#insertMessage(com.jiabian.beans.basic.Message)
	 * @exception 
	 * @since  1.0.0
	 */
	@Override
	public int insertMessage(Message message) {
		// TODO Auto-generated method stub
		return messageMapper.insert(message);
	}

	/**
	 * 
	 * (显示和商家聊天的用户列表)
	 * com.jiabian.service.basic.impl 
	 * 方法名：selectUserList
	 * 创建人：彭振锋 
	 * 时间：2016年12月17日-下午4:57:26 
	 * @param messageReq
	 * @return
	 * @see com.jiabian.service.basic.IMessageService#selectUserList(com.jiabian.message.request.MessageReq)
	 * @exception 
	 * @since  1.0.0
	 */
	@Override
	public List<MessageRes> selectUserList(MessageReq messageReq) {
		// TODO Auto-generated method stub
		return messageMapper.selectUserList(messageReq);
	}
    
	/**
	 * 
	 * (显示聊天内容)
	 * com.jiabian.service.basic.impl 
	 * 方法名：messageDetail
	 * 创建人：彭振锋 
	 * 时间：2016年12月19日-下午1:40:48 
	 * @param messageReq
	 * @return
	 * @see com.jiabian.service.basic.IMessageService#messageDetail(com.jiabian.message.request.MessageReq)
	 * @exception 
	 * @since  1.0.0
	 */
	@Override
	public List<MessageRes> messageDetail(MessageReq messageReq) {
		// TODO Auto-generated method stub
		return messageMapper.messageDetail(messageReq);
	}
    
	/**
	 * 
	 * (获取到未读消息条数)
	 * com.jiabian.service.basic.impl 
	 * 方法名：getUnreadCount
	 * 创建人：彭振锋 
	 * 时间：2016年12月19日-下午3:30:48 
	 * @param messageReq
	 * @return
	 * @see com.jiabian.service.basic.IMessageService#getUnreadCount(com.jiabian.message.request.MessageReq)
	 * @exception 
	 * @since  1.0.0
	 */
	@Override
	public Integer getUnreadCount(MessageReq messageReq) {
		// TODO Auto-generated method stub
		return messageMapper.getUnreadCount(messageReq);
	}
     
	/**
	 * 
	 * (修改已读信息状态)
	 * com.jiabian.service.basic.impl 
	 * 方法名：updateUnread
	 * 创建人：彭振锋 
	 * 时间：2016年12月19日-下午4:24:19 
	 * @param messageReq
	 * @return
	 * @see com.jiabian.service.basic.IMessageService#updateUnread(com.jiabian.message.request.MessageReq)
	 * @exception 
	 * @since  1.0.0
	 */
	@Override
	public Integer updateUnread(MessageReq messageReq) {
		// TODO Auto-generated method stub
		return messageMapper.updateUnread(messageReq);
	}

	/**
	 * 
	 * (商家接收客服的未读消息条数)
	 * com.jiabian.service.basic.impl 
	 * 方法名：unreadServiceCount
	 * 创建人：彭振锋 
	 * 时间：2016年12月27日-下午4:34:01 
	 * @param messageReq
	 * @return
	 * @see com.jiabian.service.basic.IMessageService#unreadServiceCount(com.jiabian.message.request.MessageReq)
	 * @exception 
	 * @since  1.0.0
	 */
	@Override
	public Integer unreadServiceCount(MessageReq messageReq) {
		// TODO Auto-generated method stub
		return messageMapper.getServiceUnreadCount(messageReq);
	}

	/**
	 * 
	 * (商家和客服聊天消息回显)
	 * com.jiabian.service.basic.impl 
	 * 方法名：serviceDetail
	 * 创建人：彭振锋 
	 * 时间：2016年12月27日-下午5:25:50 
	 * @param messageReq
	 * @return
	 * @see com.jiabian.service.basic.IMessageService#serviceDetail(com.jiabian.message.request.MessageReq)
	 * @exception 
	 * @since  1.0.0
	 */
	@Override
	public List<MessageRes> serviceDetail(MessageReq messageReq) {
		// TODO Auto-generated method stub
		return messageMapper.serviceDetail(messageReq);
	}

	/**
	 * 
	 * (修改商家和客服聊天的消息状态)
	 * com.jiabian.service.basic.impl 
	 * 方法名：updateServiceUnread
	 * 创建人：彭振锋 
	 * 时间：2016年12月27日-下午7:18:07 
	 * @param messageReq
	 * @return
	 * @see com.jiabian.service.basic.IMessageService#updateServiceUnread(com.jiabian.message.request.MessageReq)
	 * @exception 
	 * @since  1.0.0
	 */
	@Override
	public Integer updateServiceUnread(MessageReq messageReq) {
		// TODO Auto-generated method stub
		return messageMapper.updateServiceUnread(messageReq);
	}

	
}
