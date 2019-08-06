package com.neuedu.model.mapper;

import java.util.List;
import java.util.Map;
import com.neuedu.model.bean.User;

public interface UserMapper {
	//根据id查询用户基本信息
	public User selectUserById(int uid);
	//根据年龄和身高找相似 的人儿
	public List<User> selectSimilar(Map<String,Object> map);
	
}
