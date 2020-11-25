package com.adriancalventos.demo;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.adriancalventos.demo.customer.entity.CustomerJpa;
import com.adriancalventos.demo.customer.repository.CustomerRepositoryJpa;
import com.adriancalventos.demo.product.entity.ProductJpa;



@SpringBootApplication
@EnableAutoConfiguration
public class ClientAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientAppApplication.class, args);
	}

    @Bean
	public ModelMapper modelMapper() {
	    return new ModelMapper();
	}
    
    @Bean
    public CommandLineRunner sampleData(CustomerRepositoryJpa repository) {
        return (args) -> {
        	
        	CustomerJpa cus=new  CustomerJpa("nif1", "doc1", "mail@mail.com", "pepe");
        	cus.addProduct(new ProductJpa("pomes"));
        	cus.addProduct(new ProductJpa("taronjes"));
        	 repository.save(cus);
        };
        	
       }
}
