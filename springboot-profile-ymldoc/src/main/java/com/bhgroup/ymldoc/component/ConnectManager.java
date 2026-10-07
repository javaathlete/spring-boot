package com.bhgroup.ymldoc.component;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@ConfigurationProperties(prefix = "db")
@Data
public class ConnectManager {

	private String driverClassname;
	private String url;
	private String username;
	private String password;

	
	public void showDatabaseDetails() {
     
		System.out.println("Driver    : " + driverClassname);
		System.out.println("URL       : " + url);
		System.out.println("Username  : " + username);
		System.out.println("Password  : " + password);
	}
}
