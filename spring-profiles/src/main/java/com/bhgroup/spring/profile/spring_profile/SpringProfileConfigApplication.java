package com.bhgroup.spring.profile.spring_profile;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bhgroup.spring.profile.spring_profile.component.ConnectionManager;
import com.bhgroup.spring.profile.spring_profile.config.DevProfileJavaConfig;
import com.bhgroup.spring.profile.spring_profile.config.TestProfileJavaConfig;

public class SpringProfileConfigApplication {
    public static void main(String[] args) {
    	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

		// Activate profile
		ctx.getEnvironment().setActiveProfiles("test");
		
		System.out.println(
		        "\nActive Profile: "
		        + Arrays.toString(ctx.getEnvironment().getActiveProfiles())
		);
		// Register configuration classes
		ctx.register(DevProfileJavaConfig.class);
		ctx.register(TestProfileJavaConfig.class);


		// Start Spring container
		ctx.refresh();

		// Get bean
		ConnectionManager connectionManager = ctx.getBean(ConnectionManager.class);

		connectionManager.showDatabaseDetails();

		ctx.close();
    }
}
