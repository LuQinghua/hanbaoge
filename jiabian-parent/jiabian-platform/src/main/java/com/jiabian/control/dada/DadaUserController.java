package com.jiabian.control.dada;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jiabian.base.PagesModel;
import com.jiabian.base.control.BaseController;
import com.jiabian.dada.IDadaService;
import com.jiabian.dada.request.DadaUserReq;
import com.jiabian.dada.response.DadaUserRes;

@Controller
@RequestMapping("/dadaUser")
public class DadaUserController extends BaseController<DadaUserReq, DadaUserRes> {

	@Autowired
	private IDadaService iDadaService;
	
	/**
	 * 后台查询用户列表
	 * @param map
	 * @param dadaUserReq
	 * @return
	 */
	@RequestMapping("/userList")
	public String selectUsers(ModelMap map, DadaUserReq dadaUserReq) {
		PagesModel<DadaUserReq, DadaUserRes> pagesModel = new PagesModel<>(dadaUserReq);
		this.setPagesToModel(pagesModel, dadaUserReq);
		pagesModel.setOrderBy("id asc");
		iDadaService.selectDadaUsers(pagesModel);
		map.put("pagesModel", pagesModel);
		return "dada/user/select";
	}
	
	/**
	 * 条件查询用户
	 * @param dadaUserReq
	 * @param condition
	 * @param map
	 * return
	 */
	@RequestMapping("/selectUsersByCondition")
	@ResponseBody
	public PagesModel<DadaUserReq, DadaUserRes> selectUsersByCondition(
			@RequestParam("condition") String condition, DadaUserReq dadaUserReq, ModelMap map) {
		PagesModel<DadaUserReq, DadaUserRes> pagesModel = new PagesModel<>(dadaUserReq);
		this.setPagesToModel(pagesModel, dadaUserReq);
		pagesModel.setOrderBy("id asc");
		iDadaService.selectDadaUsersByCondition(condition,pagesModel);
		map.put("pagesModel", pagesModel);
		return pagesModel;
	}
}
