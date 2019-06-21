package com.customer.service;

import java.util.List;

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
	public List<OrderModel> findAll(){
		return dao.getAll();
		}

	
}
