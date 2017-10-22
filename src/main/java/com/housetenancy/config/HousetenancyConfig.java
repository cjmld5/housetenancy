package com.housetenancy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import com.housetenancy.queryservice.IUserQueryService;
import com.housetenancy.queryservice.impl.UserQuerySerivce;

@ImportResource("classpath:applicationContext.xml")
@Configuration
public class HousetenancyConfig {

	@Bean
	public IUserQueryService userQueryService() {
		return new UserQuerySerivce();
	}

}
