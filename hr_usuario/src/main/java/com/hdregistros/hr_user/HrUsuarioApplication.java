  
package com.hdregistros.hr_user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class HrUsuarioApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrUsuarioApplication.class, args);
	}

}