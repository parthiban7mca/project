package com.product.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name="product")
public class ProductModel {

	@Id
	private long ProductNo;
	private String ProductName;
	private double ProductMrp; 
	@CreationTimestamp
	private Date CreateAt;
	@UpdateTimestamp
	private Date UpdateAt;
	public long getProductNo() {
		return ProductNo;
	}
	public void setProductNo(long productNo) {
		ProductNo = productNo;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public double getProductMrp() {
		return ProductMrp;
	}
	public void setProductMrp(double productMrp) {
		ProductMrp = productMrp;
	}
	public Date getCreateAt() {
		return CreateAt;
	}
	public void setCreateAt(Date createAt) {
		CreateAt = createAt;
	}
	public Date getUpdateAt() {
		return UpdateAt;
	}
	public void setUpdateAt(Date updateAt) {
		UpdateAt = updateAt;
	}
	@Override
	public String toString() {
		return "ProductModel [ProductNo=" + ProductNo + ", ProductName=" + ProductName + ", ProductMrp=" + ProductMrp
				+ ", CreateAt=" + CreateAt + ", UpdateAt=" + UpdateAt + "]";
	}
	
	
}
