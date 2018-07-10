package com.jiabian.sys.sys;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jiabian.base.PagesModel;
import com.jiabian.beans.basic.SysConfig;
import com.jiabian.dao.basic.SysConfigMapper;
import com.jiabian.sys.sysconfig.request.SysConfigReq;
import com.jiabian.sys.sysconfig.response.SysConfigResp;
@Service
public class SysConfigServiceBiz implements IsysConfigServiceBiz {
	@Resource
	private SysConfigMapper configMapper;
	@Override
	public void selectByParm(PagesModel<SysConfigReq, SysConfigResp> pagesModel) {
		// TODO Auto-generated method stub
		pagesModel.setResults(configMapper.selectforPageByParam(pagesModel));
		pagesModel.setTotal(configMapper.countforPageByParam(pagesModel));
	}
	@Override
	public int addSysConfig(SysConfig sysConfig) {
		return configMapper.insert(sysConfig);
	}
	@Override
	public int updateSysConfig(SysConfig sysConfig) {
		// TODO Auto-generated method stub
		return configMapper.updateByPrimaryKeySelective(sysConfig);
	}
	@Override
	public SysConfig selectSysConfigInfo(Long id) {
		// TODO Auto-generated method stub
		return configMapper.selectByPrimaryKey(id);
	}
	@Override
	public SysConfigReq selectConfigDetail(Long id) {
		// TODO Auto-generated method stub
		return configMapper.selectConfigDetail(id);
	}
	@Override
	public int deleteSysConfig(SysConfigReq sysConfigReq) {
		// TODO Auto-generated method stub
		String[] ids = sysConfigReq.getCheckIds().split(",");
		return configMapper.updateIsDelForeach(2,ids,sysConfigReq);
	}
	@Override
	public int revertSysConfig(SysConfigReq sysConfigReq) {
		// TODO Auto-generated method stub
		String[] ids = sysConfigReq.getCheckIds().split(",");
		return configMapper.updateIsDelForeach(1,ids,sysConfigReq);
	}
	@Override
	public List<SysConfig> getAllConfiguration() {
		return configMapper.getAllConfiguration();
	}
	
}
