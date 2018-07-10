/*
 * ResumeMapper.java
 * Copyright(C) 20xx-2015 xxxxxx鍏徃
 * All rights reserved.
 * -----------------------------------------------
 * 2018-06-04 Created
 */
package com.jiabian.dao.basic;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jiabian.base.PagesModel;
import com.jiabian.beans.basic.Resume;
import com.jiabian.beans.basic.ResumeQueryHelper;
import com.jiabian.wankong.request.ResumeReq;
import com.jiabian.wankong.response.ResumeRes;

public interface ResumeMapper {
    int countByExample(ResumeQueryHelper example);

    int deleteByExample(ResumeQueryHelper example);

    int deleteByPrimaryKey(Long id);

    int insert(Resume record);

    int insertSelective(Resume record);

    List<Resume> selectByExample(ResumeQueryHelper example);

    Resume selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Resume record, @Param("example") ResumeQueryHelper example);

    int updateByExample(@Param("record") Resume record, @Param("example") ResumeQueryHelper example);

    int updateByPrimaryKeySelective(Resume record);

    int updateByPrimaryKey(Resume record);

	Integer counResume(PagesModel<ResumeReq, ResumeRes> pagesModel);
	List<ResumeRes> selectResume(PagesModel<ResumeReq, ResumeRes> pagesModel);
}