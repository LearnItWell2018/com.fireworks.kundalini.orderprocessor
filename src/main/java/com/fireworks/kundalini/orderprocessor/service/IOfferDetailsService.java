package com.fireworks.kundalini.orderprocessor.service;

import com.fireworks.kundalini.orderprocessor.pojo.Order;
import com.fireworks.kundalini.orderprocessor.pojo.customerorder.CustomerOrder;

public interface IOfferDetailsService {
	public CustomerOrder saveOrder(CustomerOrder order);
	/*public Order fetchOrder(String objectId);*/
}
