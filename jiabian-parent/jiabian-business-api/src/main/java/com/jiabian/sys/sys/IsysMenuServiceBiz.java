package com.jiabian.sys.sys;

import java.util.List;

import com.jiabian.beans.basic.SysMenu;


public interface IsysMenuServiceBiz {
	
	/**
	 * 获取该角色系统菜单(不包含隐藏菜单)
	 * @param roleId
	 * @return
	 */
	List<SysMenu> selectSysMenu(Long roleId);
	
	/**
	 * 获取系统所有菜单(包含隐藏菜单)
	 * @return
	 */
	List<SysMenu> selectAllSysMenu();
	
	/**
	 * 查询子菜单数量
	 * @param menuId
	 * @return
	 */
	int selectChildrenCount(Long menuId);
	
	/**
	 * 获取菜单详情信息
	 * @param menuId
	 * @return
	 */
	SysMenu selectSysMenuInfo(Long menuId);

	/**
	 * 修改菜单
	 * @param sysMenu
	 * @return
	 */
	int updateSysMenu(SysMenu sysMenu);
	
	/**
	 * 删除菜单
	 * @param menuId
	 * @return
	 */
	int deleteSysMenu(Long menuId);
	
	/**
	 * 添加菜单
	 * @param sysMenu
	 * @return
	 */
	int addSysMenu(SysMenu sysMenu);

	/**
	 * (这里用一句话描述这个方法的作用)
	 * com.jiabian.sys.sys 
	 * 方法名：selectMenuParentMenu
	 * 创建人：方玉明
	 * 时间：2016年12月14日-下午5:32:01 
	 * @param menuParentId
	 * @return SysMenu
	 * @exception 
	 * @since  1.0.0
	*/
	SysMenu selectMenuParentMenu(Long menuParentId);

	
	
}
