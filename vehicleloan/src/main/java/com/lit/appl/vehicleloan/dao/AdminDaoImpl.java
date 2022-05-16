package com.lit.appl.vehicleloan.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lit.appl.vehicleloan.beans.Admin;

@Repository
public class AdminDaoImpl implements AdminDao{

	@PersistenceContext
	private EntityManager em;
	
	@Override
	@Transactional
	public void addAdmin(Admin aid) {
	
		em.persist(aid);
	}

	
}
