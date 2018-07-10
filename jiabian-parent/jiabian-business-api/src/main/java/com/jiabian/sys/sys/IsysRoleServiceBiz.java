package com.jiabian.sys.sys;

import java.util.List;

import com.jiabian.base.PagesModel;
import com.jiabian.beans.basic.SysMenu;
import com.jiabian.beans.basic.SysRole;
import com.jiabian.beans.basic.SysRoleMenu;
import com.jiabian.sys.sysrole.request.SysRoleReq;
import com.jiabian.sys.sysrole.response.SysRoleResp;

public interface IsysRoleServiceBiz {
	
	/**
	 * 查询所有角色
	 * @return 角色集合
	 */
	public List<SysRole> selectAllSysRoleS();
	
	/**
	 * 根据角色ID查询角色信息
	 * @return  角色对象 
	 */
	public SysRole selectSysRoleInfo(Long roleid);
	
	/**
	 * 添加角色对象
	 * @return 
	 */
	public int addSysRole(SysRole sysRole);
	
	/**
	 * 修改角色对象
	 * @param sysRole 角色对象
	 * @return
	 */
	public int updateSysRole(SysRole sysRole);
	
	/**
	 * 通过角色ID删除角色对象
	 * @param roleid 角色ID
	 * @return
	 */
	public int deleteSysRole(Long roleid);
	
	/**
	 * 设置权限菜单
	 * @param roleid
	 * @return
	 */
	public int setSysMenuS(Long roleid, List<SysRoleMenu> roleMenuList);
	
	/**
	 * 查询该角色所拥有的菜单
	 * @param roleId
	 * @return
	 */
	List<SysMenu> selectSysMenus(Long roleId);
	
	/**
	 * 根据条件分页查询角色
	 * @param pagesModel
	 */
	void selectByParm(PagesModel<SysRoleReq,SysRoleResp> pagesModel);
}
