package com.library.mapper;

import java.sql.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import com.library.bean.User;

@Component
public interface UserMapper {
	public List<User> selAll();
	public User selByAccountAndPwd(@Param("account")String account,@Param("pwd")String pwd);
	public List<User> selByName(@Param("name")String name);
	public List<User> selBySex(@Param("sex")String sex);
	public List<User> selByreadType(@Param("readType")String readType);
	public List<User> selByTel(@Param("Tel")String Tel);
	public List<User> selByPaperNo(@Param("paperNo")String paperNo);
	public User selByPaperNo2(@Param("paperNo")String paperNo);
	public User selById(@Param("id")String id);
	public void deleteById(@Param("id")String id);
	public void insertUser(@Param("id")String id, @Param("account")String account, @Param("pwd")String pwd, @Param("name")String name,
			@Param("sex")String sex, @Param("barcode")String barcode, @Param("readType")String readType,
			@Param("tel")String tel, @Param("paperType")String paperType, @Param("paperNo")String paperNo, 
			@Param("inTime")Date inTime, @Param("operator")String operator, @Param("num")int num, @Param("bollowed")int bollowed);
	public void updetPwd(@Param("id")String id,@Param("pwd")String pwd);
	public void updateBollowed(@Param("id")String id);
	public void updateBollowed2(@Param("id")String id);
}
