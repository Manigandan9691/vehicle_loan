package com.lit.appl.vehicleloan.beans;

public class Offer {

	private int offerId;
	private long offerAmount;
	private int offerinterest;
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
