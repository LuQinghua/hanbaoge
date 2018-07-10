package com.jiabian.control.website;


import javax.annotation.Resource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jiabian.base.PagesModel;
import com.jiabian.base.control.BaseController;
import com.jiabian.hotel.request.NewsReq;
import com.jiabian.hotel.response.NewsRes;
import com.jiabian.util.Result;
import com.jiabian.website.IWebsiteServiceBiz;


@Controller
@RequestMapping("/index")
public class NewsController extends BaseController<NewsReq, NewsRes> {
	
	private static final Logger logger = LogManager.getLogger(NewsController.class.getName());	
	
	@Resource 
	private IWebsiteServiceBiz lwebsiteServiceBiz;
	
	/**
	 * 后台查询新闻列表
	 * @param map
	 * @param newsReq
	 * @return
	 */
	@RequestMapping("/news")
	public String selectNews(ModelMap map,NewsReq newsReq){
		PagesModel<NewsReq,NewsRes> pagesModel =new PagesModel<NewsReq,NewsRes>(newsReq);
		this.setPagesToModel(pagesModel, newsReq);
		pagesModel.setOrderBy("id desc");
		lwebsiteServiceBiz.selectNews(pagesModel);
		map.put("pagesModel", pagesModel);
		return "hotel/news/select";
	}
	
	/**
	 * 跳转添加页
	 * @return
	 */
	@RequestMapping("/insert")
	public String insertCase(){
		return "hotel/news/insert";
	}
	
	/**
	 * 添加
	 * @param newsReq
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value ="/insertNews", method = RequestMethod.POST)
	public Result<Boolean> insertNews(NewsReq newsReq){
		Result<Boolean> res = new Result<Boolean>();
		Integer result = lwebsiteServiceBiz.insertNews(newsReq);
		String msg;
		if (result > 0) {
			msg = "操作成功";
			res.setData(true);
		} else {
			msg = "操作失败";
			res.setData(false);
		}
		res.setDesc(msg);
		return res;
	}
	/**
	 * 删除
	 * @param newsReq
	 * @return
	 */
	@RequestMapping("/delet")
	@ResponseBody
	public Result<Boolean> deletNews(NewsReq newsReq){
		Result<Boolean> res = new Result<Boolean>();
		Integer result = lwebsiteServiceBiz.deletNews(newsReq);
		String msg;
		if (result > 0) {
			msg = "操作成功";
			res.setData(true);
		} else {
			msg = "操作失败";
			res.setData(false);
		}
		res.setDesc(msg);
		return res;
	}
	/**
	 * 根据id查询
	 * @param map
	 * @param newsReq
	 * @return
	 */
	@RequestMapping("/selectIdNews")
	public String selectIdNews(ModelMap map , NewsReq newsReq){
		NewsReq result = lwebsiteServiceBiz.selectIdNews(newsReq.getId());
		if (result == null) {
			map.put("msg", "操作失败");
		}
		map.put("msg", "操作成功");
		map.put("result", result);
		return "hotel/news/update";
	}
	
	/**
	 * 保存修改信息
	 * @param newsReq
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/updatpNews")
	public Result<Boolean> updatpNews(NewsReq newsReq){
		Result<Boolean> res = new Result<Boolean>();
		Integer result = lwebsiteServiceBiz.updatpNews(newsReq);
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
