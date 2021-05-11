package com.dwq.springCloud.Configuration.complex;

import lombok.Data;

@Data
public class templateConfiguration {

	public templateConfiguration() {
		// TODO Auto-generated constructor stub
	}
	private String templateName;
	private int maxIdle;
	private int minIdle;
}
