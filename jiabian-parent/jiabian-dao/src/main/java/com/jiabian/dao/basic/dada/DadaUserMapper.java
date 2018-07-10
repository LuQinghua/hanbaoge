/*
 * DadaUserMapper.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2018-06-26 Created
 */
package com.jiabian.dao.basic.dada;

import com.jiabian.base.PagesModel;
import com.jiabian.beans.basic.dada.DadaUser;
import com.jiabian.beans.basic.dada.DadaUserQueryHelper;
import com.jiabian.dada.request.DadaUserReq;
import com.jiabian.dada.response.DadaUserRes;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;

public interface DadaUserMapper {
    int countByExample(DadaUserQueryHelper example);

    int deleteByExample(DadaUserQueryHelper example);

    int deleteByPrimaryKey(Long id);

    int insert(DadaUser record);

    int insertSelective(DadaUser record);

    List<DadaUser> selectByExample(DadaUserQueryHelper example);

    DadaUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DadaUser record, @Param("example") DadaUserQueryHelper example);

    int updateByExample(@Param("record") DadaUser record, @Param("example") DadaUserQueryHelper example);

    int updateByPrimaryKeySelective(DadaUser record);

    int updateByPrimaryKey(DadaUser record);
    
    @Delete("DELETE FROM dadauser WHERE id =#{0}")
	Integer deleteDadaUsers(Long id);
 
	Integer countDadaUsers(PagesModel<DadaUserReq, DadaUserRes> pagesModel);

	List<DadaUserRes> selectDadaUsers(PagesModel<DadaUserReq, DadaUserRes> pagesModel);

	Integer countDadaUsersByCondition(@Param("condition") String condition, @Param("pagesModel") PagesModel<DadaUserReq, DadaUserRes> pagesModel);

	List<DadaUserRes> selectDadaUsersByCondition(@Param("condition") String condition, @Param("pagesModel") PagesModel<DadaUserReq, DadaUserRes> pagesModel);
	
}