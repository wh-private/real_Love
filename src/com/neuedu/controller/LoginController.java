package com.neuedu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neuedu.model.bean.User;
import com.neuedu.model.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;
	
	@RequestMapping("loginController")
	@ResponseBody
	public String login(String account,String password){
		User user = new User();
		user.setAccount(account);
		user.setPassword(password);
		String str = "";
		if(loginService.logincheck(user) != null){
			str = "{\"result\":\"1\"}";	
		}
	    else{
	    	str = "{\"result\":\"0\"}";
	    }
		return str;
	}


}
