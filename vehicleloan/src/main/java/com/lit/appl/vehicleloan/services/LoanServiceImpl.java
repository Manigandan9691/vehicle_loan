package com.lit.appl.vehicleloan.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lit.appl.vehicleloan.beans.Loan;
import com.lit.appl.vehicleloan.dao.LoanDao;

@Service("loanServ")
public class LoanServiceImpl implements LoanService{
	

	@Autowired
	LoanDao dao;
	

	public LoanDao getDao() {
		return dao;
	}


	public void setDao(LoanDao dao) {
		this.dao = dao;
	}


	@Override
	public void addLoan(Loan lid) {
		
	dao.addLoan(lid);

		
	}

}
