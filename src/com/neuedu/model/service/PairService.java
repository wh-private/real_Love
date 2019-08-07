package com.neuedu.model.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.model.mapper.PairMapper;
@Service
public class PairService {
	
	@Autowired
	private PairMapper pairMapper;	
	
	public String requestMatch(int myid,int uid){
		String str = "你已经发送过请求消息了，请耐心等待心仪对象的处理";
		Map<String,Object> map = new HashMap<>();
		map.put("k_myid", myid);
		map.put("k_uid", uid);
		if(pairMapper.selectMatch(map)==null){
			pairMapper.requestMatch(map);
			str = "请求牵线消息已成功送达";
		}
		return str;
	}
}
