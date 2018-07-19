package com.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.training.bean.Employee;
import com.training.service.EmployeeDAOImpl;

@Controller
public class HelloWorldController {
	
	/*@Autowired
	EmployeeDAOImpl empMap;
	*/
	@RequestMapping(value="/" , method=RequestMethod.GET)
	public String sayHello(ModelMap model) {
		model.addAttribute("message","Welcome from Spring MVC");
		
		return "welcome";
	}
	
	@RequestMapping(value="/helloAgain" , method=RequestMethod.GET)
	public String sayHelloAgain(ModelMap model) {
		model.addAttribute("message","Welcome Again from Spring MVC");
		
		return "welcome";
	}
	
	/*@RequestMapping(value="/List")
	public ModelAndView index() {
	List<Employee> empList = empMap.selectAll();
	ModelAndView mv = new ModelAndView("index");
	mv.addObject("emplist",empList);
	return mv;
	}
	*/
}
