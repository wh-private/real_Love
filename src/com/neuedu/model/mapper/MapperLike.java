package com.neuedu.model.mapper;

import java.util.List;
import java.util.Map;

import com.neuedu.model.bean.User;

public interface MapperLike {
     //��һ��ϲ��
	public List<User> selectVs();
	
	public List<User> selectAlreadyLike(int uid);
	
	//һ��ϲ�����
	//1
    public void insertLike(Map<String,Object> map);
    //2
    public void insertLike2(Map<String,Object> map);
		
	
    public void insertGuessLike(Map<String,Object> map);
    //��ѯ�ж�����
  /*  public int selectCount();
	//һ�������ѯ
    public List<User> selectVssight();*/
    
    //ȡ����ע
}
