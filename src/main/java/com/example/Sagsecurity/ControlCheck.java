package com.example.Sagsecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControlCheck {
	
	@GetMapping("/")
	public String sag() {
		
		return "Hello World";
	}

}
