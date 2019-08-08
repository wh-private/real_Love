package com.neuedu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neuedu.model.service.Servicefocid;

@Controller
public class Controllerfocid {
	@Autowired
	private Servicefocid servicefocid;
	@RequestMapping("saveAttention")
	@ResponseBody
	public String saveAttention(int focidLike, int userids) {
		servicefocid.saveAttention(focidLike, userids);
		//System.out.println(focidLike+"===================================="+userids);
		return "{\"Attention\":\"��ע�ɹ�,С��ף������ǣ�ֳɹ�\"}";

	}
	@RequestMapping("delectAttention")
	@ResponseBody
	public String delectAttention(int UnfriendedLike, int userids) {
		servicefocid.delectAttention(UnfriendedLike, userids);
		System.out.println(UnfriendedLike+"============================="+userids);
		return "{\"Attentioncancel\":\"ȡ����ע,С���ᱼ\"}";

	}
}
