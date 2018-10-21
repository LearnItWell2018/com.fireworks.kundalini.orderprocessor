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

import com.fireworks.kundalini.orderprocessor.pojo.customerorder.ReferOrder;
import com.fireworks.kundalini.orderprocessor.service.IOrderDetailsService;

@Path("refer")
@Component
public class ReferController {

	@Autowired
	IOrderDetailsService orderDetailsService;
	
	@GET
	@Path("{customerMailId}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<ReferOrder> getReferDetails(@PathParam("customerMailId") String customerMailId) {
		return orderDetailsService.getReferCustomer(customerMailId);
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public ReferOrder referCustomer(ReferOrder referOrder) {
		return orderDetailsService.referCustomer(referOrder);
	}
	
}
