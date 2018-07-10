package com.jiabian.service.basic;

import java.util.List;

import com.jiabian.base.PagesModel;
import com.jiabian.beans.basic.SysUser;
import com.jiabian.sys.sysuser.request.SysUserReq;
import com.jiabian.sys.sysuser.response.SysUserResp;

public interface ISysUserService {
	
	
	/**
     * 
     * (根据地区查询相应区域的区域经理)
     * com.jiabian.dao.basic 
     * 方法名：selectSysUserByDistrict
     * 创建人：彭振锋 
     * 时间：2016年12月22日-下午4:30:45 
     * @param sysUserReq
     * @return List<SysUserResp>
     * @exception 
     * @since  1.0.0
     */
    List<SysUserResp> selectSysUserByDistrict(SysUserReq sysUserReq);
	
    /**
     * 
     * (查询客服人员列表)
     * com.jiabian.service.basic 
     * 方法名：selectSereviceList
     * 创建人：彭振锋 
     * 时间：2016年12月28日-下午1:40:24 
     * @param sysUserReq
     * @return List<SysUserResp>
     * @exception 
     * @since  1.0.0
     */
    List<SysUserResp> selectSereviceList(SysUserReq sysUserReq);
    
    /**
     * 
     * (主键查询)
     * com.jiabian.service.basic 
     * 方法名：selectSysUser
     * 创建人：彭振锋 
     * 时间：2016年12月28日-下午7:34:06 
     * @param susUserId
     * @return SysUser
     * @exception 
     * @since  1.0.0
     */
    SysUser selectSysUser (Long susUserId);

    /**
     * 
     * 分页查询所有推广销售人员信息
     * com.jiabian.service.basic 
     * 方法名：selectGeneralize
     * 创建人：李文凯
     * 时间：2016年12月29日-上午11:16:34 
     * @param pagesModel
     * @return List<SysUserResp>
     * @exception 
     * @since  1.0.0
     */
	List<SysUserResp> selectGeneralize(PagesModel<SysUserReq, SysUserResp> pagesModel);
	Integer countGeneralize(PagesModel<SysUserReq, SysUserResp> pagesModel);

	/**
	 * 
	 * 查询推广员信息
	 * com.jiabian.service.basic 
	 * 方法名：selectSysUserInfoByInvitationCode
	 * 创建人：李文凯
	 * 时间：2016年12月30日-下午6:01:53 
	 * @param invitationCode
	 * @return SysUserResp
	 * @exception 
	 * @since  1.0.0
	 */
	SysUserResp selectSysUserInfoByInvitationCode(String invitationCode);

}
