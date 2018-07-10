package com.jiabian.control.website;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jiabian.beans.basic.hotel.Equipment;
import com.jiabian.util.Result;
import com.jiabian.website.IWebsiteServiceBiz;

@Controller
@RequestMapping("/equip")
public class EquipmentController {

	@Autowired
	private IWebsiteServiceBiz lwebsiteServiceBiz;
	
	@RequestMapping("/getEquipmentsById")
	public String getEquipmentsById(ModelMap map, @RequestParam("id") Long id, @RequestParam("cname") String cname) {
		List<Equipment> equipList = lwebsiteServiceBiz.selectEquipmentsById(id);
		map.put("equips", equipList);
		map.put("cname", cname);
		map.put("cid", id);
		map.put("allEquips", lwebsiteServiceBiz.selectAllEquipments());
		return "hotel/equipment/select";
	}
	
	@RequestMapping("/addEquipment")
	@ResponseBody
	public Result<Boolean> addEquipment(Equipment equip) {
		Result<Boolean> res = new Result<Boolean>();
		System.out.println(equip.getName());
		Integer result = lwebsiteServiceBiz.insertEquipment(equip);
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
	
	@RequestMapping("/deleteEquipment")
	@ResponseBody
	public Result<Boolean> deleteEquipment(@RequestParam Long id) {
		Result<Boolean> res = new Result<Boolean>();
		Integer result = lwebsiteServiceBiz.deleteEquipment(id);
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
