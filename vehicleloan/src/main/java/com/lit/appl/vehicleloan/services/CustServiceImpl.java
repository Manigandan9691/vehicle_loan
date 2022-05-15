package com.lit.appl.vehicleloan.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lit.appl.vehicleloan.beans.Customer;
import com.lit.appl.vehicleloan.beans.Employment;
import com.lit.appl.vehicleloan.beans.Loan;
import com.lit.appl.vehicleloan.beans.Offer;
import com.lit.appl.vehicleloan.dao.CustDao;

@Service("custService")
public class CustServiceImpl implements CustService {

	@Autowired
	CustDao dao;
	
	public CustDao getDao() {
		return dao;
	}

	public void setDao(CustDao dao) {
		this.dao = dao;
	}

	@Override
	public void addCust(Customer custid) {
	dao.addCust(custid);
		
	}

	@Override
	public void selectOfferByOfferId(Offer oid) {
	//	dao.selectOfferByOfferId(oid);
		
	}

	@Override
	public void addEmployeementDetails(Employment eid) {
	//	dao.addEmployeementDetails(eid);
		
	}

	@Override
	public void appLoan(Loan lid) {
	
	//	dao.appLoan(lid);
		
	}

	

}
