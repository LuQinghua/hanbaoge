/*
 * EquipmentMapper.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2018-06-14 Created
 */
package com.jiabian.dao.basic.hotel;

import com.jiabian.beans.basic.hotel.Equipment;
import com.jiabian.beans.basic.hotel.EquipmentQueryHelper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EquipmentMapper {
    int countByExample(EquipmentQueryHelper example);

    int deleteByExample(EquipmentQueryHelper example);

    int deleteByPrimaryKey(Long id);

    int insert(Equipment record);

    int insertSelective(Equipment record);

    List<Equipment> selectByExample(EquipmentQueryHelper example);

    Equipment selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Equipment record, @Param("example") EquipmentQueryHelper example);

    int updateByExample(@Param("record") Equipment record, @Param("example") EquipmentQueryHelper example);

    int updateByPrimaryKeySelective(Equipment record);

    int updateByPrimaryKey(Equipment record);

	List<Equipment> selectWithClassify(Long id);
	
	List<String> selectDistinctEquipments();
}