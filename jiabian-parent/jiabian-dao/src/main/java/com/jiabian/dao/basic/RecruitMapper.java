/*
 * RecruitMapper.java
 * Copyright(C) 20xx-2015 xxxxxx鍏徃
 * All rights reserved.
 * -----------------------------------------------
 * 2018-06-04 Created
 */
package com.jiabian.dao.basic;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.jiabian.base.PagesModel;
import com.jiabian.beans.basic.Recruit;
import com.jiabian.beans.basic.RecruitQueryHelper;
import com.jiabian.wankong.request.RecruitReq;
import com.jiabian.wankong.response.RecruitRes;

public interface RecruitMapper {
    int countByExample(RecruitQueryHelper example);

    int deleteByExample(RecruitQueryHelper example);

    int deleteByPrimaryKey(Long id);

    int insert(Recruit record);

    int insertSelective(Recruit record);

    List<Recruit> selectByExample(RecruitQueryHelper example);

    Recruit selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Recruit record, @Param("example") RecruitQueryHelper example);

    int updateByExample(@Param("record") Recruit record, @Param("example") RecruitQueryHelper example);

    int updateByPrimaryKeySelective(Recruit record);

    int updateByPrimaryKey(Recruit record);

	Integer counRecruit(PagesModel<RecruitReq, RecruitRes> pagesModel);
	List<RecruitRes> selectRecruit(PagesModel<RecruitReq, RecruitRes> pagesModel);

	@Delete("DELETE FROM recruit WHERE id = #{0}")
	Integer deletRecruit(Long id);
    
	@Select("SELECT * FROM recruit")
	List<RecruitRes> recruit(RecruitReq recruitReq);
	@Select("SELECT * FROM recruit WHERE id = #{0}")
	List<RecruitRes> recruitId(Long id);
}