package com.lit.appl.vehicleloan.dao;

import java.util.List;

import com.lit.appl.vehicleloan.beans.Loan;

public interface LoanDao {

	public void addLoan(Loan lid);
	
	public void appLoan(Loan lid);
	
	public List<Loan> listAllLoan();
}
