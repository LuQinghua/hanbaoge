/*
 * CompanyMapper.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2018-06-15 Created
 */
package com.jiabian.dao.basic.hotel;

import com.jiabian.beans.basic.hotel.Company;
import com.jiabian.beans.basic.hotel.CompanyQueryHelper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompanyMapper {
    int countByExample(CompanyQueryHelper example);

    int deleteByExample(CompanyQueryHelper example);

    int deleteByPrimaryKey(Integer id);

    int insert(Company record);

    int insertSelective(Company record);

    List<Company> selectByExample(CompanyQueryHelper example);

    Company selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Company record, @Param("example") CompanyQueryHelper example);

    int updateByExample(@Param("record") Company record, @Param("example") CompanyQueryHelper example);

    int updateByPrimaryKeySelective(Company record);

    int updateByPrimaryKey(Company record);
}