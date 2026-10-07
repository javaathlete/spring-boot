package com.bhgroup.spring.profile.spring_profile.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ConnectionManager {

	@Value("${db.driverClassname}")
	private String driverClassname;

	@Value("${db.url}")
	private String url;

	@Value("${db.username}")
	private String username;

	@Value("${db.password}")
	private String password;

	public void showDatabaseDetails() {

		System.out.println("Driver    : " + driverClassname);
		System.out.println("URL       : " + url);
		System.out.println("Username  : " + username);
		System.out.println("Password  : " + password);
	}

}
