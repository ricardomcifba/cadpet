package com.hdregistros.hr_user.oauth.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.hdregistros.hr_user.oauth.entities.User;
import com.hdregistros.hr_user.oauth.feignclient.UserFeignClient;

@Service
public class UserService {
	
	private static Logger logger = LoggerFactory.getLogger(UserService.class);
	
	private UserFeignClient userFeignClient;
	
	public User findByEmail(String email) {
		User user = userFeignClient.findByEmail(email).getBody();
		if(user ==null) {
			throw new IllegalArgumentException("Email not found");
		}
		return user;
	}
}
