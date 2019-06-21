package com.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customer.model.OrderModel;
import com.customer.service.OrderService;

@RestController
@RequestMapping("order")
public class OrderControl {

	@Autowired
	OrderService service;
	 @PostMapping("add")
	public OrderModel create(@RequestBody OrderModel add) {
		return service.add(add);
		}
	 @GetMapping("view")
	public List<OrderModel> getAll(){
		return service.findAll();
		}
	 
	 
}
