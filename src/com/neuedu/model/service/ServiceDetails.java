package com.neuedu.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.model.bean.Details;
import com.neuedu.model.mapper.MapperDetails;

@Service
public class ServiceDetails {
     @Autowired
     private MapperDetails mapperStar;
	public  List<Details> selectHots(){	
		return mapperStar.selectHots();
	}
	//²ÂÄãÏ²»¶
	public List<Details> selectGuessLike(){
		return mapperStar.selectGuessLike();
		
	}
	
	
}
