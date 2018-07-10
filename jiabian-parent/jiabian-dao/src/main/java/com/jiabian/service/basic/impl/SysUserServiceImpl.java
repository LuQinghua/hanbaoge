package com.jiabian.service.basic.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jiabian.base.PagesModel;
import com.jiabian.beans.basic.SysUser;
import com.jiabian.dao.basic.SysUserMapper;
import com.jiabian.service.basic.ISysUserService;
import com.jiabian.sys.sysuser.request.SysUserReq;
import com.jiabian.sys.sysuser.response.SysUserResp;

@Service
public class SysUserServiceImpl implements ISysUserService{

	 @Resource
	 private SysUserMapper sysUserMapper;
	
	 /**
	  * 
	  * (根据地区查询相应区域的区域经理)
	  * com.jiabian.service.basic.impl 
	  * 方法名：selectSysUserByDistrict
	  * 创建人：彭振锋 
	  * 时间：2016年12月22日-下午4:37:21 
	  * @param sysUserReq
	  * @return
	  * @see com.jiabian.service.basic.ISysUserService#selectSysUserByDistrict(com.jiabian.sys.sysUser.request.SysUserReq)
	  * @exception 
	  * @since  1.0.0
	  */
	@Override
	public List<SysUserResp> selectSysUserByDistrict(SysUserReq sysUserReq) {
		// TODO Auto-generated method stub
		return sysUserMapper.selectSysUserByDistrict(sysUserReq);
	}

	/**
	 * 
	 * (获取到客服人员列表)
	 * com.jiabian.service.basic.impl 
	 * 方法名：selectSereviceList
	 * 创建人：彭振锋 
	 * 时间：2016年12月28日-下午1:41:10 
	 * @param sysUserReq
	 * @return
	 * @see com.jiabian.service.basic.ISysUserService#selectSereviceList(com.jiabian.sys.sysUser.request.SysUserReq)
	 * @exception 
	 * @since  1.0.0
	 */
	@Override
	public List<SysUserResp> selectSereviceList(SysUserReq sysUserReq) {
		// TODO Auto-generated method stub
		return sysUserMapper.selectSereviceList(sysUserReq);
	}

	/**
	 * 
	 * (主键查询)
	 * com.jiabian.service.basic.impl 
	 * 方法名：selectSysUser
	 * 创建人：彭振锋 
	 * 时间：2016年12月28日-下午7:34:48 
	 * @param susUserId
	 * @return
	 * @see com.jiabian.service.basic.ISysUserService#selectSysUser(java.lang.Long)
	 * @exception 
	 * @since  1.0.0
	 */
	@Override
	public SysUser selectSysUser(Long susUserId) {		
		return sysUserMapper.selectByPrimaryKey(susUserId);
	}

	
	/**
	 * 
	 * 查看推广人员
	 * com.jiabian.service.basic.impl 
	 * 方法名：selectGeneralize
	 * 创建人：李文凯
	 * 时间：2016年12月30日-下午1:19:56 
	 * @param pagesModel
	 * @return
	 * @see com.jiabian.service.basic.ISysUserService#selectGeneralize(com.jiabian.base.PagesModel)
	 * @exception 
	 * @since  1.0.0
	 */
	@Override
	public List<SysUserResp> selectGeneralize(PagesModel<SysUserReq, SysUserResp> pagesModel) {				
		return sysUserMapper.selectGeneralize(pagesModel);
		
	}
	@Override
	public Integer countGeneralize(PagesModel<SysUserReq, SysUserResp> pagesModel) {		
		return sysUserMapper.countGeneralize(pagesModel);
		
	}

	/**
	 * 
	 * 查询推广员信息
	 * com.jiabian.service.basic.impl 
	 * 方法名：selectSysUserInfoByInvitationCode
	 * 创建人：李文凯
	 * 时间：2016年12月30日-下午6:02:21 
	 * @param invitationCode
	 * @return
	 * @see com.jiabian.service.basic.ISysUserService#selectSysUserInfoByInvitationCode(java.lang.String)
	 * @exception 
	 * @since  1.0.0
	 */
	@Override
	public SysUserResp selectSysUserInfoByInvitationCode(String invitationCode) {		
		return sysUserMapper.selectSysUserInfoByInvitationCode(invitationCode);
	}



	
}
