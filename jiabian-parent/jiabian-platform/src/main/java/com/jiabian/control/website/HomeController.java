package com.jiabian.control.website;

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
import com.jiabian.beans.basic.hotel.Classify;
import com.jiabian.hotel.request.HomeReq;
import com.jiabian.hotel.response.HomeRes;
import com.jiabian.util.Result;
import com.jiabian.website.IWebsiteServiceBiz;

@Controller
@RequestMapping("/home")
public class HomeController extends BaseController<HomeReq, HomeRes> {

	@Autowired
	private IWebsiteServiceBiz lwebsiteServiceBiz;
	
	/**
	 * 后台查询商品列表
	 * @param map
	 * @param homeReq
	 * @return
	 */
	@RequestMapping("/homeList")
	public String selectHomes(ModelMap map, HomeReq homeReq) {
		PagesModel<HomeReq, HomeRes> pagesModel = new PagesModel<HomeReq, HomeRes>(homeReq);
		this.setPagesToModel(pagesModel, homeReq);
		pagesModel.setOrderBy("id asc");
		lwebsiteServiceBiz.selectHomes(pagesModel);
		map.put("pagesModel", pagesModel);
		List<Classify> classifys = lwebsiteServiceBiz.getHomeClassifys();
		map.put("classifys", classifys);
		return "hotel/home/select";
	}
	/**
	 * 跳转添加页
	 * @return
	 */
	@RequestMapping("/toInsert")
	public String insertCase(ModelMap map){
		List<Classify> classifys = lwebsiteServiceBiz.getHomeClassifys();
		map.put("classifys", classifys);
		return "hotel/home/insert";
	}
	/**
	 * 添加
	 * @param userReq
	 * @return res
	 */
	@RequestMapping("/insertHome")
	@ResponseBody
	public Result<Boolean> insertUser(HomeReq homeReq) {
		Result<Boolean> res = new Result<>();
		Integer result = lwebsiteServiceBiz.insertHome(homeReq);
		String message;
		if(result > 0) {
			message = "操作成功";
			res.setData(true);
		}else {
			message = "操作失败";
			res.setData(false);
		}
		res.setDesc(message);
		return res;
	}
	/**
	 * 删除
	 * @param homeReq
	 * @return res
	 */
	@RequestMapping("/deleteHome")
	@ResponseBody
	public Result<Boolean> deleteHome(HomeReq homeReq) {
		Result<Boolean> res = new Result<Boolean>();
		Integer result = lwebsiteServiceBiz.deleteHome(homeReq);
		String message;
		if(result > 0) {
			message = "操作成功";
			res.setData(true);
		}else {
			message = "操作失败";
			res.setData(false);
		}
		res.setDesc(message);
		return res;
	}
	/**
	 * 批量删除
	 * @param idList
	 * @return res
	 */
	@RequestMapping("/delBatchHomes/{idList}")
	@ResponseBody
	public Result<Boolean> delBatch(@PathVariable("idList") String idList) {
		Result<Boolean> res = new Result<Boolean>();
		String message;
		List<Integer> ids = new ArrayList<>();
		if(!idList.contains("-")) {
			ids.add(Integer.parseInt(idList));
		}else {
			String[] idStrs = idList.split("-");
			for(String s : idStrs) {
				ids.add(Integer.parseInt(s));
			}
		}
		Integer result = lwebsiteServiceBiz.delBatchHomes(ids);
		if(result > 0) {
			message = "操作成功";
			res.setData(true);
		}else {
			message = "操作失败";
			res.setData(false);
		}
		res.setDesc(message);
		return res;
	}
	/**
	 * 根据条件查询
	 * @param name
	 * @param type
	 * @param price
	 * @param time
	 * @param homeReq
	 * @return
	 */
	@RequestMapping("/selectHomeByCondition")
	@ResponseBody
	public PagesModel<HomeReq, HomeRes> selectHomeByCondition(
			@RequestParam String name, @RequestParam Byte classifyId,
			@RequestParam String orderBy,
			HomeReq homeReq, ModelMap map
	) {
		PagesModel<HomeReq, HomeRes> pagesModel = new PagesModel<HomeReq, HomeRes>(homeReq);
		this.setPagesToModel(pagesModel, homeReq);
		lwebsiteServiceBiz.selectHomeByCondition(name, classifyId, orderBy, pagesModel);
		List<Classify> classifys = lwebsiteServiceBiz.getHomeClassifys();
		map.put("classifys", classifys);
		map.put("pagesModel", pagesModel);
		return pagesModel;
	}
	/**
	 * 根据id查询
	 * @param map
	 * @param homeReq
	 * @return
	 */
	@RequestMapping("/selectHomeById")
	public String selectHomeById(ModelMap map, HomeReq homeReq) {
		HomeReq result = lwebsiteServiceBiz.selectHomeById(homeReq.getId());
		if (result == null) {
			map.put("msg", "操作失败");
		}
		map.put("msg", "操作成功");
		map.put("result", result);
		List<Classify> classifys = lwebsiteServiceBiz.getHomeClassifys();
		map.put("classifys", classifys);
		return "hotel/home/update";
	}
	/**
	 * 根据id查询2
	 * @param map
	 * @param id
	 * @return
	 */
	@RequestMapping("/queryHomeById")
	@ResponseBody
	public HomeReq queryHomeById(ModelMap map, @RequestParam("id") Integer id) {
		HomeReq result = lwebsiteServiceBiz.selectHomeById(id);
		if (result == null) {
			map.put("msg", "操作失败");
		}
		map.put("msg", "操作成功");
		return result;
	}
	/**
	 * 保存修改信息
	 * @param homeReq
	 * @return
	 */
	@RequestMapping("/updateHome")
	@ResponseBody
	public Result<Boolean> updateHome(HomeReq homeReq) {
		Result<Boolean> res = new Result<Boolean>();
		Integer result = lwebsiteServiceBiz.updateHome(homeReq);
		String msg;
		if (result > 0) {
			msg = "操作成功!";
			res.setData(true);
		} else {
			msg = "操作失败!";
			res.setData(false);
		}
		res.setDesc(msg);
		return res;
	}
}
