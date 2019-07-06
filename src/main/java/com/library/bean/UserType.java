package com.library.bean;

public class UserType {
	private String uuid;
	private String typeName;
	private int num;
	public UserType(String uuid, String typeName, int num) {
		super();
		this.uuid = uuid;
		this.typeName = typeName;
		this.num = num;
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
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return "UserType [uuid=" + uuid + ", TypeName=" + typeName + ", num=" + num + "]";
	}
}
