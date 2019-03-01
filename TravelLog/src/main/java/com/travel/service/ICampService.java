package com.travel.service;

import java.util.List;

import com.travel.model.Camp;

public interface ICampService extends ITravelService{
	public List<Camp> getCamps();
}
