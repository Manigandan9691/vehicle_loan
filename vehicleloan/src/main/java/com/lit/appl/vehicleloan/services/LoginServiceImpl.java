package com.lit.appl.vehicleloan.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lit.appl.vehicleloan.beans.Admin;
import com.lit.appl.vehicleloan.beans.Customer;
import com.lit.appl.vehicleloan.dao.LoginDao;

@Service("adminServ")
public class LoginServiceImpl implements LoginService {

	@Autowired
	LoginDao dao;
	
	@Override
	public boolean logCust(Customer clogin) {
		dao.logCust(clogin);
		
		return true;
	
		
	}

	@Override
	public boolean logAdmin(Admin alogin) {
		dao.logAdmin(alogin);
		
		return true;
	}



}
