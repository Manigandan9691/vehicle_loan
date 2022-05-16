package com.lit.appl.vehicleloan.dao;

import com.lit.appl.vehicleloan.beans.Admin;
import com.lit.appl.vehicleloan.beans.Customer;

public interface LoginDao {

	public boolean logCust(Customer clogin);
	
	public boolean logAdmin(Admin alogin);
	
}
