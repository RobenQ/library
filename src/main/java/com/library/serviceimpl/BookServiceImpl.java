package com.library.serviceimpl;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.bean.Book;
import com.library.mapper.BookMapper;
import com.library.service.BookService;

@Service
public class BookServiceImpl implements BookService{
	@Autowired
	private BookMapper bookMapper;

	@Override
	public List<Book> selAll() {
		return bookMapper.selAll();
	}

	@Override
	public List<Book> selByBookName(String bookName) {
		return bookMapper.selByBookName(bookName);
	}

	@Override
	public List<Book> selByBookType(String bookType) {
		return bookMapper.selByBookType(bookType);
	}

	@Override
	public List<Book> selByBookAuthor(String bookAuthor) {
		return bookMapper.selByBookAuthor(bookAuthor);
	}

	@Override
	public List<Book> selByBookIsbn(String bookIsbn) {
		return bookMapper.selByBookIsbn(bookIsbn);
	}

	@Override
	public List<Book> selByBookPublish(String bookPublish) {
		return bookMapper.selByBookPublish(bookPublish);
	}

	@Override
	public Book selByUuid(String uuid) {
		return bookMapper.selByUuid(uuid);
	}

	@Override
	public void deleteByUuid(String uuid) {
		bookMapper.deleteByUuid(uuid);
	}

	@Override
	public void insertBook(String uuid, String bookType, String bookName, String author, String translator,
			String publish, String isbn, float price, String bookCase, Date inTime, int page, int num) {
		bookMapper.insertBook(uuid, bookType, bookName, author, translator, publish, isbn, price, bookCase, inTime, page, num);
	}

	@Override
	public Book selByBookIsbn2(String bookIsbn) {
		return bookMapper.selByBookIsbn2(bookIsbn);
	}

	@Override
	public void addBook(String isbn, Date inTime, int num) {
		bookMapper.addBook(isbn, inTime, num);
	}

	@Override
	public void updateNum(String uuid) {
		bookMapper.updateNum(uuid);
	}
}
