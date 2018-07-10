package com.jiabian.control.tspt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jiabian.base.PagesModel;
import com.jiabian.base.control.BaseController;
import com.jiabian.tspt.IComplaintService;
import com.jiabian.tspt.request.ComplUserReq;
import com.jiabian.tspt.response.ComplUserRes;

@Controller
@RequestMapping("/complUser")
public class ComplUserController extends BaseController<ComplUserReq, ComplUserRes> {

	@Autowired
	private IComplaintService iComplaintService;
	
	/**
	 * 后台查询用户列表
	 * @param map
	 * @param complUserReq
	 * @return
	 */
	@RequestMapping("/userList")
	public String selectUsers(ModelMap map, ComplUserReq complUserReq) {
		PagesModel<ComplUserReq, ComplUserRes> pagesModel = new PagesModel<>(complUserReq);
		this.setPagesToModel(pagesModel, complUserReq);
		pagesModel.setOrderBy("id asc");
		iComplaintService.selectUsers(pagesModel);
		map.put("pagesModel", pagesModel);
		return "complaints/user/select";
	}
	
	/**
	  * 条件查询用户
	 * @param pagesModel
	 * @param condition
	 * @param complUserReq
	 */
	@RequestMapping("/selectUsersByCondition")
	@ResponseBody
	public PagesModel<ComplUserReq, ComplUserRes> selectUsersByCondition(
			PagesModel<ComplUserReq, ComplUserRes> pagesModel,
			@RequestParam("condition") String condition, ComplUserReq complUserReq) {
		this.setPagesToModel(pagesModel, complUserReq);
		pagesModel.setOrderBy("id asc");
		iComplaintService.selectComplUsersByCondition(condition, pagesModel);
		return pagesModel;
	}
	
}
