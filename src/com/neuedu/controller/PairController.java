package com.neuedu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neuedu.model.service.PairService;

@Controller
public class PairController {

	@Autowired
	private PairService pairService;
	@RequestMapping("requestMatch/{myid}/{uid}")
	@ResponseBody
	public String requestMatch(@PathVariable int myid,@PathVariable int uid){
		String str = pairService.requestMatch(myid, uid);
		return "{\"result\":\""+str+"\"}";
	}
}
