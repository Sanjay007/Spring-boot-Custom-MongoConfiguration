package com.frugalis.services;

import java.lang.annotation.Annotation;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.glassfish.jersey.internal.inject.Custom;
import org.springframework.stereotype.Component;

import com.frugalis.entity.mongo.Customer;
import com.frugalis.repository.CustomerRepository;



@Named("custService")
@Component
public class CustomerService{

	private String lastName;
	private List<Customer> findByLastName;

	@Inject
	private CustomerRepository customers;

	public void setCustomerServiceInput(String lastName) {
		this.lastName = lastName;
	}
	
	public void executeImpl() {
		
		
		findByLastName = (List<Customer>) customers.findAll();
	}
	

	public List<Customer> getCustomerServiceOutput() {
		return findByLastName;
	}

}
