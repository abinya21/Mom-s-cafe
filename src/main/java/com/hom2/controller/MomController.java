package com.hom2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MomController {
	@ResponseBody
	@RequestMapping("/sugar")
	public String givesugar()
	{
		return "OK....Here is your sugar";
	}

}
