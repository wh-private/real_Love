package com.neuedu.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.model.bean.User;
import com.neuedu.model.mapper.MapperLike;

@Service
public class ServiceLike {
	@Autowired
	private MapperLike mapperLike;

	public List<User> selectVs() {
		return mapperLike.selectVs();

	}
}
