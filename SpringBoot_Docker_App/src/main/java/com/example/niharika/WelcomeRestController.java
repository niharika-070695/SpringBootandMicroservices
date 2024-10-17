package com.example.niharika;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
	
	@GetMapping
	public String getMessage() {
		return "Welcome to Mechanicsberg-Pennsylvania";
	}

}
