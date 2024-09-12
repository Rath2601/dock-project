package com.sample.dock.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("/messages")
	public String getMessage() {
		return "Hello from Docker!";
	}
	
	@GetMapping("/about")
	public String getAbout() {
		return "Trying to access application deployed in docker";
	}
}