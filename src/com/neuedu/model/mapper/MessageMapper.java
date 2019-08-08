package com.neuedu.model.mapper;

import java.util.List;
import java.util.Map;

import com.neuedu.model.bean.Message;

public interface MessageMapper {

	public void sendHi(Map<String,Object> map);
	
	public List<Message> selectHi(Map<String,Object> map);
	
	public void sendMessage(Map<String,Object> map);
	
	public long selectMessageTime(Map<String,Object> map);
}
