package com.bhgroup.boot.profile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.bhgroup.boot.profile.component.ConnectionManager;

@SpringBootApplication
public class SpringbootProfileApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringbootProfileApplication.class, args);
		ConnectionManager cm = context.getBean(ConnectionManager.class);
		cm.showDatabaseDetails();
	}

}
