package com.library.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.bean.BookType;
import com.library.mapper.BookTypeMapper;
import com.library.service.BookTypeSevrice;

@Service
public class BookTypeServiceImpl implements BookTypeSevrice{

	@Autowired
	private BookTypeMapper bookTypeMapper;

	@Override
	public List<BookType> selAll() {
		return bookTypeMapper.selAll();
	}

	@Override
	public BookType selByName(String typeName) {
		return bookTypeMapper.selByName(typeName);
	}

	@Override
	public void deleteByUuid(String uuid) {
		bookTypeMapper.deleteByUuid(uuid);
	}

	@Override
	public void insert(String uuid, String typeName, int days) {
		bookTypeMapper.insert(uuid, typeName, days);
	}
}
