package com.jiabian.sys.sys;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jiabian.base.PagesModel;
import com.jiabian.beans.basic.SysLog;
import com.jiabian.dao.basic.SysLogMapper;
import com.jiabian.sys.syslog.request.SysLogReq;
import com.jiabian.sys.syslog.response.SysLogResp;
@Service("sysLogServiceBiz")
public class SysLogServiceBiz implements IsysLogServiceBiz {
	@Resource
	private SysLogMapper logMapper;
	@Override
	public void selectByParm(PagesModel<SysLogReq, SysLogResp> pagesModel) {
		// TODO Auto-generated method stub
			pagesModel.setResults(logMapper.selectforPageByParam(pagesModel));
			pagesModel.setTotal(logMapper.countforPageByParam(pagesModel));
	}
	@Override
	public int saveLog(SysLog sysLog) {
		// TODO Auto-generated method stub
		return logMapper.insert(sysLog);
	}

}
