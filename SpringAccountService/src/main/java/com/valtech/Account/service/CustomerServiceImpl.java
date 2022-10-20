package com.valtech.Account.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valtech.Account.entity.Account;
import com.valtech.Account.entity.Customer;
import com.valtech.Account.repo.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	
	
	@Override
	public Customer getCustomer(long id){
		  return customerRepository.findById(id).get();
	  }
	
	@Override
	public List<Customer> getAllCustomers(){
	 	  return customerRepository.findAll();
	   }

	@Override
	public Customer createCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepository.save(customer);
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepository.save(customer);
	}
}
