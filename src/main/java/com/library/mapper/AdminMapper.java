package com.library.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import com.library.bean.Admin;

@Component
public interface AdminMapper {
	public Admin selByAccountAndPwd(@Param("account")String account,@Param("pwd")String pwd);
	public List<Admin> selAll();
	public List<Admin> selByName(@Param("name")String name);
	public List<Admin> selBySex(@Param("sex")String sex);
	public List<Admin> selByIdNo(@Param("idNo")String idNo);
	public Admin selByIdNo2(@Param("idNo")String idNo);
	public List<Admin> selByTel(@Param("tel")String tel);
	public List<Admin> selByAccount(@Param("account")String account);
	public void deleteByUuid(@Param("uuid")String uuid);
	public void insertAdmin(@Param("uuid")String uuid, @Param("account")String account, @Param("pwd")String pwd, 
			@Param("name")String name, @Param("sex")String sex, @Param("idNo")String idNo, @Param("tel")String tel);
	public void updetPwd(@Param("uuid")String uuid,@Param("pwd")String pwd);
}
