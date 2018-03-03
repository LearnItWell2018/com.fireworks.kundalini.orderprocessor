package com.fireworks.kundalini.orderprocessor.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fireworks.kundalini.orderprocessor.db.crud.MongoCRUDOrder;
import com.fireworks.kundalini.orderprocessor.helper.Helper;
import com.fireworks.kundalini.orderprocessor.pojo.Order;
import com.fireworks.kundalini.orderprocessor.service.IGetOfferDetailsService;

@Service
public class GetOfferDetailsServiceImpl implements IGetOfferDetailsService {

	
	@Autowired
	MongoCRUDOrder mongoCollection;

	@Override
	public Order saveOrder(Order order) {
		order.setOrderId(mongoCollection.create(order));
		return order;
	}

	@Override
	public Order fetchOrder(String objectId) {
		Order order = Helper.providePOJO4JSON(mongoCollection.read(objectId));
		order.setOrderId(objectId);
		return order;
	}

}
