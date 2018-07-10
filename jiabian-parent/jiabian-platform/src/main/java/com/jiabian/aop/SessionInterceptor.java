package com.jiabian.aop;

import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.jiabian.beans.basic.SysLog;
import com.jiabian.beans.basic.SysUser;
import com.jiabian.sys.sys.IsysLogServiceBiz;
import com.jiabian.util.CookieUtil;
import com.jiabian.util.PathUtils;
import com.jiabian.util.StrTools;

/**
 * 登录验证
 * 
 * SessionInterceptor 创建人:黄世平 时间：2016年11月8日-上午9:43:03
 * 
 * @version 1.0.0
 * 
 */
public class SessionInterceptor extends HandlerInterceptorAdapter {
	private static final Logger logger = LogManager
			.getLogger(SessionInterceptor.class);
	@Resource
	private IsysLogServiceBiz logService;
	private static final String[] arr = { "sysUser_ToLogin", "sysUserLogin" };

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		SysUser user = CookieUtil.getCookieObj(request, "jiabian_sysUser",
				SysUser.class);
		
		if(user == null){
			if(!checkedApi(request)){
				response.getWriter().write(StrTools.appendString("<script>top.location='", PathUtils.getBasePath(),"/sysUser_ToLogin';</script>"));
			}
			return true;
		}
		addSysLog(request, user);
		return true;
	}

	private void addSysLog(HttpServletRequest request, SysUser user) {

		Enumeration<String> names = request.getParameterNames();
		StringBuilder sb = new StringBuilder("请求参数为{");
		while (names.hasMoreElements()) {
			String name = (String) names.nextElement();
			String values = request.getParameter(name);
			sb.append(name + ":" + values + ", ");
		}
		sb.append("}");
		logger.info("请求地址Start: " + request.getRequestURI() + ", "
				+ sb.toString());
		SysLog sysLog = new SysLog();
		sysLog.setUserId(Long.valueOf(user.getSuserId()));
		sysLog.setCreateTime(new Date());
		sysLog.setUserIP(request.getRemoteAddr());
		sysLog.setLogModule("操作接口【" + request.getRequestURI() + "】");
		sysLog.setLogContext(sb.toString());
		logService.saveLog(sysLog);

	}

	private boolean checkedApi(HttpServletRequest request) {
		for (String str : arr) {
			if (request.getRequestURI().indexOf(str) != -1) {
				return true;
			}
		}
		return false;
	}
}
