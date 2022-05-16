package com.lit.appl.vehicleloan.beans;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="LOANS")
public class Loan {
	
	@Id
	@Column(name="LOANNUMBER")
	private long loanNumber;
	
	@Column(name="LOANID")
	private int loanId;
	
	@Column(name="LOANAMOUNT")
	private long loanAmount;
	
	@Column(name="LOANTENURE")
	private int loanTenure;
	
	@Column(name="RATEOFINTEREST")
	private int rateOfinterrest;
	
	@Column(name="PROCESSINGFEE")
	private long processingFee;
	
	@Column(name="STATUS")
	private String status;
	
	
	
	@Column(name="EMI")
	private long emi;
	
	@OneToOne
	@JoinColumn(name="CUSTID")
	private Customer c;
	
	@OneToOne
	@JoinColumn(name="VEHICLENUMBER")
	private Vehicle v;

	
	public Loan(int loanId, long loanAmount, int loanTenure, int rateOfinterrest, long processingFee, String status,
			long loanNumber, long emi, Customer c, Vehicle v) {
		super();
		this.loanId = loanId;
		this.loanAmount = loanAmount;
		this.loanTenure = loanTenure;
		this.rateOfinterrest = rateOfinterrest;
		this.processingFee = processingFee;
		this.status = status;
		this.loanNumber = loanNumber;
		this.emi = emi;
		this.c = c;
		this.v = v;
	}


	public Loan() {
		super();
	}


	public int getLoanId() {
		return loanId;
	}


	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}


	public long getLoanAmount() {
		return loanAmount;
	}


	public void setLoanAmount(long loanAmount) {
		this.loanAmount = loanAmount;
	}


	public int getLoanTenure() {
		return loanTenure;
	}


	public void setLoanTenure(int loanTenure) {
		this.loanTenure = loanTenure;
	}


	public int getRateOfinterrest() {
		return rateOfinterrest;
	}


	public void setRateOfinterrest(int rateOfinterrest) {
		this.rateOfinterrest = rateOfinterrest;
	}


	public long getProcessingFee() {
		return processingFee;
	}


	public void setProcessingFee(long processingFee) {
		this.processingFee = processingFee;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public long getLoanNumber() {
		return loanNumber;
	}


	public void setLoanNumber(long loanNumber) {
		this.loanNumber = loanNumber;
	}


	public long getEmi() {
		return emi;
	}


	public void setEmi(long emi) {
		this.emi = emi;
	}


	public Customer getC() {
		return c;
	}


	public void setC(Customer c) {
		this.c = c;
	}


	public Vehicle getV() {
		return v;
	}


	public void setV(Vehicle v) {
		this.v = v;
	}


	@Override
	public String toString() {
		return "Loan [loanId=" + loanId + ", loanAmount=" + loanAmount + ", loanTenure=" + loanTenure
				+ ", rateOfinterrest=" + rateOfinterrest + ", processingFee=" + processingFee + ", status=" + status
				+ ", loanNumber=" + loanNumber + ", emi=" + emi + ", c=" + c + ", v=" + v + "]";
	}
	
	
	
	
}
	