/*
 * DadaNewsMapper.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2018-06-26 Created
 */
package com.jiabian.dao.basic.dada;

import com.jiabian.base.PagesModel;
import com.jiabian.beans.basic.dada.DadaNews;
import com.jiabian.beans.basic.dada.DadaNewsQueryHelper;
import com.jiabian.dada.request.DadaNewsReq;
import com.jiabian.dada.response.DadaNewsRes;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;

public interface DadaNewsMapper {
    int countByExample(DadaNewsQueryHelper example);

    int deleteByExample(DadaNewsQueryHelper example);

    int deleteByPrimaryKey(Long id);

    int insert(DadaNews record);

    int insertSelective(DadaNews record);

    List<DadaNews> selectByExample(DadaNewsQueryHelper example);

    DadaNews selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DadaNews record, @Param("example") DadaNewsQueryHelper example);

    int updateByExample(@Param("record") DadaNews record, @Param("example") DadaNewsQueryHelper example);

    int updateByPrimaryKeySelective(DadaNews record);

    int updateByPrimaryKey(DadaNews record);
    
    @Delete("DELETE FROM dadanews WHERE id =#{0}")
	Integer deleteDadaNews(Long id);
    
    Integer countDadaNews(PagesModel<DadaNewsReq, DadaNewsRes> pagesModel);

	List<DadaNewsRes> selectDadaNews(PagesModel<DadaNewsReq, DadaNewsRes> pagesModel);
}