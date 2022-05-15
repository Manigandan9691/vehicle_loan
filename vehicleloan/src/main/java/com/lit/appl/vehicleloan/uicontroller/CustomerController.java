package com.lit.appl.vehicleloan.uicontroller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lit.appl.vehicleloan.beans.Customer;
import com.lit.appl.vehicleloan.beans.Employment;
import com.lit.appl.vehicleloan.beans.Loan;
import com.lit.appl.vehicleloan.beans.Offer;
import com.lit.appl.vehicleloan.services.CustServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/cust")
public class CustomerController {

	@Autowired
	CustServiceImpl custService;
	
	//http://localhost:8282/cust/addcust
	
	@PostMapping("/addcust")
	public void addCust(@RequestBody Customer custid)
	{
		System.out.println(custid.toString());
		custService.addCust(custid);
		
	}
	
/*	
	//http://localhost:8282/cust/offer
//	@PostMapping("/offer")
//	public void selectOfferById(@RequestBody Offer oid)
//	{
//		custService.selectOfferByOfferId(oid);
//	}
	
	
	//http://localhost:8282/cust/employment
	@PostMapping("/employment")
	public void addemployment(@RequestBody Employment eid)
	{
		custService.addEmployeementDetails(eid);
	}
	
	//http://localhost:8282/cust//loan
	@PostMapping("/loan")
	public void applyLoan(@RequestBody Loan lid)
	{
		custService.appLoan(lid);
	} */
}
