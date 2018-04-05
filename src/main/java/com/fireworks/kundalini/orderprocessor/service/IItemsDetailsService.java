package com.fireworks.kundalini.orderprocessor.service;

import java.util.List;

import com.fireworks.kundalini.orderprocessor.pojo.itemcategories.ItemCategories;
import com.fireworks.kundalini.orderprocessor.pojo.items.ItemTypeList;
import com.fireworks.kundalini.orderprocessor.pojo.items.KundaliniItems;

public interface IItemsDetailsService {

	public KundaliniItems getItems();
	public void setItems(KundaliniItems items);
	public List<ItemTypeList> getItem(String itemName);
	public ItemTypeList getProduct(String itemName,String productId);
	public ItemCategories getItemCategories();
	public List<ItemTypeList> getItemsByName();
}
