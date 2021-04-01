package com.investment.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	//@RequestMapping("/api/hello/string")
	@GetMapping(value = "/api/hello/string",produces = "application/json")
	public String sayHello() {
		return "Welcome to the new app";
	}
	
	@RequestMapping("/hello/object")
	public HelloObject sayHelloObject() {
		HelloObject obj = new HelloObject("Hello Rahul!");
		return obj;
	}

}
