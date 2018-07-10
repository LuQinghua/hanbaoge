package com.jiabian.util;

import java.net.URLDecoder;
import java.net.URLEncoder;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;


public class CookieUtil {
	static String cookiePath="/";
	static Integer maxAge=60*60*48;

	/**
	 * 往cookie存入一个对象
	 * @param response
	 * @param cookieName cookie 键
	 * @param objStr cookie对象字符串
	 * @param maxAge cookie失效时间
	 */
	public static  void saveCookieObj(HttpServletResponse response,String cookieName,String objStr){
		Cookie cookie = null;
		try {
			cookie = new Cookie(cookieName,URLEncoder.encode(objStr,"utf-8"));
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cookie.setMaxAge(maxAge);
		cookie.setPath(cookiePath);
		response.addCookie(cookie);
	}
	
	
	/**
	 * 获取cookie中的对象
	 * @param <T>
	 * @param request 
	 * @param cookieName cookie键名
	 * @return cookieValue
	 */
	public static <T extends Object> T getCookieObj(HttpServletRequest request,String cookieName,Class<T> bean){
		T t=null;
		Cookie[] cookies = request.getCookies();
		String cookieValue=null;
		if (cookies!=null) {
			for (Cookie cookie : cookies) {
				try {
					if (cookie.getName().equals(cookieName)) {
						cookieValue =URLDecoder.decode(cookie.getValue(), "utf-8");
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} 
		}
		try {
			t=JSON.parseObject(cookieValue, bean);
		} catch (Exception e) {
			// TODO: handle exception
			t=null;
		}
		return t;
	}
	
	
	/**
	 * 往cookie存入一个字符串
	 * @param response
	 * @param cookieName cookie 键
	 * @param cookieValue cookie 值
	 * @param maxAge cookie失效时间
	 */
	public static void saveCookieStr(HttpServletResponse response,String cookieName,String cookieValue){
		Cookie cookie = null;
		try {
			cookie = new Cookie(cookieName,URLEncoder.encode(cookieValue, "utf-8"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cookie.setMaxAge(maxAge);
		cookie.setPath(cookiePath);
		response.addCookie(cookie);
	}
	
	
	/**
	 * 获取cookie中的字符串
	 * @param request 
	 * @param cookieName cookie键名
	 * @return cookieValue
	 */
	public static String getCookieStr(HttpServletRequest request,String cookieName){
		Cookie[] cookies = request.getCookies();
		String cookieValue=null;
		if (cookies!=null) {
			for (Cookie cookie : cookies) {
				try {
					if (cookie.getName().equals(cookieName)) {
						cookieValue =URLDecoder.decode(cookie.getValue(),"utf-8");
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} 
		}
		return cookieValue;
	}
	
	/**
	 * 清除所有的Cookie
	 * @param req
	 * @param res
	 */
	public static void clear(HttpServletRequest req,HttpServletResponse res) {
        Cookie[] cookies = req.getCookies();
        if (cookies!=null) {
        	for(int i = 0,len = cookies.length; i < len; i++) {
                Cookie cookie = new Cookie(cookies[i].getName(),null);
                cookie.setMaxAge(0);
                cookie.setPath("/");
                res.addCookie(cookie);
            }
		}
    }
}
