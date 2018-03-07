package com.fireworks.kundalini.orderprocessor.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fireworks.kundalini.orderprocessor.db.crud.MongoCRUDOrder;
import com.fireworks.kundalini.orderprocessor.helper.Helper;
import com.fireworks.kundalini.orderprocessor.pojo.Order;
import com.fireworks.kundalini.orderprocessor.service.IOfferDetailsService;

@Service
public class OfferDetailsServiceImpl implements IOfferDetailsService {

	
	@Autowired
	MongoCRUDOrder mongoCollectionOrder;

	@Override
	public Order saveOrder(Order order) {
		order.setOrderId(mongoCollectionOrder.create(order));
		return order;
	}

	@Override
	public Order fetchOrder(String objectId) {
		Order order = Helper.providePOJO4JSON(mongoCollectionOrder.read(objectId), Order.class);
		order.setOrderId(objectId);
		return order;
	}

}
