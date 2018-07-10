/*
 * SysUserMapper.java
 * Copyright(C) 20xx-2015 xxxxxx��˾
 * All rights reserved.
 * -----------------------------------------------
 * 2016-12-21 Created
 */
package com.jiabian.dao.basic;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jiabian.base.PagesModel;
import com.jiabian.beans.basic.SysUser;
import com.jiabian.beans.basic.SysUserQueryHelper;
import com.jiabian.sys.sysuser.request.SysUserReq;
import com.jiabian.sys.sysuser.response.SysUserResp;

public interface SysUserMapper {
    int countByExample(SysUserQueryHelper example);

    int deleteByExample(SysUserQueryHelper example);

    int deleteByPrimaryKey(Long suserId);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    List<SysUser> selectByExample(SysUserQueryHelper example);

    SysUser selectByPrimaryKey(Long suserId);

    int updateByExampleSelective(@Param("record") SysUser record, @Param("example") SysUserQueryHelper example);

    int updateByExample(@Param("record") SysUser record, @Param("example") SysUserQueryHelper example);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);
    
    /**
     * 分页查询
     * @param pagesModel
     * @return
     */
    List<SysUserResp> selectforPageByParam(PagesModel<SysUserReq,SysUserResp> pagesModel);
    Integer countforPageByParam(PagesModel<SysUserReq,SysUserResp> pagesModel);
    /**
     * 批量修改删除状态
     * @param isDel
     * @param ids
     * @param sysUserReq
     * @return
     */
    int updateIsDelForeach(@Param("isDel") Integer isDel,@Param("ids") String[] ids,@Param("sysUserReq") SysUserReq sysUserReq);
    
    /**
     *  根据id查询系统用户信息
     * @param suserId
     * @return
     */
    SysUserResp selectUserandRole(Long suserId);

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
     * com.jiabian.dao.basic 
     * 方法名：selectSereviceList
     * 创建人：彭振锋 
     * 时间：2016年12月28日-下午1:36:00 
     * @return List<SysUserResp>
     * @exception 
     * @since  1.0.0
     */
    List<SysUserResp> selectSereviceList(SysUserReq sysUserReq);

    /**
     * 
     * 分页查询推广人员业绩
     * com.jiabian.dao.basic 
     * 方法名：selectGeneralize
     * 创建人：李文凯
     * 时间：2016年12月29日-下午7:22:59 
     * @param pagesModel
     * @return List<SysUserResp>
     * @exception 
     * @since  1.0.0
     */
	List<SysUserResp> selectGeneralize(PagesModel<SysUserReq, SysUserResp> pagesModel);

	
	SysUserResp selectPerformance(Long suserId);
	

	Integer countGeneralize(PagesModel<SysUserReq, SysUserResp> pagesModel);


	/**
	 * 
	 * 查询推广员信息
	 * com.jiabian.dao.basic 
	 * 方法名：selectSysUserInfoByInvitationCode
	 * 创建人：李文凯
	 * 时间：2016年12月30日-下午6:02:58 
	 * @param invitationCode
	 * @return SysUserResp
	 * @exception 
	 * @since  1.0.0
	 */
	SysUserResp selectSysUserInfoByInvitationCode(String invitationCode);

}