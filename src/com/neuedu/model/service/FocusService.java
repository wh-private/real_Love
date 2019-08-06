package com.neuedu.model.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.model.mapper.FocusMapper;

@Service
public class FocusService {
	@Autowired
	private FocusMapper focusMapper;
	
	public String addFocus(int myid,int uid){
		String str = "��ϲ������ע�ɹ�";
		if(myid==uid){
			return "�޷���ע�Ķ��󣬴������-001";
		}
		Map<String,Object> map = new HashMap<>();
		map.put("k_myid", myid);
		map.put("k_uid",uid);
		//���жϹ�ע�Ƿ����
		if(focusMapper.selectFocus(map)==null){
			focusMapper.addFocus(map);
			focusMapper.addMessageForYou(map);
		}else{
			str = "��ע�Ѿ����������ظ�������";
		}
		return str;
	}
	
}
