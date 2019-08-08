package com.neuedu.model.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.model.mapper.Mappermessage;

@Service
public class Servicemessage {
	@Autowired
	private Mappermessage mappermessage;
public void saveGreetings(int Greetings,int initiativeid){
	Map<String,Object> map=new HashMap<>();
	int sendid=initiativeid;
	int receiveid=Greetings;
	//获取当前时间
	  //定义一个格式
			//SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
			//日期  utli包
			//Date now =new Date();
			/*String newtime = format.format(now); 
	         //把util转成sql包   是用入参毫秒数,用getime,转出来就是sql
			java.sql.Date newtime=new java.sql.Date(now.getTime());*/
			//System.out.println(now); 
	Date now = new Date(); 
	java.sql.Date sendtime=new java.sql.Date(now.getTime());
	//System.out.println("======================"+sqlDate);
	map.put("k_receiveid", receiveid);
	map.put("k_sendid", sendid);
	map.put("k_sendtime", sendtime);
	mappermessage.saveGreetings(map);
	
	}

}
