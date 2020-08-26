package com.sip.ams.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/second")
public class SecondController {

	
	@RequestMapping("/home")
	public String home(Model modele)
	{
		return "Second/home";
	}
}
