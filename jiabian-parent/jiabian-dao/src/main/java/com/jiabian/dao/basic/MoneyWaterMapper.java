/*
 * MoneyWaterMapper.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2017-02-22 Created
 */
package com.jiabian.dao.basic;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.jiabian.base.PagesModel;
import com.jiabian.beans.basic.MoneyWater;
import com.jiabian.beans.basic.MoneyWaterQueryHelper;
import com.jiabian.moneywater.request.MoneyWaterReq;
import com.jiabian.moneywater.response.MoneyWaterHelperRes;
import com.jiabian.moneywater.response.MoneyWaterRes;

public interface MoneyWaterMapper {
    int countByExample(MoneyWaterQueryHelper example);

    int deleteByExample(MoneyWaterQueryHelper example);

    int deleteByPrimaryKey(Long id);

    int insert(MoneyWater record);

    int insertSelective(MoneyWater record);

    List<MoneyWater> selectByExample(MoneyWaterQueryHelper example);

    MoneyWater selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MoneyWater record, @Param("example") MoneyWaterQueryHelper example);

    int updateByExample(@Param("record") MoneyWater record, @Param("example") MoneyWaterQueryHelper example);

    int updateByPrimaryKeySelective(MoneyWater record);

    int updateByPrimaryKey(MoneyWater record);
    
//    /**
//     * 
//     * (动态查询资金流水)
//     * com.jiabian.dao.basic 
//     * 方法名：MoneyByCondition
//     * 创建人：彭振锋 
//     * 时间：Nov 29, 2016-2:48:43 PM 
//     * @param moneyWaterReq
//     * @param shopId (基础条件)
//     * @return List<MoneyWaterRes>
//     * @exception 
//     * @since  1.0.0
//     */
//    List<MoneyWaterRes> MoneyByCondition(PagesModel<MoneyWaterReq, MoneyWaterRes> pagesModel);
//    
//    /**
//     * 
//     * (动态查询资金流水总条数)
//     * com.jiabian.dao.basic 
//     * 方法名：countMoneyByCondition
//     * 创建人：彭振锋 
//     * 时间：Dec 2, 2016-11:35:26 AM 
//     * @param pagesModel
//     * @return Integer
//     * @exception 
//     * @since  1.0.0
//     */
//    Integer countMoneyByCondition(PagesModel<MoneyWaterReq, MoneyWaterRes> pagesModel);
//    
//    /**
//     * 
//     * (查询资金流水的总条数)
//     * com.jiabian.dao.basic 
//     * 方法名：moneyRecordNumber
//     * 创建人：彭振锋 
//     * 时间：Nov 29, 2016-3:27:29 PM 
//     * @param shopId
//     * @return int
//     * @exception 
//     * @since  1.0.0
//     */
//    MoneyWaterRes moneyRecordNumber(Long shopId);
//    
//    /**
//     * 
//     * (查询总收入金额  和总提现金额)
//     * com.jiabian.dao.basic 
//     * 方法名：getTotalMoney
//     * 创建人：彭振锋 
//     * 时间：Nov 29, 2016-7:17:23 PM 
//     * @param shopId
//     * @return MoneyWaterRes
//     * @exception 
//     * @since  1.0.0
//     */
//    MoneyWaterRes getTotalMoney(Long shopId);

    /**
     * 
     * 查询商家流水资金信息
     * com.jiabian.dao.basic 
     * 方法名：selectMoneyInfo
     * 创建人：李文凯
     * 时间：2017年2月23日-下午3:33:09 
     * @param shopId
     * @return MoneyWaterRes
     * @exception 
     * @since  1.0.0
     */
	MoneyWaterRes selectMoneyInfo(Long shopId);

	Integer countAccountList(PagesModel<MoneyWaterReq, MoneyWaterRes> pagesModel);

	List<MoneyWaterRes> selectAccountList(PagesModel<MoneyWaterReq, MoneyWaterRes> pagesModel);

	/**
	 * 
	 * 提现详情页面
	 * com.jiabian.dao.basic 
	 * 方法名：selectApplyDetail
	 * 创建人：李文凯
	 * 时间：2017年2月27日-下午2:34:16 
	 * @param id
	 * @return MoneyWaterRes
	 * @exception 
	 * @since  1.0.0
	 */
	MoneyWaterRes selectApplyDetail(Long id);

	MoneyWaterRes selectNowSaleMoney(Long shopId);

	@Select("select sum(orec.prodsPrice) from order_pay op LEFT JOIN order_record orec on "
			+ "op.orderId = orec.orderId where orec.shopId =#{0} and op.payStatus =2")
	BigDecimal getTotalSaleMoney(Long shopId);

	@Select("SELECT sum(withdrawMoney) from money_water where shopId =#{0} and moneyStatus = 0")
	BigDecimal getAvailableCashMoney(Long shopId);
	@Select("SELECT sum(withdrawMoney) from money_water where shopId =#{0} and moneyStatus = 3")
	BigDecimal getAlreadyPresentMoney(Long shopId);
	@Select("SELECT sum(withdrawMoney) from money_water where shopId =#{0} and moneyStatus > 0 and moneyStatus < 3")
	BigDecimal getApplicationForWithdrawalMoney(Long shopId);

	List<MoneyWaterRes> selectBillList(PagesModel<MoneyWaterReq, MoneyWaterRes> pagesModel);

	Integer countBillList(PagesModel<MoneyWaterReq, MoneyWaterRes> pagesModel);
	
	@Select("SELECT orec.orderId,pc.cateName,od.prodId,pro.prodName,pro.cateId,pro.priceNow,orec.prodsPrice,orec.acceptOrderTime,"
    +"u.userName,u.id FROM order_pay op LEFT JOIN order_record orec ON orec.orderId = op.orderId "
    +"LEFT JOIN order_detail od ON orec.orderId = od.orderId LEFT JOIN product pro ON pro.id = od.prodId "
    +"LEFT JOIN product_category pc ON pro.cateId = pc.id LEFT JOIN users u ON u.id = op.userId "
    +"WHERE orec.presentState = 0 AND orec.shopId = #{0} AND od.shopId =#{0} AND op.payStatus = 2")
	List<MoneyWaterHelperRes> getOrderPrice(Long shopId);

	@Update("update order_record orec LEFT JOIN order_pay op on orec.orderId = op.orderId set presentState = 1 where op.payStatus = 2 and orec.shopId = #{0}")
	Integer updateOrderRecord(Long shopId);
}