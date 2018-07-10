/*
 * UserCardRelMapper.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2017-04-12 Created
 */
package com.jiabian.dao.basic;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jiabian.beans.basic.UserCardRel;
import com.jiabian.beans.basic.UserCardRelQueryHelper;

public interface UserCardRelMapper {
    int countByExample(UserCardRelQueryHelper example);

    int deleteByExample(UserCardRelQueryHelper example);

    int deleteByPrimaryKey(Long id);

    int insert(UserCardRel record);

    int insertSelective(UserCardRel record);

    List<UserCardRel> selectByExample(UserCardRelQueryHelper example);

    UserCardRel selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserCardRel record, @Param("example") UserCardRelQueryHelper example);

    int updateByExample(@Param("record") UserCardRel record, @Param("example") UserCardRelQueryHelper example);

    int updateByPrimaryKeySelective(UserCardRel record);

    int updateByPrimaryKey(UserCardRel record);
  
    /**
     * 查询会员卡期限
     * com.jiabian.dao.basic 
     * 方法名：selectTimePeriod
     * 创建人：何雪平 
     * 时间：2017年4月14日-下午3:40:17 
     * @param orderId
     * @return String
     * @exception 
     * @since  1.0.0
     */
    Integer selectTimePeriod(Long orderId);
    
    /**
     * 插入会员卡用户信息
     * com.jiabian.dao.basic 
     * 方法名：InsertCardRel
     * 创建人：何雪平 
     * 时间：2017年4月14日-下午3:51:48 
     * @param userId
     * @return int
     * @exception 
     * @since  1.0.0
     */
    int insertCardRel(@Param("userId") Long userId,@Param("timePeriod") Integer timePeriod);
   
    /**
     * 更新会员卡时间
     * com.jiabian.dao.basic 
     * 方法名：updateCardTime
     * 创建人：何雪平 
     * 时间：2017年4月14日-下午4:24:22 
     * @param userId
     * @param timePeriod
     * @return int
     * @exception 
     * @since  1.0.0
     */
    int updateCardTime(@Param("userId") Long userId,@Param("timePeriod") Integer timePeriod);
    
    /**
     * 根据订单id查询会员卡时间期限
     * com.jiabian.dao.basic 
     * 方法名：selectPeriodByOrderId
     * 创建人：何雪平 
     * 时间：2017年4月18日-上午11:57:55 
     * @param userId
     * @return int
     * @exception 
     * @since  1.0.0
     */
    int selectPeriodByOrderId(@Param("orderId") Long orderId);
}