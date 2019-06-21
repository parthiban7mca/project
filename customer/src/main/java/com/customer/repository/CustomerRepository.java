package com.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.customer.model.CustomerModel;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerModel, Long>{

}
