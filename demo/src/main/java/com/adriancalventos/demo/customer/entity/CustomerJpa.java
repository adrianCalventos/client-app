package com.adriancalventos.demo.customer.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.adriancalventos.demo.product.entity.ProductJpa;

import lombok.ToString;



@Entity
@ToString
@Table(name="demo_customer", schema="schema_clients")
public class CustomerJpa {
	
	 @Id
	 @Column(name="customer_id", nullable=false, unique=true)
	 @GeneratedValue(strategy=GenerationType.AUTO)
	 private UUID customerId;
	 
	 
	 @Column(name="nif", nullable=false, unique=false)
	 private String nif;
	 
	 @Column(name="docNum", nullable=false, unique=false)
	 private String docNum;
	 
	 @Column(name="email")
	 private String email;
	 	 

	 @Column(name="givenName", nullable=false, unique=false)
	 private String givenName;
	
	 @OneToMany(mappedBy = "customer", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	 List<ProductJpa> products;
	 
	 


	public CustomerJpa() {};
	 
	public CustomerJpa( String nif, String docNum, String email, String givenName) {
		this.nif = nif;
		this.docNum = docNum;
		this.email = email;
		this.givenName = givenName;
		this.products=new ArrayList<ProductJpa>();
	}

	public UUID getId() {
		return customerId;
	}

	public void setId(UUID id) {
		this.customerId = id;
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
	
	 public List<ProductJpa> getProducts() {
		return products;
	}

	public void addProduct(ProductJpa product) {
		product.setCustomer(this);
		this.products.add(product);
	}
	
	
	 
	 

}
