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
import com.jiabian.dada.request.ScoreReq;
import com.jiabian.dada.response.ScoreRes;

@Controller
@RequestMapping("/score")
public class ScoreController extends BaseController<ScoreReq, ScoreRes> {

	@Autowired
	private IDadaService iDadaService;
	
	/**
	 * 根据id查询
	 * @param map
	 * @param scoreReq
	 * @param id
	 * @return
	 */
	@RequestMapping("/getScore")
	public String selectScoreById(ModelMap map, ScoreReq scoreReq, @RequestParam("id") Long id) {
		PagesModel<ScoreReq, ScoreRes> pagesModel = new PagesModel<>(scoreReq);
		DadaUser user = iDadaService.selectDadaUser(id);
		this.setPagesToModel(pagesModel, scoreReq);
		pagesModel.setOrderBy("id desc");
		iDadaService.selectScoreById(id, pagesModel);
		map.put("user", user);
		map.put("pagesModel", pagesModel);
		return "dada/score/acquire";
	}
	
}
