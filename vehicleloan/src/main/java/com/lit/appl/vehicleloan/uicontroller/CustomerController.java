package com.lit.appl.vehicleloan.uicontroller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lit.appl.vehicleloan.beans.Customer;
import com.lit.appl.vehicleloan.beans.Employment;
import com.lit.appl.vehicleloan.beans.Loan;
import com.lit.appl.vehicleloan.beans.Offer;
import com.lit.appl.vehicleloan.beans.Vehicle;
import com.lit.appl.vehicleloan.services.CustServiceImpl;

import java.util.List;

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
	//http://localhost:8282/cust/employment
	@PostMapping("/employment")
	public void addemployment(@RequestBody Employment eid)
	{
		custService.addEmployeementDetails(eid);
	}

	@PostMapping(path="/logincustomer" , produces="application/json")
	public boolean logCust(@RequestBody Customer clogin)
	{
		System.out.println("login");
		return custService.logCust(clogin);
		
	}
	
	@GetMapping("/customers")
	public List<Customer> listAllCustomer()
	{
		return custService.listAllCustomer();
	}
	
//	http://localhost:8282/cust/custid/101
	@GetMapping(path="/custid/{id}",produces="application/json")
	public Customer SearchCustomerById(@PathVariable(value="id") int id)
	{
		
		return custService.SearchCustomerById(id);
	}
	
}
