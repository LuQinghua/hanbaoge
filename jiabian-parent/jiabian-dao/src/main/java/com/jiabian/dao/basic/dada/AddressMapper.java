/*
 * AddressMapper.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2018-06-27 Created
 */
package com.jiabian.dao.basic.dada;

import com.jiabian.beans.basic.dada.Address;
import com.jiabian.beans.basic.dada.AddressQueryHelper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AddressMapper {
    int countByExample(AddressQueryHelper example);

    int deleteByExample(AddressQueryHelper example);

    int deleteByPrimaryKey(Long id);

    int insert(Address record);

    int insertSelective(Address record);

    List<Address> selectByExample(AddressQueryHelper example);

    Address selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Address record, @Param("example") AddressQueryHelper example);

    int updateByExample(@Param("record") Address record, @Param("example") AddressQueryHelper example);

    int updateByPrimaryKeySelective(Address record);

    int updateByPrimaryKey(Address record);
}