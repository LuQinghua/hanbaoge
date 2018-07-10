package com.jiabian.exception;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.jiabian.util.ResponseEnum;
import com.jiabian.util.Result;

@ControllerAdvice
public class GlobalExceptionHandler {
	private static final Logger logger = LogManager.getLogger(GlobalExceptionHandler.class.getName());

	@ExceptionHandler(value = { Throwable.class })
	@ResponseBody
	public Result<Object> handleCommonException(Throwable e, HttpServletResponse response) {
		Result<Object> result = new Result<>();
		logger.error(e.getCause(), e);
		if (e.getMessage() != null && e.getMessage().contains("*.BusinessException")) {
			response.setStatus(HttpStatus.CONFLICT.value());
			result.setResult(ResponseEnum.FAIL_SERVER_ERROR, false);
			return result;
		}
		result.setResult(ResponseEnum.FAIL_SYS_ERROR, false);
		return result;
	}
	@ExceptionHandler(value = BusinessException.class)
	@ResponseStatus(value = HttpStatus.CONFLICT)
	@ResponseBody
	public Result<Object> handleBusinessException(HttpServletResponse response, BusinessException e)
			throws IOException {
		Result<Object> result = new Result<>();
		logger.error(e.getCause(), e);
		result.setResult(HttpStatus.CONFLICT.value());
		result.setStatus(false);
		result.setDesc(e.getMessage());
		return result;
	}
	@ExceptionHandler(value = ParamValidateException.class)
	@ResponseStatus(value = HttpStatus.CONFLICT)
	@ResponseBody
	public Result<Object> handleParamValidateException(HttpServletResponse response, ParamValidateException e)
			throws IOException {
		Result<Object> result = new Result<>();
		logger.error(e.getCause(), e);
		result.setResult(Integer.parseInt("1000"));
		result.setStatus(false);
		result.setDesc(e.getMessage());
		return result;
	}
	}
