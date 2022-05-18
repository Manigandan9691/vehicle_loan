package com.lit.appl.vehicleloan.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lit.appl.vehicleloan.beans.Offer;
import com.lit.appl.vehicleloan.dao.OfferDao;

@Service("offerService")
public class OfferServiceImpl implements OfferService{
	
	@Autowired
	OfferDao dao;

	
	public OfferDao getDao() {
		return dao;
	}


	public void setDao(OfferDao dao) {
		this.dao = dao;
	}


	@Override
	public void selectOfferByOfferId(Offer oid) {
	
		dao.selectOfferByOfferId(oid);
		
	}


	@Override
	public void addOffer(Offer offerid) {
		dao.addOffer(offerid);
		
	}

}
