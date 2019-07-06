package com.library.serviceimpl;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.bean.Appointment;
import com.library.mapper.AppointmentMapper;
import com.library.service.AppointmentService;

@Service
public class AppointmentServiceImpl implements AppointmentService{

	@Autowired
	private AppointmentMapper appointmentMapper;

	@Override
	public void insert(String uuid,String userId,String bookUuid,Date appointmentTime) {
		appointmentMapper.insert(uuid,userId,bookUuid,appointmentTime);
	}

	@Override
	public List<Appointment> selAll() {
		return appointmentMapper.selAll();
	}

	@Override
	public void deleteByUuid(String uuid) {
		appointmentMapper.deleteByUuid(uuid);
	}

	@Override
	public Appointment selByUuid(String uuid) {
		return appointmentMapper.selByUuid(uuid);
	}

	@Override
	public List<Appointment> selByReaderId(String readerId) {
		return appointmentMapper.selByReaderId(readerId);
	}
}
