package com.neuedu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neuedu.model.bean.User;
import com.neuedu.model.service.ServiceStar;

@Controller
public class ControllerDetails {
@Autowired
private ServiceStar serviceStar;
@RequestMapping("selectStar")
@ResponseBody
public  List<User> selectHots(){

	return serviceStar.selectHots();
	
}
	
}
