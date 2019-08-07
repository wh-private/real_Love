package com.neuedu.model.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.model.mapper.MessageMapper;

@Service
public class MessageService {
	@Autowired
	private MessageMapper messageMapper;
	
	public String sendHi(int myid,int uid){
		String str = "一直发消息会很招人烦的哦~";
		Map<String,Object> map = new HashMap<>(); 
		map.put("k_myid", myid);
		map.put("k_uid", uid);
		map.put("k_contents", "Hi,我对你很感兴趣，方便认识一下吗？");
		if(messageMapper.selectHi(map)==null){
			messageMapper.sendHi(map);
			str = "已成功搭讪";
		}
		return str;
	}
}
