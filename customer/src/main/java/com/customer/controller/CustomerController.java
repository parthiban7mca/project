package com.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customer.model.CustomerModel;
import com.customer.service.CustomerService;

@RestController
@RequestMapping("customer")
public class CustomerController {
	@Autowired
	CustomerService service;
	 @PostMapping("addid")
	public CustomerModel create(@RequestBody CustomerModel add) {
		return service.create(add);
		}
	 @GetMapping("viewcustomer")
	public List<CustomerModel> getAll(){
		return service.getAll();
		}
	
}
