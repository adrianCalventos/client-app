package com.adriancalventos.demo.customer.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adriancalventos.demo.customer.entity.dto.CustomerDto;
import com.adriancalventos.demo.customer.service.CustomerService;

@CrossOrigin(maxAge = 3600)
@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	


	 	@GetMapping(value = "/customer", produces = MediaType.APPLICATION_JSON_VALUE)
	    public List<CustomerDto> getCustomer() {
	        return customerService.getCustomers();
	    }

	    @GetMapping(value = "/customer/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	    public CustomerDto getCustomer(@PathVariable UUID id){
	        return customerService.getCustomer(id);
	    }
	    

}
