package com.travel.dao;

import java.util.List;

import com.travel.model.Trek;

public interface ITrekDao { //extends ITravelDao
	public List<Trek> fetchTreks();
}
