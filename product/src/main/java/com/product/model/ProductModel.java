package com.product.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name="product")
public class ProductModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long productNo;
	private String productName;
	private double productMrp; 
	@CreationTimestamp
	private Date createAt;
	@UpdateTimestamp
	private Date updateAt;
	
	public Long getProductNo() {
		return productNo;
	}
	public void setProductNo(Long productNo) {
		this.productNo = productNo;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductMrp() {
		return productMrp;
	}
	public void setProductMrp(double productMrp) {
		this.productMrp = productMrp;
	}
	public Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	public Date getUpdateAt() {
		return updateAt;
	}
	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}
	@Override
	public String toString() {
		return "ProductModel [productNo=" + productNo + ", productName=" + productName + ", productMrp=" + productMrp
				+ ", createAt=" + createAt + ", updateAt=" + updateAt + "]";
	}

	
}
