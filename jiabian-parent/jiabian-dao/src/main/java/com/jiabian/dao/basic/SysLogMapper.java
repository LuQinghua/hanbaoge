/*
 * SysLogMapper.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-10-19 Created
 */
package com.jiabian.dao.basic;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jiabian.base.PagesModel;
import com.jiabian.beans.basic.SysLog;
import com.jiabian.beans.basic.SysLogQueryHelper;
import com.jiabian.sys.syslog.request.SysLogReq;
import com.jiabian.sys.syslog.response.SysLogResp;

public interface SysLogMapper {
    int countByExample(SysLogQueryHelper example);

    int deleteByExample(SysLogQueryHelper example);

    int deleteByPrimaryKey(Long id);

    int insert(SysLog record);

    int insertSelective(SysLog record);

    List<SysLog> selectByExample(SysLogQueryHelper example);
    
    SysLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysLog record, @Param("example") SysLogQueryHelper example);

    int updateByExample(@Param("record") SysLog record, @Param("example") SysLogQueryHelper example);

    int updateByPrimaryKeySelective(SysLog record);

    int updateByPrimaryKey(SysLog record);
    
    /**
     * 分页查询
     * @param pagesModel
     * @return
     */
    List<SysLogResp> selectforPageByParam(PagesModel<SysLogReq,SysLogResp> pagesModel);
    Integer countforPageByParam(PagesModel<SysLogReq,SysLogResp> pagesModel);
}