package com.neuedu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neuedu.model.bean.Image;
import com.neuedu.model.service.ImageService;

@Controller
public class ImageController {
	
	@Autowired
	private ImageService imageService;
	
	@RequestMapping("selectImageById/{uid}")
	@ResponseBody
	public List<Image> selectImageById(@PathVariable int uid){
		return imageService.selectImageById(uid);
	}
	
}
