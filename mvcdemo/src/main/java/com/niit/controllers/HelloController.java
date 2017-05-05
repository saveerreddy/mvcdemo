package com.niit.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController
{
	@RequestMapping("/")
	public String hellopage()
	{
		return "index";
	}
	
	@RequestMapping("/hello")
	public String show(Model m)
	{
		
		m.addAttribute("msg", "Welcome to Spring");
		return "hello";
		
	}
	
	@RequestMapping ("/getUserForm")
	
		public String getUserForm()
		{
		   return "sayHelloToUser";
		}
	

}
