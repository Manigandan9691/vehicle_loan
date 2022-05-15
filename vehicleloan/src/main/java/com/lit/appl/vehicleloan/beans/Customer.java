package com.lit.appl.vehicleloan.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CUSTOMERS")
public class Customer {
	
 @Id
 @Column(name="CUSTID")
 private int custId;
 
 @Column(name="CUSTNAME")
 private String custName;
 
 @Column(name="AGE")
 private int age;
 
 @Column(name="GENDER")
 private String gender;
 
 @Column(name="PHNUMBER")
 private long phNumber; 
 
 @Column(name="EMAILID")
 private String emailId;
 
 @Column(name="PASSWORD")
 private String password;
 
 @Column(name="ADDRESS")
 private String address;

 
 public Customer(int custId, String custName, int age, String gender, long phNumber, String emailId, String password,
		String address) {
	super();
	this.custId = custId;
	this.custName = custName;
	this.age = age;
	this.gender = gender;
	this.phNumber = phNumber;
	this.emailId = emailId;
	this.password = password;
	this.address = address;
}


public Customer() {
	super();
}


public int getCustId() {
	return custId;
}


public void setCustId(int custId) {
	this.custId = custId;
}


public String getCustName() {
	return custName;
}


public void setCustName(String custName) {
	this.custName = custName;
}


public int getAge() {
	return age;
}


public void setAge(int age) {
	this.age = age;
}


public String getGender() {
	return gender;
}


public void setGender(String gender) {
	this.gender = gender;
}


public long getPhNumber() {
	return phNumber;
}


public void setPhNumber(long phNumber) {
	this.phNumber = phNumber;
}


public String getEmailId() {
	return emailId;
}


public void setEmailId(String emailId) {
	this.emailId = emailId;
}


public String getPassword() {
	return password;
}


public void setPassword(String password) {
	this.password = password;
}


public String getAddress() {
	return address;
}


public void setAddress(String address) {
	this.address = address;
}


@Override
public String toString() {
	return "Customer [custId=" + custId + ", custName=" + custName + ", age=" + age + ", gender=" + gender
			+ ", phNumber=" + phNumber + ", emailId=" + emailId + ", password=" + password + ", address=" + address
			+ "]";
}
 
 
 
 


}
