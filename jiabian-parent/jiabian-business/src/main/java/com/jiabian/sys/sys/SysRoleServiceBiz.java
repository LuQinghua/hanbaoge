package com.jiabian.sys.sys;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jiabian.base.PagesModel;
import com.jiabian.beans.basic.SysMenu;
import com.jiabian.beans.basic.SysMenuQueryHelper;
import com.jiabian.beans.basic.SysRole;
import com.jiabian.beans.basic.SysRoleMenu;
import com.jiabian.beans.basic.SysRoleMenuQueryHelper;
import com.jiabian.beans.basic.SysRoleQueryHelper;
import com.jiabian.dao.basic.SysMenuMapper;
import com.jiabian.dao.basic.SysRoleMapper;
import com.jiabian.dao.basic.SysRoleMenuMapper;
import com.jiabian.sys.sysrole.request.SysRoleReq;
import com.jiabian.sys.sysrole.response.SysRoleResp;
@Service
public class SysRoleServiceBiz implements IsysRoleServiceBiz {
	
	@Resource
	private SysRoleMapper roleMapper;
	@Resource
	private SysRoleMenuMapper roleMenuMapper;
	@Resource
	private SysMenuMapper menuMapper;
	
	/**
	 * 根据角色ID获取菜单权限
	 * @param roleId
	 * @return
	 */
	@Override
	public List<SysMenu> selectSysMenus(Long roleId){
		SysRoleMenuQueryHelper example = new SysRoleMenuQueryHelper();
		example.createCriteria().andRoleIdEqualTo(roleId);
		List<SysRoleMenu> sysRoleMenuList = roleMenuMapper.selectByExample(example);
		
		List<Long> menuIdList=new ArrayList<Long>();
		List<SysMenu> sysMenuList = new ArrayList<SysMenu>();
		if (sysRoleMenuList!=null&&sysRoleMenuList.size()>0) {
			for (SysRoleMenu sysRoleMenu2 : sysRoleMenuList) {
				menuIdList.add(sysRoleMenu2.getMenuId());
			}
			SysMenuQueryHelper example2=new SysMenuQueryHelper();
			example2.createCriteria().andMenuIdIn(menuIdList);
			sysMenuList = menuMapper.selectByExample(example2);
		}
		return sysMenuList;
	}
	
	@Override
	public SysRole selectSysRoleInfo(Long roleId) {
		// TODO Auto-generated method stub
		return roleMapper.selectByPrimaryKey(roleId);
	}
	@Override
	public int addSysRole(SysRole sysRole) {
		// TODO Auto-generated method stub
		return roleMapper.insert(sysRole);
	}
	
	
	@Override
	public int updateSysRole(SysRole sysRole) {
		// TODO Auto-generated method stub
		return roleMapper.updateByPrimaryKeySelective(sysRole);
	}
	
	@Override
	public int deleteSysRole(Long roleId) {
		int result=-1;
		result=roleMapper.deleteByPrimaryKey(roleId);
		
		SysRoleMenuQueryHelper example = new SysRoleMenuQueryHelper();
		example.createCriteria().andRoleIdEqualTo(roleId);
		List<SysRoleMenu> roleMenuList = roleMenuMapper.selectByExample(example);
		if (roleMenuList!=null&&roleMenuList.size()>0) {
			example.clear();
			example.createCriteria().andRoleIdEqualTo(roleId);
			result=roleMenuMapper.deleteByExample(example);
		}
		return result;
	}
	
	@Override
	public List<SysRole> selectAllSysRoleS() {
		// TODO Auto-generated method stub
		SysRoleQueryHelper example = new SysRoleQueryHelper();
		return roleMapper.selectByExample(example);
	}
	
	@Override
	public int setSysMenuS(Long roleId,List<SysRoleMenu> roleMenuList) {
		// TODO Auto-generated method stub
		int result=-1;
		SysRoleMenuQueryHelper example = new SysRoleMenuQueryHelper();
		example.createCriteria().andRoleIdEqualTo(roleId);
		result=roleMenuMapper.deleteByExample(example);
		if (roleMenuList!=null&&roleMenuList.size()>0) {
			result = roleMenuMapper.insertForeach(roleMenuList);
		}
		return 	result;
	}

	@Override
	public void selectByParm(PagesModel<SysRoleReq, SysRoleResp> pagesModel) {
		// TODO Auto-generated method stub
		pagesModel.setResults(roleMapper.selectforPageByParam(pagesModel));
		pagesModel.setTotal(roleMapper.countforPageByParam(pagesModel));
	}

}
