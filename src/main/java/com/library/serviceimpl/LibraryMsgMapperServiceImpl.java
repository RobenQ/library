package com.library.serviceimpl;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.bean.LibraryMsg;
import com.library.mapper.LibraryMsgMapper;
import com.library.service.LibraryMsgService;

@Service
public class LibraryMsgMapperServiceImpl implements LibraryMsgService{

	@Autowired
	private LibraryMsgMapper libraryMagMapper;
	
	@Override
	public LibraryMsg selLibraryMsg() {
		return libraryMagMapper.selLibraryMsg();
	}

	@Override
	public void deleteLibraryMsg() {
		libraryMagMapper.deleteLibraryMsg();
	}

	@Override
	public void insertLibraryMsg(String name, String tel, String adress, Date buildTime, String msg) {
		libraryMagMapper.insertLibraryMsg(name, tel, adress, buildTime, msg);
	}

}
