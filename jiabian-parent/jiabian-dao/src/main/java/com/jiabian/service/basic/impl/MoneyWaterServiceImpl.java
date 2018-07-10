package com.jiabian.service.basic.impl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Service;

import com.jiabian.base.PagesModel;
import com.jiabian.beans.basic.MoneyWater;
import com.jiabian.dao.basic.MoneyWaterMapper;
import com.jiabian.moneywater.request.MoneyWaterReq;
import com.jiabian.moneywater.response.MoneyWaterHelperRes;
import com.jiabian.moneywater.response.MoneyWaterRes;
import com.jiabian.service.basic.IMoneyWaterService;
@Service
public class MoneyWaterServiceImpl implements IMoneyWaterService{

	@Resource
	private MoneyWaterMapper moneyWaterMapper;

	
	/**
	 * 
	 * 查询商家流水资金信息
	 * com.jiabian.service.basic.impl 
	 * 方法名：selectMoneyInfo
	 * 创建人：李文凯
	 * 时间：2017年2月23日-下午3:32:51 
	 * @param shopId
	 * @return
	 * @see com.jiabian.service.basic.IMoneyWaterService#selectMoneyInfo(java.lang.Long)
	 * @exception 
	 * @since  1.0.0
	 */
	@Override
	public MoneyWaterRes selectMoneyInfo(Long shopId) {
		
		return moneyWaterMapper.selectMoneyInfo(shopId);
	}


	
	/**
	 * 
	 * 分页查询提现信息
	 * com.jiabian.service.basic.impl 
	 * 方法名：countAccountList
	 * 创建人：李文凯
	 * 时间：2017年2月24日-上午11:16:48 
	 * @param pagesModel
	 * @return
	 * @see com.jiabian.service.basic.IMoneyWaterService#countAccountList(com.jiabian.base.PagesModel)
	 * @exception 
	 * @since  1.0.0
	 */
	@Override
	public Integer countAccountList(PagesModel<MoneyWaterReq, MoneyWaterRes> pagesModel) {
		
		return moneyWaterMapper.countAccountList(pagesModel);
	}


	@Override
	public List<MoneyWaterRes> selectAccountList(PagesModel<MoneyWaterReq, MoneyWaterRes> pagesModel) {
	
		return moneyWaterMapper.selectAccountList(pagesModel);
	}


	/**
	 * 
	 * 提现详情页面
	 * com.jiabian.service.basic.impl 
	 * 方法名：selectApplyDetail
	 * 创建人：李文凯
	 * 时间：2017年2月27日-下午2:32:15 
	 * @param id
	 * @return
	 * @see com.jiabian.service.basic.IMoneyWaterService#selectApplyDetail(java.lang.Long)
	 * @exception 
	 * @since  1.0.0
	 */
	@Override
	public MoneyWaterRes selectApplyDetail(Long id) {		
		return moneyWaterMapper.selectApplyDetail(id);
	}



	/**
	 * 
	 * 处理提现
	 * com.jiabian.service.basic.impl 
	 * 方法名：updateApplyStatus
	 * 创建人：李文凯
	 * 时间：2017年2月27日-下午5:49:00 
	 * @param moneyWater
	 * @return
	 * @see com.jiabian.service.basic.IMoneyWaterService#updateApplyStatus(com.jiabian.beans.basic.MoneyWater)
	 * @exception 
	 * @since  1.0.0
	 */
	@Override
	public Integer updateApplyStatus(MoneyWater moneyWater) {
		return moneyWaterMapper.updateByPrimaryKeySelective(moneyWater);
	}


	/**
	 * 
	 * 申请提现
	 * com.jiabian.service.basic.impl 
	 * 方法名：businessApplyMoney
	 * 创建人：李文凯
	 * 时间：2017年2月28日-上午11:19:42 
	 * @param moneyWater
	 * @return
	 * @see com.jiabian.service.basic.IMoneyWaterService#businessApplyMoney(com.jiabian.beans.basic.MoneyWater)
	 * @exception 
	 * @since  1.0.0
	 */
	@Override
	public Integer businessApplyMoney(MoneyWater moneyWater) {		
		return moneyWaterMapper.insertSelective(moneyWater);
	}



	/**
	 * 
	 * 实时查看销售额
	 * com.jiabian.service.basic.impl 
	 * 方法名：selectNowSaleMoney
	 * 创建人：李文凯
	 * 时间：2017年3月14日-上午11:21:07 
	 * @param shopId
	 * @return
	 * @see com.jiabian.service.basic.IMoneyWaterService#selectNowSaleMoney(java.lang.Long)
	 * @exception 
	 * @since  1.0.0
	 */
	@Override
	public MoneyWaterRes selectNowSaleMoney(Long shopId) {		
		return moneyWaterMapper.selectNowSaleMoney(shopId);
	}



	@Override
	public BigDecimal getTotalMoney(Long shopId,Integer type) {
		BigDecimal money;
		switch (type) {
		case 1:
			money = moneyWaterMapper.getTotalSaleMoney(shopId);
			break;
		case 2:
			money = moneyWaterMapper.getAvailableCashMoney(shopId);
			break;
		case 3:
			money = moneyWaterMapper.getAlreadyPresentMoney(shopId);
			break;
		case 4:
			money = moneyWaterMapper.getApplicationForWithdrawalMoney(shopId);
			break;
		default:
			money = new BigDecimal("0.00");
		}
		
		return money!=null?money:new BigDecimal("0.00");
	}



	@Override
	public void selectBillList(PagesModel<MoneyWaterReq, MoneyWaterRes> pagesModel) {
		pagesModel.setTotal(moneyWaterMapper.countBillList(pagesModel));
		pagesModel.setResults(moneyWaterMapper.selectBillList(pagesModel));
	}



	@Override
	public List<MoneyWaterHelperRes> getOrderPrice(Long shopId) {
		return moneyWaterMapper.getOrderPrice(shopId);
	}



	@Override
	public Integer typingWaterMoney(MoneyWaterReq moneyWaterReq) {
		Integer res = moneyWaterMapper.updateOrderRecord(moneyWaterReq.getShopId());
		if(res > 0){
			MoneyWater moneyWater = new MoneyWater();
			moneyWater.setShopId(moneyWaterReq.getShopId());
			moneyWater.setMoneyStatus(Byte.valueOf("1"));
			moneyWater.setWithdrawMoney(moneyWaterReq.getWithdrawMoney());
			moneyWater.setAuditTime(new Date());
			moneyWater.setMoneyWaterCode(RandomStringUtils.randomNumeric(19));
			moneyWaterMapper.insertSelective(moneyWater);
		}
		return res;
	}
	


}
