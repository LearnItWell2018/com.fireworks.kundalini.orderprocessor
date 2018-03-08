package com.fireworks.kundalini.orderprocessor.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fireworks.kundalini.orderprocessor.pojo.itemcategories.ItemCategories;
import com.fireworks.kundalini.orderprocessor.service.IItemsDetailsService;

@Path("itemCategories")
@Component
public class ItemCategoriesController {

	@Autowired
	IItemsDetailsService itemsDetailsService;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ItemCategories getItemCategories() {
		return itemsDetailsService.getItemCategories();
	}
	
}
