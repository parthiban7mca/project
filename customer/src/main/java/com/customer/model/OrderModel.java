package com.customer.model;

//import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
//import javax.persistence.OneToOne;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class OrderModel {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String customerName;
	private Long orderValue;
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="customer_id", insertable=false, updatable=false, 
			nullable=true)
private CustomerModel customermodel;
	public CustomerModel getCustomermodel() {
		return customermodel;
	}
	public void setCustomermodel(CustomerModel customermodel) {
		this.customermodel = customermodel;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "OrderModel [id=" + id + ", customerName=" + customerName + ", orderValue=" + orderValue
				+ ", customermodel=" + customermodel + "]";
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
}
