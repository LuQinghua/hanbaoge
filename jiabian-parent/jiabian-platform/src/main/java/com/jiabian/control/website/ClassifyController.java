package com.jiabian.control.website;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jiabian.beans.basic.hotel.Classify;
import com.jiabian.util.Result;
import com.jiabian.website.IWebsiteServiceBiz;

@Controller
@RequestMapping("/classify")
public class ClassifyController {

	@Autowired
	private IWebsiteServiceBiz lwebsiteServiceBiz;
	/**
	 * 后台查询商品类型列表
	 * @param map
	 * @param homeReq
	 * @return
	 */
	@RequestMapping("/classifyList")
	public String selectClassifies(ModelMap map) {
		List<Classify> classifyList = lwebsiteServiceBiz.getHomeClassifys();
		map.put("classifyList", classifyList);
		return "hotel/classify/select";
	}
	/**
	 * 删除
	 * @param classify
	 * @return res
	 */
	@RequestMapping("/deleteClassify")
	@ResponseBody
	public Result<Boolean> deleteClassify(Classify classify) {
		Result<Boolean> res = new Result<Boolean>();
		Integer result = lwebsiteServiceBiz.deleteClassify(classify);
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
	 * 跳转添加页
	 * @return
	 */
	@RequestMapping("/toInsert")
	public String toInsert() {
		return "hotel/classify/insert";
	}
	/**
	 * 添加
	 * @param classify
	 * @return res
	 */
	@RequestMapping("/insertClassify")
	@ResponseBody
	public Result<Boolean> insertClassify(Classify classify) {
		Result<Boolean> res = new Result<Boolean>();
		Integer result = lwebsiteServiceBiz.insertClassify(classify);
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
	 * 根据id查询
	 * @param map
	 * @param classify
	 * @return
	 */
	@RequestMapping("/selectClassifyById")
	public String selectClassifyById(ModelMap map, @RequestParam("id") Long id) {
		Classify result = lwebsiteServiceBiz.selectClassifyById(id);
		map.put("classify", result);
		return "hotel/classify/update";
	}
	/**
	 * 保存修改信息
	 * @param classify
	 * @return
	 */
	@RequestMapping("/updateClassify")
	@ResponseBody
	public Result<Boolean> updateClassify(Classify classify) {
		Result<Boolean> res = new Result<Boolean>();
		Integer result = lwebsiteServiceBiz.updateClassify(classify);
		String message;
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
}
