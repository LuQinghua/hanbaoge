package com.jiabian.control.tspt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jiabian.base.PagesModel;
import com.jiabian.base.control.BaseController;
import com.jiabian.beans.basic.complaints.Complaints;
import com.jiabian.tspt.IComplaintService;
import com.jiabian.tspt.request.ComplaintsReq;
import com.jiabian.tspt.response.ComplaintsRes;
import com.jiabian.util.Result;

@Controller
@RequestMapping("/complaints")
public class ComplaintController extends BaseController<ComplaintsReq, ComplaintsRes> {

	@Autowired
	private IComplaintService iComplaintService;
	
	/**
	 * 后台查询投诉列表
	 * @param map
	 * @param complaintReq
	 * @return
	 */
	@RequestMapping("/complaintList")
	public String selectCompliants(ModelMap map, ComplaintsReq complaintsReq) {
		PagesModel<ComplaintsReq, ComplaintsRes> pagesModel = new PagesModel<>(complaintsReq);
		this.setPagesToModel(pagesModel, complaintsReq);
		pagesModel.setOrderBy("id asc");
		iComplaintService.selectComplaints(pagesModel);
		map.put("pagesModel", pagesModel);
		return "complaints/compl/select";
	}
	
	/**
	  * 条件查询投诉单
	 * @param pagesModel
	 * @param condition
	 * @param complaintsReq
	 * @return
	 */
	@RequestMapping("/selectComplaintsByCondition")
	@ResponseBody
	public PagesModel<ComplaintsReq, ComplaintsRes> selectComplaintsByCondition(
			@RequestParam(value="condition",required=false) String condition, 
			PagesModel<ComplaintsReq, ComplaintsRes> pagesModel, ComplaintsReq complaintsReq) {
		//this.setPagesToModel(pagesModel, complaintsReq);
		pagesModel.setOrderBy("id asc");
		iComplaintService.selectComplaintsByCondition(condition, pagesModel);
		return pagesModel;
	}
	
	/**
	  * 审核投诉单
	 * @param status
	 * @param id
	 * @return
	 */
	@RequestMapping("/updateStatus")
	@ResponseBody
	public Result<Boolean> updateStatus(@RequestParam("status") Byte status, @RequestParam("id") Long id) {
		Complaints complaints = new Complaints();
		complaints.setId(id);
		complaints.setStatus(status);
		Result<Boolean> res = new Result<>();
		String message;
		Integer result = iComplaintService.updateComplaintStatus(complaints);
		if(result > 0) {
			message="操作成功！";
			res.setData(true);
		}else {
			message="操作失败！";
			res.setData(false);
		}
		res.setDesc(message);
		return res;
	}
}
