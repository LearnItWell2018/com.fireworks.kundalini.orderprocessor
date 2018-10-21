package com.fireworks.kundalini.orderprocessor.service;

import java.util.List;

import com.fireworks.kundalini.orderprocessor.pojo.customerorder.CustomerOrder;
import com.fireworks.kundalini.orderprocessor.pojo.customerorder.ReferOrder;

public interface IOrderDetailsService {
	public CustomerOrder saveOrder(CustomerOrder order);
	public List<CustomerOrder> fetchOrderForCustomer(String customerMail);
	public ReferOrder referCustomer(ReferOrder eferOrder);
	public List<ReferOrder> getReferCustomer(String customerMail);
}
