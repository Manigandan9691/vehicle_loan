package com.lit.appl.vehicleloan.uicontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lit.appl.vehicleloan.beans.Offer;
import com.lit.appl.vehicleloan.services.OfferServiceImpl;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/offer")
public class OfferController {

	@Autowired
	OfferServiceImpl offerService;
	
	
	//http://localhost:8282/cust/offer
	
	@PostMapping("/selectoffer")
	public void selectOfferByOfferId(@RequestBody Offer oid)
	{
		offerService.addOffer(oid);
	}
	@PostMapping("/addoffer")
	public void addOffer(@RequestBody Offer offerid)
	{
		offerService.addOffer(offerid);
	}
}
