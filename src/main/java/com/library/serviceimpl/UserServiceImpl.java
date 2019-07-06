package com.library.serviceimpl;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.bean.User;
import com.library.mapper.UserMapper;
import com.library.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;
	@Override
	public User selByAccountAndPwd(String account, String pwd) {
		return userMapper.selByAccountAndPwd(account, pwd);
	}
	@Override
	public List<User> selAll() {
		return userMapper.selAll();
	}
	@Override
	public List<User> selByName(String name) {
		return userMapper.selByName(name);
	}
	@Override
	public List<User> selBySex(String sex) {
		return userMapper.selBySex(sex);
	}
	@Override
	public List<User> selByreadType(String readType) {
		return userMapper.selByreadType(readType);
	}
	@Override
	public List<User> selByTel(String Tel) {
		return userMapper.selByTel(Tel);
	}
	@Override
	public List<User> selByPaperNo(String paperNo) {
		return userMapper.selByPaperNo(paperNo);
	}
	@Override
	public User selById(String id) {
		return userMapper.selById(id);
	}
	@Override
	public void deleteById(String id) {
		userMapper.deleteById(id);
	}
	@Override
	public void insertUser(String id, String account, String pwd, String name, String sex, String barcode,
			String readType, String tel, String paperType, String paperNo, Date inTime, String operator, int num,
			int bollowed) {
		userMapper.insertUser(id, account, pwd, name, sex, barcode, readType, tel, paperType, paperNo, inTime, operator, num, bollowed);
	}
	@Override
	public User selByPaperNo2(String paperNo) {
		return userMapper.selByPaperNo2(paperNo);
	}
	@Override
	public void updetPwd(String id, String pwd) {
		userMapper.updetPwd(id, pwd);
	}
	@Override
	public void updateBollowed(String id) {
		userMapper.updateBollowed(id);
	}
	@Override
	public void updateBollowed2(String id) {
		userMapper.updateBollowed2(id);
	}

}
