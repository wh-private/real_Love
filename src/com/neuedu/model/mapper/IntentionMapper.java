package com.neuedu.model.mapper;

import com.neuedu.model.bean.Intention;

public interface IntentionMapper {
	
	//根据id查询择偶意向
	public Intention selectIntentionById(int uid);

}
