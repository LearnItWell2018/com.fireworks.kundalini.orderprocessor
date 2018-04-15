package com.fireworks.kundalini.orderprocessor.service;

import java.util.List;

import com.fireworks.kundalini.orderprocessor.pojo.customerorder.CustomerOrder;

public interface IOrderDetailsService {
	public CustomerOrder saveOrder(CustomerOrder order);
	public List<CustomerOrder> fetchOrderForCustomer(String customerMail);
	public void generatePdf(CustomerOrder order);
	public void sendMail(CustomerOrder order);
}
