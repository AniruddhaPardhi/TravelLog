package com.travel.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Camp {

	public String type;
	
	public Camp() {}
	
	public Camp(String type) {
		this.type=type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
