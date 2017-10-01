package com.gbshuler.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
 
@Controller
@RequestMapping("/hello")
public class HelloWorldController {
 
	@RequestMapping("/1")
	public String sayHello(){		
		// System.out.println("Console Log sayHello");
		// return "/views/static/hello.html";
		System.out.println("Console Log codeschool");
		return "/views/static/exercise3_7.html";
	}
}
