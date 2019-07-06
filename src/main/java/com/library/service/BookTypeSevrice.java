package com.library.service;

import java.util.List;

import com.library.bean.BookType;

public interface BookTypeSevrice {

	public List<BookType> selAll();
	public BookType selByName(String typeName);
	public void deleteByUuid(String uuid);
	public void insert(String uuid,String typeName,int days);
}
