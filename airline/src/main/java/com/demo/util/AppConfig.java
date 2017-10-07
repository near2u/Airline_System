package com.demo.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.demo.service.UserService;
import com.demo.service.impl.UserServiceImpl;

@Configuration
public class AppConfig {

	@Bean
	public UserService getUserService() {

		UserService userService = new UserServiceImpl();
		return userService;
	}
}
