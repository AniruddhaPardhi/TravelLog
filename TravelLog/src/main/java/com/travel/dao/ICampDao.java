package com.travel.dao;

import java.util.List;

import com.travel.model.Camp;

public interface ICampDao {//extends ITravelDao{
	public List<Camp> fetchCamps();
}
