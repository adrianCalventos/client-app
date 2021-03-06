package com.adriancalventos.demo.customer.service;

import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.server.ResponseStatusException;

import com.adriancalventos.demo.customer.entity.CustomerJpa;
import com.adriancalventos.demo.customer.entity.dto.CustomerDto;
import com.adriancalventos.demo.customer.repository.CustomerRepositoryJpa;
import com.adriancalventos.demo.product.entity.dto.ProductDto;




@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepositoryJpa customerRepository;
	

	@Autowired
	private ModelMapper modelMapper;
	
    public List<CustomerDto> getCustomers() {
        return customerRepository.findAll().stream()
        		.map(this::convertToDto)
  	          .collect(Collectors.toList());
    }
    
    public CustomerDto getCustomer(@PathVariable UUID id){
       return customerRepository.findById(id).map(this::convertToDto).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, String.format("Invalid Book id %s", id)));
    }
	
	
    private CustomerDto convertToDto(CustomerJpa customerJpa) {
    	List<ProductDto> prodDto = customerJpa.getProducts().stream().map(prodJpa->
    		 new ProductDto(prodJpa.getProductName(), prodJpa.getProductTypeName(), prodJpa.getNumeracioTerminal(), prodJpa.getSoldAt())
    	).collect(Collectors.toList());
    	CustomerDto customerDto = modelMapper.map(customerJpa, CustomerDto.class);
    	customerDto.setProducts(prodDto);
	    return customerDto;
	}
    
    private CustomerJpa convertToEntity(CustomerDto customerDto) {
    	CustomerJpa customerJpa = modelMapper.map(customerDto, CustomerJpa.class);
        return customerJpa;
    }

}
