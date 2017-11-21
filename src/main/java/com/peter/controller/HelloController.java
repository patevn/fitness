package com.peter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	// RequestMapping is what method the url ties to, eg http://localhost:8080/something/greeting
	@RequestMapping(value = "/greeting")
	public String sayHello(Model model) {
		
		//model is essentially a hashmap, greeting is a key hello world is a value
		model.addAttribute("greeting", "Hello World");

		//needs to be hello to map to hello.jsp
		return "hello";
	}

}
