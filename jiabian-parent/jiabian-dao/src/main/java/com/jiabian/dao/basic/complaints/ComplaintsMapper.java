/*
 * ComplaintsMapper.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2018-07-06 Created
 */
package com.jiabian.dao.basic.complaints;

import com.jiabian.base.PagesModel;
import com.jiabian.beans.basic.complaints.Complaints;
import com.jiabian.beans.basic.complaints.ComplaintsQueryHelper;
import com.jiabian.tspt.request.ComplaintsReq;
import com.jiabian.tspt.response.ComplaintsRes;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ComplaintsMapper {
    int countByExample(ComplaintsQueryHelper example);

    int deleteByExample(ComplaintsQueryHelper example);

    int deleteByPrimaryKey(Long id);

    int insert(Complaints record);

    int insertSelective(Complaints record);

    List<Complaints> selectByExample(ComplaintsQueryHelper example);

    Complaints selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Complaints record, @Param("example") ComplaintsQueryHelper example);

    int updateByExample(@Param("record") Complaints record, @Param("example") ComplaintsQueryHelper example);

    int updateByPrimaryKeySelective(Complaints record);

    int updateByPrimaryKey(Complaints record);
    
    List<ComplaintsRes> selectComplaints(PagesModel<ComplaintsReq, ComplaintsRes> pagesModel);
    
    List<ComplaintsRes> selectComplaintsByCondition(@Param("condition") String condition,
    		@Param("pagesModel") PagesModel<ComplaintsReq, ComplaintsRes> pagesModel);

	Integer countComplaintsByCondition(@Param("condition") String condition, 
			@Param("pagesModel") PagesModel<ComplaintsReq, ComplaintsRes> pagesModel);
}