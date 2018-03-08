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

import com.fireworks.kundalini.orderprocessor.pojo.customer.Customer;
import com.fireworks.kundalini.orderprocessor.service.ICustomerDetailsService;

@Path("customer")
@Component
public class CustomerController {

	@Autowired
	ICustomerDetailsService customerDetailsService;
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void saveCustomer(Customer customer) {
		customerDetailsService.saveCustomer(customer);
	}
	
	@GET
	@Path("{customerMailId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Customer getOfferByID(@PathParam("customerMailId") String customerMailId) {
		return customerDetailsService.fetchCustomerByMailId(customerMailId);
	}
	
}
