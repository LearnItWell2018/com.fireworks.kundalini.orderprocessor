package com.fireworks.kundalini.orderprocessor.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fireworks.kundalini.orderprocessor.pojo.offer.Offers;
import com.fireworks.kundalini.orderprocessor.service.IItemsDetailsService;

@Path("offer")
@Component
public class OfferController {

	@Autowired
	IItemsDetailsService itemsDetailsService;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Offers> getItemCategories() {
		return itemsDetailsService.getOffers();
	}
	
}
