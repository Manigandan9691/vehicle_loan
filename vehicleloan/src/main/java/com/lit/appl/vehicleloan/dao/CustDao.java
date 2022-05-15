package com.lit.appl.vehicleloan.dao;

import com.lit.appl.vehicleloan.beans.Customer;
import com.lit.appl.vehicleloan.beans.Employment;
import com.lit.appl.vehicleloan.beans.Loan;
import com.lit.appl.vehicleloan.beans.Offer;

public interface CustDao {

	public void addCust(Customer custid);
	
	public void selectOfferByOfferId(Offer oid);
	
	public void addEmployeementDetails(Employment eid);
	
	public void appLoan(Loan lid);
	
}
