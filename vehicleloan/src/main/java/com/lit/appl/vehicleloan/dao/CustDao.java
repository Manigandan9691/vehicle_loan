package com.lit.appl.vehicleloan.dao;

import java.util.List;

import com.lit.appl.vehicleloan.beans.Customer;
import com.lit.appl.vehicleloan.beans.Employment;
import com.lit.appl.vehicleloan.beans.Loan;
import com.lit.appl.vehicleloan.beans.Offer;
import com.lit.appl.vehicleloan.beans.Vehicle;

public interface CustDao {

	public void addCust(Customer custid);
	
	public void selectOfferByOfferId(Offer oid);
	
	public void addEmployeementDetails(Employment eid);
	
	public void appLoan(Loan lid);
	
	public List<Customer> listAllCustomer();
	
	public boolean logCust(Customer clogin);
	
}
