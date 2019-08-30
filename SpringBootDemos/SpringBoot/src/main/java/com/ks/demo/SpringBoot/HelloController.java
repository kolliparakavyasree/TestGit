package com.ks.demo.SpringBoot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@RequestMapping("/hi")
	public String sayHello(){
		return "Hello Boot";
	}
	@RequestMapping("/hiii")
	public @ResponseBody String sayHi(){
		return "Hi Boot";
	}
}
