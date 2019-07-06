package com.library.mapper;

import java.sql.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import com.library.bean.Appointment;

@Component
public interface AppointmentMapper {
	public void insert(@Param("uuid")String uuid,@Param("userId")String userId,@Param("bookUuid")String bookUuid,@Param("appointmentTime")Date appointmentTime);
	public List<Appointment> selAll();
	public void deleteByUuid(@Param("uuid")String uuid);
	public Appointment selByUuid(@Param("uuid")String uuid);
	public List<Appointment> selByReaderId(@Param("readerId")String readerId);
}
