/*
 * AfterSaleMapper.java
 * Copyright(C) 20xx-2015 xxxxxx鍏徃
 * All rights reserved.
 * -----------------------------------------------
 * 2018-06-11 Created
 */
package com.jiabian.dao.basic;

import com.jiabian.base.PagesModel;
import com.jiabian.beans.basic.AfterSale;
import com.jiabian.beans.basic.AfterSaleQueryHelper;
import com.jiabian.wankong.request.AfterSaleReq;
import com.jiabian.wankong.response.AfterSaleRes;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AfterSaleMapper {
    int countByExample(AfterSaleQueryHelper example);

    int deleteByExample(AfterSaleQueryHelper example);

    int deleteByPrimaryKey(Long id);

    int insert(AfterSale record);

    int insertSelective(AfterSale record);

    List<AfterSale> selectByExample(AfterSaleQueryHelper example);

    AfterSale selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AfterSale record, @Param("example") AfterSaleQueryHelper example);

    int updateByExample(@Param("record") AfterSale record, @Param("example") AfterSaleQueryHelper example);

    int updateByPrimaryKeySelective(AfterSale record);

    int updateByPrimaryKey(AfterSale record);

	List<AfterSaleRes> selectafterSale(PagesModel<AfterSaleReq, AfterSaleRes> pagesModel);

	Integer counafterSale(PagesModel<AfterSaleReq, AfterSaleRes> pagesModel);
}