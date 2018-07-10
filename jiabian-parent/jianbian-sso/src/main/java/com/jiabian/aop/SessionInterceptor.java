package com.jiabian.aop;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;
import com.jiabian.cache.JedisUtil;
import com.jiabian.util.Result;
/**
 * 登录拦截器
 * SessionInterceptor
 * 创建人:何雪平 
 * 时间：2017年3月15日-下午2:32:51 
 * @version 1.0.0
 *
 */
public class SessionInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// 在Handler执行之前处理
		// 判断sid是否存在，用户是否登录
		Object sid = request.getHeader("sid");

		// 取不到用户信息
		if (null == sid) {
			@SuppressWarnings("null")
			String userInfo=JedisUtil.get(sid.toString());
			if (userInfo==null) {
				Result<JSONObject> result=new Result<>();
				result.setResult(500);
				result.setDesc("用户登录实现，请重新登录！");
				result.setStatus(false);
				return false;
			}
		}
		// 取到用户信息，放行
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// handler执行之后，返回ModelAndView之前

	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// 返回ModelAndView之后。
		// 响应用户之后。

	}

}
