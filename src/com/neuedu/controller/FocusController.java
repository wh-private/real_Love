package com.neuedu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neuedu.model.service.FocusService;

@Controller
public class FocusController {
	
	@Autowired
	private FocusService focusService;
	
	@RequestMapping("addFocus/{myid}/{uid}")
	@ResponseBody
	public String addFocus(@PathVariable int myid,@PathVariable int uid){
		String str = focusService.addFocus(myid, uid);
		return "{\"result\":\""+str+"\"}";
	}
}
