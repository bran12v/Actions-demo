package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping("/")
	public String Hello() {
		return "<h1>Congratulations you have implemented CI/CD for Spring!</h1>";
	}
	
}
