package com.neuedu.model.mapper;

import java.util.List;

import com.neuedu.model.bean.Image;

public interface ImageMapper {

	//����id��ѯ�û���ͼƬ
	public List<Image> selectImageById(int uid);
	
}
