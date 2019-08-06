package com.neuedu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.neuedu.model.bean.Intention;
import com.neuedu.model.service.IntentionService;


@Controller
public class IntentionController {
	
	@Autowired
	private IntentionService intentionService;
	
	@RequestMapping("selectIntentionById/{uid}")
	@ResponseBody
	public Intention selectIntentionById(@PathVariable int uid){
		return intentionService.selectIntentionById(uid);
	}
}
