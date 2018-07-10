package com.jiabian.common;

import java.math.BigDecimal;
import java.util.List;

import com.jiabian.base.PagesModel;
import com.jiabian.beans.basic.MoneyWater;
import com.jiabian.moneywater.request.MoneyWaterReq;
import com.jiabian.moneywater.response.MoneyWaterHelperRes;
import com.jiabian.moneywater.response.MoneyWaterRes;

public interface IMoneyWaterServiceBiz {

	/**
	 * 
	 * 查询商家流水资金信息
	 * com.jiabian.common 
	 * 方法名：selectMoneyInfo
	 * 创建人：李文凯
	 * 时间：2017年2月22日-下午5:56:24 
	 * @param shopId
	 * @return MoneyWaterRes
	 * @exception 
	 * @since  1.0.0
	 */
	MoneyWaterRes selectMoneyInfo(Long shopId);

	
	/**
	 * 
	 * 查询提现记录
	 * com.jiabian.common 
	 * 方法名：selectAccountList
	 * 创建人：李文凯
	 * 时间：2017年2月24日-上午11:13:40 
	 * @param pagesModel
	 * @return PagesModel<MoneyWaterReq,MoneyWaterRes>
	 * @exception 
	 * @since  1.0.0
	 */
	PagesModel<MoneyWaterReq, MoneyWaterRes> selectAccountList(PagesModel<MoneyWaterReq, MoneyWaterRes> pagesModel);


	/**
	 * 
	 * 提现详情页面
	 * com.jiabian.common 
	 * 方法名：selectApplyDetail
	 * 创建人：李文凯
	 * 时间：2017年2月27日-下午2:30:42 
	 * @param id
	 * @return MoneyWaterRes
	 * @exception 
	 * @since  1.0.0
	 */
	MoneyWaterRes selectApplyDetail(Long id);


	/**
	 * 
	 * 处理提现
	 * com.jiabian.common 
	 * 方法名：updateApplyStatus
	 * 创建人：李文凯
	 * 时间：2017年2月27日-下午5:47:36 
	 * @param moneyWater
	 * @return Integer
	 * @exception 
	 * @since  1.0.0
	 */
	Integer updateApplyStatus(MoneyWater moneyWater);


	/**
	 * 
	 * 申请提现
	 * com.jiabian.common 
	 * 方法名：businessApplyMoney
	 * 创建人：李文凯
	 * 时间：2017年2月28日-上午11:17:40 
	 * @param moneyWater
	 * @return Integer
	 * @exception 
	 * @since  1.0.0
	 */
	Integer businessApplyMoney(MoneyWater moneyWater);


	/**
	 * 
	 * 查询销售总额
	 * com.jiabian.common 
	 * 方法名：getTotalMoney
	 * 创建人：黄世平
	 * 时间：2017年3月24日-上午11:49:17 
	 * @param shopId
	 * @param type 1 销售总额 2 可提现金额 3 已提现金额 4 申请提现金额
	 * @return BigDecimal
	 * @exception 
	 * @since  1.0.0
	 */
	BigDecimal getTotalMoney(Long shopId,Integer type);


	void selectBillList(PagesModel<MoneyWaterReq, MoneyWaterRes> pagesModel);


	List<MoneyWaterHelperRes> getOrderPrice(Long shopId);


	Integer typingWaterMoney(MoneyWaterReq moneyWaterReq);

}
