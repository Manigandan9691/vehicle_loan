package com.lit.appl.vehicleloan.services;

import java.util.List;

import com.lit.appl.vehicleloan.beans.Loan;

public interface LoanService {

	public void addLoan(Loan lid);
	public void appLoan(Loan lid);
	public List<Loan> listAllLoan();
}
