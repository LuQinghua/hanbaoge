package com.jiabian.sys.sys;

import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.jiabian.base.BaseEnum.CRUDEnum;
import com.jiabian.base.PagesModel;
import com.jiabian.beans.basic.SysUser;
import com.jiabian.beans.basic.SysUserQueryHelper;
import com.jiabian.dao.basic.SysUserMapper;
import com.jiabian.service.basic.ISysUserService;
import com.jiabian.sys.sysuser.request.SysUserReq;
import com.jiabian.sys.sysuser.response.SysUserResp;
import com.jiabian.util.DateUtil;
import com.jiabian.util.MD5;
import com.jiabian.util.Result;

@Service
public class SysUserServiceBiz implements IsysUserServiceBiz {
	@Resource
	private SysUserMapper sysUserMapper;
	@Resource
	private ISysUserService sysUserService;
	/**
	 * 根据用户名称和密码查询系统用户
	 */
	@Override
	public SysUser sysUserLogin(String loginName,String loginPwd) {
		// TODO Auto-generated method stub
		SysUserQueryHelper example = new SysUserQueryHelper();
		example.createCriteria().andLoginNameEqualTo(loginName).andLoginPwdEqualTo(loginPwd).andIsDelEqualTo((byte)1);
		List<SysUser> list = sysUserMapper.selectByExample(example);
		if (list!=null&&list.size()>0) {
			return list.get(0);
		}else{
			return null;
		}
	}
	@Override
	public SysUserResp selectSysUserInfo(Long suserId) {
		// TODO Auto-generated method stub
		return sysUserMapper.selectUserandRole(suserId);
	}
	@Override
	public int addSysUser(SysUser sysUser) {
		// TODO Auto-generated method stub
		return sysUserMapper.insert(sysUser);
	}
	@Override
	public int updateSysUser(SysUser sysUser) {
		// TODO Auto-generated method stub
		return sysUserMapper.updateByPrimaryKeySelective(sysUser);
	}
	
	@Override
	public int deleteSysUser(SysUserReq sysUserReq) {
		// TODO Auto-generated method stub
		String[] ids=sysUserReq.getCheckIds().split(",");
		return sysUserMapper.updateIsDelForeach(2,ids,sysUserReq);
	}
	@Override
	public void selectByParm(PagesModel<SysUserReq, SysUserResp> pagesModel) {
		// TODO Auto-generated method stub
		pagesModel.setResults(sysUserMapper.selectforPageByParam(pagesModel));
		pagesModel.setTotal(sysUserMapper.countforPageByParam(pagesModel));
	}
	@Override
	public int revertSysUser(SysUserReq sysUserReq) {
		// TODO Auto-generated method stub
		String[] ids=sysUserReq.getCheckIds().split(",");
		return sysUserMapper.updateIsDelForeach(1,ids,sysUserReq);
	}
	
	@Override
	public Result<JSONObject> updatePersonalInfo(SysUser sysUser) {
		// TODO Auto-generated method stub
		Result<JSONObject> result=new Result<>();
		if (StringUtils.isNotBlank(sysUser.getLoginPwd())) {
			sysUser.setLoginPwd((MD5.encryptionStr(sysUser.getLoginPwd())));
		}
		sysUser.setUpdateTime(DateUtil.getDateShotFormat(DateUtil.getSysTime()));
		Integer res=sysUserMapper.updateByPrimaryKeySelective(sysUser);
		if (res>0) {
			result.setStatus(true);
			result.setDesc(CRUDEnum.UPDATE_SUCCEED.desc());
		}else{
			result.setStatus(false);
			result.setDesc(CRUDEnum.UPDATE_ERR.desc());
		}
		return result;
	}
	
	/**
	 * 
	 * (主键查询)
	 * com.jiabian.sys.sys 
	 * 方法名：selectSysUser
	 * 创建人：彭振锋 
	 * 时间：2016年12月28日-下午7:37:00 
	 * @param susUserId
	 * @return
	 * @see com.jiabian.sys.sys.IsysUserServiceBiz#selectSysUser(java.lang.Long)
	 * @exception 
	 * @since  1.0.0
	 */
	@Override
	public SysUser selectSysUser(Long susUserId) {
		// TODO Auto-generated method stub
		return sysUserService.selectSysUser(susUserId);
	}
	
	/**
	 * 
	 * 分页查询推广员信息
	 * com.jiabian.sys.sys 
	 * 方法名：selectGeneralize
	 * 创建人：李文凯
	 * 时间：2016年12月30日-下午6:00:49 
	 * @param pagesModel
	 * @return
	 * @see com.jiabian.sys.sys.IsysUserServiceBiz#selectGeneralize(com.jiabian.base.PagesModel)
	 * @exception 
	 * @since  1.0.0
	 */
	@Override
	public PagesModel<SysUserReq, SysUserResp> selectGeneralize(PagesModel<SysUserReq, SysUserResp> pagesModel) {	
		pagesModel.setResults(sysUserService.selectGeneralize(pagesModel));
		pagesModel.setTotal(sysUserService.countGeneralize(pagesModel));
		return pagesModel;
	}
	
	/**
	 * 
	 * 查询推广员信息
	 * com.jiabian.sys.sys 
	 * 方法名：selectSysUserInfoByInvitationCode
	 * 创建人：李文凯
	 * 时间：2016年12月30日-下午6:01:14 
	 * @param invitationCode
	 * @return
	 * @see com.jiabian.sys.sys.IsysUserServiceBiz#selectSysUserInfoByInvitationCode(java.lang.String)
	 * @exception 
	 * @since  1.0.0
	 */
	@Override
	public SysUserResp selectSysUserInfoByInvitationCode(String invitationCode) {	
		return sysUserService.selectSysUserInfoByInvitationCode(invitationCode);
	}

}
