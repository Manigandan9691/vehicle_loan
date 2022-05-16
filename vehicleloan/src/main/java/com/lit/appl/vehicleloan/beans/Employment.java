package com.lit.appl.vehicleloan.beans;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="EMPLOYMENTS")
public class Employment {

	
	@Id
	@Column(name="EMPID")
	private int empId;
	
	@Column(name="EMPTYPE")
	private String empType;
	
	@Column(name="SALARY")
	private int salary;
	
	@Column(name="EXISTINGEMI")
	private int existingEmi;

	@OneToOne
	@JoinColumn(name="custId")
	private Customer c;

	public Employment(int empId, String empType, int salary, int existingEmi, Customer c) {
		super();
		this.empId = empId;
		this.empType = empType;
		this.salary = salary;
		this.existingEmi = existingEmi;
		this.c = c;
	}

	public Employment() {
		super();
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpType() {
		return empType;
	}

	public void setEmpType(String empType) {
		this.empType = empType;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getExistingEmi() {
		return existingEmi;
	}

	public void setExistingEmi(int existingEmi) {
		this.existingEmi = existingEmi;
	}

	public Customer getC() {
		return c;
	}

	public void setC(Customer c) {
		this.c = c;
	}

	@Override
	public String toString() {
		return "Employment [empId=" + empId + ", empType=" + empType + ", salary=" + salary + ", existingEmi="
				+ existingEmi + ", c=" + c + "]";
	}

	
	
}