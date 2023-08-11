package com.waly.payroll.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients
public class PayrollMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PayrollMicroserviceApplication.class, args);
	}

}
