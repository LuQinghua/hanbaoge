package com.jiabian.control.dada;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jiabian.beans.basic.dada.Address;
import com.jiabian.beans.basic.dada.DadaUser;
import com.jiabian.dada.IDadaService;

@Controller
@RequestMapping("/address")
public class AddressController {

	@Autowired
	private IDadaService iDadaService;
	
	/**
	 * 根据id查询
	 * @param map
	 * @param id
	 * @return
	 */
	@RequestMapping("/getAddress")
	public String getAddress(@RequestParam("id") Long id, ModelMap map) {
		List<Address> res = iDadaService.selectAddressById(id);
		DadaUser user = iDadaService.selectDadaUser(id);
		map.put("user", user);
		map.put("res", res);
		return "dada/address/select";
	}
	
}
