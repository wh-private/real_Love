package com.neuedu.model.mapper;

import com.neuedu.model.bean.Details;

public interface DetailsMapper {
	//根据uid查询详细信息
	public Details selectDetailsById(int uid);
	//点赞
	public void addHot();
	//取消点赞
	public void cancelHot();
}
