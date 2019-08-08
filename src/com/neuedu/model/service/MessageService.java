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
		String str = "һֱ����Ϣ������˷���Ŷ~";
		Map<String,Object> map = new HashMap<>(); 
		map.put("k_myid", myid);
		map.put("k_uid", uid);
		map.put("k_contents", "Hi,�Ҷ���ܸ���Ȥ��������ʶһ����");
		if(messageMapper.selectHi(map).size()==0){
			messageMapper.sendHi(map);
			str = "�ѳɹ���ڨ";
		}
		return str;
	}
	
	public String sendMessage(int myid,int uid,String content){
		String str = "��ÿ�η���Ϣ��ʱ��Ҫ������СʱŶ��";
		Map<String,Object> map = new HashMap<>();
		map.put("k_myid", myid);
		map.put("k_uid", uid);
		map.put("k_content", content);
		if(messageMapper.selectMessageTime(map)>=7200000){
			messageMapper.sendMessage(map);
			str = "��Ϣ���ͳɹ�";
		}
		return str;
	}
}
