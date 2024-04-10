package com.hom2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/sis")
public class SisController {
	@ResponseBody
	@RequestMapping("/makeup")
	public String makeup()
	{
		return "take make up kit";
	}
	@ResponseBody
	@RequestMapping("/book")
	public String getbooks()
	{
		System.out.println("this is getbooks()...");		
		return "Math book";
	}

}
