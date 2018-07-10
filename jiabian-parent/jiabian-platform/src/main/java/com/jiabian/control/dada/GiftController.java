package com.jiabian.control.dada;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jiabian.beans.basic.dada.Gift;
import com.jiabian.dada.IDadaService;
import com.jiabian.util.Result;

@Controller
@RequestMapping("/gift")
public class GiftController {

	@Autowired
	private IDadaService iDadaService;
	
	/**
	 * 后台查询礼品列表
	 * @param map
	 * @return
	 */
	@RequestMapping("/giftList")
	public String selectGifts(ModelMap map) {
		List<Gift> res = iDadaService.selectGifts();
		map.put("res", res);
		return "dada/gift/select";
	}
	
	/**
	 * 添加跳转页
	 */
	@RequestMapping("/toInsert")
	public String toInsert() {
		return "dada/gift/insert";
	}
	
	/**
	 * 插入礼品信息
	 * @param gift
	 * @return res
	 */
	@RequestMapping("/insertGift")
	@ResponseBody
	public Result<Boolean> insertGift(Gift gift) {
		Result<Boolean> res = new Result<>();
		String message;
		Integer result = iDadaService.insertGift(gift);
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
	 * 删除礼品
	 * @param id
	 * @return res
	 */
	@RequestMapping("/deleteGift")
	@ResponseBody
	public Result<Boolean> deleteGift(@RequestParam("id") Long id){
		Result<Boolean> res = new Result<>();
		String message;
		Integer result = iDadaService.deleteGift(id);
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
	@RequestMapping("/selectGiftById")
	public String selectGiftById(ModelMap map, @RequestParam("id") Long id) {
		Gift gift = iDadaService.selectGiftById(id);
		map.put("result", gift);
		return "dada/gift/update";
	}
	
	/**
	 * 修改礼品信息
	 * @param gift
	 * @return res
	 */
	@RequestMapping("/updateGift")
	@ResponseBody
	public Result<Boolean> updateGift(Gift gift) {
		Result<Boolean> res = new Result<>();
		String message;
		Integer result = iDadaService.updateGift(gift);
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
