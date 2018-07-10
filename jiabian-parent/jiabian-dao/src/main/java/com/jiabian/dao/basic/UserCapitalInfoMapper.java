/*
 * UserCapitalInfoMapper.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2017-01-10 Created
 */
package com.jiabian.dao.basic;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jiabian.base.PagesModel;
import com.jiabian.beans.basic.UserCapitalInfo;
import com.jiabian.beans.basic.UserCapitalInfoQueryHelper;
import com.jiabian.usercapitalinfo.request.UserCapitalInfoReq;
import com.jiabian.usercapitalinfo.response.UserCapitalInfoRes;

public interface UserCapitalInfoMapper {
    int countByExample(UserCapitalInfoQueryHelper example);

    int deleteByExample(UserCapitalInfoQueryHelper example);

    int deleteByPrimaryKey(Long id);

    int insert(UserCapitalInfo record);

    int insertSelective(UserCapitalInfo record);

    List<UserCapitalInfo> selectByExample(UserCapitalInfoQueryHelper example);

    UserCapitalInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserCapitalInfo record, @Param("example") UserCapitalInfoQueryHelper example);

    int updateByExample(@Param("record") UserCapitalInfo record, @Param("example") UserCapitalInfoQueryHelper example);

    int updateByPrimaryKeySelective(UserCapitalInfo record);

    int updateByPrimaryKey(UserCapitalInfo record);

    
    /**
     * 
     * 根据Id查找系统平台用户的账户信息
     * com.jiabian.dao.basic 
     * 方法名：selectAccountById
     * 创建人：李文凯
     * 时间：2017年1月10日-下午4:11:18 
     * @param pagesModel
     * @return List<UserCapitalInfoRes>
     * @exception 
     * @since  1.0.0
     */
	List<UserCapitalInfoRes> selectAccountById(PagesModel<UserCapitalInfoReq, UserCapitalInfoRes> pagesModel);

	Integer countAccount(PagesModel<UserCapitalInfoReq, UserCapitalInfoRes> pagesModel);

	/**
	 * 
	 * 删除账户
	 * com.jiabian.dao.basic 
	 * 方法名：deleteAccountById
	 * 创建人：李文凯
	 * 时间：2017年1月11日-下午1:56:04 
	 * @param id
	 * @return Integer
	 * @exception 
	 * @since  1.0.0
	 */
	Integer deleteAccountById(Long id);
}