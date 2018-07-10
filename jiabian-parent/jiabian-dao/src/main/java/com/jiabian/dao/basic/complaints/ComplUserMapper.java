/*
 * ComplUserMapper.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2018-07-05 Created
 */
package com.jiabian.dao.basic.complaints;

import com.jiabian.base.PagesModel;
import com.jiabian.beans.basic.complaints.ComplUser;
import com.jiabian.beans.basic.complaints.ComplUserQueryHelper;
import com.jiabian.tspt.request.ComplUserReq;
import com.jiabian.tspt.response.ComplUserRes;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ComplUserMapper {
    int countByExample(ComplUserQueryHelper example);

    int deleteByExample(ComplUserQueryHelper example);

    int deleteByPrimaryKey(Long id);

    int insert(ComplUser record);

    int insertSelective(ComplUser record);

    List<ComplUser> selectByExample(ComplUserQueryHelper example);

    ComplUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ComplUser record, @Param("example") ComplUserQueryHelper example);

    int updateByExample(@Param("record") ComplUser record, @Param("example") ComplUserQueryHelper example);

    int updateByPrimaryKeySelective(ComplUser record);

    int updateByPrimaryKey(ComplUser record);

	Integer countComplUsers(PagesModel<ComplUserReq, ComplUserRes> pagesModel);

	List<ComplUserRes> selectComplUsers(PagesModel<ComplUserReq, ComplUserRes> pagesModel);

	List<ComplUserRes> selectComplUsersByCondition(@Param("condition") String condition, @Param("pagesModel") PagesModel<ComplUserReq, ComplUserRes> pagesModel);

}