package com.travel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.travel.dao.ICampDao;
import com.travel.dao.ITravelDao;
import com.travel.model.Camp;
import com.travel.service.ICampService;

@Service("campService")
public class CampServiceImpl implements ICampService {
	
	@Autowired
	@Qualifier("campDao")
	ICampDao campDao; //ITravelDao campDao;
	
	public List<Camp> getCamps() {
		return campDao.fetchCamps();
	}
}
