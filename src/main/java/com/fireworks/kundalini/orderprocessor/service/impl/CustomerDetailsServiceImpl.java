package com.fireworks.kundalini.orderprocessor.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fireworks.kundalini.orderprocessor.db.crud.CustomerRepository;
import com.fireworks.kundalini.orderprocessor.pojo.customer.Customer;
import com.fireworks.kundalini.orderprocessor.service.ICustomerDetailsService;

@Service
public class CustomerDetailsServiceImpl implements ICustomerDetailsService{

	@Autowired
	CustomerRepository customerRepository;
	
	@Override
	public void saveCustomer(Customer customer) {
		customerRepository.save(customer);
	}

	@Override
	public Customer fetchCustomerByMailId(String mailID) {
		return customerRepository.findBycustomerMail(mailID);
	}

}
