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
	//��ȡ��ǰʱ��
	  //����һ����ʽ
			//SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
			//����  utli��
			//Date now =new Date();
			/*String newtime = format.format(now); 
	         //��utilת��sql��   ������κ�����,��getime,ת��������sql
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
