package com.travel.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Trek {
	
	private String type;
	
	public Trek() {}
	
	public Trek(String type) {
		this.type=type;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
