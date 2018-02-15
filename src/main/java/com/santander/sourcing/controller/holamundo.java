package com.santander.sourcing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/helloController")
public class holamundo {
	
	 @RequestMapping(value = "/hello", method=RequestMethod.GET)
	 @ResponseBody
	 public String home() {
		 return "HolaMundo";
	 }
}
