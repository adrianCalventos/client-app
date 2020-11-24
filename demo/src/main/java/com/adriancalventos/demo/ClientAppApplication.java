package com.adriancalventos.demo;

import org.modelmapper.ModelMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.adriancalventos.demo.customer.entity.CustomerJpa;
import com.adriancalventos.demo.customer.repository.CustomerRepositoryJpa;



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
        	
        	 repository.save(new  CustomerJpa("nif1", "doc1", "mail@mail.com", "pepe"));
        };
        	
       }
}
