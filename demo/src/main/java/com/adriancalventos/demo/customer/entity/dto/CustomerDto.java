package com.adriancalventos.demo.customer.entity.dto;

import java.util.List;
import java.util.UUID;

import com.adriancalventos.demo.product.entity.ProductJpa;
import com.adriancalventos.demo.product.entity.dto.ProductDto;



public class CustomerDto {
	

	 private UUID id;
	 
	 private String nif;
	 
	 private String docNum;
	 
	 private String email;
	 	 
	 private String givenName;
	 
	 List<ProductDto> products;
	 
	 public CustomerDto() {}
	 

	public CustomerDto(UUID id, String nif, String docNum, String email, String givenName, List<ProductDto> products) {
		this.id = id;
		this.nif = nif;
		this.docNum = docNum;
		this.email = email;
		this.givenName = givenName;
		this.products= products;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getDocNum() {
		return docNum;
	}

	public void setDocNum(String docNum) {
		this.docNum = docNum;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGivenName() {
		return givenName;
	}

	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}


	public List<ProductDto> getProducts() {
		return products;
	}


	public void setProducts(List<ProductDto> products) {
		this.products = products;
	}
	 
	
	 


}
