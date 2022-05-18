package com.lit.appl.vehicleloan.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lit.appl.vehicleloan.beans.Offer;

@Repository
public class OfferDaoImpl implements OfferDao {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	@Transactional
	public void selectOfferByOfferId(Offer oid) {
		
		em.persist(oid);
		
	}

	@Override
	public void addOffer(Offer offerid) {
	
		em.persist(offerid);
		
	}

}
