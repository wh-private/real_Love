package com.neuedu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import com.neuedu.model.bean.User;
import com.neuedu.model.service.ServiceLike;

@Controller
public class ControllerLike {
    @Autowired
	private ServiceLike servicelike;
	
	
    @RequestMapping("selectVs")
	@ResponseBody
    public List<User> selectVs() {
		return servicelike.selectVs();

	}
    
    
	//以喜欢的
	@RequestMapping("selectAlreadyLike/{uid}")
	@ResponseBody
	public List<User> selectAlreadyLike(@PathVariable int uid){
		/* Iterator<User> it = strList.iterator();
	        while (it.hasNext()) {
	            String str = (String) it.next();
	            System.out.println(str);
	        }*/
		System.out.println("======================================"+uid);
		return servicelike.selectAlreadyLike(uid);	
		
	}
	
	
	//一见钟情里点击喜欢
	//1
	@RequestMapping("insertLike")
	@ResponseBody
	public String insertLike(int clickfirst,int initiativeid){
		servicelike.insertLike(clickfirst, initiativeid);
		return "{\"results\":\"恭喜您,被爱神射中了哦\"}";	
		
	}
	
	@RequestMapping("insertLike2")
	@ResponseBody
	public String insertLike2(int Liketwo,int initiativeid){
		servicelike.insertLike2(Liketwo, initiativeid);
		return "{\"results\":\"恭喜您,被爱神射中了哦\"}";	
		
	}
	
	//猜你喜欢表里加人
	@RequestMapping("insertGuessLike")
	@ResponseBody
	public String insertGuessLike(int guessLike,int initiativeid){
		servicelike.insertGuessLike(guessLike, initiativeid);
		return "{\"resultss\":\"后宫+1,小爱会为您提供更多信息哦\"}";	
		
	}
	
	
}
