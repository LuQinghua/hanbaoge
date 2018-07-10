package com.jiabian.control.sys;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.jiabian.base.PagesModel;
import com.jiabian.base.control.BaseController;
import com.jiabian.beans.basic.SysMenu;
import com.jiabian.beans.basic.SysRole;
import com.jiabian.beans.basic.SysRoleMenu;
import com.jiabian.sys.sys.IsysMenuServiceBiz;
import com.jiabian.sys.sys.IsysRoleServiceBiz;
import com.jiabian.sys.sysrole.request.SysRoleReq;
import com.jiabian.sys.sysrole.response.SysRoleResp;
import com.jiabian.util.SpringBeanUtils;

@Controller("sysRoleController")
@RequestMapping("/sysRole")
public class SysRoleController extends BaseController<SysRoleReq, SysRoleResp> {
	private static final Logger logger = LogManager.getLogger(SysRoleController.class.getName());	
	
	@Resource
	private IsysRoleServiceBiz sysRoleServiceBiz;
	@Resource
	private IsysMenuServiceBiz sysMenuServiceBiz;
	
	/**
	 * 查询所有角色
	 * @return
	 */					
	
	@RequestMapping("/sysRoleList")
	public String roleList(ModelMap model,HttpServletRequest request,SysRoleReq sysRoleReq){
		
		PagesModel<SysRoleReq,SysRoleResp> pagesModel = new PagesModel<>(sysRoleReq);
		pagesModel.setOrderBy("roleId desc ");
		this.setPagesToModel(pagesModel,sysRoleReq);
		sysRoleServiceBiz.selectByParm(pagesModel);
		if (!StringUtils.isBlank(sysRoleReq.getRoleName())) {
			model.put("roleName", sysRoleReq.getRoleName());
		}
		String msg = (String) request.getSession().getAttribute("msg");
		request.getSession().removeAttribute("msg");
		model.put("msg", msg);
		model.put("pagesModel", pagesModel);
		return  "sys/sysRole/roleList";
	}
	
	@RequestMapping("/toAddSysRole")
	public String toAddSysRole(){
		return "sys/sysRole/addSysRole";
	}
	/**
	 * 执行添加角色操作
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/addSysRole")
	public int addSysRole(HttpServletRequest request,SysRoleReq sysRoleReq){
		SysRole sysRole=new SysRole();
		SpringBeanUtils.copyProperties(sysRoleReq, sysRole);
		return sysRoleServiceBiz.addSysRole(sysRole);
	}
	
	/**
	 * 获取角色信息
	 * @return
	 */
	@RequestMapping("/toUpdateSysRole")
	public String getRoleInfo(ModelMap model,SysRoleReq sysRoleReq){
		SysRole sysRole = sysRoleServiceBiz.selectSysRoleInfo(sysRoleReq.getRoleId());
		model.put("obj",sysRole);
		return "sys/sysRole/updateSysRole";
	}
	
	/**
	 * 执行修改角色操作
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/updateSysRole")
	public int updateSysRole(HttpServletRequest request,SysRoleReq sysRoleReq){
		SysRole sysRole=new SysRole();
		SpringBeanUtils.copyProperties(sysRoleReq, sysRole);
		return sysRoleServiceBiz.updateSysRole(sysRole);
	}
	
	/**
	 * 执行删除角色操作
	 * @param roleid
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/deleteSysRole")
	public int deleteSysRole(HttpServletRequest request,SysRoleReq sysRoleReq){
		return sysRoleServiceBiz.deleteSysRole(sysRoleReq.getRoleId());
	}
	
	
	/**
	 * 为角色分配权限
	 * @return
	 */
	@RequestMapping("/getPermission")
	@ResponseBody
	public Map getPermission(HttpServletRequest request,SysRoleReq sysRoleReq){
		//获取该角色所拥有的菜单
		Long roleId = sysRoleReq.getRoleId();
		List<SysMenu> checkedMenuList = sysRoleServiceBiz.selectSysMenus(roleId);
		//获取所有菜单树
		List<SysMenu> allMenuList = sysMenuServiceBiz.selectAllSysMenu();
		JSONObject permissionTree = initMenuTree(allMenuList,checkedMenuList); 
		Map map=new HashMap<>();
		map.put("data", permissionTree);
		map.put("roleId", roleId);
		return map;
	}
	
	@RequestMapping("/setSysMenu")
	public String setMenu(HttpServletRequest request,@RequestParam Long roleId,@RequestParam String[] nodes){
		String msg="";
		List<SysRoleMenu> roleMenuList=new ArrayList<SysRoleMenu>();
		for(int i=0;i<nodes.length;i++){
			 SysRoleMenu roleMenu=new SysRoleMenu();
			 if (nodes[i].toString()!="#") {
				 roleMenu.setMenuId(Long.valueOf(nodes[i]));
				 roleMenu.setRoleId(roleId);
				 roleMenuList.add(roleMenu);
			 }
		}
		int result = sysRoleServiceBiz.setSysMenuS(roleId, roleMenuList);
		if (result>0) {
			msg="授权成功!";
		}else{
			msg="授权失败啦!";
		}
		request.getSession().setAttribute("msg", msg);
		return "redirect:sysRoleList";
	}
	
	/**
	 * 生成菜单树
	 * @param menuSet
	 * @return
	 */
	public  JSONObject initMenuTree(List<SysMenu> allMenuList,List<SysMenu> checkedMenuList){
		HashMap<String,Object> rootMap=new HashMap<String,Object>();
		List<HashMap<String, Object>> listMap=new ArrayList<HashMap<String,Object>>();
		for (SysMenu sysMenu : allMenuList) {
			HashMap<String,Boolean> stateMap= new HashMap<String,Boolean>();//节点状态
			HashMap<String, Object> map=null;
			if (sysMenu.getMenuParentId().toString().equals("0")) {
				//设置顶级菜单列表
				map=new HashMap<String,Object>();
				map.put("id", sysMenu.getMenuId().toString());
				map.put("text", sysMenu.getMenuName());
				map.put("icon", sysMenu.getMenuIcon()); 
				stateMap.put("opened",true);
				
				HashMap<String,String> attrMap= new HashMap<String,String>();//额外属性
				attrMap.put("menuDesc",sysMenu.getMenuDesc());
				attrMap.put("menuState",sysMenu.getMenuState().toString());
				int childrenCount = sysMenuServiceBiz.selectChildrenCount(sysMenu.getMenuId()); //查询有无子节点
				if (childrenCount>0) {		//判断有无子节点
					attrMap.put("hasChildren","1");
					map.put("a_attr", attrMap);
					map.put("state", stateMap);
					setChildrenMenuTree(allMenuList,checkedMenuList,map,sysMenu.getMenuId().toString());  
				}else{
					if (checkedMenuList!=null&&checkedMenuList.size()>0) {
						for (SysMenu checkSysmenu : checkedMenuList) {
							if (checkSysmenu.getMenuId().toString().equals(sysMenu.getMenuId().toString())) {
								stateMap.put("checked",true);
							}
						}
					}
					map.put("state", stateMap);
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
		HashMap<String,Boolean> rootStateMap= new HashMap<String,Boolean>();//节点状态
		rootStateMap.put("opened",true);
		rootMap.put("state", rootStateMap);
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
	public  HashMap<String,Object> setChildrenMenuTree(List<SysMenu> allMenuList,List<SysMenu> checkedMenuList,HashMap<String,Object> map,String pid){
		List<HashMap<String, Object>> listMap2=new ArrayList<HashMap<String,Object>>();
		HashMap<String, Object> map2=null;
		for (SysMenu sysMenu : allMenuList) {
			HashMap<String,Boolean> stateMap= new HashMap<String,Boolean>();//节点状态
			if (sysMenu.getMenuParentId().toString().equals(pid)) {
				map2=new HashMap<String, Object>();
				map2.put("id", sysMenu.getMenuId().toString());
				map2.put("text", sysMenu.getMenuName());
				map2.put("icon", sysMenu.getMenuIcon()); 
				stateMap.put("opened",true);
				
				HashMap<String,String> attrMap= new HashMap<String,String>();//额外属性
				attrMap.put("menuDesc",sysMenu.getMenuDesc());
				attrMap.put("menuState",sysMenu.getMenuState().toString());
				int childrenCount = sysMenuServiceBiz.selectChildrenCount(sysMenu.getMenuId()); //查询有无子节点
				if (childrenCount>0) {	//判断有无子节点
					attrMap.put("hasChildren","1");
					map2.put("a_attr", attrMap);
					map2.put("state", stateMap);
					listMap2.add(map2);
					//继续添加子节点
					setChildrenMenuTree(allMenuList,checkedMenuList,map2,sysMenu.getMenuId().toString());  
				}else{
					if (checkedMenuList!=null&&checkedMenuList.size()>0) {
						for (SysMenu checkSysmenu : checkedMenuList) {
							if (checkSysmenu.getMenuId().toString().equals(sysMenu.getMenuId().toString())) {
								stateMap.put("checked",true);
							}
						}
					}
					map2.put("state", stateMap);
					
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
