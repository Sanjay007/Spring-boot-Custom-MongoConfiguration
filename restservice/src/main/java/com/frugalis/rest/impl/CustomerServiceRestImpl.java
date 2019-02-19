package com.frugalis.rest.impl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.core.Response;

import com.frugalis.entity.mongo.Customer;
import com.frugalis.rest.CustomerServiceRest;
import com.frugalis.services.CustomerService;


@Named
public class CustomerServiceRestImpl implements CustomerServiceRest {

	@Inject
	private CustomerService customerService;

	@Override
	public Response GetCustomer() {
		customerService.setCustomerServiceInput("hyderabad");
		customerService.executeImpl();
		List<Customer> listCustomer = customerService.getCustomerServiceOutput();
		
		return Response.ok(listCustomer).build();

	}


}
