package com.jiabian.control.dada;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jiabian.base.PagesModel;
import com.jiabian.base.control.BaseController;
import com.jiabian.beans.basic.dada.DadaNews;
import com.jiabian.dada.IDadaService;
import com.jiabian.dada.request.DadaNewsReq;
import com.jiabian.dada.response.DadaNewsRes;
import com.jiabian.util.Result;

@Controller
@RequestMapping("/dadaNews")
public class DadaNewsController extends BaseController<DadaNewsReq, DadaNewsRes> {

	@Autowired
	private IDadaService iDadaService;
	
	/**
	 * 后台查询新闻列表
	 * @param map
	 * @param dadaNewsReq
	 * @return
	 */
	@RequestMapping("/newsList")
	public String getNewsList(ModelMap map, DadaNewsReq dadaNewsReq) {
		PagesModel<DadaNewsReq, DadaNewsRes> pagesModel = new PagesModel<>(dadaNewsReq);
		this.setPagesToModel(pagesModel, dadaNewsReq);
		pagesModel.setOrderBy("id asc");
		iDadaService.selectDadaNews(pagesModel);
		map.put("pagesModel", pagesModel);
		return "dada/news/select";
	}
	
	/**
	 * 跳转添加页
	 * @return
	 */
	@RequestMapping("/toInsert")
	public String toInsert() {
		return "dada/news/insert";
	}
	
	/**
	 * 添加
	 * @param dadaNewsReq
	 * @return
	 */
	@RequestMapping("/insertNews")
	@ResponseBody
	public Result<Boolean> insertNews(DadaNewsReq dadaNewsReq) {
		Result<Boolean> res = new Result<Boolean>();
		String message;
		Integer result = iDadaService.insertNews(dadaNewsReq);
		if(result > 0) {
			message = "操作成功！";
			res.setData(true);
		}else {
			message = "操作失败！";
			res.setData(false);
		}
		res.setDesc(message);
		return res;
	}
	
	/**
	 * 删除
	 * @param dadaNewsReq
	 * @return
	 */
	@RequestMapping("/deleteNews")
	@ResponseBody
	public Result<Boolean> deleteNews(DadaNewsReq dadaNewsReq) {
		Result<Boolean> res = new Result<>();
		String message;
		Integer result = iDadaService.deleteNews(dadaNewsReq);
		if(result > 0) {
			message = "操作成功！";
			res.setData(true);
		}else {
			message = "操作失败！";
			res.setData(false);
		}
		res.setDesc(message);
		return res;
	}
	
	/**
	 * 根据id查询
	 * @param map
	 * @param id
	 * @return
	 */
	@RequestMapping("/selectNewsById")
	public String selectNewsById(ModelMap map, @RequestParam("id") Long id) {
		DadaNews dadaNews = iDadaService.selectDadaNewsById(id);
		map.put("result", dadaNews);
		return "dada/news/update";
	}
	/**
	 * 保存修改信息
	 * @param dadaNewsReq
	 * @return
	 */
	@RequestMapping("/updateNews")
	@ResponseBody
	public Result<Boolean> updateNews(DadaNewsReq dadaNewsReq) {
		Result<Boolean> res = new Result<>();
		String message;
		Integer result = iDadaService.updateDadaNews(dadaNewsReq);
		if(result > 0) {
			res.setData(true);
			message = "操作成功！";
		}else {
			res.setData(false);
			message = "操作失败！";
		}
		res.setDesc(message);
		return res;
	}
	/**
	 * 批量删除新闻
	 * @param idList
	 * @return
	 */
	@RequestMapping("/delBatchNews/{idList}")
	@ResponseBody
	public Result<Boolean> delBatchNews(@PathVariable("idList") String idList) {
		Result<Boolean> res = new Result<>();
		String message;
		List<Long> ids = new ArrayList<>();
		if(!idList.contains("-")) {
			ids.add(Long.parseLong(idList));
		}else {
			String[] idStrs = idList.split("-");
			for(String idStr : idStrs) {
				ids.add(Long.parseLong(idStr));
			}
		}
		Integer result = iDadaService.delBatchDadaNews(ids);
		if(result > 0) {
			res.setData(true);
			message = "操作成功！";
		}else {
			res.setData(false);
			message = "操作失败！";
		}
		res.setDesc(message);
		return res;
	}
}
