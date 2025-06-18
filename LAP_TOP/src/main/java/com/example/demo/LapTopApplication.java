package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.Enity.PersonEnity;
import com.example.demo.laptopservice.PersonService;

@SpringBootApplication
public class LapTopApplication { 
 
	public static void main(String[] args) {
		SpringApplication.run(LapTopApplication.class, args);  
 	} 
	  
}
