package com.hom2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Brocontroller {
	
	
	
	@RequestMapping("/cricket")
	public String givecricketbat()
	{
		return "MRFcricketbat";
	} 

}