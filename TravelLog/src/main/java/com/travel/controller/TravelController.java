package com.travel.controller;

import javax.ws.rs.Path;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class TravelController {
	
	@Path("/")
	public String greetTrvaller() {
		return "Ssup biatch!!";
	}
}
