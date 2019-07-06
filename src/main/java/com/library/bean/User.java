package com.library.bean;

import java.sql.Date;

public class User {
	private String id;
	private String account;
	private String pwd;
	private String name;
	private String sex;
	private String barcode;
	private String readType;
	private String tel;
	private String paperType;
	private String paperNo;
	private Date inTime;
	private String operator;
	private int num;
	private int bollowed;
	public User(String id, String account, String pwd, String name, String sex, String barcode, String readType,
			String tel, String paperType, String paperNo, Date inTime, String operator, int num, int bollowed) {
		super();
		this.id = id;
		this.account = account;
		this.pwd = pwd;
		this.name = name;
		this.sex = sex;
		this.barcode = barcode;
		this.readType = readType;
		this.tel = tel;
		this.paperType = paperType;
		this.paperNo = paperNo;
		this.inTime = inTime;
		this.operator = operator;
		this.num = num;
		this.bollowed = bollowed;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public String getBarcode() {
		return barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	public String getReadType() {
		return readType;
	}
	public void setReadType(String readType) {
		this.readType = readType;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getPaperType() {
		return paperType;
	}
	public void setPaperType(String paperType) {
		this.paperType = paperType;
	}
	public String getPaperNo() {
		return paperNo;
	}
	public void setPaperNo(String paperNo) {
		this.paperNo = paperNo;
	}
	public Date getInTime() {
		return inTime;
	}
	public void setInTime(Date inTime) {
		this.inTime = inTime;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getBollowed() {
		return bollowed;
	}
	public void setBollowed(int bollowed) {
		this.bollowed = bollowed;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", account=" + account + ", pwd=" + pwd + ", name=" + name + ", sex=" + sex
				+ ", barcode=" + barcode + ", readType=" + readType + ", tel=" + tel + ", paperType=" + paperType
				+ ", paperNo=" + paperNo + ", inTime=" + inTime + ", operator=" + operator + ", num=" + num
				+ ", bollowed=" + bollowed + "]";
	}
}
