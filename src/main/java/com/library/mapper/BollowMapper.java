package com.library.mapper;

import java.sql.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import com.library.bean.Bollow;

@Component
public interface BollowMapper {
	public void insertBollow(@Param("uuid")String uuid,@Param("reader")String reader,@Param("bookUuid")String bookUuid,
			@Param("outTime")Date outTime,@Param("shouldTime")int shouldTime,@Param("factTime")Date factTime,@Param("isReture")boolean isReture);
	public List<Bollow> selByReaderId(@Param("readerId")String readerId);
	public List<Bollow> selByReaderId2(@Param("readerId")String readerId);
	public List<Bollow> selNoReturn();
	public List<Bollow> selYesReturn();
	public void updateReturned(@Param("uuid")String uuid);
	public Bollow selByUuid(@Param("uuid")String uuid);
	public List<Bollow> selAll();
}
