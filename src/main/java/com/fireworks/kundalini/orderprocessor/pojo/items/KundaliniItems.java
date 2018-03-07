package com.fireworks.kundalini.orderprocessor.pojo.items;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "items")
public class KundaliniItems {

	private Items items;

	public Items getItems() {
		return items;
	}

	public void setItems(Items items) {
		this.items = items;
	}
	
}
