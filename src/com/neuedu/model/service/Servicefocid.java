package com.neuedu.model.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.model.mapper.Mapperfocid;

@Service

public class Servicefocid {
	@Autowired
	private Mapperfocid mapperfocid;
	public void saveAttention(int focidLike, int userids){
    	//System.out.println("++++++++++++++++++++++++++++++="+Liketwo+initiativeid);
    	Map<String,Object> map=new HashMap<>();
    	int focid=focidLike;
    	map.put("k_focid", focid);
    	map.put("k_userids", userids);
    	
    	mapperfocid.saveAttention(map);
		
	}
	public void delectAttention(int UnfriendedLike, int userids){
    	
    	Map<String,Object> map=new HashMap<>();
    	int focid=UnfriendedLike;
    	int userid=userids;
    	map.put("k_focid", focid);
    	map.put("k_userid", userid);
    	
    	mapperfocid.delectAttention(map);
		
	}
}
