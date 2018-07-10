/*
 * ScoreMapper.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2018-06-27 Created
 */
package com.jiabian.dao.basic.dada;

import com.jiabian.base.PagesModel;
import com.jiabian.beans.basic.dada.Score;
import com.jiabian.beans.basic.dada.ScoreQueryHelper;
import com.jiabian.dada.request.ScoreReq;
import com.jiabian.dada.response.ScoreRes;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScoreMapper {
    int countByExample(ScoreQueryHelper example);

    int deleteByExample(ScoreQueryHelper example);

    int deleteByPrimaryKey(Long id);

    int insert(Score record);

    int insertSelective(Score record);

    List<Score> selectByExample(ScoreQueryHelper example);

    Score selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Score record, @Param("example") ScoreQueryHelper example);

    int updateByExample(@Param("record") Score record, @Param("example") ScoreQueryHelper example);

    int updateByPrimaryKeySelective(Score record);

    int updateByPrimaryKey(Score record);

	Integer countScoreById(@Param("pagesModel") PagesModel<ScoreReq, ScoreRes> pagesModel, @Param("id") Long id);

	List<ScoreRes> selectScoreById(@Param("pagesModel") PagesModel<ScoreReq, ScoreRes> pagesModel, @Param("id") Long id);
}