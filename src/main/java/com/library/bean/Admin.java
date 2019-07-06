package com.library.bean;

public class Admin {
	private String uuid;
	private String account;
	private String pwd;
	private String name;
	private String sex;
	private String idNo;
	private String tel;
	public Admin(String uuid, String account, String pwd, String name, String sex, String idNo, String tel) {
		super();
		this.uuid = uuid;
		this.account = account;
		this.pwd = pwd;
		this.name = name;
		this.sex = sex;
		this.idNo = idNo;
		this.tel = tel;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getIdNo() {
		return idNo;
	}
	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	@Override
	public String toString() {
		return "Admin [uuid=" + uuid + ", account=" + account + ", pwd=" + pwd + ", name=" + name + ", sex=" + sex
				+ ", idNo=" + idNo + ", tel=" + tel + "]";
	}
}
