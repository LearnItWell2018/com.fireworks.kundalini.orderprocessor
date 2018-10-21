package com.fireworks.kundalini.orderprocessor.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fireworks.kundalini.orderprocessor.db.crud.CustomerOrderRepository;
import com.fireworks.kundalini.orderprocessor.db.crud.ReferRepository;
import com.fireworks.kundalini.orderprocessor.pojo.customerorder.CustomerOrder;
import com.fireworks.kundalini.orderprocessor.pojo.customerorder.ReferOrder;
import com.fireworks.kundalini.orderprocessor.service.IOrderDetailsService;

@Service
public class OrderDetailsServiceImpl implements IOrderDetailsService {

	
	@Autowired
	CustomerOrderRepository customerOrderRepository;
	
	@Autowired
	ReferRepository referRepository;
	
	@Override
	public CustomerOrder saveOrder(CustomerOrder order) {
		customerOrderRepository.save(order);
		return order;
	}

	@Override
	public List<CustomerOrder> fetchOrderForCustomer(String customerMail) {
		return customerOrderRepository.findBycustomerMail(customerMail);
	}

	@Override
	public ReferOrder referCustomer(ReferOrder referOrder) {
		referRepository.save(referOrder);
		return referOrder;
	}

	@Override
	public List<ReferOrder> getReferCustomer(String customerMail) {
		return referRepository.findBycustomerMail(customerMail);
	}
	
	
}
