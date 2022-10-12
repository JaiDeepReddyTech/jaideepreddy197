package com.jai.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	// need a controller method to show the initial HTML form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld";
	}

	// need a controller method to process the HTML form
//	@RequestMapping("/processForm")
//	public String processForm() {
//		return "helloworld2";
//	}
	// new controller method to read HTML data and add data to the model

	@RequestMapping("/processFromVersionTwo")
	public String versionTwo(HttpServletRequest request, Model model) {
		// read the request parameter from the HTML form
		String theName = request.getParameter("student");

		// convert data to all caps
		theName = "Yooo! " + theName.toUpperCase();
		// add message to the model
		model.addAttribute("message", theName);
		return "helloworld2";
	}
	// new controller method to read HTML data and add data to the model

	@RequestMapping("/processFromVersionThree")

	// read the request parameter from the HTML form

	public String versionThree(@RequestParam("student") String theName, Model model) {
		// convert data to all caps
		theName = "Yooo! " + theName.toUpperCase();
		// add message to the model
		model.addAttribute("message", theName);
		return "helloworld2";
	}
}
