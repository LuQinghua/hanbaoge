package com.jiabian.moneywater.response;

import java.math.BigDecimal;
import java.util.List;

import com.jiabian.base.BaseRes;
import com.jiabian.base.PagesModel;
import com.jiabian.base.io.request.IRequest;
import com.jiabian.moneywater.request.MoneyWaterReq;

public class MoneyWaterRecordRes extends BaseRes implements IRequest{
   
	private List<MoneyWaterRes> list;
	
	private Long recordNumber;
	
	/**
	 * 总收入金额
	 */
	private BigDecimal totalIncome;
	
	/**
	 * 总提现金额
	 */
	private BigDecimal totalWithdraw;
    
	/**
	 * 总余额
	 */
	private BigDecimal totalBalance;
	private PagesModel<MoneyWaterReq,MoneyWaterRes> pagesModel;
	
	public BigDecimal getTotalIncome() {
		return totalIncome;
	}

	public void setTotalIncome(BigDecimal totalIncome) {
		this.totalIncome = totalIncome;
	}

	public List<MoneyWaterRes> getList() {
		return list;
	}

	public void setList(List<MoneyWaterRes> list) {
		this.list = list;
	}

	public BigDecimal getTotalWithdraw() {
		return totalWithdraw;
	}

	public void setTotalWithdraw(BigDecimal totalWithdraw) {
		this.totalWithdraw = totalWithdraw;
	}

	public PagesModel<MoneyWaterReq,MoneyWaterRes> getPagesModel() {
		return pagesModel;
	}

	public void setPagesModel(PagesModel<MoneyWaterReq,MoneyWaterRes> pagesModel) {
		this.pagesModel = pagesModel;
	}

	public Long getRecordNumber() {
		return recordNumber;
	}

	public void setRecordNumber(Long recordNumber) {
		this.recordNumber = recordNumber;
	}

	public BigDecimal getTotalBalance() {
		return totalBalance;
	}

	public void setTotalBalance(BigDecimal totalBalance) {
		this.totalBalance = totalBalance;
	}



}
