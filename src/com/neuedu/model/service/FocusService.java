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
		String str = "恭喜您，关注成功";
		if(myid==uid){
			return "无法关注的对象，错误代码-001";
		}
		Map<String,Object> map = new HashMap<>();
		map.put("k_myid", myid);
		map.put("k_uid",uid);
		//先判断关注是否存在
		if(focusMapper.selectFocus(map)==null){
			focusMapper.addFocus(map);
			focusMapper.addMessageForYou(map);
		}else{
			str = "关注已经存在请勿重复操作！";
		}
		return str;
	}
	
}
