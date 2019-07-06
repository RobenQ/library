package com.library.service;

import java.util.List;

import com.library.bean.Admin;

public interface AdminService {
	public Admin selByAccountAndPwd(String account,String pwd);
	public List<Admin> selAll();
	public List<Admin> selByName(String name);
	public List<Admin> selBySex(String sex);
	public List<Admin> selByIdNo(String idNo);
	public Admin selByIdNo2(String idNo);
	public List<Admin> selByTel(String tel);
	public List<Admin> selByAccount(String account);
	public void deleteByUuid(String uuid);
	public void insertAdmin(String uuid, String account, String pwd, String name, String sex, String idNo, String tel);
	public void updetPwd(String uuid,String pwd);
}
