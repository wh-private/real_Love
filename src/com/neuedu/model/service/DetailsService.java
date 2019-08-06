package com.neuedu.model.service;

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
}
