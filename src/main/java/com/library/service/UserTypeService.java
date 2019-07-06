package com.library.service;

import java.util.List;

import com.library.bean.UserType;

public interface UserTypeService {

	public List<UserType> selAll();
	public UserType selByName(String typeName);
	public void deleteByUuid(String uuid);
	public void insert(String uuid,String typeName,int num);
}
