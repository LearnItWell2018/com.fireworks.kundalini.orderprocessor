package com.fireworks.kundalini.orderprocessor.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fireworks.kundalini.orderprocessor.db.crud.CustomerOrderRepository;
import com.fireworks.kundalini.orderprocessor.mail.Mailer;
import com.fireworks.kundalini.orderprocessor.pdf.OrderBill;
import com.fireworks.kundalini.orderprocessor.pojo.customerorder.CustomerOrder;
import com.fireworks.kundalini.orderprocessor.service.IOrderDetailsService;

@Service
public class OrderDetailsServiceImpl implements IOrderDetailsService {

	
	@Autowired
	CustomerOrderRepository customerOrderRepository;
	
	@Autowired
	OrderBill orderbill;
	
	@Autowired
	Mailer mailer;
	
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
	public void generatePdf(CustomerOrder input) {
		orderbill.generatePdf(input);
	}

	@Override
	public void sendMail(CustomerOrder order) {
		
		 mailer.send(order);
	}

	
}
