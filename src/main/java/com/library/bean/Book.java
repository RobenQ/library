package com.library.bean;

import java.sql.Date;

public class Book {
	private String uuid;
	private String bookType;
	private String bookName;
	private String author;
	private String translator;
	private String publish;
	private String isbn;
	private float price;
	private String bookCase;
	private Date inTime;
	private int page;
	private int num;
	public Book(String uuid, String bookType, String bookName, String author, String translator, String publish,
			String isbn, float price, String bookCase, Date inTime, int page, int num) {
		super();
		this.uuid = uuid;
		this.bookType = bookType;
		this.bookName = bookName;
		this.author = author;
		this.translator = translator;
		this.publish = publish;
		this.isbn = isbn;
		this.price = price;
		this.bookCase = bookCase;
		this.inTime = inTime;
		this.page = page;
		this.num = num;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getBookType() {
		return bookType;
	}
	public void setBookType(String bookType) {
		this.bookType = bookType;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTranslator() {
		return translator;
	}
	public void setTranslator(String translator) {
		this.translator = translator;
	}
	public String getPublish() {
		return publish;
	}
	public void setPublish(String publish) {
		this.publish = publish;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getBookCase() {
		return bookCase;
	}
	public void setBookCase(String bookCase) {
		this.bookCase = bookCase;
	}
	public Date getInTime() {
		return inTime;
	}
	public void setInTime(Date inTime) {
		this.inTime = inTime;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return "Book [uuid=" + uuid + ", bookType=" + bookType + ", bookName=" + bookName + ", author=" + author
				+ ", translator=" + translator + ", publish=" + publish + ", isbn=" + isbn + ", price=" + price
				+ ", bookCase=" + bookCase + ", inTime=" + inTime + ", page=" + page + ", num=" + num + "]";
	}
}
