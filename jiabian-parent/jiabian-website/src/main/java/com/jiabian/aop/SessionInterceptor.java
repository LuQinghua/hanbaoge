package com.jiabian.aop;


import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.alibaba.fastjson.JSONObject;


/**
 * 用户登录拦截
 * 
 * SessionInterceptor
 * 创建人:黄世平
 * 时间：2016年11月9日-下午1:22:30 
 * @version 1.0.0
 *
 */
public class SessionInterceptor extends HandlerInterceptorAdapter {
	private static final Logger logger = LogManager.getLogger(SessionInterceptor.class);

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//		String loginname="";
//		Cookie[] cookies = request.getCookies();
//		for (Cookie cookie : cookies) {
//			if (cookie.getName().equals("sys_Current_User")) {
//				String userJsonStr = cookie.getValue();
//				JSONObject json=JSONObject.parseObject(userJsonStr);
//				loginname = (String) json.get("loginName");
//			}
//		}
//		
//		if (loginname!=null) {
			return true;
//		}else{
//			response.sendRedirect("sysUser_ToLogin");
//			return false;
//		}
		
	}

	private void printRequestInfo(HttpServletRequest request) {
		
	}
}
