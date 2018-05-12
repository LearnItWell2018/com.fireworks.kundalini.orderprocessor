package com.fireworks.kundalini.orderprocessor.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fireworks.kundalini.orderprocessor.pojo.customerorder.CustomerOrder;
import com.fireworks.kundalini.orderprocessor.service.IOrderDetailsService;

@Path("order")
@Component
public class OrderController {

	@Autowired
	IOrderDetailsService orderDetailsService;

	@GET
	@Path("{customerMailId}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<CustomerOrder> getOfferByID(@PathParam("customerMailId") String customerMailId) {
		return orderDetailsService.fetchOrderForCustomer(customerMailId);
	}

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public CustomerOrder insertOrder(CustomerOrder order) {
		orderDetailsService.saveOrder(order);
		return order;
	}
}
