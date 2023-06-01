package com.oilc_suit.serviceRegister;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class OilcSuitServiceRegister1Application {

	public static void main(String[] args) {
		SpringApplication.run(OilcSuitServiceRegister1Application.class, args);
	}

}
