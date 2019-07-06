package com.library.bean;

import java.sql.Date;

public class Appointment {
	private String uuid;
	private User userId;
	private Book bookUuid;
	private Date appointmentTime;
	public Appointment(String uuid, Date appointmentTime,User userId, Book bookUuid) {
		super();
		this.uuid = uuid;
		this.userId = userId;
		this.bookUuid = bookUuid;
		this.appointmentTime = appointmentTime;
	}
	public Appointment() {
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
	public Date getAppointmentTime() {
		return appointmentTime;
	}
	public void setAppointmentTime(Date appointmentTime) {
		this.appointmentTime = appointmentTime;
	}
	@Override
	public String toString() {
		return "Appointment [uuid=" + uuid + ", userId=" + userId + ", bookUuid=" + bookUuid + ", appointmentTime="
				+ appointmentTime + "]";
	}
}
