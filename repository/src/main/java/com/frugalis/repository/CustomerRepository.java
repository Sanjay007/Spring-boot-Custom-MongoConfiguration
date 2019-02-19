package com.frugalis.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.frugalis.entity.mongo.Customer;



public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);
}
