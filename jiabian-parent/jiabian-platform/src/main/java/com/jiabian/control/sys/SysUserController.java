package com.jiabian.control.sys;


import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.jiabian.base.PagesModel;
import com.jiabian.base.control.BaseController;
import com.jiabian.beans.basic.SysRole;
import com.jiabian.beans.basic.SysUser;
import com.jiabian.sys.sys.IsysRoleServiceBiz;
import com.jiabian.sys.sys.IsysUserServiceBiz;
import com.jiabian.sys.sysuser.request.SysUserReq;
import com.jiabian.sys.sysuser.response.SysUserResp;
import com.jiabian.util.DateUtil;
import com.jiabian.util.MD5;
import com.jiabian.util.Result;
import com.jiabian.util.SpringBeanUtils;


@Controller("sysUserController")
@RequestMapping("/sysUser")
public class SysUserController extends BaseController<SysUserReq, SysUserResp> {
	private static final Logger logger = LogManager.getLogger(SysUserController.class.getName());	
	
	@Resource
	private IsysUserServiceBiz sysUserServiceBiz;
	@Resource
	private IsysRoleServiceBiz sysRoleServiceBiz;
	/**
	 * 查询所有用户
	 * com.jiabian.control.sys 
	 * 方法名：sysUserList
	 * 创建人：方玉明
	 * 时间：2017年1月10日-下午12:21:19 
	 * @param model
	 * @param request
	 * @param sysUserReq
	 * @return String
	 * @exception 
	 * @since  1.0.0
	 */
	@RequestMapping("/sysUserList")
	public String sysUserList(ModelMap model,HttpServletRequest request,SysUserReq sysUserReq){
		if (sysUserReq.getIsDel()==null) {
			sysUserReq.setIsDel((byte)1);
		}
		PagesModel<SysUserReq,SysUserResp> pagesModel = new PagesModel<>(sysUserReq);
		pagesModel.setOrderBy("updateTime desc");
		this.setPagesToModel(pagesModel,sysUserReq);
		sysUserServiceBiz.selectByParm(pagesModel);
		if (!StringUtils.isBlank(sysUserReq.getRealName())) {
			model.put("realName",sysUserReq.getRealName());
		}
		if (!StringUtils.isBlank(sysUserReq.getLoginName())) {
			model.put("loginName",sysUserReq.getLoginName());
		}
		if (!StringUtils.isBlank(sysUserReq.getEmail())) {
			model.put("email",sysUserReq.getEmail());
		}
		if (sysUserReq.getIsDel()!=null) {
			model.put("isDel",sysUserReq.getIsDel());
		}
		String msg = (String) request.getSession().getAttribute("msg");
		request.getSession().removeAttribute("msg");
		model.put("msg", msg);
		model.put("pagesModel", pagesModel);
		return "sys/sysUser/userList";
	}
	
	/**
	 * 
	 * 跳转到添加用户页面
	 * com.jiabian.control.sys 
	 * 方法名：toAddSysUser
	 * 创建人：方玉明
	 * 时间：2016年11月10日-下午12:41:36 
	 * @param model
	 * @return String
	 * @exception 
	 * @since  1.0.0
	 */
	@RequestMapping("/toAddSysUser")
	public String toAddSysUser(ModelMap model){
		List<SysRole> roleList = sysRoleServiceBiz.selectAllSysRoleS();
		model.put("roleList",roleList);
		return "sys/sysUser/addSysUser";
	}
	
	/**
	 * 执行添加用户操作
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/addSysUser")
	public int addSysUser(HttpServletRequest request,SysUserReq sysUserReq){
		if (StringUtils.isNotBlank(sysUserReq.getLoginPwd())) {
			sysUserReq.setLoginPwd((MD5.encryptionStr(sysUserReq.getLoginPwd())));
		}
		SysUser sysUser = new SysUser();
		SpringBeanUtils.copyProperties(sysUserReq, sysUser);
		
		sysUser.setCreateTime(DateUtil.getDateShotFormat(DateUtil.getSysTime()));
		sysUser.setUpdateTime(DateUtil.getDateShotFormat(DateUtil.getSysTime()));
		sysUser.setIsDel((byte)1);
		return sysUserServiceBiz.addSysUser(sysUser);
	}
	
	/**
	 * 跳转到修改用户页面
	 * @return
	 */
	@RequestMapping("/toUpdateSysUser")
	public String getUserInfo(ModelMap model,SysUserReq sysUserReq){
		SysUserResp sysUser=sysUserServiceBiz.selectSysUserInfo(sysUserReq.getSuserId());
		model.put("obj", sysUser);
		List<SysRole> roleList = sysRoleServiceBiz.selectAllSysRoleS();
		model.put("roleList", roleList);
		return "sys/sysUser/updateSysUser";
	}
	
	/**
	 * 执行修改用户操作
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/updateSysUser")
	public int updateSysUser(HttpServletRequest request,SysUserReq sysUserReq){
		if (StringUtils.isNotBlank(sysUserReq.getLoginPwd())) {
			sysUserReq.setLoginPwd((MD5.encryptionStr(sysUserReq.getLoginPwd())));
		}
		SysUser sysUser=new SysUser();
		SpringBeanUtils.copyProperties(sysUserReq, sysUser);
		sysUser.setUpdateTime(DateUtil.getDateShotFormat(DateUtil.getSysTime()));
		return sysUserServiceBiz.updateSysUser(sysUser);
	}
	
	/**
	 * 执行删除用户操作
	 * @param suserid
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/deleteSysUser")
	public int deleteSysUser(HttpServletRequest request,SysUserReq sysUserReq){
		sysUserReq.setUpdateTime(new Date());
		return sysUserServiceBiz.deleteSysUser(sysUserReq);
	}
	
	/**
	 * 执行恢复用户操作
	 * @param suserid
	 * @return
	 */
	@RequestMapping("/revertSysUser")
	public String revertSysUser(HttpServletRequest request,SysUserReq sysUserReq){
		String msg="";
		sysUserReq.setUpdateTime(new Date());
		int result = sysUserServiceBiz.revertSysUser(sysUserReq);
		if (result>0) {
			msg="恢复用户成功!";
		}else{
			msg="恢复用户失败啦!";
		}
		request.getSession().setAttribute("msg", msg);
		return "redirect:sysUserList?isDel=2";
	}
	
	/**
	 * 修改我的密码
	 * @return
	 */
	@RequestMapping("/selectUserInfo")
	@ResponseBody
	public SysUserResp updateMyPwd(SysUserReq sysUserReq){
		return sysUserServiceBiz.selectSysUserInfo(sysUserReq.getSuserId());
	}
	
	@ResponseBody
	@RequestMapping("/updatePersonalInfo")
	public Result<JSONObject> updatePersonalInfo(HttpServletRequest request,SysUserReq sysUserReq){
		SysUser sysUser=new SysUser();
		SpringBeanUtils.copyProperties(sysUserReq, sysUser);
		return sysUserServiceBiz.updatePersonalInfo(sysUser);
	}
}
