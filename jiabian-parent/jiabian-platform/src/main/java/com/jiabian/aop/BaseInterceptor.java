package com.jiabian.aop;

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.jiabian.base.io.request.IRequest;
import com.jiabian.base.io.request.ReqHttpHeaders;
import com.jiabian.exception.AuthException;
import com.jiabian.util.ConfigUtil;
import com.jiabian.util.Constants;
import com.jiabian.util.ResponseEnum;
import com.jiabian.util.SecurityUtils;

/**
 * 拦截器
 * 
 * BaseInterceptor
 * 创建人:黄世平
 * 时间：2016年11月8日-上午9:42:36 
 * @version 1.0.0
 *
 */
public class BaseInterceptor {
	private static final Logger logger = LogManager.getLogger(BaseInterceptor.class.getName());

	/**
	 * 验证授权用户/权限
	 */
	public void authenticateAuthInfo(ReqHttpHeaders head) {
		
		logger.debug("验证授权用户/权限 ....");
	}

	/**
	 * 验证签名
	 * 
	 * @param req
	 * @param head
	 */
	public void authenticateSign(IRequest req, ReqHttpHeaders head) {

		StringBuilder sb = new StringBuilder().append(head.getIss())
				.append("&").append(head.getCompany()).append(head.getExp())
				.append("&").append(head.getAwesome());
		logger.info("src  sign:{}", sb.toString());
		String sign = SecurityUtils.HmacSHA1Encrypt(sb.toString(), ConfigUtil.getConfig(Constants.API_SECRET));
		logger.info("sign:{}", sign);
		if (StringUtils.isEmpty(sign)) {
			throw new AuthException(ResponseEnum.FAIL_SYS_UNAUTHORIZED.desc());
		}
		if (!sign.equals(head.getSigning())) {
			logger.error("sign:{}", head.getSigning());
			throw new AuthException(ResponseEnum.FAIL_SYS_UNAUTHORIZED.desc());
		}
	}

	/**
	 * 验证url时间戳 10分钟有效 600秒
	 * 
	 * @param iCNNCTAuth
	 * @param cardNo
	 * @param sign
	 * @throws AuthException
	 */
	public void authenticateTimeStamp(ReqHttpHeaders head) {
		logger.info("验证url时间戳..");
		/*
		 * if (System.currentTimeMillis() - head.getStamp() > 60000000) { throw
		 * new AuthException(AuthException.ErrorMessageInfo.URL_OVERDUE); }
		 */
	}
}
