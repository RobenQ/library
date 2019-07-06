package com.library.service;

import java.sql.Date;
import java.util.List;

import com.library.bean.User;

public interface UserService {
	public List<User> selAll();
	public User selByAccountAndPwd(String account,String pwd);
	public List<User> selByName(String name);
	public List<User> selBySex(String sex);
	public List<User> selByreadType(String readType);
	public List<User> selByTel(String Tel);
	public List<User> selByPaperNo(String paperNo);
	public User selByPaperNo2(String paperNo);
	public User selById(String id);
	public void deleteById(String id);
	public void insertUser(String id, String account, String pwd, String name, String sex, String barcode, String readType,
			String tel, String paperType, String paperNo, Date inTime, String operator, int num, int bollowed);
	public void updetPwd(String id,String pwd);
	public void updateBollowed(String id);
	public void updateBollowed2(String id);
}
