package com.fireworks.kundalini.orderprocessor.service.impl;

import org.springframework.stereotype.Service;

import com.fireworks.kundalini.orderprocessor.pojo.Order;
import com.fireworks.kundalini.orderprocessor.service.IOrderProcessor;

@Service
public class OrderProcessor implements IOrderProcessor {

	@Override
	public boolean saveOrder(Order order) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Order fetchOrder(Order order) {
		// TODO Auto-generated method stub
		return null;
	}

}
