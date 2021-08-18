package com.example.elk.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.elk.model.User;
import com.example.elk.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepo ;
	
	Logger logger = LoggerFactory.getLogger(UserService.class);
	
	public User getUser(int id) {
		
		Optional<User> userRecord =  userRepo.findById(id);
		
		if(userRecord.isPresent()) {
			return userRecord.get();
		}
		return null;
	}
	
	public void saveUser(User userData)
	{
		userRepo.save(userData);
		logger.info(" user data saved to DB through Repo " );
		
	}

}
