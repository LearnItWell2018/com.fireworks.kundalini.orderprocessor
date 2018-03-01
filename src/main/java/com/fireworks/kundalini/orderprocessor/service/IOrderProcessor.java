package com.fireworks.kundalini.orderprocessor.service;

import com.fireworks.kundalini.orderprocessor.pojo.Order;

public interface IOrderProcessor {

	public boolean saveOrder(Order order);
	
	public Order fetchOrder(Order order);
}
