package com.investment.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.investment.model.User;
import com.investment.repositories.UserRepository;

@RestController
public class UserController {
	
	@Autowired
	UserRepository userRepository;
	
	@RequestMapping("/api/user/insert/{username}/{pass}")
	public User insertUser(@PathVariable("username") String user,@PathVariable("pass") String pass ) {
		User obj = new User();
		obj.setName("testUser");
		obj.setUserPassword("testPass");
		userRepository.save(obj);
		return obj;
	}
	
	@RequestMapping("/api/users/select/all")
	public List<User> selectAllUserObjects() {
		List<User> users = (List<User>)userRepository.findAll();
		return users;
	}
}
