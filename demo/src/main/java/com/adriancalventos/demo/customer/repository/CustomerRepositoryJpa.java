package com.adriancalventos.demo.customer.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.adriancalventos.demo.customer.entity.CustomerJpa;



@Repository
public interface CustomerRepositoryJpa extends CrudRepository<CustomerJpa, UUID>{
	
	List<CustomerJpa> findAll();

	CustomerJpa save(CustomerJpa customerJpa);
	


}
