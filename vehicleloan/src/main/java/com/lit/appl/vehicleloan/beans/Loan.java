package com.lit.appl.vehicleloan.beans;

public class Loan {
	
	private int loanId;
	private long loanAmount;
	private int loanTenure;
	private int rateOfinterrest;
	private long processingFee;
	private String status;
	private long loanNumber;
	private long emi;
	
	public Loan(int loanId, long loanAmount, int loanTenure, int rateOfinterrest, long processingFee, String status,
			long loanNumber, long emi) {
		super();
		this.loanId = loanId;
		this.loanAmount = loanAmount;
		this.loanTenure = loanTenure;
		this.rateOfinterrest = rateOfinterrest;
		this.processingFee = processingFee;
		this.status = status;
		this.loanNumber = loanNumber;
		this.emi = emi;
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

	@Override
	public String toString() {
		return "Loan [loanId=" + loanId + ", loanAmount=" + loanAmount + ", loanTenure=" + loanTenure
				+ ", rateOfinterrest=" + rateOfinterrest + ", processingFee=" + processingFee + ", status=" + status
				+ ", loanNumber=" + loanNumber + ", emi=" + emi + "]";
	}
	
	
	


}
