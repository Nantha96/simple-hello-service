package com.nantha.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloService {
	
	@GetMapping("/hello")
	public String helloWorld()
	{
		return "Hello World !!";
	}

}
