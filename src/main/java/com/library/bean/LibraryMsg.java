package com.library.bean;

import java.sql.Date;

public class LibraryMsg {
	private String name;
	private String tel;
	String adress;
	Date buildTime;
	String msg;
	public LibraryMsg(String name, String tel, String adress, Date buildTime, String msg) {
		super();
		this.name = name;
		this.tel = tel;
		this.adress = adress;
		this.buildTime = buildTime;
		this.msg = msg;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public Date getBuildTime() {
		return buildTime;
	}
	public void setBuildTime(Date buildTime) {
		this.buildTime = buildTime;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	@Override
	public String toString() {
		return "LibraryMsg [name=" + name + ", tel=" + tel + ", adress=" + adress + ", buildTime=" + buildTime
				+ ", msg=" + msg + "]";
	}
}
