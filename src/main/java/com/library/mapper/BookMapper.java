package com.library.mapper;

import java.sql.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import com.library.bean.Book;

@Component
public interface BookMapper {
	public List<Book> selAll();
	public List<Book> selByBookName(@Param("bookName")String bookName);
	public List<Book> selByBookType(@Param("bookType")String bookType);
	public List<Book> selByBookAuthor(@Param("bookAuthor")String bookAuthor);
	public List<Book> selByBookIsbn(@Param("bookIsbn")String bookIsbn);
	public Book selByBookIsbn2(@Param("bookIsbn")String bookIsbn);
	public List<Book> selByBookPublish(@Param("bookPublish")String bookPublish);
	public Book selByUuid(@Param("uuid")String uuid);
	public void deleteByUuid(@Param("uuid")String uuid);
	public void insertBook(@Param("uuid")String uuid, @Param("bookType")String bookType, @Param("bookName")String bookName,
			@Param("author")String author, @Param("translator")String translator, @Param("publish")String publish,
			@Param("isbn")String isbn, @Param("price")float price, @Param("bookCase")String bookCase, 
			@Param("inTime")Date inTime, @Param("page")int page, @Param("num")int num);
	public void addBook(@Param("isbn")String isbn,@Param("inTime")Date inTime,@Param("num")int num);
	public void updateNum(@Param("uuid")String uuid);
}
