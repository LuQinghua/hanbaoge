package com.jiabian.control.dada;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jiabian.beans.basic.dada.Homepage;
import com.jiabian.dada.IDadaService;
import com.jiabian.util.Result;

@Controller
@RequestMapping("/homepage")
public class HomepageController {
	
	@Autowired
	private IDadaService iDadaService;

	/**
	 * 后台查询首页图片
	 * @param map
	 * @return
	 */
	@RequestMapping("/detail")
	public String toHomepage(ModelMap map) {
		Homepage homepage = iDadaService.getHomepageInfo();
		map.put("homepage", homepage);
		return "dada/homeImg";
	}
	
	/**
	 * 更新首页图片
	 * @param homepage
	 * @return
	 */
	@RequestMapping("/updateHomepage")
	@ResponseBody
	public Result<Boolean> updateHomepage(Homepage homepage) {
		System.out.println(homepage.getId());
		System.out.println(homepage.getImgs());
		Result<Boolean> res = new Result<Boolean>();
		String message;
		Integer result = iDadaService.updateHomepageInfo(homepage);
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
