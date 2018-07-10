/*
 * MessageMapper.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-12-27 Created
 */
package com.jiabian.dao.basic;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jiabian.beans.basic.Message;
import com.jiabian.beans.basic.MessageQueryHelper;
import com.jiabian.message.request.MessageReq;
import com.jiabian.message.response.MessageRes;

public interface MessageMapper {
    int countByExample(MessageQueryHelper example);

    int deleteByExample(MessageQueryHelper example);

    int deleteByPrimaryKey(Long id);

    int insert(Message record);

    int insertSelective(Message record);

    List<Message> selectByExample(MessageQueryHelper example);

    Message selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Message record, @Param("example") MessageQueryHelper example);

    int updateByExample(@Param("record") Message record, @Param("example") MessageQueryHelper example);

    int updateByPrimaryKeySelective(Message record);

    int updateByPrimaryKey(Message record);
    
    /**
     * 
     * (显示和商家过聊天的用户列表)
     * com.jiabian.dao.basic 
     * 方法名：selectUserList
     * 创建人：彭振锋 
     * 时间：2016年12月17日-下午4:54:29 
     * @param messageReq
     * @return List<MessageRes>
     * @exception 
     * @since  1.0.0
     */
    List<MessageRes> selectUserList(MessageReq messageReq);
    
    /**
     * 
     * (显示商家和用户聊天信息)
     * com.jiabian.dao.basic 
     * 方法名：messageDetail
     * 创建人：彭振锋 
     * 时间：2016年12月19日-下午1:39:15 
     * @param messageReq
     * @return List<MessageRes>
     * @exception 
     * @since  1.0.0
     */
    List<MessageRes> messageDetail(MessageReq messageReq);
    
    /**
     * 
     * (查询未读消息条数)
     * com.jiabian.dao.basic 
     * 方法名：getUnreadCount
     * 创建人：彭振锋 
     * 时间：2016年12月19日-下午3:28:48 
     * @param messageReq
     * @return Integer
     * @exception 
     * @since  1.0.0
     */
    Integer getUnreadCount(MessageReq messageReq);
    
    /**
     * 
     * (修改消息已读状态)
     * com.jiabian.dao.basic 
     * 方法名：updateUnread
     * 创建人：彭振锋 
     * 时间：2016年12月19日-下午4:22:00 
     * @param messageReq
     * @return Integer
     * @exception 
     * @since  1.0.0
     */
    Integer updateUnread(MessageReq messageReq);
    
    /**
     * 
     * (查询商家和客服聊天 未读消息条数)
     * com.jiabian.dao.basic 
     * 方法名：getServiceUnreadCount
     * 创建人：彭振锋 
     * 时间：2016年12月27日-下午4:10:21 
     * @param messageReq
     * @return Integer
     * @exception 
     * @since  1.0.0
     */
    Integer getServiceUnreadCount(MessageReq messageReq);
    
    /**
     * 
     * (查询商家和客服聊天的聊天内容)
     * com.jiabian.dao.basic 
     * 方法名：serviceDetail
     * 创建人：彭振锋 
     * 时间：2016年12月27日-下午5:22:38 
     * @param messageReq
     * @return List<MessageRes>
     * @exception 
     * @since  1.0.0
     */
    List<MessageRes> serviceDetail(MessageReq messageReq);
    
    /**
     * 
     * (将商家和客服的消息状态修改为已读)
     * com.jiabian.dao.basic 
     * 方法名：updateServiceUnread
     * 创建人：彭振锋 
     * 时间：2016年12月27日-下午7:08:33 
     * @param messageReq
     * @return Integer
     * @exception 
     * @since  1.0.0
     */
    Integer updateServiceUnread(MessageReq messageReq);
}