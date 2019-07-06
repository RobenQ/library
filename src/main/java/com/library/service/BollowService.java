package com.library.service;

import java.sql.Date;
import java.util.List;

import com.library.bean.Bollow;

public interface BollowService {
	public void insertBollow(String uuid,String reader,String bookUuid,Date outTime,int shouldTime,Date factTime,boolean isReture);
	public List<Bollow> selByReaderId(String readerId);
	public List<Bollow> selByReaderId2(String readerId);
	public List<Bollow> selNoReturn();
	public List<Bollow> selYesReturn();
	public void updateReturned(String uuid);
	public Bollow selByUuid(String uuid);
	public List<Bollow> selAll();
}
