package com.neuedu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neuedu.model.bean.Details;
import com.neuedu.model.service.ServiceDetails;

@Controller
public class ControllerDetails {
@Autowired
private ServiceDetails serviceStar;
@RequestMapping("selectStar")
@ResponseBody
public  List<Details> selectHots(){
	return serviceStar.selectHots();
	
}
	

@RequestMapping("selectGuessLike")
@ResponseBody
public List<Details> selectGuessLike(){
	return serviceStar.selectGuessLike();
	
}

}
