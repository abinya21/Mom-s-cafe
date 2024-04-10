package com.hom2.mycafe.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyCafeController {
	
	//Return the Welcome-page
	@RequestMapping("/cafe")
	public String ShowWelcomepagePage(Model model)
	{
	return "Welcome-Page";
				
	}
	
	@RequestMapping("/ProcessOrder")
	public String ProcessOrder(HttpServletRequest request, Model model)
	{
		//handle the data recieved from the user
		String UserEnteredvalue = request.getParameter("foodtype");
		
		//adding the capture value to the model
		model.addAttribute("UserInput",UserEnteredvalue);
// send the user data with the model object and send it to view
		return "Process-Order";
	}
	
	
}
