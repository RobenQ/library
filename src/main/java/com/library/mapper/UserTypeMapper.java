package com.library.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import com.library.bean.UserType;

@Component
public interface UserTypeMapper {

	public List<UserType> selAll();
	public UserType selByName(@Param("typeName")String typeName);
	public void deleteByUuid(@Param("uuid")String uuid);
	public void insert(@Param("uuid")String uuid,@Param("typeName")String typeName,@Param("num")int num);
}
