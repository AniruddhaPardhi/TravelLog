package com.travel.controller;

import javax.ws.rs.Path;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TravelController {
	
	@RequestMapping(value="/")
	public String greetTrvaller() {
		return "Ssup biatch!!";
	}
	
	@RequestMapping(value="/treks")
	public String getTreks() {
		return "Vasota-Kalsubai";
	}
}
