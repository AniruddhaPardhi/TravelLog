package com.travel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.travel.dao.ITrekDao;
import com.travel.model.Trek;
import com.travel.service.ITrekService;

@Service("trekService")
public class TrekServiceImpl implements ITrekService { //implements ITravelService
	
	@Autowired
	@Qualifier("trekDao")
	ITrekDao trekDao; //ITravelDao trekDao;

	public List<Trek> getTreks() {
		return trekDao.fetchTreks();
	}
}
