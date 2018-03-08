package com.fireworks.kundalini.orderprocessor.service;

import com.fireworks.kundalini.orderprocessor.pojo.customer.Customer;

public interface ICustomerDetailsService {

	public void saveCustomer(Customer customer);
	public Customer fetchCustomerByMailId(String mailID);
}
