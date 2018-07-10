package com.jiabian.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jiabian.util.SMSEnum;
import com.jiabian.util.SMSUtils;
/**
 * 发送手机验证码控制层
 * SMSController
 * 创建人:何雪平 
 * 时间：2016年11月7日-上午11:34:18 
 * @version 1.0.0
 *
 */
@CrossOrigin(origins = "*")
@Controller
@RequestMapping(value = "/sms")
public class SMSController {
	
	/**											
	 * 发送验证码
	 * com.jiabian.control 
	 * 方法名：sendMsg
	 * 创建人：何雪平 
	 * 时间：2016年11月7日-上午11:36:09 
	 * @param result
	 * @param userTel
	 * @return Object
	 * @exception 
	 * @since  1.0.0
	 */
	@RequestMapping(value = "/send", method = RequestMethod.POST)
	@ResponseBody
	public Object sendMsg(@RequestParam(value = "userTel") String userTel,SMSEnum smsEnum) {
		return SMSUtils.sendMsg(smsEnum, userTel);
	}

}
