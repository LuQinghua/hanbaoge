package com.jiabian.util;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.velocity.VelocityContext;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

public class MyServletContextListener   implements ServletContextListener {
//	private static final Logger logger = Logger
//			.getLogger(MyServletContextListener.class);

	public void contextDestroyed(ServletContextEvent arg0) {

	}

	public void contextInitialized(ServletContextEvent arg0) {
		ServletContext servlet_context = arg0.getServletContext();
		String contextPath = servlet_context.getContextPath();
		System.out.println("系统初始化开始。。。");
		servlet_context.setAttribute("basePath",contextPath);
		System.out.println("basePath=========>>>"+contextPath);
		
		
//		String base = servlet_context.getContextPath();
//		servlet_context.setAttribute("base",base);
//		servlet_context.setAttribute("resouce_base","");
		//String buiPath=Config.getString("bui.path");
		//String staticServerUpload=Config.getString("resource.upload");
		//servlet_context.setAttribute("basePath",buiPath);
		//servlet_context.setAttribute("staticServerUpload",staticServerUpload);
	}
	
	
	public static ServletContext getServletContext(){

		 WebApplicationContext webApplicationContext = ContextLoader.getCurrentWebApplicationContext();    
		return webApplicationContext.getServletContext();
	}
}
