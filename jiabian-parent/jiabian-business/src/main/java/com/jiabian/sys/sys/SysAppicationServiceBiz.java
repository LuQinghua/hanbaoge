package com.jiabian.sys.sys;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jiabian.appication.request.SysApplicationReq;
import com.jiabian.appication.response.SysApplicationRes;
import com.jiabian.base.PagesModel;
import com.jiabian.beans.basic.SysApplication;
import com.jiabian.service.basic.IsysAppicationService;
import com.jiabian.sys.sysuser.response.SysUserResp;
@Service
public class SysAppicationServiceBiz implements IsysAppicationServiceBiz {
	@Resource
	private IsysAppicationService sysAppicationService;

	@Override
	public int countAppication4CarId(String cardNo) {
		// TODO Auto-generated method stub
		return sysAppicationService.countAppication4CarId(cardNo);
	}

	@Override
	public Integer saveAppication(SysApplication sysApplication) {
		// TODO Auto-generated method stub
		return sysAppicationService.saveAppication(sysApplication);
	}

	@Override
	public void selectSysApplicationPage(PagesModel<SysApplicationReq, SysApplicationRes> pagesModel) {
		pagesModel.setTotal(sysAppicationService.countSysApplication4PagesModel(pagesModel));
		pagesModel.setResults(sysAppicationService.selectSysApplication4PagesModel(pagesModel));
	}

	@Override
	public SysApplicationRes getSysApplication4Id(Long id) {
		return sysAppicationService.getSysApplication4Id(id);
	}

	@Override
	public Integer updateApplictionStatus(Long id,Long reviewer, Byte status,Byte type) {
		// TODO Auto-generated method stub
		return sysAppicationService.updateApplictionStatus(id,reviewer,status,type);
	}

	@Override
	public SysUserResp selectApplicationSysUserInfo(Long id) {
		// TODO Auto-generated method stub
		return sysAppicationService.selectApplicationSysUserInfo(id);
	}
	
	
	
}
