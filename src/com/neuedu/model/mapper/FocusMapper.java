package com.neuedu.model.mapper;

import java.util.Map;

import com.neuedu.model.bean.Focus;

public interface FocusMapper {

	public void addFocus(Map<String,Object> map);
	
	public Focus selectFocus(Map<String,Object> map);
	
	//�ڶԷ���Ϣ������ӹ�ע��ʾ��Ϣ��
	public void addMessageForYou(Map<String,Object> map);
	
}
