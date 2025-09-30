package com.myorganisation.eurekaservice1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class Eurekaservice1Application {

	public static void main(String[] args) {
		SpringApplication.run(Eurekaservice1Application.class, args);
	}

}
