package com.neuedu.model.mapper;

import com.neuedu.model.bean.Details;

public interface DetailsMapper {
	//����uid��ѯ��ϸ��Ϣ
	public Details selectDetailsById(int uid);
	//����
	public void addHot();
	//ȡ������
	public void cancelHot();
}
