package com.packt.cardatabase.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@GetMapping("/")
	public String home() {
		return "Hello Spring World";
	}

	@RequestMapping("/hello")
	public String hello() {
		return "Hi, spring";
	}

	@RequestMapping("/hi") //
	public String hi(@RequestParam("username") String userName) {
		return "Hi! " + userName;
	}
	
	@RequestMapping("/memberinfo") //
	public String memberinfo(@RequestParam("id") String id,
			@RequestParam("name") String name,
			@RequestParam("age") String age,
			@RequestParam("address") String address) {
		return "출력결과 : id:"+id+ "이고, 이름은" + name + "(나이"+age+"), 주소: "+address;
	}
}
