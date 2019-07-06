package com.library.service;

import java.sql.Date;
import java.util.List;

import com.library.bean.Appointment;

public interface AppointmentService {

	public void insert(String uuid,String userId,String bookUuid,Date appointmentTime);
	public List<Appointment> selAll();
	public void deleteByUuid(String uuid);
	public Appointment selByUuid(String uuid);
	public List<Appointment> selByReaderId(String readerId);
}
