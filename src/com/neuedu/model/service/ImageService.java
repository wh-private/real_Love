package com.neuedu.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.model.bean.Image;
import com.neuedu.model.mapper.ImageMapper;

@Service
public class ImageService {
	@Autowired
	private ImageMapper imageMapper;

	public List<Image> selectImageById(int uid){
		return imageMapper.selectImageById(uid);
	}
	
}
