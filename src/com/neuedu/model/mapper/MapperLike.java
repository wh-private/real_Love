package com.neuedu.model.mapper;

import java.util.List;
import java.util.Map;

import com.neuedu.model.bean.User;

public interface MapperLike {
     //查一键喜欢
	public List<User> selectVs();
	
	public List<User> selectAlreadyLike(int uid);
	
	//一键喜欢点击
	//1
    public void insertLike(Map<String,Object> map);
    //2
    public void insertLike2(Map<String,Object> map);
		
	
    public void insertGuessLike(Map<String,Object> map);
    //查询有多少条
  /*  public int selectCount();
	//一见钟情查询
    public List<User> selectVssight();*/
    
    //取消关注
}
