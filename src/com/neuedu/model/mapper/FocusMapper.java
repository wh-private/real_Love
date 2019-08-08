package com.neuedu.model.mapper;

import java.util.Map;

import com.neuedu.model.bean.Focus;

public interface FocusMapper {

	public void addFocus(Map<String,Object> map);
	
	public Focus selectFocus(Map<String,Object> map);
	
	//在对方消息表中添加关注提示消息；
	public void addMessageForYou(Map<String,Object> map);
	
}
