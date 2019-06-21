package com.customer.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "customers")
public class CustomerModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String customerName;
	private String customerAddress;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "customer_id")
	private Set<OrderModel>ordermodel=new HashSet<>();
	public Set<OrderModel> getOrdermodel() {
		return ordermodel;
	}

	public void setOrdermodel(Set<OrderModel> ordermodel) {
		this.ordermodel = ordermodel;
	}

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

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	@Override
	public String toString() {
		return "CustomerModel [id=" + id + ", customerName=" + customerName + ", customerAddress=" + customerAddress
				+ ", ordermodel=" + ordermodel + "]";
	}

}
