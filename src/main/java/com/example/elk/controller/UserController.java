package com.example.elk.controller;




import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class UserController {

	Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@GetMapping("/user/{id}")
	public String getUser(@PathVariable int id) {
		logger.info(" gettign user from the DB with id " + id);
		
		logger.debug(" debug- getting user from the DB with id " + id);
		
		return "user Found in Azue deployment-New ";
	}
}
