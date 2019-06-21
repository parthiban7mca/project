package com.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.customer.dao.CustomerDao;
import com.customer.model.CustomerModel;
@Component
public class CustomerService {


	@Autowired
	CustomerDao dao;
 
	public CustomerModel create(CustomerModel add) {
		return dao.create(add);
		}
	public List<CustomerModel> getAll(){
		return dao.getAll();
		}
	
	
}
