package com.neuedu.model.bean;

public class Pair {
	//Æ¥Åä±í
	private int id;
	private int intiativeid;
	private int passiveid;
	private int status;
	private User user;
	
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
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
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	

}
