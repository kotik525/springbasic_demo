package com.sp.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SpringController {
	@RequestMapping("/spring")
	public ModelAndView show() {
		String msg="Spring MVC DEMO ";
		
		return new ModelAndView("Spring","message",msg);
	}
}