package com.test.client2.controller;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {
	
//	@Autowired
//	RestTemplate r;
	
	@GetMapping("/a")
	public String test() {
		
//		return r.getForObject("http://client1/hi", String.class);
		return "a";
	}

}
