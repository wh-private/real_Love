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
		String str = "���Ѿ����͹�������Ϣ�ˣ������ĵȴ����Ƕ���Ĵ���";
		Map<String,Object> map = new HashMap<>();
		map.put("k_myid", myid);
		map.put("k_uid", uid);
		if(pairMapper.selectMatch(map)==null){
			pairMapper.requestMatch(map);
			str = "����ǣ����Ϣ�ѳɹ��ʹ�";
		}
		return str;
	}
}
