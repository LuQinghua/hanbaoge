package com.jiabian.servlet;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.jiabian.beans.basic.SysConfig;
import com.jiabian.sys.sys.SysConfigServiceBiz;
import com.jiabian.util.ConfigUtil;


/**
 *author huangshiping
 
 *@date:Aug 29, 201510:57:30 AM
 *@version:1.0
 *动态加载配置项
 */
public class InitServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public InitServlet() {
		super();
	}

	public void destroy() {
		super.destroy(); 
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	public void init() throws ServletException {
		WebApplicationContext wac = WebApplicationContextUtils  
                .getWebApplicationContext(this.getServletContext());  
		SysConfigServiceBiz sysConfigService = wac.getBean(SysConfigServiceBiz.class);
		List<SysConfig> conList = sysConfigService.getAllConfiguration();
		initMap(conList, ConfigUtil.map);
	}
	
	private  void initMap(List<SysConfig> list,Map<String,String> map) {
		if (list.isEmpty()) {
			return ;
		}
		for (SysConfig config : list) {
			map.put(config.getConKey(), config.getConValue());
		}
	}
}
