package com.neuedu.model.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.model.bean.User;
import com.neuedu.model.mapper.UserMapper;
@Service
public class UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	public User selectUserById(int uid){
		return userMapper.selectUserById(uid);
	}
	
	public List<User> selectSimilar(int birthyear,int bodyheight,int uid){
		/*int[] arr = {(birthyear-3),(birthyear+3),(bodyheight-5),(bodyheight+5)};*/
		Map<String,Object> map = new HashMap<>();
		map.put("k_birthyear1", (birthyear-3)+"-01-01");
		map.put("k_birthyear2", (birthyear+3)+"-12-31");
		map.put("k_bodyheight1", (bodyheight-5));
		map.put("k_bodyheight2", (bodyheight+5));
		map.put("k_uid",uid);
		System.out.println(map.values()+"<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<  map.value()!!!!");
		return userMapper.selectSimilar(map);
		
	}

}
