package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloWorldController {
	
	@GetMapping(path = "/hello-world")
	public String helloWorld(Model model) {
		model.addAttribute( "message","Hello World");
		return "HelloWorld";
	}
	
	@GetMapping(path = "/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World"); 
	}
	
}
