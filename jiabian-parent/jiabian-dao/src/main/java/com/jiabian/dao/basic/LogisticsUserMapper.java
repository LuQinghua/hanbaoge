/*
 * LogisticsUserMapper.java
 * Copyright(C) 20xx-2015 xxxxxx��˾
 * All rights reserved.
 * -----------------------------------------------
 * 2016-12-16 Created
 */
package com.jiabian.dao.basic;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jiabian.base.PagesModel;
import com.jiabian.beans.basic.LogisticsUser;
import com.jiabian.beans.basic.LogisticsUserQueryHelper;
import com.jiabian.logisticsuser.request.logisticsUserReq;
import com.jiabian.logisticsuser.response.LogisticsUserRes;

public interface LogisticsUserMapper {
    int countByExample(LogisticsUserQueryHelper example);

    int deleteByExample(LogisticsUserQueryHelper example);

    int deleteByPrimaryKey(Long id);

    int insert(LogisticsUser record);

    int insertSelective(LogisticsUser record);

    List<LogisticsUser> selectByExample(LogisticsUserQueryHelper example);

    LogisticsUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LogisticsUser record, @Param("example") LogisticsUserQueryHelper example);

    int updateByExample(@Param("record") LogisticsUser record, @Param("example") LogisticsUserQueryHelper example);

    int updateByPrimaryKeySelective(LogisticsUser record);

    int updateByPrimaryKey(LogisticsUser record);
    
    /**
     * 配送员信息
     * com.jiabian.dao.basic 
     * 方法名：selectSendUserInfo
     * 创建人：何雪平 
     * 时间：2016年12月3日-上午10:10:17 
     * @param shopId
     * @param orderId
     * @return LogisticsUserService
     * @exception 
     * @since  1.0.0
     */
    LogisticsUserRes selectSendUserInfo(@Param("orderId") Long orderId,@Param("shopId") Long shopId);

    
    /**
     * 
     * 配送人员分页
     * com.jiabian.dao.basic 
     * 方法名：selectCourierList
     * 创建人：李文凯
     * 时间：2016年12月16日-下午2:19:59 
     * @param pagesModel
     * @return List<LogisticsUserRes>
     * @exception 
     * @since  1.0.0
     */
	List<LogisticsUserRes> selectCourierList(
			PagesModel<logisticsUserReq, LogisticsUserRes> pagesModel);

	Integer countCourierList(
			PagesModel<logisticsUserReq, LogisticsUserRes> pagesModel);

	Integer deleteCourier(Long id);
}