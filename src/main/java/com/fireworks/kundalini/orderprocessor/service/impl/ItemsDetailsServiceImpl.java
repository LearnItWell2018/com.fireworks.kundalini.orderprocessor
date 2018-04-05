package com.fireworks.kundalini.orderprocessor.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fireworks.kundalini.orderprocessor.db.crud.ItemsRepository;
import com.fireworks.kundalini.orderprocessor.pojo.itemcategories.Item;
import com.fireworks.kundalini.orderprocessor.pojo.itemcategories.ItemCategories;
import com.fireworks.kundalini.orderprocessor.pojo.items.ItemList;
import com.fireworks.kundalini.orderprocessor.pojo.items.ItemTypeList;
import com.fireworks.kundalini.orderprocessor.pojo.items.KundaliniItems;
import com.fireworks.kundalini.orderprocessor.service.IItemsDetailsService;

@Service
public class ItemsDetailsServiceImpl implements IItemsDetailsService {
	
	@Autowired
	ItemsRepository itemsRepository;
	
	@Override
	public KundaliniItems getItems() {
		return itemsRepository.findByitemStatus("active");
	}

	@Override
	public void setItems(KundaliniItems items) {
		itemsRepository.save(items);
	}

	@Override
	public List<ItemTypeList> getItem(String itemName) {
		KundaliniItems kundaliniItems = getItems();
		for (ItemList itemList : kundaliniItems.getItems().getItemList()) {
			if (itemName.equalsIgnoreCase(itemList.getItemName())) {
				return itemList.getItemTypeList();
			}
		}
		return null;
	}

	@Override
	public ItemTypeList getProduct(String itemName, String productId) {
		for (ItemTypeList itemTypeList : getItem(itemName)) {
			if (productId.equals(itemTypeList.getProductId())) {
				return itemTypeList;
			}
		}
		return null;
	}

	@Override
	public ItemCategories getItemCategories() {
		ItemCategories itemCategories = new ItemCategories();
		List<Item> items = new ArrayList<>();
		Item item;
		KundaliniItems kundaliniItems = getItems();
		for (ItemList itemList : kundaliniItems.getItems().getItemList()) {
			item = new Item();
			item.setItemName(itemList.getItemName());
			item.setItemIMGPath(itemList.getItemIMGPath());
			item.setItemURL(itemList.getItemName());
			items.add(item);
		}
		itemCategories.setItems(items);
		return itemCategories;
	}

	@Override
	public List<ItemTypeList> getItemsByName() {
		KundaliniItems kundaliniItems = getItems();
		List<ItemTypeList> itemNameList = new ArrayList<>();
		for (ItemList itemList : kundaliniItems.getItems().getItemList()) {
			itemNameList.addAll(itemList.getItemTypeList());
		}
		return itemNameList;
	}
	
}
