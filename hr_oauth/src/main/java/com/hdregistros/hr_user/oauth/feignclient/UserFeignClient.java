package com.hdregistros.hr_user.oauth.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hdregistros.hr_user.oauth.entities.User;

@Component
@FeignClient(name= "hr_user", path = "/users")
public interface UserFeignClient {
	
	@GetMapping(value = "/search")
	ResponseEntity<User> findByEmail(@RequestParam String email);
	
}
