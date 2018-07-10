/*
 * SysReturnMoneyMapper.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2017-01-20 Created
 */
package com.jiabian.dao.basic;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jiabian.beans.basic.SysReturnMoney;
import com.jiabian.beans.basic.SysReturnMoneyQueryHelper;
import com.jiabian.sys.sysreturnmoney.response.SysReturnMoneyRes;

public interface SysReturnMoneyMapper {
    int countByExample(SysReturnMoneyQueryHelper example);

    int deleteByExample(SysReturnMoneyQueryHelper example);

    int deleteByPrimaryKey(Long id);

    int insert(SysReturnMoney record);

    int insertSelective(SysReturnMoney record);

    List<SysReturnMoney> selectByExample(SysReturnMoneyQueryHelper example);

    SysReturnMoney selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysReturnMoney record, @Param("example") SysReturnMoneyQueryHelper example);

    int updateByExample(@Param("record") SysReturnMoney record, @Param("example") SysReturnMoneyQueryHelper example);

    int updateByPrimaryKeySelective(SysReturnMoney record);

    int updateByPrimaryKey(SysReturnMoney record);
    
    /**
     * 
     * (抢大运溢出号 退款记录插入)
     * com.jiabian.dao.basic 
     * 方法名：doInsertQdyRecord
     * 创建人：彭振锋 
     * 时间：2017年1月20日-下午3:11:23 
     * @param sysReturnMoneyRes
     * @return Integer
     * @exception 
     * @since  1.0.0
     */
    Integer doInsertQdyRecord(SysReturnMoneyRes sysReturnMoneyRes);
}