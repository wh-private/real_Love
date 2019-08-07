package com.neuedu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neuedu.model.service.MessageService;

@Controller
public class MessageController {
	@Autowired
	private MessageService messageService;
	
	@RequestMapping("sendHi/{myid}/{uid}")
	@ResponseBody
	public String sendHi(@PathVariable int myid,@PathVariable int uid){
		String str = messageService.sendHi(myid, uid);
		return "{\"result\":\""+str+"\"}";
	}
}
