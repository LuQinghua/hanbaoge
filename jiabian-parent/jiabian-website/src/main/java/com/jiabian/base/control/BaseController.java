package com.jiabian.base.control;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.jiabian.base.BaseReq;
import com.jiabian.base.PagesModel;

/**
 * 
 * @author admin
 * 
 */
public class BaseController<R,Q> {
	private static final Logger logger = LogManager.getLogger(BaseController.class.getName());

	@Resource
	protected HttpServletRequest request;

	protected static final String USER_SESSION_KEY = "user_session_key";

	protected String getRemoteIP() {
		String ip = request.getHeader("x-forwarded-for");
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("WL-Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getRemoteAddr();
		}
		if (ip != null && ip.length() > 0) {
			String[] ipArray = ip.split(",");
			if (ipArray != null && ipArray.length > 1) {
				return ipArray[0];
			}
			return ip;
		}

		return "未知IP";
	}
	
	public void setPagesToModel(PagesModel<R,Q> pagesModel,BaseReq baseReq){
		Integer length = baseReq.getSize();
		Integer offset = baseReq.getOffset();
		if (offset<1) {
			offset=1;
		}
		if(length == null || length == 0){
			pagesModel.setLimitNum(10);
		}else{
			pagesModel.setLimitNum(length);
		}
		pagesModel.setCurrentPage(offset);
		
	}
}