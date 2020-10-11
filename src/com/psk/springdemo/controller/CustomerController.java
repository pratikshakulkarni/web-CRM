package com.psk.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.psk.springdemo.dao.CustomerDAO;
import com.psk.springdemo.entity.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerDAO customerDAO;
	
	@RequestMapping("/list")
	public String listCustomers(Model model) {
		
		//get customer from dao
		List<Customer> theCustomers = customerDAO.getCustomers();
		
		//add the customers to model
		model.addAttribute("customers",theCustomers);
		
		return "list-customers";
		
	}
	
}
