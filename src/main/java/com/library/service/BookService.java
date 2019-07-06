package com.library.service;

import java.sql.Date;
import java.util.List;

import com.library.bean.Book;

public interface BookService {
	public List<Book> selAll();
	public List<Book> selByBookName(String bookName);
	public List<Book> selByBookType(String bookType);
	public List<Book> selByBookAuthor(String bookAuthor);
	public List<Book> selByBookIsbn(String bookIsbn);
	public Book selByBookIsbn2(String bookIsbn);
	public List<Book> selByBookPublish(String bookPublish);
	public Book selByUuid(String uuid);
	public void deleteByUuid(String uuid);
	public void insertBook(String uuid, String bookType, String bookName, String author, String translator, String publish,
			String isbn, float price, String bookCase, Date inTime, int page, int num);
	public void addBook(String isbn,Date inTime,int num);
	public void updateNum(String uuid);
}
