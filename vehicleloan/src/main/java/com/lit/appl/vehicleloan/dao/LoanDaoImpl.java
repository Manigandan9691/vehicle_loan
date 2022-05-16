package com.lit.appl.vehicleloan.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lit.appl.vehicleloan.beans.Loan;

@Repository
public class LoanDaoImpl implements LoanDao {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	@Transactional
	public void addLoan(Loan lid) {
		
		em.persist(lid);
	}

}
