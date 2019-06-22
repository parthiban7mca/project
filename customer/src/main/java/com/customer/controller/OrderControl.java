package com.customer.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.customer.model.OrderModel;
import com.customer.repository.OrderRepository;
import com.customer.service.OrderService;

@RestController
@RequestMapping("order")
public class OrderControl {
	
	@Autowired 
	OrderRepository orderrepository;

	@Autowired
	OrderService service;
	 @PostMapping("add")
	public OrderModel create(@RequestBody OrderModel add) {
		return service.add(add);
		}
	 @GetMapping("view")
	public List<OrderModel> getAll(){
		return service.getAll();
		}
	 
	 @PostMapping("both")
	 public OrderModel load(@RequestBody final OrderModel ordermodel)
	 {
		 return orderrepository.save(ordermodel);
	 }
	 @RequestMapping(value= "view/{id}", method= RequestMethod.GET)
		public OrderModel getEmployeeById(@PathVariable Long id) throws Exception{
	    Optional<OrderModel> trs =  service.getById(id);
	    if(!trs.isPresent())
	        throw new Exception("not find employeeid- " + id);
	        return trs.get();
	}
	 
	 
}
