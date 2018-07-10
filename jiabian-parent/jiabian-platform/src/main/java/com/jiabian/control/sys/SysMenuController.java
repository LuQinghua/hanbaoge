package com.jiabian.control.sys;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.jiabian.beans.basic.SysMenu;
import com.jiabian.sys.sys.IsysMenuServiceBiz;
import com.jiabian.sys.sysmenu.request.SysMenuReq;
import com.jiabian.util.SpringBeanUtils;

@Controller("sysMenuController")
@RequestMapping("/sysMenu")
public class SysMenuController {
	private static final Logger logger = LogManager.getLogger(LoginController.class.getName());
	@Resource
	private IsysMenuServiceBiz sysMenuServiceBiz;
	
	
	
	/**
	 * 展示菜单树
	 * @param request
	 * @return
	 */
	@RequestMapping("/sysMenuList")
	public String sysMenuList(ModelMap model,HttpServletRequest request){	
		List<SysMenu> sysMenuList = sysMenuServiceBiz.selectAllSysMenu();
		JSONObject menuTree = initMenuTree(sysMenuList); 
		model.put("menuTree", menuTree);
		String msg = (String) request.getSession().getAttribute("msg");
		request.getSession().removeAttribute("msg");
		model.put("msg", msg);
		return "sys/sysMenu/menuList";
	}
	
	
	/**
	 * 执行添加菜单操作
	 * @return
	 */
	@RequestMapping("/addSysMenu")
	@ResponseBody
	public int addSysMenu(HttpServletRequest request,SysMenuReq sysMenuReq){
		SysMenu sysMenu=new SysMenu();
		SpringBeanUtils.copyProperties(sysMenuReq, sysMenu);
		return sysMenuServiceBiz.addSysMenu(sysMenu);
	}
	
	
	/**
	 * 执行修改菜单操作
	 * @return
	 */
	@RequestMapping("/updateSysMenu")
	@ResponseBody
	public int updateSysMenu(HttpServletRequest request,SysMenuReq sysMenuReq){
		SysMenu sysMenu=new SysMenu();
		SpringBeanUtils.copyProperties(sysMenuReq, sysMenu);
		return sysMenuServiceBiz.updateSysMenu(sysMenu);
	}
	
	/**
	 * 执行删除菜单操作
	 * @param menuid
	 * @return
	 */
	@RequestMapping("/deleteSysMenu")
	@ResponseBody
	public int deleteSysMenu(HttpServletRequest request,SysMenuReq sysMenuReq){
		return sysMenuServiceBiz.deleteSysMenu(sysMenuReq.getMenuId());
	}
	
	
	/**
	 * 生成菜单树
	 * @param menuSet
	 * @return
	 */
	public  JSONObject initMenuTree(List<SysMenu> sysMenuList){
		HashMap<String,Boolean> stateMap= new HashMap<String,Boolean>();//节点状态
		HashMap<String,Object> rootMap=new HashMap<String,Object>();
		List<HashMap<String, Object>> listMap=new ArrayList<HashMap<String,Object>>();
		for (SysMenu sysMenu : sysMenuList) {
			HashMap<String, Object> map=null;
			if (sysMenu.getMenuParentId().toString().equals("0")) {
				//设置顶级菜单列表
				map=new HashMap<String,Object>();
				map.put("id", sysMenu.getMenuId().toString());
				map.put("text", sysMenu.getMenuName());
				map.put("icon", sysMenu.getMenuIcon()); 
//				stateMap.put("opened",true);
//				map.put("state", stateMap);
				HashMap<String,String> attrMap= new HashMap<String,String>();//额外属性
				attrMap.put("menuDesc",sysMenu.getMenuDesc());
				attrMap.put("menuState",sysMenu.getMenuState().toString());
				int childrenCount = sysMenuServiceBiz.selectChildrenCount(sysMenu.getMenuId()); //查询有无子节点
				if (childrenCount>0) {		//判断有无子节点
					attrMap.put("hasChildren","1");
					map.put("a_attr", attrMap);
					setChildrenMenuTree(sysMenuList,map,sysMenu.getMenuId().toString());  
				}else{
					attrMap.put("menuUrl",sysMenu.getMenuUrl());
					attrMap.put("hasChildren","0");
					map.put("a_attr", attrMap);
				}
				listMap.add(map);
			}
		}
		//添加树root根节点
		rootMap.put("id", "0");
		rootMap.put("text", "家边后台管理系统");
		rootMap.put("icon", "icon-screen-desktop");
		stateMap.put("opened",true);
		rootMap.put("state", stateMap);
		rootMap.put("children", listMap);
		HashMap<String,String> attrMap= new HashMap<String,String>();//额外属性
		attrMap.put("menuDesc","系统顶级菜单");
		attrMap.put("hasChildren","1");
		attrMap.put("menuState","0");
		rootMap.put("a_attr", attrMap);
		JSONObject json=(JSONObject) JSONObject.toJSON(rootMap);
		return json;
	}
	
	/**
	 * 递归获取所有子节点
	 * @param menuSet 传入所有菜单集合
	 * @param map 传入父节点对象
	 * @param pid 传入的父id
	 * @return
	 */
	public  HashMap<String,Object> setChildrenMenuTree(List<SysMenu> sysMenuList,HashMap<String,Object> map,String pid){
		HashMap<String,Boolean> stateMap= new HashMap<String,Boolean>();//节点状态
		List<HashMap<String, Object>> listMap2=new ArrayList<HashMap<String,Object>>();
		HashMap<String, Object> map2=null;
		for (SysMenu sysMenu : sysMenuList) {
			if (sysMenu.getMenuParentId().toString().equals(pid)) {
				map2=new HashMap<String, Object>();
				map2.put("id", sysMenu.getMenuId().toString());
				map2.put("text", sysMenu.getMenuName());
				map2.put("icon", sysMenu.getMenuIcon()); 
//				stateMap.put("opened",true);
				map2.put("state", stateMap);
				HashMap<String,String> attrMap= new HashMap<String,String>();//额外属性
				attrMap.put("menuDesc",sysMenu.getMenuDesc());
				attrMap.put("menuState",sysMenu.getMenuState().toString());
				int childrenCount = sysMenuServiceBiz.selectChildrenCount(sysMenu.getMenuId()); //查询有无子节点
				if (childrenCount>0) {	//判断有无子节点
					attrMap.put("hasChildren","1");
					map2.put("a_attr", attrMap);
					listMap2.add(map2);
					//继续添加子节点
					setChildrenMenuTree(sysMenuList,map2,sysMenu.getMenuId().toString());  
				}else{
					attrMap.put("hasChildren","0");
					attrMap.put("menuUrl",sysMenu.getMenuUrl());
					map2.put("a_attr", attrMap);
					listMap2.add(map2);
				}
			}
		}
		map.put("children", listMap2);	
		return map;
	}
	
}
