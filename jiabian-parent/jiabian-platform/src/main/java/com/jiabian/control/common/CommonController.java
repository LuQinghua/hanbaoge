package com.jiabian.control.common;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jiabian.qiniu.Manager;
import com.jiabian.rongyun.rongyun.io.rong.RongYunTokenUtil;
import com.jiabian.user.request.UsersReq;
import com.jiabian.util.Result;

@Controller
@RequestMapping(value = "/common")
public class CommonController {

	/**
	 * 获取验证码
	 * 
	 * @param req
	 * @param resp
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/getVcode.do")
	public String getVcode(HttpServletRequest req, HttpServletResponse resp) {
		return req.getSession().getAttribute("validateCode").toString();
	}

	
	@RequestMapping(value = "/getQNToken",method = RequestMethod.GET)
	@ResponseBody
	public Object getUpToken() {
		Map<String, String> token=new HashMap<>();
		token.put("uptoken", Manager.getUpToken());
		return token;
	};
	
	@RequestMapping(value = "/getIMToken",method = RequestMethod.GET)
	@ResponseBody
	public Object getMessageToken(UsersReq usersReq) {
		return new Result(RongYunTokenUtil.getToken(usersReq.getUserId().toString()));
	};
	
}
