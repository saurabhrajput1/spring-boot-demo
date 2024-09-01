package com.saurabh.demo_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/greeting")
public class GreetingController {
	
	@GetMapping("hello")
	public String greetingHello() {
		return "Hello!";
	}

}
