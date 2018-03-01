package com.fireworks.kundalini.orderprocessor.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fireworks.kundalini.orderprocessor.pojo.Order;
import com.fireworks.kundalini.orderprocessor.service.IOrderProcessor;

/**
 * Root resource (exposed at "orderController" path)
 */
@Path("order")
@Component
public class OrderController {

	
	@Autowired
	IOrderProcessor orderProcessor;
	
	
	@GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Got it!";
    }
	
	
	@POST
	@Path("/")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response insertOrder(Order order) {
		String result;
		if (orderProcessor.saveOrder(order)) {
			result = "order processed sucessfully";
		} else {
			result = "order not processed";
		}
		return Response.status(200).entity(result).build();
	}
}
