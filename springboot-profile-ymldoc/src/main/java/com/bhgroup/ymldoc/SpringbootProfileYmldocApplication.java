package com.bhgroup.ymldoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.bhgroup.ymldoc.component.ConnectManager;

@SpringBootApplication
public class SpringbootProfileYmldocApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringbootProfileYmldocApplication.class, args);
		ConnectManager connectMgr = ctx.getBean(ConnectManager.class);
		connectMgr.showDatabaseDetails();
	}

}
