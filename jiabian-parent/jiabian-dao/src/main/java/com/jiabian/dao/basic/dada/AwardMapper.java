/*
 * AwardMapper.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2018-06-27 Created
 */
package com.jiabian.dao.basic.dada;

import com.jiabian.base.PagesModel;
import com.jiabian.beans.basic.dada.Award;
import com.jiabian.beans.basic.dada.AwardQueryHelper;
import com.jiabian.dada.request.AwardReq;
import com.jiabian.dada.response.AwardRes;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AwardMapper {
    int countByExample(AwardQueryHelper example);

    int deleteByExample(AwardQueryHelper example);

    int deleteByPrimaryKey(Long id);

    int insert(Award record);

    int insertSelective(Award record);

    List<Award> selectByExample(AwardQueryHelper example);

    Award selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Award record, @Param("example") AwardQueryHelper example);

    int updateByExample(@Param("record") Award record, @Param("example") AwardQueryHelper example);

    int updateByPrimaryKeySelective(Award record);

    int updateByPrimaryKey(Award record);

	Integer countAwardById(@Param("pagesModel") PagesModel<AwardReq, AwardRes> pagesModel, @Param("id") Long id);

	List<AwardRes> selectAwardById(@Param("pagesModel") PagesModel<AwardReq, AwardRes> pagesModel, @Param("id") Long id);
}