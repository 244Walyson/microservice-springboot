package com.waly.oauthmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class OauthMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OauthMicroserviceApplication.class, args);
	}

}
