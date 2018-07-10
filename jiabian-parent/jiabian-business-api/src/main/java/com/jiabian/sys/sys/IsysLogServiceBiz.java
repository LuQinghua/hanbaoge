package com.jiabian.sys.sys;

import com.jiabian.base.PagesModel;
import com.jiabian.beans.basic.SysLog;
import com.jiabian.sys.syslog.request.SysLogReq;
import com.jiabian.sys.syslog.response.SysLogResp;

public interface IsysLogServiceBiz {
	/**
	 * 根据条件分页查询配置项
	 * @param pagesModel
	 */
	void selectByParm(PagesModel<SysLogReq,SysLogResp> pagesModel);
	
	int saveLog(SysLog sysLog);
	
}
