package com.library.service;

import java.sql.Date;

import com.library.bean.LibraryMsg;

public interface LibraryMsgService {
	public LibraryMsg selLibraryMsg();
	public void deleteLibraryMsg();
	public void insertLibraryMsg(String name, String tel, String adress, Date buildTime, String msg);
}
