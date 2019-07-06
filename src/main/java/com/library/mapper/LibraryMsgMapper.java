package com.library.mapper;

import java.sql.Date;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import com.library.bean.LibraryMsg;

@Component
public interface LibraryMsgMapper {
	public LibraryMsg selLibraryMsg();
	public void deleteLibraryMsg();
	public void insertLibraryMsg(@Param("name")String name, @Param("tel")String tel, @Param("adress")String adress, 
			@Param("buildTime")Date buildTime, @Param("msg")String msg);
}
