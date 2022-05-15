package com.lit.appl.vehicleloan.dao;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.lit.appl.vehicleloan.beans.Customer;


@Repository
public class LoginDaoImpl implements LoginDao{

	private EntityManager em;
	@Override
	public Customer custLogin(LoginDao logindao) {
		
		
		Query query = em.createQuery(
				"Select user from Customer as user where user.emailId=:emailId and user.password=:password ");
		query.setParameter("emailId", LoginDao.class);
		query.setParameter("password", LoginDao.class);
		

		if (query.getResultList().size() > 0)
			return (Customer) (query.getResultList().get(0));

		return null;
				
		
	}

	
}
