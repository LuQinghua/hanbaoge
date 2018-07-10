/*
 * SysConfigMapper.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-10-18 Created
 */
package com.jiabian.dao.basic;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jiabian.base.PagesModel;
import com.jiabian.beans.basic.SysConfig;
import com.jiabian.beans.basic.SysConfigQueryHelper;
import com.jiabian.sys.sysconfig.request.SysConfigReq;
import com.jiabian.sys.sysconfig.response.SysConfigResp;

public interface SysConfigMapper {
    int countByExample(SysConfigQueryHelper example);

    int deleteByExample(SysConfigQueryHelper example);

    int deleteByPrimaryKey(Long id);

    int insert(SysConfig record);

    int insertSelective(SysConfig record);

    List<SysConfig> selectByExample(SysConfigQueryHelper example);

    SysConfig selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysConfig record, @Param("example") SysConfigQueryHelper example);

    int updateByExample(@Param("record") SysConfig record, @Param("example") SysConfigQueryHelper example);

    int updateByPrimaryKeySelective(SysConfig record);

    int updateByPrimaryKey(SysConfig record);
    
    /**
     * 根据id查询详情信息
     * @param id
     * @return
     */
    SysConfigReq selectConfigDetail(Long id);
    
    /**
     * 分页查询
     * @param pagesModel
     * @return
     */
    List<SysConfigResp> selectforPageByParam(PagesModel<SysConfigReq,SysConfigResp> pagesModel);
    Integer countforPageByParam(PagesModel<SysConfigReq,SysConfigResp> pagesModel);
    
    /**
     * 批量修改删除状态
     * @param isDel
     * @param ids
     * @param sysConfigReq
     * @return
     */
    int updateIsDelForeach(@Param("isDel") Integer isDel,@Param("ids") String[] ids,@Param("sysConfigReq") SysConfigReq sysConfigReq);

	List<SysConfig> getAllConfiguration();
    
}