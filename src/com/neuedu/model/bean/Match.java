package com.neuedu.model.bean;

public class Match {
	//Æ¥Åä±í
	private int id;
	private int intiativeid;
	private int passiveid;
	private String status;
	private User user;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIntiativeid() {
		return intiativeid;
	}
	public void setIntiativeid(int intiativeid) {
		this.intiativeid = intiativeid;
	}
	public int getPassiveid() {
		return passiveid;
	}
	public void setPassiveid(int passiveid) {
		this.passiveid = passiveid;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	

}
