package com.customer.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.customer.model.CustomerModel;
import com.customer.repository.CustomerRepository;

@Component
public class CustomerDao {
	@Autowired
	CustomerRepository repository;
 
	public CustomerModel create(CustomerModel add) {
		return repository.save(add);
		}
	public List<CustomerModel> getAll(){
		return repository.findAll();
		
		}

	
}
