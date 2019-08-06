package com.neuedu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neuedu.model.bean.User;
import com.neuedu.model.service.UserService;


@Controller
//@RequestMapping("html/")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@ResponseBody
	@RequestMapping("selectUserById/{uid}")
	public User selectUserById(@PathVariable int uid){
		User user = userService.selectUserById(uid);
		return user;
	}
	
	@ResponseBody
	@RequestMapping("selectSimilar/{birthyear}/{bodyheight}/{uid}")
	public List<User> selectSimilar(@PathVariable int birthyear,@PathVariable int bodyheight,@PathVariable int uid){
		List<User> list = userService.selectSimilar(birthyear, bodyheight,uid);
		return list;
	}
	
	
	
	
	
}
