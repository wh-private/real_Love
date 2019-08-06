package com.neuedu.model.mapper;

import java.util.List;

import com.neuedu.model.bean.Image;

public interface ImageMapper {

	//根据id查询用户的图片
	public List<Image> selectImageById(int uid);
	
}
