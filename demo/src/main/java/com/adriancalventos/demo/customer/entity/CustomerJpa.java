package com.adriancalventos.demo.customer.entity;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.ToString;



@Entity
@ToString
@Table(name="demo_customer", schema="schema_clients")
public class CustomerJpa {
	
	 @Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	 private UUID id;
	 
	 @Column(name="nif", nullable=false, unique=false)
	 private String nif;
	 
	 @Column(name="docNum", nullable=false, unique=false)
	 private String docNum;
	 
	 @Column(name="email")
	 private String email;
	 	 

	 @Column(name="givenName", nullable=false, unique=false)
	 private String givenName;


	 public CustomerJpa() {};
	 
	public CustomerJpa( String nif, String docNum, String email, String givenName) {
		this.nif = nif;
		this.docNum = docNum;
		this.email = email;
		this.givenName = givenName;
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
	
	
	 
	 

}
