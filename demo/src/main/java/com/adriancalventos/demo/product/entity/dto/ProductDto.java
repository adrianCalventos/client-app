package com.adriancalventos.demo.product.entity.dto;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.adriancalventos.demo.customer.entity.CustomerJpa;

public class ProductDto {
	

	 private UUID id;
	 
	 private String productName;
	 

	 private String productTypeName;
	 

	 private String numeracioTerminal;
	 
	 private Date soldAt;


	 
	 public  ProductDto() {};

	public ProductDto(String productName, String productTypeName, String numeracioTerminal, Date soldAlt) {
		this.productName = productName;
		this.productTypeName=productTypeName;
		this.numeracioTerminal= numeracioTerminal;
		this.soldAt = soldAlt;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}


	public String getProductTypeName() {
		return productTypeName;
	}

	public void setProductTypeName(String productTypeName) {
		this.productTypeName = productTypeName;
	}

	public String getNumeracioTerminal() {
		return numeracioTerminal;
	}

	public void setNumeracioTerminal(String numeracioTerminal) {
		this.numeracioTerminal = numeracioTerminal;
	}

	public Date getSoldAt() {
		return soldAt;
	}

	public void setSoldAt(Date soldAt) {
		this.soldAt = soldAt;
	}
	
	
	

}
