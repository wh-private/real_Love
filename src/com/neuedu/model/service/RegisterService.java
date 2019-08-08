package com.neuedu.model.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.model.bean.User;
import com.neuedu.model.mapper.RegisterMapper;

@Service
public class RegisterService {

	@Autowired
	private RegisterMapper registerMapper;
	
	public void saveuser(User user) {
	
		registerMapper.saveuser(user);

	}

}
