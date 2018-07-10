package com.jiabian.control.dada;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jiabian.base.PagesModel;
import com.jiabian.base.control.BaseController;
import com.jiabian.beans.basic.dada.DadaUser;
import com.jiabian.dada.IDadaService;
import com.jiabian.dada.request.AwardReq;
import com.jiabian.dada.response.AwardRes;

@Controller
@RequestMapping("/award")
public class AwardController extends BaseController<AwardReq, AwardRes> {

	@Autowired
	private IDadaService iDadaService;
	
	/**
	 * 根据id查询
	 * @param map
	 * @param awardReq
	 * @param id
	 * @return
	 */
	@RequestMapping("/getAward")
	public String getAward(ModelMap map, AwardReq awardReq, @RequestParam(value="id") Long id) {
		DadaUser user = iDadaService.selectDadaUser(id);
		PagesModel<AwardReq, AwardRes> pagesModel = new PagesModel<AwardReq, AwardRes>(awardReq);
		this.setPagesToModel(pagesModel, awardReq);
		pagesModel.setOrderBy("id desc");
		iDadaService.selectAwardById(id, pagesModel);
		map.put("user", user);
		map.put("pagesModel", pagesModel);
		return "dada/score/consume";
	}
	
}
