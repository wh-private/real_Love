package com.neuedu.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neuedu.model.service.Servicemessage;

@Controller
public class Controllermessage {
    @Autowired
	private Servicemessage servicemessage;
	@RequestMapping("saveGreetings")
	@ResponseBody
	public String saveGreetings(int Greetings,int initiativeid){
		servicemessage.saveGreetings(Greetings, initiativeid);
		
		return "{\"Greetingsinitial\":\"已经和心仪的人打招呼了\"}";
		
	}
	
}
