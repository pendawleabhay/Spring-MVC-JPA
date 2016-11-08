package edu.sjsu.cmpe275.lab2;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FrontController {

	@RequestMapping(value="/", method=RequestMethod.GET )
	public ModelAndView homePage() {
		ModelAndView model = new ModelAndView("index");
		return model;
	}
	
	@RequestMapping(value = "submitUserForm", method = RequestMethod.POST)
	public ModelAndView submitUserForm(@ModelAttribute("user") User user){
		ModelAndView model = new ModelAndView("UserSuccess");
		return model;
	}

	
}