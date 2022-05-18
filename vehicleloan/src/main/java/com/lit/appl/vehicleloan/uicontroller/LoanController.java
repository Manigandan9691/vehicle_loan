package com.lit.appl.vehicleloan.uicontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lit.appl.vehicleloan.beans.Customer;
import com.lit.appl.vehicleloan.beans.Loan;
import com.lit.appl.vehicleloan.services.LoanServiceImpl;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/loan")
public class LoanController {
	
	@Autowired
	private LoanServiceImpl loanServ;
	
	//http://localhost:8282/loan/addloan
	@PostMapping(path="/addloan",produces="application/json",consumes="application/json")
	public void addLoan(@RequestBody Loan lid)
	{
		System.out.println(lid);
		loanServ.addLoan(lid);
	}
	@PostMapping("/applyloan")
	public void applyLoan(@RequestBody Loan lid)
	{
		loanServ.appLoan(lid);
	} 
	
	@GetMapping("/loans")
	public List<Loan> listAllLoan()
	{
		return loanServ.listAllLoan();
	}
	
}
