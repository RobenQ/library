package com.library.serviceimpl;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.bean.Bollow;
import com.library.mapper.BollowMapper;
import com.library.service.BollowService;

@Service
public class BollowServiceImpl implements BollowService{

	@Autowired
	private BollowMapper bollowMapper;
	
	@Override
	public void insertBollow(String uuid,String reader,String bookUuid,Date outTime,int shouldTime,Date factTime,boolean isReture) {
		bollowMapper.insertBollow(uuid, reader, bookUuid, outTime, shouldTime,factTime, isReture);
	}

	@Override
	public List<Bollow> selByReaderId(String readerId) {
		return bollowMapper.selByReaderId(readerId);
	}

	@Override
	public List<Bollow> selByReaderId2(String readerId) {
		return bollowMapper.selByReaderId2(readerId);
	}

	@Override
	public List<Bollow> selNoReturn() {
		return bollowMapper.selNoReturn();
	}

	@Override
	public List<Bollow> selYesReturn() {
		return bollowMapper.selYesReturn();
	}

	@Override
	public void updateReturned(String uuid) {
		bollowMapper.updateReturned(uuid);
	}

	@Override
	public Bollow selByUuid(String uuid) {
		return bollowMapper.selByUuid(uuid);
	}

	@Override
	public List<Bollow> selAll() {
		return bollowMapper.selAll();
	}

}
