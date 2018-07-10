package com.jiabian.control.sys;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.jiabian.beans.basic.SysLog;
import com.jiabian.beans.basic.SysMenu;
import com.jiabian.beans.basic.SysUser;
import com.jiabian.rongyun.rongyun.io.rong.RongYunTokenUtil;
import com.jiabian.sys.sys.IsysLogServiceBiz;
import com.jiabian.sys.sys.IsysMenuServiceBiz;
import com.jiabian.sys.sys.IsysUserServiceBiz;
import com.jiabian.sys.sysuser.request.SysUserReq;
import com.jiabian.util.CookieUtil;
import com.jiabian.util.MD5;
import com.jiabian.util.PathUtils;

@Controller
public class LoginController {

	private static final Logger logger = LogManager.getLogger(LoginController.class.getName());
	static String targetTypeDefault = "iframe-tab";// 默认页面打开方式
	@Resource
	private IsysLogServiceBiz sysLogServiceBiz;
	@Resource
	private IsysUserServiceBiz sysUserServiceBiz;
	@Resource
	private IsysMenuServiceBiz sysMenuServiceBiz;
	
	@RequestMapping("/welcomePage")
	public String welcomePage(){
		return "admin/welcome";
	}
	
	/**
	 * 跳转后台用户登录页面
	 * 
	 * @return
	 */
	@RequestMapping("/sysUser_ToLogin")
	public String toLogin(ModelMap model,HttpServletRequest request) {
		SysUser user = CookieUtil.getCookieObj(request, "jiabian_sysUser", SysUser.class);
		if (user==null) {
			return "login";
		}
		JSONArray systemMenu = initSysMenu(Long.valueOf(user.getRoleId()));
		model.put("systemMenu", systemMenu);
		return "admin/index_iframe";
	}

	/**
	 * 跳转后台用户登录页面
	 * 
	 * @return
	 */
	@RequestMapping("/sysUser_loginOut")
	public String outSys(HttpServletRequest request,HttpServletResponse response) {
		CookieUtil.clear(request, response);
		return "login";
	}

	/**
	 * 执行系统用户登录操作
	 * 
	 * @param loginname
	 *            登录名称
	 * @param loginpwd
	 *            登录密码
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/sysUserLogin")
	public String login(ModelMap model, SysUserReq sysUserReq,
			HttpServletRequest request, HttpServletResponse response) {
		String loginName = sysUserReq.getLoginName();
		String loginPwd ="";
		if (sysUserReq.getLoginPwd()!=null) {
			loginPwd = MD5.encryptionStr(sysUserReq.getLoginPwd());
		}
		SysUser user = CookieUtil.getCookieObj(request, "jiabian_sysUser", SysUser.class);
		if (user!=null) {
			JSONArray systemMenu = initSysMenu(Long.valueOf(user.getRoleId()));
			model.put("systemMenu", systemMenu);
			return "admin/index_iframe";
			
		}
		
		if (StringUtils.isBlank(loginName) || StringUtils.isBlank(loginPwd)) {
			return "login";
		}

		SysUser currentUser = sysUserServiceBiz.sysUserLogin(
				loginName, loginPwd);
		if (currentUser != null) {
			logger.info("后台用户【" + currentUser.getRealName() + "】登录系统!");
			// 将用户信息存入cookies
			String token=RongYunTokenUtil.getToken("sys"+currentUser.getSuserId().toString());
			currentUser.setToken(token);
			CookieUtil.saveCookieObj(response, "jiabian_sysUser", JSONObject.toJSONString(currentUser));
			
			// 初始化系统菜单
			JSONArray systemMenu = initSysMenu(currentUser.getRoleId());
			model.put("systemMenu", systemMenu);

			SysLog sysLog = new SysLog();
			sysLog.setUserId(Long.valueOf(currentUser.getSuserId()));
			sysLog.setCreateTime(new Date());
			sysLog.setUserIP(request.getRemoteAddr());
			sysLog.setLogModule("操作接口【sysUserLogin】");
			sysLog.setLogContext("登录了系统");
			
			sysLogServiceBiz.saveLog(sysLog);
		} else {
			model.put("msg", "账号密码有误!");
			return "login";
		}
		return "admin/index_iframe";
	}
	
	public Set<SysMenu> addParentMenu(SysMenu sysMenu,Set<SysMenu> set){
		SysMenu parentMenu=sysMenuServiceBiz.selectMenuParentMenu(sysMenu.getMenuParentId());
		set.add(parentMenu);
		if (!parentMenu.getMenuParentId().toString().equals("0")) {
			addParentMenu(parentMenu,set);
		}
		return set;
	}
	
	/**
	 * 初始化菜单
	 * 
	 * @param roleId
	 * @return
	 */
	public JSONArray initSysMenu(Long roleId) {
		List<SysMenu> sysMenuList = sysMenuServiceBiz.selectSysMenu(roleId);
		Set<SysMenu> set=new LinkedHashSet<>();
		
		for (SysMenu sysMenu : sysMenuList) {
			if (!sysMenu.getMenuParentId().toString().equals("0")) {
				addParentMenu(sysMenu,set);
			}
		}
		
		sysMenuList.addAll(set);
		sysMenuList=new ArrayList<>(new LinkedHashSet<>(sysMenuList));
		
		List<HashMap<String, Object>> listMap = new ArrayList<HashMap<String, Object>>();
		for (SysMenu sysMenu : sysMenuList) {
			HashMap<String, Object> map = null;
			if (sysMenu.getMenuParentId().toString().equals("0")) {
				// 设置顶级菜单列表
				map = new HashMap<String, Object>();
				map.put("id", sysMenu.getMenuId().toString());
				map.put("text", sysMenu.getMenuName());
				map.put("icon", sysMenu.getMenuIcon());
				map.put("url",PathUtils.getBasePath() + "/"+ sysMenu.getMenuUrl());
				map.put("targetType", targetTypeDefault);
				int childrenCount = sysMenuServiceBiz.selectChildrenCount(sysMenu.getMenuId()); // 查询有无子节点
				if (childrenCount > 0) {
					setChildrenSysMenu(sysMenuList, map, sysMenu.getMenuId().toString());
				}
				listMap.add(map);
			}
		}
		JSONArray json = (JSONArray) JSONArray.toJSON(listMap);
		return json;
	}

	/**
	 * 递归获取所有子节点
	 * 
	 * @param menuSet
	 *            传入所有菜单集合
	 * @param map
	 *            传入父节点对象
	 * @param pid
	 *            传入的父id
	 * @return
	 */
	public HashMap<String, Object> setChildrenSysMenu(
			List<SysMenu> sysMenuList, HashMap<String, Object> map, String pid) {
		List<HashMap<String, Object>> listMap2 = new ArrayList<HashMap<String, Object>>();
		HashMap<String, Object> map2 = null;
		for (SysMenu sysMenu : sysMenuList) {
			if (sysMenu.getMenuParentId().toString().equals(pid)) {
				map2 = new HashMap<String, Object>();
				map2.put("id", sysMenu.getMenuId().toString());
				map2.put("text", sysMenu.getMenuName());
				map2.put("icon", sysMenu.getMenuIcon());
				map2.put("url",PathUtils.getBasePath() + "/"+ sysMenu.getMenuUrl());
				map2.put("targetType", targetTypeDefault);
				listMap2.add(map2);
				int childrenCount = sysMenuServiceBiz.selectChildrenCount(sysMenu.getMenuId()); // 查询有无子节点
				if (childrenCount > 0) {
					setChildrenSysMenu(sysMenuList, map2, sysMenu.getMenuId().toString());
				} 
			}
		}
		map.put("children", listMap2);
		return map;
	}
	
	
	
	
	
	
	
}
