package com.Docker.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

	@GetMapping("/message")
	public String getMessage() {
		return "Hi cs";
	}

}

