package com.neuedu.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.model.bean.User;
import com.neuedu.model.mapper.MapperStar;

@Service
public class ServiceStar {
     @Autowired
     private MapperStar mapperStar;
	public  List<User> selectHots(){	
		return mapperStar.selectHots();
	}
	
}
