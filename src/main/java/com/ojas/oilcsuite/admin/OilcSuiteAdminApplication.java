package com.ojas.oilcsuite.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class OilcSuiteAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(OilcSuiteAdminApplication.class, args);
	}

}
