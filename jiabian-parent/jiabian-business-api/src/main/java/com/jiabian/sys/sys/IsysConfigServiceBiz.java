package com.jiabian.sys.sys;

import java.util.List;

import com.jiabian.base.PagesModel;
import com.jiabian.beans.basic.SysConfig;
import com.jiabian.sys.sysconfig.request.SysConfigReq;
import com.jiabian.sys.sysconfig.response.SysConfigResp;

public interface IsysConfigServiceBiz {
	/**
	 * 根据条件分页查询配置项
	 * @param pagesModel
	 */
	void selectByParm(PagesModel<SysConfigReq,SysConfigResp> pagesModel);
	
	int addSysConfig(SysConfig sysConfig);
	
	int updateSysConfig(SysConfig sysConfig);
	
	int deleteSysConfig(SysConfigReq sysConfigReq);
	
	int revertSysConfig(SysConfigReq sysConfigReq);
	
	SysConfig  selectSysConfigInfo(Long id);
	
	SysConfigReq selectConfigDetail(Long id);

	/**
	 * 获取所以配置文件
	 */
	List<SysConfig> getAllConfiguration();
}
