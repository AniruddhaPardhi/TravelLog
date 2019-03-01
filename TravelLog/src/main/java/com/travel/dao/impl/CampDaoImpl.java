package com.travel.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.travel.dao.ICampDao;
import com.travel.model.Camp;

@Repository("campDao")
public class CampDaoImpl implements ICampDao {

	@Override
	public List<Camp> fetchCamps() {
		List<Camp> campList = new ArrayList<>();
		campList.add(new Camp("Lake side"));
		campList.add(new Camp("Hill Station"));
		return campList;
	}

}
