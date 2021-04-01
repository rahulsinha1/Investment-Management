package com.investment.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.investment.model.Customer;
import com.investment.repositories.CustomerRepository;

@RestController
public class CustomerController {
	@Autowired
	CustomerRepository customerRepository;
	
	@RequestMapping("/user/insert/{username}/{pass}")
	public Customer insertUser(@PathVariable("username") String user,@PathVariable("pass") String pass ) {
		Customer obj = new Customer();
		obj.setName(user);
		obj.setUserPassword(pass);
		customerRepository.save(obj);
		return obj;
	}
	
	@RequestMapping("/user/select/all")
	public List<Customer> selectAllUserObjects() {
		List<Customer> users = (List<Customer>)customerRepository.findAll();
		return users;
	}
	@RequestMapping("/user/find/{username}")
	public Customer findUser(@PathVariable("username") String user) {
		Customer userObj = customerRepository.findByUserName(user);
		return userObj;
	}
}
