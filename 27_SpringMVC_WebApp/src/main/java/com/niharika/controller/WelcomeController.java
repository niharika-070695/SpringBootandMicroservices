package com.niharika.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	
	
	//Request processing method
	@RequestMapping(value = "welcome")
	public ModelAndView getWelcomeMessage() {
		
		//logical name for view page - welcome
		ModelAndView mav = new ModelAndView("welcome");
		
		//Model data to be displayed on view page
		mav.addObject("wishMessage", "Wecome to Mechanicsberg--Pennsylvania");
		return mav;
		
		
	}
	
	@RequestMapping(value = "wishes")
	public ModelAndView getWishMessage(@RequestParam Map<String,String> requestParams) {
		
		//logical name for view page - welcome
		ModelAndView mav = new ModelAndView("welcome");
		
		//Model data to be displayed on view page
		mav.addObject("wishMessage", "Wecome to Mechanicsberg--Pennsylvania");
		System.out.println("RequestParameters Data:::"+ requestParams);
		mav.addObject("requestData",requestParams);
		return mav;
		
		
	}

}
