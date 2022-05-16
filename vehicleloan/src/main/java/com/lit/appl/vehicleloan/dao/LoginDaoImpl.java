package com.lit.appl.vehicleloan.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.lit.appl.vehicleloan.beans.Admin;
import com.lit.appl.vehicleloan.beans.Customer;

@Repository
public class LoginDaoImpl implements LoginDao{

	@PersistenceContext
	private EntityManager em;
	@Override
	public boolean logCust(Customer clogin) {
		System.out.println(clogin.toString());
	String emailId=clogin.getEmailId();
	String password=clogin.getPassword();
		
	TypedQuery<Customer> tqry=em.createQuery("Select c from Customers c",Customer.class);
	List<Customer> user=tqry.getResultList();
	
	for(Customer c:user) {
		
		if(c.getEmailId()==emailId && c.getPassword()==password ) {
			return true;
		}
		System.out.println(c.getEmailId()+ " " + c.getPassword());

	}
	
	return false;
}
	@Override
	public boolean logAdmin(Admin alogin) {
	
		System.out.println(alogin.toString());
		String emailId=alogin.getAdminUserName();
		String password=alogin.getPassword();
			
		TypedQuery<Admin> tqry=em.createQuery("Select a from Admins a",Admin.class);
		List<Admin> user=tqry.getResultList();
		
		for(Admin a:user) {
			
			if(a.getAdminUserName()==emailId && a.getPassword()==password ) {
				return true;
			}
			System.out.println(a.getAdminUserName()+ " " + a.getPassword());

		}
		
		return false;
	}

}

