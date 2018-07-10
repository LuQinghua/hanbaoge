package com.jiabian.aop;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.jiabian.base.io.request.IRequest;
import com.jiabian.base.io.request.ReqHttpHeaders;
import com.jiabian.exception.ParamValidateException;

/**
 * 用户请求授权认证
 * 
 * AuthInterceptor
 * 创建人:黄世平
 * 时间：2016年11月8日-上午9:42:04 
 * @version 1.0.0
 *
 */
@Aspect
@Component
public class AuthInterceptor extends BaseInterceptor {

	private static final Logger logger = LogManager
			.getLogger(AuthInterceptor.class.getName());

	@Pointcut(value = "execution(* com.jiabian.control.*.*(..))")
	public void select() {
	}

	@Before(" select() && args(req)")
	public void beforeSelect(IRequest req) {
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder
				.getRequestAttributes()).getRequest();
		ReqHttpHeaders head = new ReqHttpHeaders();
		head.setAwesome(request.getHeader("awesome"));
		head.setIss(request.getHeader("iss"));
		head.setCompany(request.getHeader("company"));
		head.setExp(request.getHeader("exp"));
		head.setSigning(request.getHeader("m-sign"));
		super.authenticateTimeStamp(head);
		super.authenticateAuthInfo(head);
		super.authenticateSign(req, head);
		logger.info("2签名验证开始。。。");
	}

	@Before(" select() && args(req,bindingResult)")
	public void beforeRequstV(IRequest req, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			throw new ParamValidateException(bindingResult.getFieldError()
					.getDefaultMessage());
		}
		// 签名验证
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder
				.getRequestAttributes()).getRequest();
		ReqHttpHeaders head = new ReqHttpHeaders();
		head.setAwesome(request.getHeader("awesome"));
		head.setIss(request.getHeader("iss"));
		head.setCompany(request.getHeader("company"));
		head.setExp(request.getHeader("exp"));
		head.setSigning(request.getHeader("m-sign"));
		super.authenticateTimeStamp(head);
		super.authenticateAuthInfo(head);
		// super.authenticateSign(req, head);
		logger.info("2签名验证开始。。。");
	}

	@Around("execution(* com.jiabian.control.*.*(..))")
	public Object employeeAroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {
		ModelMap model = null;
		try {
			Object object = proceedingJoinPoint.proceed();
			if (object instanceof ModelMap) {
				model = (ModelMap) object;
				model.addAttribute("version", "2.0");
				model.addAttribute("sign", "123456");
			} else {
				return object;
			}

		} catch (Throwable e) {
			e.printStackTrace();
		}
		return model;
	}

}