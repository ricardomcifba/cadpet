package com.hdregistros.hr_pets;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class HrPetApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrPetApplication.class, args);
	}

}
