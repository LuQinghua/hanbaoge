package com.jiabian.sys.sys;


import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jiabian.beans.basic.SysMenu;
import com.jiabian.beans.basic.SysMenuQueryHelper;
import com.jiabian.beans.basic.SysRoleMenu;
import com.jiabian.beans.basic.SysRoleMenuQueryHelper;
import com.jiabian.dao.basic.SysMenuMapper;
import com.jiabian.dao.basic.SysRoleMenuMapper;
@Service
public class SysMenuServiceBiz implements IsysMenuServiceBiz {
	@Resource
	private SysMenuMapper menuMapper;
	@Resource
	private SysRoleMenuMapper roleMenuMapper;
	
	@Override
	public List<SysMenu> selectSysMenu(Long roleId){
		SysRoleMenuQueryHelper roleMenuExample = new SysRoleMenuQueryHelper();
		roleMenuExample.createCriteria().andRoleIdEqualTo(roleId);
		List<SysRoleMenu> sysRoleMenuList = roleMenuMapper.selectByExample(roleMenuExample);
		
		if (sysRoleMenuList.isEmpty()) {
			return new ArrayList<>();
		}
		List<Long> menuIdList=new ArrayList<Long>();
		for (SysRoleMenu sysRoleMenu : sysRoleMenuList) {
			menuIdList.add(sysRoleMenu.getMenuId());
		}
		SysMenuQueryHelper sysMenuExample = new SysMenuQueryHelper();
		sysMenuExample.createCriteria().andMenuIdIn(menuIdList).andMenuStateEqualTo((byte) 0);
		return  menuMapper.selectByExample(sysMenuExample);
	}
	
	@Override
	public List<SysMenu> selectAllSysMenu() {
		SysMenuQueryHelper example=new SysMenuQueryHelper();
		List<SysMenu> sysMenuList = menuMapper.selectByExample(example);
		return sysMenuList;
	}
	
	@Override
	public int selectChildrenCount(Long menuId) {
		SysMenuQueryHelper example=new SysMenuQueryHelper();
		example.createCriteria().andMenuParentIdEqualTo(menuId);
		int childrenCount = menuMapper.countByExample(example);
		return childrenCount;
	}
	
	
	@Override
	public SysMenu selectSysMenuInfo(Long menuId) {
		SysMenu sysMenu = menuMapper.selectByPrimaryKey(menuId);
		return sysMenu;
	}

	@Override
	public int updateSysMenu(SysMenu sysMenu) {
		int result = menuMapper.updateByPrimaryKeySelective(sysMenu);
		return result;
	}
	
	@Override
	public int deleteSysMenu(Long menuId) {
		int result =-1;
		result=menuMapper.deleteByPrimaryKey(menuId);
		
		SysRoleMenuQueryHelper example = new SysRoleMenuQueryHelper();
		example.createCriteria().andMenuIdEqualTo(menuId);
		List<SysRoleMenu> roleMenuList = roleMenuMapper.selectByExample(example);
		if (roleMenuList.isEmpty()) {
			return result;
		}

		return roleMenuMapper.deleteByExample(example);
	}
	
	@Override
	public int addSysMenu(SysMenu sysMenu) {
		 int result = menuMapper.insert(sysMenu);
		 return result;
	}

	@Override
	public SysMenu selectMenuParentMenu(Long menuParentId) {
		// TODO Auto-generated method stub
		return menuMapper.selectByPrimaryKey(menuParentId);
	}

	
}
