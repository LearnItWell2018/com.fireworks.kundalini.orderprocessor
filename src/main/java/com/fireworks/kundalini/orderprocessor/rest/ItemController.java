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

import com.fireworks.kundalini.orderprocessor.pojo.items.ItemTypeList;
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
	
	@GET
	@Path("{itemName}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<ItemTypeList> getItem(@PathParam("itemName") String itemName) {
		return itemsDetailsService.getItem(itemName);
	}
	
	@GET
	@Path("{itemName}/{productID}")
	@Produces(MediaType.APPLICATION_JSON)
	public ItemTypeList getItem(@PathParam("itemName") String itemName, @PathParam("productID") String productID) {
		return itemsDetailsService.getProduct(itemName, productID);
	}
	
	@GET
	@Path("list")
	@Produces(MediaType.APPLICATION_JSON)
	public List<ItemTypeList> getItemsByName() {
		return itemsDetailsService.getItemsByName();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void setItems(KundaliniItems items) {
		itemsDetailsService.setItems(items);
	}
	
	
}
