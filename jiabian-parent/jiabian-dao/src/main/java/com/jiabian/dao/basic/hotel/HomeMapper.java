/*
 * HomeMapper.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2018-06-14 Created
 */
package com.jiabian.dao.basic.hotel;

import com.jiabian.base.PagesModel;
import com.jiabian.beans.basic.hotel.Home;
import com.jiabian.beans.basic.hotel.HomeQueryHelper;
import com.jiabian.hotel.request.HomeReq;
import com.jiabian.hotel.response.HomeRes;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;

public interface HomeMapper {
    int countByExample(HomeQueryHelper example);

    int deleteByExample(HomeQueryHelper example);

    int deleteByPrimaryKey(Integer id);

    int insert(Home record);

    int insertSelective(Home record);

    List<Home> selectByExample(HomeQueryHelper example);

    Home selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Home record, @Param("example") HomeQueryHelper example);

    int updateByExample(@Param("record") Home record, @Param("example") HomeQueryHelper example);

    int updateByPrimaryKeySelective(Home record);

    int updateByPrimaryKey(Home record);
    
    @Delete("DELETE FROM home WHERE id =#{id}")
	Integer deletHome(Integer id);

	Integer countHomes(PagesModel<HomeReq, HomeRes> pagesModel);

	List<HomeRes> selectHomes(PagesModel<HomeReq, HomeRes> pagesModel);
	
	List<Integer> getHomeClassIds();
	
	List<HomeRes> selectHomeByCondition(@Param("name") String name, @Param("classifyId") Byte classifyId,
			@Param("pagesModel") PagesModel<HomeReq, HomeRes> pagesModel);
}