package com.jiabian.control.website;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jiabian.beans.basic.hotel.Company;
import com.jiabian.util.Result;
import com.jiabian.website.IWebsiteServiceBiz;

@Controller
@RequestMapping("/company")
public class CompanyController {

	@Autowired
	private IWebsiteServiceBiz lwebsiteServiceBiz;
	
	@RequestMapping("/companyInfo")
	public String getCompanyInfo(ModelMap map) {
		Company companyInfo = lwebsiteServiceBiz.selectCompanyInfo();
		map.put("companyInfo", companyInfo);
		return "hotel/about";
	}
	
	@RequestMapping("/updateInfo")
	@ResponseBody
	public Result<Boolean> updateInfo(Company company) {
		Result<Boolean> res = new Result<Boolean>();
		Integer result = lwebsiteServiceBiz.updateCompanyInfo(company);
		//System.out.println(company.getIntroduce());
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
