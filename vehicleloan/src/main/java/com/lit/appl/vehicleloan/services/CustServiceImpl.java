package com.lit.appl.vehicleloan.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lit.appl.vehicleloan.beans.Customer;
import com.lit.appl.vehicleloan.beans.Employment;
import com.lit.appl.vehicleloan.beans.Loan;
import com.lit.appl.vehicleloan.beans.Offer;
import com.lit.appl.vehicleloan.beans.Vehicle;
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
		dao.selectOfferByOfferId(oid);
		
	}

	@Override
	public void addEmployeementDetails(Employment eid) {
		dao.addEmployeementDetails(eid);
		
	}

	@Override
	public void appLoan(Loan lid) {
	
		dao.appLoan(lid);
		
	}

	

	@Override
	public boolean logCust(Customer clogin) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Customer> listAllCustomer() {
		
		List<Customer>custList=dao.listAllCustomer();
		
		return custList;
	}

	

}
