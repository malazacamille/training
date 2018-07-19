package com.training.spring.web.controller;

import java.util.Map;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.training.spring.web.model.Employee;
import com.training.spring.web.model.EmployeeJsonResponse;

@Controller
public class WelcomeController {

	 @GetMapping("/")
	   public String employeeForm() {
	      return "welcome";
	   }

	   @PostMapping(value = "/saveEmployee", produces = { MediaType.APPLICATION_JSON_VALUE })
	   @ResponseBody
	   public EmployeeJsonResponse saveEmployee(@ModelAttribute @Valid Employee employee,
	         BindingResult result) {

	      EmployeeJsonResponse respone = new EmployeeJsonResponse();
	      
	      if(result.hasErrors()){
	         
	         
	         
	         respone.setValidated(false);
	         
	      }else{
	         // Implement business logic to save employee into database
	         //..
	         respone.setValidated(true);
	         respone.setEmployee(employee);
	      }
	      return respone;
	   }

}