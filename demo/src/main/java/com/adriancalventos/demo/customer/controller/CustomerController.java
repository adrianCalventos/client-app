package com.adriancalventos.demo.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adriancalventos.demo.customer.entity.dto.CustomerDto;
import com.adriancalventos.demo.customer.service.CustomerService;


@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	


	 	@GetMapping(value = "/customer", produces = MediaType.APPLICATION_JSON_VALUE)
	    public List<CustomerDto> getCustomer() {
	        return customerService.getCustomers();
	    }

	    @GetMapping(value = "/customer/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	    public CustomerDto getCustomer(@PathVariable Long id){
	        return customerService.getCustomer(id);
	    }
	    

}
