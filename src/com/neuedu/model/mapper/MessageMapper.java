package com.neuedu.model.mapper;

import java.util.Map;

import com.neuedu.model.bean.Message;

public interface MessageMapper {

	public void sendHi(Map<String,Object> map);
	
	public Message selectHi(Map<String,Object> map);
}
