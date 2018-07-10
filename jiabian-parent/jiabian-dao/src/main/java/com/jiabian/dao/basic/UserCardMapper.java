/*
 * UserCardMapper.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2017-04-12 Created
 */
package com.jiabian.dao.basic;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jiabian.base.PagesModel;
import com.jiabian.beans.basic.UserCard;
import com.jiabian.beans.basic.UserCardQueryHelper;
import com.jiabian.usercard.request.UserCardReq;
import com.jiabian.usercard.response.OrderRes;

public interface UserCardMapper {
    int countByExample(UserCardQueryHelper example);

    int deleteByExample(UserCardQueryHelper example);

    int deleteByPrimaryKey(Long id);

    int insert(UserCard record);

    int insertSelective(UserCard record);

    List<UserCard> selectByExample(UserCardQueryHelper example);

    UserCard selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserCard record, @Param("example") UserCardQueryHelper example);

    int updateByExample(@Param("record") UserCard record, @Param("example") UserCardQueryHelper example);

    int updateByPrimaryKeySelective(UserCard record);

    int updateByPrimaryKey(UserCard record);
    
    /**
	 * 查询会员卡数量
	 * com.jiabian.dao.basic 
	 * 方法名：selectListCount
	 * 创建人：何雪平 
	 * 时间：2017年4月12日-下午3:06:45 
	 * @param pagesModel
	 * @return Integer
	 * @exception 
	 * @since  1.0.0
	*/
	Integer selectListCount(PagesModel<UserCardReq, OrderRes> pagesModel);

	/**
	 * 查询会员卡列表
	 * com.jiabian.dao.basic 
	 * 方法名：selectList
	 * 创建人：何雪平 
	 * 时间：2017年4月12日-下午3:07:10 
	 * @param pagesModel
	 * @return List<UserCardRes>
	 * @exception 
	 * @since  1.0.0
	*/
	List<OrderRes> selectList(PagesModel<UserCardReq, OrderRes> pagesModel);

	/**
	 * 根据用户id查询会员卡列表
	 * com.jiabian.dao.basic 
	 * 方法名：selectList
	 * 创建人：何雪平 
	 * 时间：2017年4月13日-下午5:27:08 
	 * @param userId
	 * @return List<UserCardRes>
	 * @exception 
	 * @since  1.0.0
	*/
	List<OrderRes> selectListByUserId(Long userId);

	/**
	 * 查询用户会员卡 
	 * com.jiabian.dao.basic 
	 * 方法名：selectUserCard
	 * 创建人：何雪平 
	 * 时间：2017年4月19日-下午1:36:22 
	 * @param userId
	 * @return UserCardRel
	 * @exception 
	 * @since  1.0.0
	*/
	OrderRes selectUserCard(Long userId);    
    
}