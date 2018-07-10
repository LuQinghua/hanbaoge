package com.jiabian.control.sys;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jiabian.base.PagesModel;
import com.jiabian.base.control.BaseController;
import com.jiabian.sys.sys.IsysLogServiceBiz;
import com.jiabian.sys.syslog.request.SysLogReq;
import com.jiabian.sys.syslog.response.SysLogResp;

@Controller("logController")
@RequestMapping("sysLog")
public class LogController extends BaseController<SysLogReq, SysLogResp> {
	@Resource
	private IsysLogServiceBiz sysLogServiceBiz;
	/**
	 * 查询日志列表
	 * com.jiabian.control.sys 
	 * 方法名：logList
	 * 创建人：方玉明
	 * 时间：2017年1月10日-下午12:18:40 
	 * @param model
	 * @param request
	 * @param logReq
	 * @return String
	 * @exception 
	 * @since  1.0.0
	 */
	@RequestMapping("/logList")
	public String logList(ModelMap model,HttpServletRequest request,SysLogReq logReq){
		PagesModel<SysLogReq,SysLogResp> pagesModel = new PagesModel<>(logReq);
		pagesModel.setOrderBy("l.id desc ");
		this.setPagesToModel(pagesModel,logReq);
		sysLogServiceBiz.selectByParm(pagesModel);
		if (StringUtils.isNotBlank(logReq.getStartTime())) {
			model.put("startTime", logReq.getStartTime());
		}
		if (StringUtils.isNotBlank(logReq.getEndTime())) {
			model.put("endTime", logReq.getEndTime());
		}
		String msg = (String) request.getSession().getAttribute("msg");
		request.getSession().removeAttribute("msg");
		model.put("msg", msg);
		model.put("pagesModel", pagesModel);
		return "sys/sysLog/logList";
	}
}
