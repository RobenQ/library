package com.library.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.bean.UserType;
import com.library.mapper.UserTypeMapper;
import com.library.service.UserTypeService;

@Service
public class UserTypeServiceImpl implements UserTypeService{

	@Autowired
	private UserTypeMapper userTypeMapper;

	@Override
	public List<UserType> selAll() {
		return userTypeMapper.selAll();
	}

	@Override
	public UserType selByName(String typeName) {
		return userTypeMapper.selByName(typeName);
	}

	@Override
	public void deleteByUuid(String uuid) {
		userTypeMapper.deleteByUuid(uuid);
	}

	@Override
	public void insert(String uuid, String typeName, int num) {
		userTypeMapper.insert(uuid, typeName, num);
	}
}
