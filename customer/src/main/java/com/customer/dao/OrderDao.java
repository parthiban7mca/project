package com.customer.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.customer.model.OrderModel;
import com.customer.repository.OrderRepository;

@Component
public class OrderDao {

	@Autowired
OrderRepository repository;

public OrderModel create(OrderModel add) {
	return repository.save(add);
	}
public List<OrderModel> getAll(){
	return repository.findAll();
	}
public Optional<OrderModel> findById(Long id){
	return repository.findById(id);
	
}
}
