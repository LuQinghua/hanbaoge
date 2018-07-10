/*
 * SysApplicationMapper.java
 * Copyright(C) 20xx-2015 xxxxxx��˾
 * All rights reserved.
 * -----------------------------------------------
 * 2016-12-21 Created
 */
package com.jiabian.dao.basic;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jiabian.appication.request.SysApplicationReq;
import com.jiabian.appication.response.SysApplicationRes;
import com.jiabian.base.PagesModel;
import com.jiabian.beans.basic.SysApplication;
import com.jiabian.beans.basic.SysApplicationQueryHelper;
import com.jiabian.sys.sysuser.response.SysUserResp;

public interface SysApplicationMapper {
    int countByExample(SysApplicationQueryHelper example);

    int deleteByExample(SysApplicationQueryHelper example);

    int deleteByPrimaryKey(Long id);

    int insert(SysApplication record);

    int insertSelective(SysApplication record);

    List<SysApplication> selectByExample(SysApplicationQueryHelper example);

    SysApplication selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysApplication record, @Param("example") SysApplicationQueryHelper example);

    int updateByExample(@Param("record") SysApplication record, @Param("example") SysApplicationQueryHelper example);

    int updateByPrimaryKeySelective(SysApplication record);

    int updateByPrimaryKey(SysApplication record);
    
    Integer countSysApplication4PagesModel(PagesModel<SysApplicationReq, SysApplicationRes> pagesModel);

	List<SysApplicationRes> selectSysApplication4PagesModel(PagesModel<SysApplicationReq, SysApplicationRes> pagesModel);

	/**
	 * 根据Id查询系统用户信息
	 * com.jiabian.dao.basic 
	 * 方法名：selectApplicationSysUserInfo
	 * 创建人：方玉明
	 * 时间：2016年12月21日-下午3:56:57 
	 * @param id
	 * @return SysUserResp
	 * @exception 
	 * @since  1.0.0
	*/
	SysUserResp selectApplicationSysUserInfo(Long id);

}