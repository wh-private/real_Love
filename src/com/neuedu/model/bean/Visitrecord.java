package com.neuedu.model.bean;

import java.sql.Timestamp;

public class Visitrecord {
	//���ʼ�¼��˭�����ң��ҿ���˭
	private int id;
	private int initiativeid;//������
	private int passiveid;//������
	private Timestamp visitime;
	private User user;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getInitiativeid() {
		return initiativeid;
	}
	public void setInitiativeid(int initiativeid) {
		this.initiativeid = initiativeid;
	}
	public int getPassiveid() {
		return passiveid;
	}
	public void setPassiveid(int passiveid) {
		this.passiveid = passiveid;
	}
	public Timestamp getVisitime() {
		return visitime;
	}
	public void setVisitime(Timestamp visitime) {
		this.visitime = visitime;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
}
