package com.jasmine.sept.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	
	@GetMapping(path="/hello-world")
	public String helloWorld() {
		return "Hello World!";
	}
	
	@GetMapping(path="/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("hello world!", 2);
	}
	
	@GetMapping(path="/hello-world-bean/path-variables/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello %s!" , name));
	}
}
