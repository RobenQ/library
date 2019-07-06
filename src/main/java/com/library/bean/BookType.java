package com.library.bean;

public class BookType {
	private String uuid;
	private String typeName;
	private int days;
	public BookType(String uuid, String typeName, int days) {
		super();
		this.uuid = uuid;
		this.typeName = typeName;
		this.days = days;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	@Override
	public String toString() {
		return "BookType [uuid=" + uuid + ", TypeName=" + typeName + ", days=" + days + "]";
	}
}
