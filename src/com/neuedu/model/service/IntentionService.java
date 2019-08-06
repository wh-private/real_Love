package com.neuedu.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.neuedu.model.bean.Intention;
import com.neuedu.model.mapper.IntentionMapper;


@Service
public class IntentionService {
	
	@Autowired
	private IntentionMapper intentionMapper;
	
	public Intention selectIntentionById(int uid){
		return intentionMapper.selectIntentionById(uid);
	}
	
	
	
	
}
