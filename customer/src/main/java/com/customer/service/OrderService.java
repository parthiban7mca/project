package com.customer.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.customer.dao.OrderDao;
import com.customer.model.OrderModel;

@Component
public class OrderService {

	@Autowired
	OrderDao dao;
 
	public OrderModel add(OrderModel add) {
		return dao.create(add);
		}
	public List<OrderModel> getAll(){
		return dao.getAll();
		}
	public Optional<OrderModel> getById(Long id){
		return dao.findById(id);
    	
    }
	
}
