/*
 * VersionAppMapper.java
 * Copyright(C) 20xx-2015 xxxxxx��˾
 * All rights reserved.
 * -----------------------------------------------
 * 2016-12-20 Created
 */
package com.jiabian.dao.basic;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jiabian.base.PagesModel;
import com.jiabian.beans.basic.VersionApp;
import com.jiabian.beans.basic.VersionAppQueryHelper;
import com.jiabian.versionapp.request.VersionAppReq;
import com.jiabian.versionapp.response.VersionAppRes;

public interface VersionAppMapper {
    int countByExample(VersionAppQueryHelper example);

    int deleteByExample(VersionAppQueryHelper example);

    int deleteByPrimaryKey(Long id);

    int insert(VersionApp record);

    int insertSelective(VersionApp record);

    List<VersionApp> selectByExample(VersionAppQueryHelper example);

    VersionApp selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") VersionApp record, @Param("example") VersionAppQueryHelper example);

    int updateByExample(@Param("record") VersionApp record, @Param("example") VersionAppQueryHelper example);

    int updateByPrimaryKeySelective(VersionApp record);

    int updateByPrimaryKey(VersionApp record);
    
    /**
     * 查询最新版本
     * com.jiabian.dao.basic 
     * 方法名：selectLatestVersion
     * 创建人：何雪平 
     * 时间：2016年12月20日-上午9:55:54 
     * @return VersionApp
     * @exception 
     * @since  1.0.0
     */
    VersionApp selectLatestVersion(@Param("source") Byte source,@Param("type") Byte type);

    
    /**
     * 
     * APP版本管理分页
     * com.jiabian.dao.basic 
     * 方法名：selectVersion
     * 创建人：李文凯
     * 时间：2017年1月5日-下午5:56:43 
     * @param pagesModel
     * @return List<VersionAppRes>
     * @exception 
     * @since  1.0.0
     */
	List<VersionAppRes> selectVersion(PagesModel<VersionAppReq, VersionAppRes> pagesModel);
	Integer countVersion(PagesModel<VersionAppReq, VersionAppRes> pagesModel);

	
	/**
	 * 
	 * 删除版本信息
	 * com.jiabian.dao.basic 
	 * 方法名：deleteApp
	 * 创建人：李文凯
	 * 时间：2017年1月6日-下午3:15:18 
	 * @param id
	 * @return Integer
	 * @exception 
	 * @since  1.0.0
	 */
	Integer deleteApp(Long id);

	
	/**
	 * 
	 * 当前APP版本号
	 * com.jiabian.dao.basic 
	 * 方法名：selectNowAndroid
	 * 创建人：李文凯
	 * 时间：2017年1月6日-下午5:20:24 
	 * @return VersionApp
	 * @exception 
	 * @since  1.0.0
	 */
	VersionApp selectNowAndroid();
	VersionApp selectNowIos();
}