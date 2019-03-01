package com.travel.service;

import java.util.List;

import com.travel.model.Trek;

public interface ITrekService extends ITravelService {
	public List<Trek> getTreks();
}
