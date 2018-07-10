package com.jiabian.service.basic;

import java.math.BigDecimal;
import java.util.List;

import com.jiabian.base.PagesModel;
import com.jiabian.beans.basic.MoneyWater;
import com.jiabian.moneywater.request.MoneyWaterReq;
import com.jiabian.moneywater.response.MoneyWaterHelperRes;
import com.jiabian.moneywater.response.MoneyWaterRes;

public interface IMoneyWaterService {

	
	/**
	 * 
	 * 查询商家流水资金信息
	 * com.jiabian.service.basic 
	 * 方法名：selectMoneyInfo
	 * 创建人：李文凯
	 * 时间：2017年2月23日-下午3:29:03 
	 * @param shopId
	 * @return MoneyWaterRes
	 * @exception 
	 * @since  1.0.0
	 */
	MoneyWaterRes selectMoneyInfo(Long shopId);

	
	/**
	 * 
	 * 分页查询提现信息
	 * com.jiabian.service.basic 
	 * 方法名：countAccountList
	 * 创建人：李文凯
	 * 时间：2017年2月24日-上午11:16:12 
	 * @param pagesModel
	 * @return Integer
	 * @exception 
	 * @since  1.0.0
	 */
	Integer countAccountList(PagesModel<MoneyWaterReq, MoneyWaterRes> pagesModel);
	List<MoneyWaterRes> selectAccountList(PagesModel<MoneyWaterReq, MoneyWaterRes> pagesModel);


	/**
	 * 
	 * 提现详情页面
	 * com.jiabian.service.basic 
	 * 方法名：selectApplyDetail
	 * 创建人：李文凯
	 * 时间：2017年2月27日-下午2:31:52 
	 * @param id
	 * @return MoneyWaterRes
	 * @exception 
	 * @since  1.0.0
	 */
	MoneyWaterRes selectApplyDetail(Long id);


	/**
	 * 
	 * 处理提现
	 * com.jiabian.service.basic 
	 * 方法名：updateApplyStatus
	 * 创建人：李文凯
	 * 时间：2017年2月27日-下午5:48:38 
	 * @param moneyWater
	 * @return Integer
	 * @exception 
	 * @since  1.0.0
	 */
	Integer updateApplyStatus(MoneyWater moneyWater);


	/**
	 * 
	 * 申请提现
	 * com.jiabian.service.basic 
	 * 方法名：businessApplyMoney
	 * 创建人：李文凯
	 * 时间：2017年2月28日-上午11:19:11 
	 * @param moneyWater
	 * @return Integer
	 * @exception 
	 * @since  1.0.0
	 */
	Integer businessApplyMoney(MoneyWater moneyWater);


	
	MoneyWaterRes selectNowSaleMoney(Long shopId);


	BigDecimal getTotalMoney(Long shopId,Integer type);


	void selectBillList(PagesModel<MoneyWaterReq, MoneyWaterRes> pagesModel);


	List<MoneyWaterHelperRes> getOrderPrice(Long shopId);


	Integer typingWaterMoney(MoneyWaterReq moneyWaterReq);

}
