package com.lit.appl.vehicleloan.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="OFFERS")
public class Offer {

	@Id
	@Column(name="OFFERID")
	private int offerId;
	
	@Column(name="OFFERAMOUNT")
	private long offerAmount;
	
	@Column(name="OFFERINTEREST")
	private int offerinterest;
	
	@Column(name="OFFERTENURE")
	private int offerTensure;

	public Offer(int offerId, long offerAmount, int offerinterest, int offerTensure) {
		super();
		this.offerId = offerId;
		this.offerAmount = offerAmount;
		this.offerinterest = offerinterest;
		this.offerTensure = offerTensure;
	}

	public Offer() {
		super();
	}

	public int getOfferId() {
		return offerId;
	}

	public void setOfferId(int offerId) {
		this.offerId = offerId;
	}

	public long getOfferAmount() {
		return offerAmount;
	}

	public void setOfferAmount(long offerAmount) {
		this.offerAmount = offerAmount;
	}

	public int getOfferinterest() {
		return offerinterest;
	}

	public void setOfferinterest(int offerinterest) {
		this.offerinterest = offerinterest;
	}

	public int getOfferTensure() {
		return offerTensure;
	}

	public void setOfferTensure(int offerTensure) {
		this.offerTensure = offerTensure;
	}

	@Override
	public String toString() {
		return "Offer [offerId=" + offerId + ", offerAmount=" + offerAmount + ", offerinterest=" + offerinterest
				+ ", offerTensure=" + offerTensure + "]";
	}
	
	
}
