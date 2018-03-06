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

import com.fireworks.kundalini.orderprocessor.pojo.items.KundaliniItems;

@Path("items")
@Component
public class ItemController {
	
	

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public KundaliniItems getItems() {
		return new KundaliniItems();
	}
	
	
	
	
}