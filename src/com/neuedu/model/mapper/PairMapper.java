package com.neuedu.model.mapper;

import java.util.Map;

import com.neuedu.model.bean.Pair;


public interface PairMapper {

	//����ǣ��
	public void requestMatch(Map<String,Object> map);
	//��ѯǣ��
	public Pair selectMatch(Map<String,Object> map);
}
