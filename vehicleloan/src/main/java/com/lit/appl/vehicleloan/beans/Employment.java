package com.lit.appl.vehicleloan.beans;

public class Employment {

	private int empId;
	private String empType;
	private int salary;
	private int existingEmi;

	public Employment(int empId, String empType, int salary, int existingEmi) {
		super();
		this.empId = empId;
		this.empType = empType;
		this.salary = salary;
		this.existingEmi = existingEmi;
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

	@Override
	public String toString() {
		return "Employment [empId=" + empId + ", empType=" + empType + ", salary=" + salary + ", existingEmi="
				+ existingEmi + "]";
	}
	
	
	
}
