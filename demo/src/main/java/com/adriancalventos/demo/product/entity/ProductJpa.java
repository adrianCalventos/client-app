package com.adriancalventos.demo.product.entity;

import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.adriancalventos.demo.customer.entity.CustomerJpa;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.ToString;

@Entity
@ToString
@Table(name="demo_product", schema="schema_clients")
@JsonIgnoreProperties({"customer"})
public class ProductJpa {
	
	 @Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	 private UUID id;
	 
	 @Column(name="productName", nullable=false)
	 private String productName;
	 
	 @OneToOne
	 @JoinColumn(name = "customer_id")
	 private CustomerJpa customer;
	 
	 public  ProductJpa() {};

	public ProductJpa(String productName) {
		this.productName = productName;
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

	public CustomerJpa getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerJpa customerId) {
		this.customer = customerId;
	}
	 
	 

}
