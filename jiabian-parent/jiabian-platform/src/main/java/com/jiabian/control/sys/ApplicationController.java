package com.jiabian.control.sys;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jiabian.appication.request.SysApplicationReq;
import com.jiabian.appication.response.SysApplicationRes;
import com.jiabian.base.PagesModel;
import com.jiabian.base.control.BaseController;
import com.jiabian.beans.basic.SysUser;
import com.jiabian.sys.sys.IsysAppicationServiceBiz;
import com.jiabian.sys.sysuser.response.SysUserResp;
import com.jiabian.util.CookieUtil;

@RequestMapping("/application")
@Controller
public class ApplicationController extends BaseController<SysApplicationReq,SysApplicationRes> {
	@Resource 
	private IsysAppicationServiceBiz sysAppicationServiceBiz;
	/**
	 * 
	 * 查询列表
	 * com.jiabian.control.sys 
	 * 方法名：list
	 * 创建人：黄世平
	 * 时间：2016年12月8日-下午5:29:05 
	 * @param sysApplicationReq
	 * @param modelMap
	 * @return String
	 * @exception 
	 * @since  1.0.0
	 */
	@RequestMapping("/list")
	public String list(SysApplicationReq sysApplicationReq,ModelMap modelMap){

		PagesModel<SysApplicationReq, SysApplicationRes> pagesModel = new PagesModel<>(sysApplicationReq);
		pagesModel.setOrderBy("updateTime desc ");
		this.setPagesToModel(pagesModel, sysApplicationReq);
		sysAppicationServiceBiz.selectSysApplicationPage(pagesModel);
		modelMap.addAttribute("pagesModel", pagesModel);
		modelMap.put("returnName", sysApplicationReq.getName());
		modelMap.put("cardNo", sysApplicationReq.getCardNo());
		modelMap.put("status", sysApplicationReq.getStatus());
		modelMap.put("type", sysApplicationReq.getType());
		modelMap.put("mobile", sysApplicationReq.getMobile());
		modelMap.put("email", sysApplicationReq.getEmail());
		return "application/list";
	}
	
	/**
	 * 
	 * 查看详情
	 * com.jiabian.control.sys 
	 * 方法名：info
	 * 创建人：黄世平
	 * 时间：2016年12月8日-下午7:18:54 
	 * @param id
	 * @param modelMap
	 * @return String
	 * @exception 
	 * @since  1.0.0
	 */
	@RequestMapping("/info")
	public String info(Long id,ModelMap modelMap){
		SysApplicationRes application = sysAppicationServiceBiz.getSysApplication4Id(id);
		modelMap.addAttribute("application",application);
		if (application.getStatus()==(byte)2) {
			SysUserResp sysUserResp=sysAppicationServiceBiz.selectApplicationSysUserInfo(id);
			modelMap.addAttribute("sysUserResp", sysUserResp);
		}
		return "application/info";
	}
	
	
	/**
	 * 
	 * 审核
	 * com.jiabian.control.sys 
	 * 方法名：reviewed
	 * 创建人：黄世平
	 * 时间：2016年12月8日-下午7:18:28 
	 * @param id
	 * @param modelMap
	 * @return String
	 * @exception 
	 * @since  1.0.0
	 */
	@RequestMapping(value = "/reviewed")
	@ResponseBody
	public Integer reviewed(Long id,Byte status,Byte type){
		SysUser user = CookieUtil.getCookieObj(request, "jiabian_sysUser", SysUser.class);
		return user!=null?sysAppicationServiceBiz.updateApplictionStatus(id,user.getSuserId(),status,type):null;
	}
	 
}
