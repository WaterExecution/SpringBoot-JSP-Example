package com.somemart.somemart;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Index {

	@GetMapping("/test")
	public String index() {
		return "Greetings from Spring Boot!";
	}

}

