package com.neuedu.model.mapper;

import java.util.List;
import java.util.Map;
import com.neuedu.model.bean.User;

public interface UserMapper {
	//����id��ѯ�û�������Ϣ
	public User selectUserById(int uid);
	//������������������ ���˶�
	public List<User> selectSimilar(Map<String,Object> map);
	
}
