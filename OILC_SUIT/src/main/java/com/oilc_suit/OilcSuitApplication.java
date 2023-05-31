package com.oilc_suit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class OilcSuitApplication {

	public static void main(String[] args) {
		SpringApplication.run(OilcSuitApplication.class, args);
	}

}
