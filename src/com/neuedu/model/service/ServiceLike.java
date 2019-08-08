package com.neuedu.model.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neuedu.model.bean.User;
import com.neuedu.model.mapper.MapperLike;

@Service
public class ServiceLike {
	@Autowired
	private MapperLike mapperLike;

	public List<User> selectVs() {
		return mapperLike.selectVs();

	}
	//��ϲ��
	public List<User> selectAlreadyLike(int uid){
		return mapperLike.selectAlreadyLike(uid);
		
	}
	
	//һ��ϲ���ĵ��
	//1
	public void insertLike(int clickfirst, int initiativeid){
    	//System.out.println("++++++++++++++++++++++++++++++="+clickfirst+initiativeid);
    	Map<String,Object> map=new HashMap<>();
    	int passiveid=clickfirst;
    	map.put("k_passiveid", passiveid);
    	map.put("k_initiativeid", initiativeid);
    	
    	mapperLike.insertLike(map);
		
	}
	//2
	public void insertLike2(int Liketwo, int initiativeid){
    	//System.out.println("++++++++++++++++++++++++++++++="+Liketwo+initiativeid);
    	Map<String,Object> map=new HashMap<>();
    	int passiveid=Liketwo;
    	map.put("k_passiveid", passiveid);
    	map.put("k_initiativeid", initiativeid);
    	
    	mapperLike.insertLike(map);
		
	}
	//һ�������ҳ
	
	/*public List<User> selectVssight(int pagenum){
		int pagesize=2;
		int count=mapperLike.selectCount();
		//��ѯ���ж���ҳ
		int Connum=0;
		if(count%pagesize==0){
			Connum=count/pagesize;
		}else{
			Connum=count/pagesize+1;
			
		}
		Map<String,Object> map=new HashMap();
		map.put("pagesize", pagesize);
		map.put("pagenumbegin", (pagenum-1)*pagesize);
		
		return mapperLike.selectVssight();
		
	}
	//��ҳ
	public int insertLimit(){
	     //���в��������
		int count=mapperLike.selectCount();
		//��ѯ���ж���ҳ
		int Connum=0;
		int pagesize=2;
		if(count%pagesize==0){
			Connum=count/pagesize;
		}else{
			Connum=count/pagesize+1;
			
		}
		return Connum;
		
	}
	*/
	public void insertGuessLike(int guessLike, int initiativeid){
    	//System.out.println("++++++++++++++++++++++++++++++="+Liketwo+initiativeid);
    	Map<String,Object> map=new HashMap<>();
    	int passiveid=guessLike;
    	map.put("k_passiveid", passiveid);
    	map.put("k_initiativeid", initiativeid);
    	
    	mapperLike.insertGuessLike(map);
		
	}
	
}
