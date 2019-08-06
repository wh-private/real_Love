package com.neuedu.model.mapper;

import com.neuedu.model.bean.Details;

public interface DetailsMapper {
	//根据uid查询详细信息
	public Details selectDetailsById(int uid);

}
