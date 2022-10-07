package com.example.demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@ComponentScan("com.example.demo")
@RestController
public class MainController {
	@GetMapping("/")
	public String welcome() {
		return "welcome to Amazon EC2 instance..!!! You are reading this message from spring boot application..";
	}

}
