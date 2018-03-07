package com.fireworks.kundalini.orderprocessor.service;

import com.fireworks.kundalini.orderprocessor.pojo.items.Items;
import com.fireworks.kundalini.orderprocessor.pojo.items.KundaliniItems;

public interface IItemsDetailsService {

	public KundaliniItems getItems();
	public void setItems(KundaliniItems items);
}
