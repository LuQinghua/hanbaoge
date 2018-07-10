package com.jiabian.control.common;


import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.alibaba.fastjson.JSONObject;
import com.jiabian.control.sys.LoginController;
import com.jiabian.qiniu.Manager;
import com.jiabian.util.Constants;
import com.jiabian.util.DateUtil;
import com.qiniu.http.Response;

@Controller
@RequestMapping("/qiNiuYun")
public class QiNiuYunUtil {
	
	private static final Logger logger = LogManager.getLogger(LoginController.class.getName());
	
	
	
	@RequestMapping(value = "/uploadImg", method = RequestMethod.POST)  
	@ResponseBody  
	public JSONObject uploadImg(HttpServletRequest request,HttpServletResponse response) throws IOException {
		MultipartHttpServletRequest re = (MultipartHttpServletRequest) request;
	    MultipartFile fileM = re.getFile("myfile");
	    CommonsMultipartFile cf = (CommonsMultipartFile) fileM;
	    InputStream in = cf.getInputStream();
	    String fileName=fileM.getOriginalFilename();
	    byte[] data=new byte[in.available()];
	    in.read(data);
	    String key= DateUtil.getLongCurrTimes()+"/"+fileName;
	    String token = Manager.getUpToken();
	    Response responseBody = Manager.getManager().put(data, key, token);
	    String msg=responseBody.bodyString();
	    JSONObject responseJson=(JSONObject) JSONObject.parse(msg);
	    String picPath= new StringBuilder().append(Constants.OUT_SIDE_NAME).append(responseJson.getString("key")).toString();
	    logger.info("picPath"+picPath);
	    Map<String,String> map=new HashMap<>();
	    map.put("picPath", picPath);
	    JSONObject json=(JSONObject) JSONObject.toJSON(map);
	    return json;
	}  
	    
}
