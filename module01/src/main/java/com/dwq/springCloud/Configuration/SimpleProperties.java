package com.dwq.springCloud.Configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Data
@Configuration
@ConfigurationProperties(prefix = "config.test")
public class SimpleProperties {

	public SimpleProperties() {
		// TODO Auto-generated constructor stub
	}

	public String getUsername() {
		return usrName;
	}

	public void setUsername(String username) {
		this.usrName = username;
	}

	private String usrName;
	private String password;
	private int maxIdle;
	private int minIdle;
}
