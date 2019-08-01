package com.neuedu.model.bean;

import java.sql.Timestamp;

public class Visitrecord {
	//访问记录表，谁看过我，我看过谁
	private int id;
	private int initiativeid;//主动的
	private int passiveid;//被动的
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
