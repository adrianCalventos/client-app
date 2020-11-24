package com.adriancalventos.demo.customer.entity.dto;

import java.util.UUID;



public class CustomerDto {
	

	 private UUID id;
	 
	 private String nif;
	 
	 private String docNum;
	 
	 private String email;
	 	 
	 private String givenName;
	 
	 public CustomerDto() {}
	 

	public CustomerDto(UUID id, String nif, String docNum, String email, String givenName) {
		this.id = id;
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
