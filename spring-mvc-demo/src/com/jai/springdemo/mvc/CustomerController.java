package com.jai.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/customer")
public class CustomerController {
	// add an initBinder ... to convert trim input string
	// remove leading and trailing whitespace
	// resolve issue for our validation
	@InitBinder
	public void initBinder(WebDataBinder data) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		data.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	@RequestMapping("/showForm")
	public String showForm(Model theModle) {
		theModle.addAttribute("theCustomer", new Customer());
		return "customer-form";
	}
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("theCustomer") Customer customer, BindingResult theBingingResutl) {
		if (theBingingResutl.hasErrors()) {
			return "customer-form";
		} else {
			return "customer-confirmation";
		}
	}
}
