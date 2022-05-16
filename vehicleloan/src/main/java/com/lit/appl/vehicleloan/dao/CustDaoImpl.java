package com.lit.appl.vehicleloan.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lit.appl.vehicleloan.beans.Customer;
import com.lit.appl.vehicleloan.beans.Employment;
import com.lit.appl.vehicleloan.beans.Loan;
import com.lit.appl.vehicleloan.beans.Offer;
import com.lit.appl.vehicleloan.beans.Vehicle;


@Repository
public class CustDaoImpl implements CustDao {

	@PersistenceContext
	private EntityManager em;
	
	
	@Override
	@Transactional
	public void addCust(Customer custid) {
	
		em.persist(custid);
		
	}

	@Override
	@Transactional
	public void selectOfferByOfferId(Offer oid) {
		
		em.persist(oid);
		
	}

	@Override
	@Transactional
	public void addEmployeementDetails(Employment eid) {
		
		em.persist(eid);
		
	}

	@Override
	@Transactional
	public void appLoan(Loan lid) {
		
		em.persist(lid);
		
	}

	

	@Override
	public boolean logCust(Customer clogin) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Customer> listAllCustomer() {
		
		Query qry=em.createQuery("Select c From Customer c");
		List<Customer>custList= qry.getResultList();
		System.out.println("cust list "+custList);
		
		return custList;
	}
	
	

}
