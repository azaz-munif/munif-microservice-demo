package com.munifec.munifmsaccount;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MunifMsAccountApplication {

	public static void main(String[] args) {
		SpringApplication.run(MunifMsAccountApplication.class, args);
	}

}
