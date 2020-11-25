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
	 
	 @Column(name="productTypeName", nullable=false)
	 private String productTypeName;
	 
	 @OneToOne
	 @JoinColumn(name = "customer_id")
	 private CustomerJpa customer;
	 
	 @Column(name="numeracioTerminal")
	 private String numeracioTerminal;

	 
	 public  ProductJpa() {};

	public ProductJpa(String productName, String productTypeName, String numeracioTerminal) {
		this.productName = productName;
		this.productTypeName=productTypeName;
		this.numeracioTerminal= numeracioTerminal;
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
	
	
	
	
	 
	 

}
