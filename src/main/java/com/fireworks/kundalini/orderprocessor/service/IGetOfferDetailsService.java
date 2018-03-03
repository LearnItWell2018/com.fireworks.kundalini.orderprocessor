package com.fireworks.kundalini.orderprocessor.service;

import com.fireworks.kundalini.orderprocessor.pojo.Order;

public interface IGetOfferDetailsService {
	public Order saveOrder(Order order);
	public Order fetchOrder(String objectId);
}
