package com.bankatm.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="account")
public class BankAtmModel {
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long AccNo;
	private String AccName;
	private String AccType;
	private String Balance;
	 
	private Date CreateAt;
	 
	private Date UpdateAt;
	public long getAccNo() {
		return AccNo;
	}
	public void setAccNo(long accNo) {
		AccNo = accNo;
	}
	public String getAccName() {
		return AccName;
	}
	public void setAccName(String accName) {
		AccName = accName;
	}
	public String getAccType() {
		return AccType;
	}
	public void setAccType(String accType) {
		AccType = accType;
	}
	public String getBalance() {
		return Balance;
	}
	public void setBalance(String balance) {
		Balance = balance;
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
		return "Bankmodel [AccNo=" + AccNo + ", AccName=" + AccName + ", AccType=" + AccType + ", Balance=" + Balance
				+ ", CreateAt=" + CreateAt + ", UpdateAt=" + UpdateAt + "]";
	}
	
	
}
