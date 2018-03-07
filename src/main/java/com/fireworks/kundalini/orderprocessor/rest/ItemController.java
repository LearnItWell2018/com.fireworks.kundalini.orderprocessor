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
import com.fireworks.kundalini.orderprocessor.service.IItemsDetailsService;

@Path("items")
@Component
public class ItemController {
	
	@Autowired
	IItemsDetailsService itemsDetailsService;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public KundaliniItems getItems() {
		return itemsDetailsService.getItems();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void setItems(KundaliniItems items) {
		itemsDetailsService.setItems(items);
	}
	
	
}
