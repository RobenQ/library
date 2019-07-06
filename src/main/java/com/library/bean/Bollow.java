package com.library.bean;

import java.sql.Date;

public class Bollow {
	private String uuid;
	private User userId;
	private Book bookUuid;
	private Date outTime;
	private Date shouldTime;
	private Date factTime;
	public Date getFactTime() {
		return factTime;
	}
	public void setFactTime(Date factTime) {
		this.factTime = factTime;
	}
	private boolean isReturn;
	public Bollow() {
		super();
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public User getUserId() {
		return userId;
	}
	public void setUserId(User userId) {
		this.userId = userId;
	}
	public Book getBookUuid() {
		return bookUuid;
	}
	public void setBookUuid(Book bookUuid) {
		this.bookUuid = bookUuid;
	}
	public Date getOutTime() {
		return outTime;
	}
	public void setOutTime(Date outTime) {
		this.outTime = outTime;
	}
	public Date getShouldTime() {
		return shouldTime;
	}
	public void setShouldTime(Date shouldTime) {
		this.shouldTime = shouldTime;
	}
	public boolean isReturn() {
		return isReturn;
	}
	public void setReturn(boolean isReturn) {
		this.isReturn = isReturn;
	}
	@Override
	public String toString() {
		return "Bollow [uuid=" + uuid + ", userId=" + userId + ", bookUuid=" + bookUuid + ", outTime=" + outTime
				+ ", shouldTime=" + shouldTime + ", factTime=" + factTime + ", isReturn=" + isReturn + "]";
	}
}
