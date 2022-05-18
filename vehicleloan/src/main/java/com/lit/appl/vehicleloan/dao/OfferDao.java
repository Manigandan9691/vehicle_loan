package com.lit.appl.vehicleloan.dao;


import com.lit.appl.vehicleloan.beans.Offer;

public interface OfferDao {
	
	public void addOffer(Offer offerid);
	public void selectOfferByOfferId(Offer oid);
	

}
