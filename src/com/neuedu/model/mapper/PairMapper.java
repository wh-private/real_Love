package com.neuedu.model.mapper;

import java.util.Map;

import com.neuedu.model.bean.Pair;


public interface PairMapper {

	//请求牵线
	public void requestMatch(Map<String,Object> map);
	//查询牵线
	public Pair selectMatch(Map<String,Object> map);
}
