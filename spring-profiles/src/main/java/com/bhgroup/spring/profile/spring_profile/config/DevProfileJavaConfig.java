package com.bhgroup.spring.profile.spring_profile.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:db-dev.properties")
@ComponentScan(basePackages = "com.bhgroup.spring.profile.spring_profile.component")
@Profile("dev")
public class DevProfileJavaConfig {

	@Bean
    public static PropertySourcesPlaceholderConfigurer pty() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
