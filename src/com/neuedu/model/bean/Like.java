package com.neuedu.model.bean;
public class Like {
	private int id;
	private int initiativeid;//主动
	private int passiveid;//被动
	private User user;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIntiativeid() {
		return initiativeid;
	}
	public void setIntiativeid(int intiativeid) {
		this.initiativeid = intiativeid;
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
