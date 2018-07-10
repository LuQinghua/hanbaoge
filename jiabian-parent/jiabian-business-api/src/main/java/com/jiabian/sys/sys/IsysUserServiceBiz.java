package com.jiabian.sys.sys;

import com.alibaba.fastjson.JSONObject;
import com.jiabian.base.PagesModel;
import com.jiabian.beans.basic.SysUser;
import com.jiabian.sys.sysuser.request.SysUserReq;
import com.jiabian.sys.sysuser.response.SysUserResp;
import com.jiabian.util.Result;



/**
 * 后台管理员用户接口
 * */
public interface IsysUserServiceBiz {
	/**
	 * 根据用户名称和密码查询系统用户
	 * @param sysUser 拥有登录名称和登录密码的系统用户对象 
	 * @return	系统用户对象
	 */
	public SysUser sysUserLogin(String loginName,String loginPwd);
	
	/**
	 * 通过用户ID查询系统用户对象
	 * @param suserid 系统用户ID
	 * @return
	 */
	public SysUserResp selectSysUserInfo(Long suserid);
	
	/**
	 * 添加系统用户对象
	 * @param sysUser 系统用户对象
	 * @return
	 */
	public int addSysUser(SysUser sysUser);
	
	/**
	 * 修改系统用户对象
	 * @param sysUser 系统用户对象
	 * @return
	 */
	public int updateSysUser(SysUser sysUser);
	
	/**
	 * 批量删除用户
	 * @param 
	 * @return 
	 */
	public int deleteSysUser(SysUserReq sysUserReq);
	
	/**
	 * 恢复删除用户
	 * @param 
	 * @return 
	 */
	public int revertSysUser(SysUserReq sysUserReq);
	
	/**
	 * 根据条件分页查询
	 * @param pagesModel
	 */
	void selectByParm(PagesModel<SysUserReq,SysUserResp> pagesModel);
	
	/**
	 * 
	 * 修改密码
	 * com.jiabian.sys.sys 
	 * 方法名：updatePersonalInfo
	 * 创建人：方玉明
	 * 时间：2016年12月19日-下午4:58:48 
	 * @param sysUser
	 * @return Result<JSONObject>
	 * @exception 
	 * @since  1.0.0
	 */
	public Result<JSONObject> updatePersonalInfo(SysUser sysUser);
	
	/**
	 * 
	 * (主键查询)
	 * com.jiabian.sys.sys 
	 * 方法名：selectSysUser
	 * 创建人：彭振锋 
	 * 时间：2016年12月28日-下午7:36:21 
	 * @param susUserId
	 * @return SysUser
	 * @exception 
	 * @since  1.0.0
	 */
	SysUser selectSysUser(Long susUserId);

	/**
	 * 
	 * 查询推广员
	 * com.jiabian.sys.sys 
	 * 方法名：selectGeneralize
	 * 创建人：李文凯
	 * 时间：2016年12月30日-下午5:59:20 
	 * @param pagesModel
	 * @return PagesModel<SysUserReq,SysUserResp>
	 * @exception 
	 * @since  1.0.0
	 */
     PagesModel<SysUserReq, SysUserResp> selectGeneralize(PagesModel<SysUserReq, SysUserResp> pagesModel);


     /**
      * 
      * 查询推广员信息
      * com.jiabian.sys.sys 
      * 方法名：selectSysUserInfoByInvitationCode
      * 创建人：李文凯
      * 时间：2016年12月30日-下午6:00:12 
      * @param invitationCode
      * @return SysUserResp
      * @exception 
      * @since  1.0.0
      */
	public SysUserResp selectSysUserInfoByInvitationCode(String invitationCode);
	


     

}
