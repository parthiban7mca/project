package com.customer.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class OrderModel {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String customerName;
	private Long orderValue;
	@ManyToMany(mappedBy="ordermodel",cascade = {CascadeType.PERSIST,CascadeType.MERGE},fetch = FetchType.EAGER)
	private Set<CustomerModel>cutomermodel = new HashSet<>();
   			
	//private CustomerModel customermodel;
	public Set<CustomerModel> getCutomermodel() {
		return cutomermodel;
	}
	public void setCutomermodel(Set<CustomerModel> cutomermodel) {
		this.cutomermodel = cutomermodel;
	}
	/*public CustomerModel getCustomermodel() {
		return customermodel;
	}
	public void setCustomermodel(CustomerModel customermodel) {
		this.customermodel = customermodel;
	}*/
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Long getOrderValue() {
		return orderValue;
	}
	public void setOrderValue(Long orderValue) {
		this.orderValue = orderValue;
	}
	@Override
	public String toString() {
		return "OrderModel [id=" + id + ", customerName=" + customerName + ", orderValue=" + orderValue
				+ ", cutomermodel=" + cutomermodel + "]";
	}
	
	
	
}
