package com.fireworks.kundalini.orderprocessor.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fireworks.kundalini.orderprocessor.db.crud.ItemsRepository;
import com.fireworks.kundalini.orderprocessor.pojo.items.KundaliniItems;
import com.fireworks.kundalini.orderprocessor.service.IItemsDetailsService;

@Service
public class ItemsDetailsServiceImpl implements IItemsDetailsService{
	
	@Autowired
	ItemsRepository itemsRepository;
	
	@Override
	public KundaliniItems getItems() {
		return itemsRepository.findAll().get(0);
	}

	@Override
	public void setItems(KundaliniItems items) {
		itemsRepository.save(items);
	}

}
