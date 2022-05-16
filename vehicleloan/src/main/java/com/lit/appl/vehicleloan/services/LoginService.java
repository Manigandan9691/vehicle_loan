package com.lit.appl.vehicleloan.services;

import com.lit.appl.vehicleloan.beans.Admin;
import com.lit.appl.vehicleloan.beans.Customer;

public interface LoginService {
	
	public boolean logCust(Customer clogin);
	
	public boolean logAdmin(Admin alogin);

}
