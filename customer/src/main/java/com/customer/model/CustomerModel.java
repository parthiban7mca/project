package com.customer.model;


import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "customers")
public class CustomerModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String customerName;
	private String customerAddress;
	
	@ManyToMany(fetch = FetchType.LAZY,cascade = {CascadeType.PERSIST,CascadeType.MERGE})
	@JoinTable(name="customerorder",joinColumns= {@JoinColumn(name ="customer_id")},inverseJoinColumns= {@JoinColumn(name = "order_id")})
	private List<OrderModel>ordermodel;
	
	public Long getId() {
		return id;
	}

	public List<OrderModel> getOrdermodel() {
		return ordermodel;
	}

	public void setOrdermodel(List<OrderModel> ordermodel) {
		this.ordermodel = ordermodel;
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
