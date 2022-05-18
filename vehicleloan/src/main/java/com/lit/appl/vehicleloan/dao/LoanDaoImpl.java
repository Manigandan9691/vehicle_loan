package com.lit.appl.vehicleloan.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lit.appl.vehicleloan.beans.Customer;
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

	@Override
	@Transactional
	public void appLoan(Loan lid) {

		em.persist(lid);
	}

	@Override
	public List<Loan> listAllLoan() {
		Query qry=em.createQuery("Select l From Loan l");
		List<Loan>loanList= qry.getResultList();
		System.out.println("cust list "+loanList);
		return loanList;
	}

}
