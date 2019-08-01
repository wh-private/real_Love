package com.neuedu.model.bean;

import java.sql.Timestamp;

public class Vip {
	// Vip±í
	private int vid;
	private String vipname;
	private int vippirce;
	private Timestamp viptime;
	
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public String getVipname() {
		return vipname;
	}
	public void setVipname(String vipname) {
		this.vipname = vipname;
	}
	public int getVippirce() {
		return vippirce;
	}
	public void setVippirce(int vippirce) {
		this.vippirce = vippirce;
	}
	public Timestamp getViptime() {
		return viptime;
	}
	public void setViptime(Timestamp viptime) {
		this.viptime = viptime;
	}

	
}
