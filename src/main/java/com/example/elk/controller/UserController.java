package com.example.elk.controller;




import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.elk.model.User;
import com.example.elk.service.UserService;



@RestController
public class UserController {

	Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/user/{id}")
	public String getUser(@PathVariable int id) {
		logger.info(" gettign user from the DB with id " + id);
		
		//logger.debug(" debug- getting user from the DB with id " + id);
		User u = userService.getUser(id);
		if(u != null )
		return "user Found in Azue deployment-New ";
		else
			return "user with this id not there ";
	}
	
	@PostMapping("/saveUser")
	public String saveUser(@RequestBody User userToSave) {
		
		userService.saveUser(userToSave);

		return "user data saved";
		
	}
}
