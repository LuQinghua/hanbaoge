package com.jiabian.control.sys;

import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jiabian.base.PagesModel;
import com.jiabian.base.control.BaseController;
import com.jiabian.beans.basic.SysConfig;
import com.jiabian.beans.basic.SysUser;
import com.jiabian.sys.sys.IsysConfigServiceBiz;
import com.jiabian.sys.sysconfig.request.SysConfigReq;
import com.jiabian.sys.sysconfig.response.SysConfigResp;
import com.jiabian.util.CookieUtil;
import com.jiabian.util.SpringBeanUtils;

@Controller("sysConfigController")
@RequestMapping("/sysConfig")
public class SysConfigController extends BaseController<SysConfigReq,SysConfigResp> {
	@Resource 
	private IsysConfigServiceBiz sysConfigServiceBiz;
	
	/**
	 * 查询系统配置列表
	 * com.jiabian.control.sys 
	 * 方法名：sysConfigList
	 * 创建人：方玉明
	 * 时间：2017年1月10日-下午12:19:13 
	 * @param model
	 * @param request
	 * @param sysConfigReq
	 * @return String
	 * @exception 
	 * @since  1.0.0
	 */
	@RequestMapping("/sysConfigList")
	public String sysConfigList(ModelMap model,HttpServletRequest request,SysConfigReq sysConfigReq){
		if (sysConfigReq.getIsDel()==null) {
			sysConfigReq.setIsDel((byte)1);
		}
		PagesModel<SysConfigReq,SysConfigResp> pagesModel = new PagesModel<>(sysConfigReq);
		pagesModel.setOrderBy("updateTime desc ");
		this.setPagesToModel(pagesModel,sysConfigReq);
		sysConfigServiceBiz.selectByParm(pagesModel);
		if (!StringUtils.isBlank(sysConfigReq.getConKey())) {
			model.put("conKey",sysConfigReq.getConKey());
		}
		if (!StringUtils.isBlank(sysConfigReq.getConValue())) {
			model.put("conValue",sysConfigReq.getConValue());
		}
		if (!StringUtils.isBlank(sysConfigReq.getConForName())) {
			model.put("conForName",sysConfigReq.getConForName());
		}
		if (sysConfigReq.getIsDel()!=null) {
			model.put("isDel", sysConfigReq.getIsDel());
		}
		String msg = (String) request.getSession().getAttribute("msg");
		request.getSession().removeAttribute("msg");
		model.put("msg", msg);
		model.put("pagesModel", pagesModel);
		
		return "sys/sysConfig/sysConfigList";
	}
	
	/**
	 * 跳转到添加配置页面
	 * com.jiabian.control.sys 
	 * 方法名：toAddSysConfig
	 * 创建人：方玉明
	 * 时间：2017年1月10日-下午12:19:37 
	 * @param model
	 * @param sysConfigReq
	 * @return String
	 * @exception 
	 * @since  1.0.0
	 */
	@RequestMapping("/toAddSysConfig")
	public String toAddSysConfig(ModelMap model,SysConfigReq sysConfigReq){
		return "sys/sysConfig/addSysConfig";
	}
	
	/**
	 * 执行添加配置操作
	 * com.jiabian.control.sys 
	 * 方法名：addSysConfig
	 * 创建人：方玉明
	 * 时间：2017年1月10日-下午12:19:54 
	 * @param request
	 * @param sysConfigReq
	 * @return String
	 * @exception 
	 * @since  1.0.0
	 */
	@ResponseBody
	@RequestMapping("/addSysConfig")
	public int addSysConfig(HttpServletRequest request,SysConfigReq sysConfigReq){
		
		SysUser user = CookieUtil.getCookieObj(request, "jiabian_sysUser", SysUser.class);
		if (user==null) {
			return -1;
		}
		SysConfig sysConfig=new SysConfig();
		SpringBeanUtils.copyProperties(sysConfigReq, sysConfig);
		sysConfig.setCreateTime(new Date());
		sysConfig.setUpdateTime(new Date());
		sysConfig.setIsDel((byte)1);
		sysConfig.setUserId(Long.valueOf(user.getSuserId()));
		return sysConfigServiceBiz.addSysConfig(sysConfig);
	}
	
	/**
	 * 跳转到修改配置页面
	 * com.jiabian.control.sys 
	 * 方法名：toUpdateSysConfig
	 * 创建人：方玉明
	 * 时间：2017年1月10日-下午12:20:13 
	 * @param model
	 * @param sysConfigReq
	 * @return String
	 * @exception 
	 * @since  1.0.0
	 */
	@RequestMapping("/toUpdateSysConfig")
	public String toUpdateSysConfig(ModelMap model,SysConfigReq sysConfigReq){
		SysConfig sysConfig = sysConfigServiceBiz.selectSysConfigInfo(sysConfigReq.getId());
		model.put("obj", sysConfig);
		return "sys/sysConfig/updateSysConfig";
	}
	
	/**
	 * 查看配置详情
	 * (这里用一句话描述这个方法的作用)
	 * com.jiabian.control.sys 
	 * 方法名：getConfigDetail
	 * 创建人：方玉明
	 * 时间：2017年1月10日-下午12:20:30 
	 * @param model
	 * @param sysConfigReq
	 * @return String
	 * @exception 
	 * @since  1.0.0
	 */
	@RequestMapping("/getConfigDetail")
	public String getConfigDetail(ModelMap model,SysConfigReq sysConfigReq){
		SysConfigReq sysConfig = sysConfigServiceBiz.selectConfigDetail(sysConfigReq.getId());
		model.put("obj", sysConfig);
		return "sys/sysConfig/sysConfigDetail";
	}
	
	
	/**
	 * 执行修改配置操作
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/updateSysConfig")
	public int updateSysConfig(HttpServletRequest request,SysConfigReq sysConfigReq){
		
		SysUser user = CookieUtil.getCookieObj(request, "jiabian_sysUser", SysUser.class);
		if (user ==null) {
          return -1;
		}
		
		SysConfig sysConfig=new SysConfig();
		SpringBeanUtils.copyProperties(sysConfigReq, sysConfig);
		sysConfig.setUpdateTime(new Date());
		sysConfig.setUserId(user.getSuserId());
		
		return sysConfigServiceBiz.updateSysConfig(sysConfig);
	}
	
	/**
	 * 执行删除配置操作
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/deleteSysConfig")
	public int deleteSysConfig(HttpServletRequest request,SysConfigReq sysConfigReq){
		
		SysUser sysUser = CookieUtil.getCookieObj(request, "jiabian_sysUser", SysUser.class);
		if (sysUser==null) {
			return -1;
		}
		sysConfigReq.setUpdateTime(new Date());
		sysConfigReq.setUserId(sysUser.getSuserId());
		return sysConfigServiceBiz.deleteSysConfig(sysConfigReq);
	}
	
	/**
	 * 恢复配置
	 * com.jiabian.control.sys 
	 * 方法名：revertSysConfig
	 * 创建人：方玉明
	 * 时间：2017年1月10日-下午12:20:49 
	 * @param request
	 * @param sysConfigReq
	 * @return String
	 * @exception 
	 * @since  1.0.0
	 */
	@RequestMapping("/revertSysConfig")
	public String revertSysConfig(HttpServletRequest request,SysConfigReq sysConfigReq){
		String msg="";
		sysConfigReq.setUpdateTime(new Date());
		Long suserId=null;
		SysUser user = CookieUtil.getCookieObj(request, "jiabian_sysUser", SysUser.class);
		if (user!=null) {
			suserId=user.getSuserId();
		}
		sysConfigReq.setUserId(suserId);
		int result = sysConfigServiceBiz.revertSysConfig(sysConfigReq);
		if (result>0) {
			msg="恢复配置成功!";
		}else{
			msg="恢复配置失败啦!";
		}
		request.getSession().setAttribute("msg", msg);
		return "redirect:sysConfigList?isDel=2";
	}
		
}
