/*
 * NewsMapper.java
 * Copyright(C) 20xx-2015 xxxxxx鍏徃
 * All rights reserved.
 * -----------------------------------------------
 * 2018-06-12 Created
 */
package com.jiabian.dao.basic.hotel;

import com.jiabian.base.PagesModel;
import com.jiabian.beans.basic.hotel.News;
import com.jiabian.beans.basic.hotel.NewsQueryHelper;
import com.jiabian.hotel.request.NewsReq;
import com.jiabian.hotel.response.NewsRes;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;

public interface NewsMapper {
    int countByExample(NewsQueryHelper example);

    int deleteByExample(NewsQueryHelper example);

    int deleteByPrimaryKey(Long id);

    int insert(News record);

    int insertSelective(News record);

    List<News> selectByExample(NewsQueryHelper example);

    News selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") News record, @Param("example") NewsQueryHelper example);

    int updateByExample(@Param("record") News record, @Param("example") NewsQueryHelper example);

    int updateByPrimaryKeySelective(News record);

    int updateByPrimaryKey(News record);

    @Delete("DELETE FROM news WHERE id =#{0}")
	Integer deletNews(Long id);

	Integer counNews(PagesModel<NewsReq, NewsRes> pagesModel);
	List<NewsRes> selectNews(PagesModel<NewsReq, NewsRes> pagesModel);
}