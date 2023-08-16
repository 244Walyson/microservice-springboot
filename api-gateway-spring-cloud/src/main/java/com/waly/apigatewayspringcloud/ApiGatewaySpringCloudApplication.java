package com.waly.apigatewayspringcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class ApiGatewaySpringCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewaySpringCloudApplication.class, args);
	}

}
