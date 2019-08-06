package com.neuedu.model.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.model.bean.Details;
import com.neuedu.model.mapper.DetailsMapper;


@Service
public class DetailsService {
	@Autowired
	private DetailsMapper detailsMapper;
	
	public Details selectDetailsById(int uid){
		return detailsMapper.selectDetailsById(uid);
	}
	
	public String addHot(int myid,int uid){
		Map<String,Object> map = new HashMap<>();
		map.put("k_myid", myid);
		map.put("k_uid", uid);
		detailsMapper.addHot();
		//!!!!!!!!!!!!!!!!!!!!����Ϣ���������Ϣ������ӣ�
		return "���޳ɹ�";
	}
	
	public String cancelHot(int myid,int uid){
		Map<String,Object> map = new HashMap<>();
		map.put("k_myid", myid);
		map.put("k_uid", uid);
		detailsMapper.cancelHot();
		//!!!!!!!!!!!!!!!!!!!!����Ϣ���������Ϣ������ӣ�
		return "ȡ�����޳ɹ�";
	}
}
