
package com.neuedu.model.mapper;

import java.util.List;

import com.neuedu.model.bean.Details;


public interface MapperDetails {
     //��������
	public  List<Details> selectHots();
	//����ϲ��
	public List<Details> selectGuessLike();
	
}
