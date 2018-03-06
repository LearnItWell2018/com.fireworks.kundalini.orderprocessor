package com.fireworks.kundalini.orderprocessor.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fireworks.kundalini.orderprocessor.pojo.Order;
import com.fireworks.kundalini.orderprocessor.service.IOfferDetailsService;

@Path("order")
@Component
public class OrderController {

	
	@Autowired
	IOfferDetailsService offerDetailsService;
	
	@GET
	@Path("{orderId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Order getOfferByID(@PathParam("orderId") String orderId) {
		return offerDetailsService.fetchOrder(orderId);
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Order insertOrder(Order order) {
		return offerDetailsService.saveOrder(order);
	}
}
