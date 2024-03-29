package com.neuedu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.neuedu.model.bean.Details;
import com.neuedu.model.service.DetailsService;

@Controller
public class DetailsController {

	@Autowired
	private DetailsService detailsService;
	
	@ResponseBody
	@RequestMapping("selectDetailsById/{uid}")
	public Details selectDetailsById(@PathVariable int uid){
		return detailsService.selectDetailsById(uid);
	}
	
	@RequestMapping("addHot/{myid}/{uid}")
	@ResponseBody
	public String addHot(@PathVariable int myid,@PathVariable int uid){
		String str = detailsService.addHot(myid, uid);
		return "{\"result\":\""+str+"\"}";
	}
	
	@RequestMapping("cancelHot/{myid}/{uid}")
	@ResponseBody
	public String cancelHot(@PathVariable int myid,@PathVariable int uid){
		String str = detailsService.cancelHot(myid, uid);
		return "{\"result\":\""+str+"\"}";
	}
}
