package com.neuedu.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neuedu.model.bean.User;
import com.neuedu.model.service.RegisterService;


@Controller
public class RegisterController {
	
	@Autowired
	private RegisterService registerService;
	
	@RequestMapping("saveuserController")
	@ResponseBody
	public String saveuser(User user){
		registerService.saveuser(user);
		return "{\"result\":\"×¢²á³É¹¦\"}";
	}
}
