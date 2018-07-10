package com.jiabian.control.website;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jiabian.base.PagesModel;
import com.jiabian.base.control.BaseController;
import com.jiabian.hotel.request.UserReq;
import com.jiabian.hotel.response.UserRes;
import com.jiabian.util.Result;
import com.jiabian.website.IWebsiteServiceBiz;

@Controller
@RequestMapping("/users")
public class UserController extends BaseController<UserReq, UserRes> {

	private static final Logger logger = LogManager.getLogger(UserController.class.getName());
	
	@Autowired
	private IWebsiteServiceBiz lwebsiteServiceBiz;
	
	/**
	 * 后台查询用户列表
	 * @param map
	 * @param userReq
	 * @return
	 */
	@RequestMapping("/userList")
	public String selectUsers(ModelMap map, UserReq userReq) {
		PagesModel<UserReq, UserRes> pagesModel = new PagesModel<UserReq, UserRes>(userReq);
		this.setPagesToModel(pagesModel, userReq);
		pagesModel.setOrderBy("id asc");
		lwebsiteServiceBiz.selectUsers(pagesModel);
		map.put("pagesModel", pagesModel);
		return "hotel/users/select";
	}
	/**
	 * 跳转添加页
	 * @return
	 */
	/*@RequestMapping("/toInsert")
	public String insertCase(){
		return "hotel/users/insert";
	}*/
	/**
	 * 添加
	 * @param userReq
	 * @return res
	 */
	/*@RequestMapping(value="/addUser", method=RequestMethod.POST)
	@ResponseBody
	public Result<Boolean> insertUser(UserReq userReq) {
		Result<Boolean> res = new Result<>();
		Integer result = lwebsiteServiceBiz.insertUser(userReq);
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
	}*/
	/**
	 * 删除
	 * @param userReq
	 * @return res
	 */
	@RequestMapping("/deleteUser")
	@ResponseBody
	public Result<Boolean> deleteUser(UserReq userReq) {
		Result<Boolean> res = new Result<>();
		Integer result = lwebsiteServiceBiz.deleteUser(userReq);
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
	 * @param userReq
	 * @return res
	 */
	@RequestMapping(value="/delBatchUsers/{idList}")
	@ResponseBody
	public Result<Boolean> delBatchUsers(@PathVariable("idList") String idList) {
		Result<Boolean> res = new Result<>();
		String message;
		List<Integer> ids = new ArrayList<Integer>();
		if(idList.contains("-")) {
			String[] idStrs = idList.split("-");
			for(int i = 0; i < idStrs.length; i++) {
				ids.add(Integer.parseInt(idStrs[i]));
			}
		}else {
			ids.add(Integer.parseInt(idList));
		}
		Integer result = lwebsiteServiceBiz.delBatchUsers(ids);
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
	 * @param useranme
	 * @param telephone
	 * @param userReq
	 * @return
	 */
	@RequestMapping("/selecUsertByCondition")
	@ResponseBody
	public PagesModel<UserReq, UserRes> selectUserByCondition(
			@RequestParam String username, 
			@RequestParam String telephone,
			UserReq userReq
	) {
		PagesModel<UserReq, UserRes> result = new PagesModel<UserReq, UserRes>(userReq);
		this.setPagesToModel(result, userReq);
		result.setOrderBy("id asc");
		lwebsiteServiceBiz.selectUserByCondition(username, telephone, result);
		return result;
	}
	/**
	 * 根据id查询
	 * @param id
	 * @return
	 */
	@RequestMapping("/selectUserById")
	@ResponseBody
	public UserRes selectUserById(@RequestParam("id") Integer id) {
		UserRes userRes = lwebsiteServiceBiz.selectUserById(id);
		if(userRes == null) return new UserRes();
		return userRes;
	}
}
