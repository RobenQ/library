package com.library.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.bean.Admin;
import com.library.mapper.AdminMapper;
import com.library.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService{

	@Autowired
	private AdminMapper adminMapper;
	
	@Override
	public Admin selByAccountAndPwd(String account, String pwd) {
		return adminMapper.selByAccountAndPwd(account, pwd);
	}

	@Override
	public List<Admin> selAll() {
		return adminMapper.selAll();
	}

	@Override
	public List<Admin> selByName(String name) {
		return adminMapper.selByName(name);
	}

	@Override
	public List<Admin> selBySex(String sex) {
		return adminMapper.selBySex(sex);
	}

	@Override
	public List<Admin> selByIdNo(String idNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Admin> selByTel(String tel) {
		return adminMapper.selByTel(tel);
	}

	@Override
	public List<Admin> selByAccount(String account) {
		return adminMapper.selByAccount(account);
	}

	@Override
	public void deleteByUuid(String uuid) {
		adminMapper.deleteByUuid(uuid);
	}

	@Override
	public void insertAdmin(String uuid, String account, String pwd, String name, String sex, String idNo, String tel) {
		adminMapper.insertAdmin(uuid, account, pwd, name, sex, idNo, tel);
	}

	@Override
	public Admin selByIdNo2(String idNo) {
		return adminMapper.selByIdNo2(idNo);
	}

	@Override
	public void updetPwd(String uuid, String pwd) {
		adminMapper.updetPwd(uuid, pwd);
	}

}
