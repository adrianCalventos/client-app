package com.adriancalventos.demo;

import java.text.SimpleDateFormat;
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
        	
        	List<CustomerJpa> cusList=new ArrayList<CustomerJpa>();
        	CustomerJpa cus=new  CustomerJpa("1111111111A", "123344567", "pepe@mail.com", "pepe");
        	cus.addProduct(new ProductJpa("linea fixe", "servei", "911111111",  new SimpleDateFormat("yyyy-MM-dd").parse("2016-06-01")));
        	cus.addProduct(new ProductJpa("fibra", "servei", null,  new SimpleDateFormat("yyyy-MM-dd").parse("2020-11-01")));
        	

        	cusList.add(cus);
        	
        	cus=new  CustomerJpa("1111111112A", "123344568", "Joseph@mail.com", "Joseph");
        	cus.addProduct(new ProductJpa("linea fixe", "servei", "911111111",  new SimpleDateFormat("yyyy-MM-dd").parse("2019-01-01")));
        	cus.addProduct(new ProductJpa("20gb", "producte", null,  new SimpleDateFormat("yyyy-MM-dd").parse("2017-11-15")));
        	cus.addProduct(new ProductJpa("roaming", "producte", null,  new SimpleDateFormat("yyyy-MM-dd").parse("2017-11-15") ));
        	cus.addProduct(new ProductJpa("roaming", "producte", null,  new SimpleDateFormat("yyyy-MM-dd").parse("2016-11-15") ));
        	cus.addProduct(new ProductJpa("movil", "servei", null,  new SimpleDateFormat("yyyy-MM-dd").parse("2020-02-22")));

        	cusList.add(cus);
        	cus=new  CustomerJpa("1111111113A", "123344569", "aaia@mail.com", "Laia");

        	cusList.add(cus);
        	
        	 repository.saveAll(cusList);
        };
        	
       }
}
