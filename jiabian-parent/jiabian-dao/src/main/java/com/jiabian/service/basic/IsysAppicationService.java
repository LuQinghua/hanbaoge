package com.jiabian.service.basic;

import java.util.List;

import com.jiabian.appication.request.SysApplicationReq;
import com.jiabian.appication.response.SysApplicationRes;
import com.jiabian.base.PagesModel;
import com.jiabian.beans.basic.SysApplication;
import com.jiabian.sys.sysuser.response.SysUserResp;

public interface IsysAppicationService {

	int countAppication4CarId(String cardNo);

	Integer saveAppication(SysApplication sysApplication);

	Integer countSysApplication4PagesModel(PagesModel<SysApplicationReq, SysApplicationRes> pagesModel);

	List<SysApplicationRes> selectSysApplication4PagesModel(PagesModel<SysApplicationReq, SysApplicationRes> pagesModel);

	SysApplicationRes getSysApplication4Id(Long id);

	Integer updateApplictionStatus(Long id,Long reviewer, Byte status,Byte type);

	/**
	 * 根据Id查询系统用户信息
	 * com.jiabian.service.basic 
	 * 方法名：selectApplicationSysUserInfo
	 * 创建人：方玉明
	 * 时间：2016年12月21日-下午3:55:19 
	 * @param id
	 * @return SysUserResp
	 * @exception 
	 * @since  1.0.0
	*/
	SysUserResp selectApplicationSysUserInfo(Long id);



}
