package com.interview.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {

	@RequestMapping(value="/test",method=RequestMethod.POST)
	public ModelAndView Test() {
		
		
		return new ModelAndView("test");
	}
	
	
	
}
