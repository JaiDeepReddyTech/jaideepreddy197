package com.springdemo.customercontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springdemo.dao.CustomerDAO;
import com.springdemo.entity.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerDAO customerDAO;//=new CustomerDAO();
	@RequestMapping("/list")
	public String myShow(Model theModel) {
		List<Customer> theCustomers = customerDAO.getCustomers();
		theModel.addAttribute("customer", theCustomers);
		return "customer-list";
		
	}
}
