package com.neuedu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import com.neuedu.model.bean.User;
import com.neuedu.model.service.ServiceLike;

@Controller
public class ControllerLike {
     //Ò»¼üÖÓÇé\
	
	@Autowired
	private ServiceLike servicelike;
	
	@RequestMapping("selectVs")
	@ResponseBody
	public List<User> selectVs(){
		return servicelike.selectVs();
	
		
	}
}
