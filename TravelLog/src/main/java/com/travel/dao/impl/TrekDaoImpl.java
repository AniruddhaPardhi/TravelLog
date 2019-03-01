package com.travel.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.travel.dao.ITrekDao;
import com.travel.model.Trek;

@Repository("trekDao")
public class TrekDaoImpl  implements ITrekDao {

	@Override
	public List<Trek> fetchTreks() {
		List<Trek> trekList = new ArrayList<>();
		trekList.add(new Trek("Vasota"));
		trekList.add(new Trek("Kalsubai"));
		return trekList;
	}
}
