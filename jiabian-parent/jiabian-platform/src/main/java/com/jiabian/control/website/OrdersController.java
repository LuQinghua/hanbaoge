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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jiabian.base.PagesModel;
import com.jiabian.base.control.BaseController;
import com.jiabian.hotel.request.OrdersReq;
import com.jiabian.hotel.response.OrdersRes;
import com.jiabian.util.Result;
import com.jiabian.website.IWebsiteServiceBiz;

@Controller
@RequestMapping("/orders")
public class OrdersController extends BaseController<OrdersReq, OrdersRes> {

private static final Logger logger = LogManager.getLogger(UserController.class.getName());
	
	@Autowired
	private IWebsiteServiceBiz lwebsiteServiceBiz;
	
	/**
	 * 后台查询订单列表
	 * @param map
	 * @param ordreReq
	 * @return
	 */
	@RequestMapping("/orderList")
	public String selectOrders(ModelMap map, OrdersReq ordersReq) {
		PagesModel<OrdersReq, OrdersRes> pagesModel = new PagesModel<>(ordersReq);
		this.setPagesToModel(pagesModel, ordersReq);
		pagesModel.setOrderBy("id asc");
		lwebsiteServiceBiz.selectOrders(pagesModel);
		map.put("pagesModel", pagesModel);
		return "hotel/orders/select";
	}
	/**
	 * 删除
	 * @param ordersReq
	 * @return res
	 */
	@RequestMapping("/deleteOrder")
	@ResponseBody
	public Result<Boolean> deleteOrder(OrdersReq ordersReq) {
		Result<Boolean> res = new Result<>();
		Integer result = lwebsiteServiceBiz.deleteOrder(ordersReq);
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
	/**
	 * 批量删除
	 * @param idList
	 * @return res
	 */
	@RequestMapping("deleteBatchOrders/{idList}")
	@ResponseBody
	public Result<Boolean> deleteBatchOrders(@PathVariable("idList") String idList){
		Result<Boolean> res = new Result<>();
		List<Long> ids = new ArrayList<>();
		if(!idList.contains("-")) {
			ids.add(Long.parseLong(idList));
		}else {
			String[] idStrs = idList.split("-");
			for(String s : idStrs) {
				ids.add(Long.parseLong(s));
			}
		}
		Integer result = lwebsiteServiceBiz.delBatchOrders(ids);
		String message;
		if(result > 0) {
			message="操作成功！";
			res.setData(true);
		}else {
			message = "操作失败！";
			res.setData(false);
		}
		res.setDesc(message);
		return res;
	}
	@RequestMapping("/selecOrdersByCondition")
	@ResponseBody
	public PagesModel<OrdersReq, OrdersRes> selecOrdertByCondition(
			@RequestParam("orderCode") String orderCode,
			@RequestParam("condition") String condition,
			OrdersReq ordersReq, ModelMap map
	) {
		PagesModel<OrdersReq,OrdersRes> pagesModel = new PagesModel<>(ordersReq);
		this.setPagesToModel(pagesModel, ordersReq);
		lwebsiteServiceBiz.selectOrdersByCondition(orderCode, condition, pagesModel);
		map.put("pagesModel", pagesModel);
		return pagesModel;
	}
}
